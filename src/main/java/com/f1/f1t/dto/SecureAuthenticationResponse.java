package com.f1.f1t.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SecureAuthenticationResponse {
    private String authenticationToken;
    private Instant expiresAt;
    private String username;
    private long id;
}
