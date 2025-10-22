package org.example.api.dto.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserListDto {

        private Integer page;
        @JsonProperty("per_page")
        private Integer perPage;
        private Integer total;
        @JsonProperty("total_pages")
        private Integer totalPages;
        private List<UserDto> data;
        private SupportDto support;
        private Object _meta;
}
