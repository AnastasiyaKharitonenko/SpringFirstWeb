package ru.socialnetwork.app.repository.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import ru.socialnetwork.app.model.DataOfUsers;
import ru.socialnetwork.app.model.Users;
import ru.socialnetwork.app.repository.DataOfUsersRepository;
import ru.socialnetwork.app.repository.UsersRepository;

import java.util.List;

@Component
@AllArgsConstructor
public class UsersRepositoryImpl implements DataOfUsersRepository {
    private final List<DataOfUsers> dataOfUsersList;


    @Override
    public DataOfUsers create(DataOfUsers dataOfUsers) {
        dataOfUsersList.add(dataOfUsers);
        return dataOfUsers;
    }

    @Override
    public DataOfUsers update(DataOfUsers dataOfUsers, Long aLong) {
        DataOfUsers dataOfUsers1 = dataOfUsersList.get(aLong.intValue());
        DataOfUsers dataOfUserResult = dataOfUserMapper(dataOfUsers, dataOfUsers1);
        dataOfUsersList.set(aLong.intValue(), dataOfUserResult);
        return dataOfUsers;

    }

    @Override
    public List<DataOfUsers> findAll() {
        return dataOfUsersList;
    }

    @Override
    public DataOfUsers delete(Long aLong) {
        DataOfUsers dataOfUsers = dataOfUsersList.get(aLong.intValue());
        dataOfUsersList.remove(dataOfUsers);
        return dataOfUsers;
    }

    private DataOfUsers dataOfUserMapper(DataOfUsers dataOfUsersFromRest, DataOfUsers dataOfUsersFromList) {
        dataOfUsersFromList.setUsersId(dataOfUsersFromRest.getUsersId());
        dataOfUsersFromList.setAge(dataOfUsersFromRest.getAge());
        dataOfUsersFromList.setCountries(dataOfUsersFromRest.getCountries());
        dataOfUsersFromList.setMiddleName(dataOfUsersFromRest.getMiddleName());
        dataOfUsersFromList.setLastname(dataOfUsersFromRest.getLastname());
        dataOfUsersFromList.setName(dataOfUsersFromRest.getName());
        dataOfUsersFromList.setUsersId(dataOfUsersFromRest.getUsersId());
        return dataOfUsersFromList;
    }
}

