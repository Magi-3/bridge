package me.magi.demoniccore.model.entity.enums;

public enum BloodType {
    APOSITIVO("A+"),
    ANEGATIVO("A-"),
    BPOSITIVO("B+"),
    BNEGATIVO("B-"),
    ABPOSITIVO("AB+"),
    ABNEGATIVO("AB-"),
    OPOSITIVO("0+"),
    ONEGATIVO("O-");

    String bloodType;
    BloodType(String bloodType) {
        this.bloodType = bloodType;
    }


}
