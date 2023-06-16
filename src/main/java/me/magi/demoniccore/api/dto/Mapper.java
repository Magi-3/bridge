package me.magi.demoniccore.api.dto;

import me.magi.demoniccore.model.entity.MilitaryEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class Mapper {

    private ModelMapper modelMapper;

    public void convertDto (ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }
    private MilitaryEntity forEntity(MilitaryRequestDto requestDto) {
        MilitaryEntity entity = modelMapper.map(requestDto, MilitaryEntity.class);
        return entity;
    }

}
