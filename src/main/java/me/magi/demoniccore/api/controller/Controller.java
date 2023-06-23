package me.magi.demoniccore.api.controller;

import jakarta.persistence.PostUpdate;
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

    @GetMapping("/user/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public UserResponseDto findMilitaryById(@PathVariable String id) {
        var military = service.readMilitary(id);
        return Mapper.forResponse(military);
    }

    @DeleteMapping("/user/{id}")
    @ResponseStatus(HttpStatus.GONE)
    public void DeleteMilitary(@PathVariable String id) {
        service.removeMilitary(id);
    }

    @PatchMapping("/user/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void UpdateMilitary(@PathVariable String id, @RequestBody UserRequestDto userRequestDto) {
        service.updateMilitaryById(id, userRequestDto);
    }

}
