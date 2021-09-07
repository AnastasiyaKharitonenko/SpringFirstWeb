package ru.socialnetwork.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.socialnetwork.app.model.Countries;
import ru.socialnetwork.app.model.DataOfUsers;
import ru.socialnetwork.app.model.Users;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Configuration
public class ConfigUsers {

    @Bean
    public DataOfUsers dataOfUsers() {
        DataOfUsers dataOfUsers = DataOfUsers.builder()
                .age(23)
                .countries(Countries.AUSTRALIA)
                .name("George")
                .lastname("Ivanov")
                .id(1L)
                .usersId(
                        Users.builder()
                                .accountIsNotBlocked(true)
                                .accountIsNotExpired(true)
                                .login("root")
                                .password("$2a$12$7ZQotweDAc/y3pA3Cw08V.xuK1PBAXa2WroCqlm.uMe.OzwWf8oBu")
                                .build()

                )
                .build();

        DataOfUsers dataOfUsers1 = DataOfUsers.builder()
                .age(23)
                .countries(Countries.RUSSIA)
                .name("Andrey")
                .lastname("Petrov")
                .id(2L)
                .usersId(
                        Users.builder()
                                .accountIsNotBlocked(true)
                                .accountIsNotExpired(true)
                                .login("root1")
                                .password("$2a$12$7ZQotweDAc/y3pA3Cw08V.xuK1PBAXa2WroCqlm.uMe.OzwWf8oBu")
                                .build()
                )
                .build();

        List<DataOfUsers> dataOfUsersList1 = new CopyOnWriteArrayList<>();
        dataOfUsersList1.add(dataOfUsers);
        dataOfUsersList1.add(dataOfUsers1);
        return dataOfUsers;

    }
}