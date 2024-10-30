package edu.icet.repository;

import edu.icet.entity.QuizEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<QuizEntity,String> {

}
