package edu.icet.repository;

import edu.icet.entity.WordEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordRepository extends JpaRepository<WordEntity,String> {

    WordEntity findByName(String name);
}
