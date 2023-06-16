package me.magi.demoniccore.model.services;

import me.magi.demoniccore.model.entity.MilitaryEntity;
import me.magi.demoniccore.model.repository.MilitaryRepository;
import me.magi.demoniccore.model.services.servicesinterface.MilitaryService;

public class MilitaryServiceImpl implements MilitaryService {
    private MilitaryRepository repository;

    public void MilitaryServiceImpl (MilitaryRepository repository){
        this.repository = repository;

    }

    @Override
    public void addNewMilitary(MilitaryEntity military) {
        repository.save(military);

    }

    @Override
    public void removeMilitary(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void updateMilitary(Long id,MilitaryEntity military) {
    }

    @Override
    public MilitaryEntity readMilitary(Long id) {
        return repository.findById(id).orElseThrow();
    }
}
