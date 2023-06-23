package me.magi.demoniccore.model.repository;

import me.magi.demoniccore.api.dto.UserRequestDto;
import me.magi.demoniccore.model.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional
public interface MilitaryRepository extends CrudRepository<UserEntity, Long> {

    Optional<UserEntity> findByIdNumber(String id);

    void deleteByIdNumber(String id);
}
