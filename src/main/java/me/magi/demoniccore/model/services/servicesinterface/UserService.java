package me.magi.demoniccore.model.services.servicesinterface;

import me.magi.demoniccore.model.entity.UserEntity;

import java.util.List;

public interface UserService {

    public void addNewMilitary(UserEntity military);

    public void removeMilitary(Long id);

    public UserEntity readMilitary(Long id);
    
    public List<UserEntity> listAllMilitary();
}
