package org.example.api.model.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserList {

        private int page;
        @JsonProperty("per_page")
        private int perPage;
        private int total;
        @JsonProperty("total_pages")
        private int totalPages;
        private List<User> data;
        private Support support;
}
