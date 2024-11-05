package edu.icet.repository;

import edu.icet.entity.QuizEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuizRepository extends JpaRepository<QuizEntity,Long> {

    List<QuizEntity> findByPlayer(String player_id);

}
