package org.example.api.dto.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class UserUpdate extends UserDto {

    private String updatedAt;

    public UserUpdate(int id) {
        super(id);
        updatedAt = "Updated At Value";
    }
}
