package com.JWTAuth.api.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class UserLoginDTO {
    private String username;
    private String password;
}
