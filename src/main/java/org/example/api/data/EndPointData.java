package org.example.api.data;

public class EndPointData {

    public static String GET_USERS = "/api/users";
    public static final String GET_USER_BY_ID = "/api/users/{id}";

    public static String getUserById(int id) {
        return GET_USER_BY_ID.replace("{id}", String.valueOf(id));
    }


}
