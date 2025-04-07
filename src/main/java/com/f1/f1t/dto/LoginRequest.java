package com.f1.f1t.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class LoginRequest {
    private String identifier;
    private String password;
    private boolean rememberMe;
}
