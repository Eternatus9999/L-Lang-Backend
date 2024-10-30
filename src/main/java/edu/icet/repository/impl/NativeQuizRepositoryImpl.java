package edu.icet.repository.impl;

import edu.icet.entity.PlayerEntity;
import edu.icet.entity.QuizEntity;
import edu.icet.repository.NativeQuizRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class NativeQuizRepositoryImpl implements NativeQuizRepository {
    private final JdbcTemplate jdbctemplate;
    @Override
    public QuizEntity findById(String id) {
        return jdbctemplate.queryForObject("SELECT * FROM quiz WHERE quiz_id = :id", QuizEntity.class);
    }
}
