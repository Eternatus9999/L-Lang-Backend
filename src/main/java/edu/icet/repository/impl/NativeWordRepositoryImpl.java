package edu.icet.repository.impl;

import edu.icet.entity.WordEntity;
import edu.icet.repository.NativeWordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class NativeWordRepositoryImpl implements NativeWordRepository {
    final NamedParameterJdbcTemplate namedjdbctemplate;
    final JdbcTemplate jdbtemplate;

    @Override
    public WordEntity findByName(String name) {
        return jdbtemplate.queryForObject("SELECT * FROM word WHERE name :name", WordEntity.class);

    }
}
