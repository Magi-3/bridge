package me.magi.demoniccore.api.dto;

import me.magi.demoniccore.model.entity.enums.BloodType;

public class UserRequestDto {

    private String name;

    private String cellNumber;

    private String cpf;

    private String Logradouro;

    private String bairro;

    private BloodType tipoSanguineo;

    public String getName() {
        return name;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public String getCpf() {
        return cpf;
    }

    public String getLogradouro() {
        return Logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public BloodType getTipoSanguineo() {
        return tipoSanguineo;
    }
}

