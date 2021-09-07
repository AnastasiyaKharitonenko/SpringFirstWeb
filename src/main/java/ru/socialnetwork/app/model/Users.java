package ru.socialnetwork.app.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Users {

    private Long id;
    private String login;
    private String password;
    private Boolean accountIsNotBlocked;
    private Boolean accountIsNotExpired;
}
