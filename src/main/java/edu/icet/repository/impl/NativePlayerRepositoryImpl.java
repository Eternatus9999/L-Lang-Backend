package edu.icet.repository.impl;

import edu.icet.entity.PlayerEntity;
import edu.icet.repository.NativePlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class NativePlayerRepositoryImpl implements NativePlayerRepository {
    final JdbcTemplate jdbctemplate;
    @Override
    public PlayerEntity findByName(String name) {
        return jdbctemplate.queryForObject("SELECT * FROM player WHERE name = :name",PlayerEntity.class);
    }
}
