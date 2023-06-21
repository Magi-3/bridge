package me.magi.demoniccore.model.repository;

import me.magi.demoniccore.model.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface MilitaryRepository extends CrudRepository<UserEntity, Long> {

}
