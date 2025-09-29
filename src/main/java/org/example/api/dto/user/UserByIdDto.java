package org.example.api.dto.user;

import lombok.Data;

@Data
public class UserByIdDto {

    private UserDto data;
    private SupportDto support;
}
