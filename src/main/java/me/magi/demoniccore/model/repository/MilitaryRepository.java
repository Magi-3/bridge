package me.magi.demoniccore.model.repository;

import me.magi.demoniccore.model.entity.MilitaryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface MilitaryRepository extends JpaRepository<MilitaryEntity, Long> {
}
