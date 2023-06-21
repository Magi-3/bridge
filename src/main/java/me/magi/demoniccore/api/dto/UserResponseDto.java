package me.magi.demoniccore.api.dto;

import me.magi.demoniccore.model.entity.enums.Behavior;
import me.magi.demoniccore.model.entity.enums.BloodType;

public class UserResponseDto {
    private String name;

    private String cellNumber;

    private Behavior behavior;

    private Boolean cfc;

    private String cpf;

    private String Logradouro;

    private String bairro;

    private BloodType tipoSanguineo;

    public UserResponseDto(String name, String cellNumber, Behavior behavior, Boolean cfc, String cpf, String logradouro, String bairro, BloodType tipoSanguineo) {
        this.name = name;
        this.cellNumber = cellNumber;
        this.behavior = behavior;
        this.cfc = cfc;
        this.cpf = cpf;
        Logradouro = logradouro;
        this.bairro = bairro;
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    public Behavior getBehavior() {
        return behavior;
    }

    public void setBehavior(Behavior behavior) {
        this.behavior = behavior;
    }

    public Boolean getCfc() {
        return cfc;
    }

    public void setCfc(Boolean cfc) {
        this.cfc = cfc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getLogradouro() {
        return Logradouro;
    }

    public void setLogradouro(String logradouro) {
        Logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public BloodType getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(BloodType tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }
}
