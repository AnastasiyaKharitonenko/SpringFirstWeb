package ru.socialnetwork.app.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import ru.socialnetwork.app.exception.DataOfUsersBadRequestException;
import ru.socialnetwork.app.model.DataOfUsers;
import ru.socialnetwork.app.service.DataOfUsersService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class DataOfUsersController {
    private final DataOfUsersService dataOfUsersService;


    @GetMapping("/")
    public List<DataOfUsers> findAll() {
        return dataOfUsersService.findAll();
    }

    @PostMapping("/add")
    public DataOfUsers addDataOfUsers(@RequestBody DataOfUsers dataOfUsers) {
        return dataOfUsersService.create(dataOfUsers);
    }

    @PutMapping("/update/{id}")
    public DataOfUsers upDateOfUsers(@PathVariable String id, @RequestBody DataOfUsers dataOfUsers) {
        try {
            return dataOfUsersService.update(dataOfUsers, Long.parseLong(id));
        } catch (Exception e) {
            throw new DataOfUsersBadRequestException();
        }
    }

    @DeleteMapping("/{id}")
    public DataOfUsers deleteDataOfUsers(@PathVariable String id) {
        try {
            return dataOfUsersService.delete(Long.parseLong(id));
        } catch (Exception e) {
            throw new DataOfUsersBadRequestException();
        }
    }

}