package me.magi.demoniccore.model.services;

import me.magi.demoniccore.model.entity.UserEntity;
import me.magi.demoniccore.model.repository.MilitaryRepository;
import me.magi.demoniccore.model.services.servicesinterface.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final MilitaryRepository repository;

    public UserServiceImpl(MilitaryRepository repository){
        this.repository = repository;
    }

    @Override
    public void addNewMilitary(UserEntity military) {
        repository.save(military);
    }

    @Override
    public void removeMilitary(Long id) {
        repository.deleteById(id);
    }


    @Override
    public UserEntity readMilitary(Long id) {
        return repository.findById(id).orElseThrow();
    }
    
    @Override
    public List<UserEntity> listAllMilitary() {
        return (List<UserEntity>) repository.findAll();
    }
}
