package me.magi.demoniccore.api.controller;

import me.magi.demoniccore.api.dto.Mapper;
import me.magi.demoniccore.api.dto.UserRequestDto;
import me.magi.demoniccore.api.dto.UserResponseDto;
import me.magi.demoniccore.model.services.UserServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1")
public class Controller {

    private final UserServiceImpl service;

    public Controller(UserServiceImpl service){this.service = service;}

    @GetMapping("/user")
    public List<UserResponseDto> GetAllMilitary () {
        return service.listAllMilitary()
                .stream()
                .map(Mapper::forResponse)
                .collect(Collectors.toList());
    }

    @PostMapping("/user")
    @ResponseStatus(HttpStatus.CREATED)
    public void addNewMilitary(@RequestBody UserRequestDto userRequestDto) {
        service.addNewMilitary(Mapper.forEntity(userRequestDto));
    }

}
