package com.f1.f1t.mapper;

import com.f1.f1t.dto.AuthenticationResponse;
import com.f1.f1t.dto.SecureAuthenticationResponse;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationMapper {
    public SecureAuthenticationResponse mapResponseToSecureResponse(AuthenticationResponse authenticationResponse){
        return SecureAuthenticationResponse.builder()
                .username(authenticationResponse.getUsername())
                .expiresAt(authenticationResponse.getExpiresAt())
                .authenticationToken(authenticationResponse.getAuthenticationToken())
                .id(authenticationResponse.getId())
                .build();
    }
}
