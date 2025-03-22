package com.JWTAuth.api.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class UserRegisterDTO {
    private String username;
    private String password;
    private String role;
}
