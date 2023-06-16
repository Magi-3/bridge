package me.magi.demoniccore.model.entity;

import jakarta.persistence.*;
import me.magi.demoniccore.model.entity.enums.Behavior;
import me.magi.demoniccore.model.entity.enums.BloodType;

import java.util.UUID;

@Entity
@Table(name = "effective_entity")
public class MilitaryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;

    private String name;

    private String cellNumber;

    private Behavior behavior;

    private Boolean cfc;

    private String cpf;

    private String Logradouro;

    private String bairro;

    private BloodType tipoSanguineo;

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public Behavior getBehavior() {
        return behavior;
    }

    public Boolean getCfc() {
        return cfc;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    public void setBehavior(Behavior behavior) {
        this.behavior = behavior;
    }

    public void setCfc(Boolean cfc) {
        this.cfc = cfc;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setLogradouro(String logradouro) {
        Logradouro = logradouro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setTipoSanguineo(BloodType tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }
}