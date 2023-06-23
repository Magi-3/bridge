package me.magi.demoniccore.model.services;

import me.magi.demoniccore.api.dto.UserRequestDto;
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
    public void removeMilitary(String id) {
        repository.deleteByIdNumber(id);
    }

    @Override
    public UserEntity readMilitary(String id) {
        return repository.findByIdNumber(id).orElseThrow();
    }
    
    @Override
    public List<UserEntity> listAllMilitary() {
        return (List<UserEntity>) repository.findAll();
    }

    @Override
    public void updateMilitaryById(String id, UserRequestDto userRequestDto) {
        var userInDB = repository.findByIdNumber(id).orElseThrow();
        userInDB.setAddress(userRequestDto.getAddress());
        userInDB.setBehavior(userRequestDto.getBehavior());
        userInDB.setCpf(userRequestDto.getCpf());
        userInDB.setDistrict(userRequestDto.getDistrict());
        userInDB.setName(userRequestDto.getName());
        userInDB.setBloodType(userRequestDto.getBloodType());
        userInDB.setCellNumber(userRequestDto.getCellNumber());

        repository.save(userInDB);


    }
}
