package edu.icet.repository;

import edu.icet.entity.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<PlayerEntity,Long> {

    PlayerEntity findByName(String name);
    List<PlayerEntity> findAllByOrderByMarksDesc();
}
