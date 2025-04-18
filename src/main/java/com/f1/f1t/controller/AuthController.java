package com.f1.f1t.controller;

import com.f1.f1t.dto.*;

import com.f1.f1t.mapper.AuthenticationMapper;
import com.f1.f1t.service.AuthService;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("api/auth")
@AllArgsConstructor
public class AuthController {

    private final AuthService authService;
    private final AuthenticationMapper authenticationMapper;

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody RegisterRequest registerRequest){
        authService.signup(registerRequest);
        return new ResponseEntity<>("User Registration Successful", HttpStatus.OK);
    }
    @GetMapping("/verifyAccount/{token}")
    public ResponseEntity<String> verifyAccount(@PathVariable String token){
        authService.verifyAccount(token);
        return new ResponseEntity<>("User verified successful", HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<SecureAuthenticationResponse> login(@RequestBody LoginRequest loginRequest, HttpServletResponse response) {
        AuthenticationResponse login = authService.login(loginRequest);
        response.addCookie(authService.getRefreshTokenCookie( loginRequest, login));
        return ResponseEntity.ok()
                .body(authenticationMapper.mapResponseToSecureResponse(login));
    }

    @PostMapping("refresh/token")
    public ResponseEntity<SecureAuthenticationResponse> refreshTokens(@RequestBody RefreshTokenRequest refreshTokenRequest, @CookieValue(name = "RefreshToken") String refreshToken, HttpServletResponse response){
        AuthenticationResponse authenticationResponse = authService.refreshTokenUsingCookie(refreshTokenRequest.getUsername(), refreshToken);
        response.addCookie(authService.refreshRefreshTokenCookie(refreshToken));
        return new ResponseEntity<>(authenticationMapper.mapResponseToSecureResponse(authenticationResponse), HttpStatus.OK);
    }
}