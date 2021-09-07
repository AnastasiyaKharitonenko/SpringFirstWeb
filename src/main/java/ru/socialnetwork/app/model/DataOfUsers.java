package ru.socialnetwork.app.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DataOfUsers {


    private Long id;
    private String name, lastname, middleName;
    private Integer age;
    private Countries countries;
    private Users usersId;

}

