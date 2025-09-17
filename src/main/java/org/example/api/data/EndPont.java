package org.example.api.data;

public class EndPont {

    public static String GET_USERS = "/api/users";
    public static final String USER_BY_ID = "/api/users/{id}";

    public static String userById(int id) {
        return USER_BY_ID.replace("{id}", String.valueOf(id));
    }


}
