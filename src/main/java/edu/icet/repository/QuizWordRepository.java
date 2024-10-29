package edu.icet.repository;

import edu.icet.entity.QuizWordEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizWordRepository extends JpaRepository<QuizWordEntity,Long> {
}
