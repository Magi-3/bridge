package me.magi.demoniccore.api.dto;

import me.magi.demoniccore.model.entity.UserEntity;
import me.magi.demoniccore.model.entity.enums.Behavior;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class Mapper {

    private final ModelMapper modelMapper;

    public Mapper (ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public static UserResponseDto forResponse(UserEntity military) {
        return new UserResponseDto(
                military.getName(),
                military.getCellNumber(),
                military.getBehavior(),
                military.getCfc(),
                military.getCpf(),
                military.getAddress(),
                military.getDistrict(),
                military.getBloodType()
                );
    }

    public static UserEntity forEntity (UserRequestDto military) {
        var newMilitary = UserEntity.newInstance();
        newMilitary.setName(military.getName());
        newMilitary.setCellNumber(military.getCellNumber());
        newMilitary.setCpf(military.getCpf());
        newMilitary.setAddress(military.getLogradouro());
        newMilitary.setDistrict(military.getBairro());
        newMilitary.setBloodType(military.getTipoSanguineo());

        newMilitary.setBehavior(Behavior.Bom);
        newMilitary.setCfc(Boolean.FALSE);

        return newMilitary;
    }

}
