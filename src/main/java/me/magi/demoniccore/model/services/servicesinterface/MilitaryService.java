package me.magi.demoniccore.model.services.servicesinterface;

import me.magi.demoniccore.model.entity.MilitaryEntity;

public interface MilitaryService {

    public void addNewMilitary(MilitaryEntity military);

    public void removeMilitary(Long id);

    public void updateMilitary(Long id, MilitaryEntity military);

    public MilitaryEntity readMilitary(Long id);

}
