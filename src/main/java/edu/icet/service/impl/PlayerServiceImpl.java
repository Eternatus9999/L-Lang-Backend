package edu.icet.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.dto.Player;
import edu.icet.entity.PlayerEntity;
import edu.icet.repository.PlayerRepository;
import edu.icet.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Primary
@Service
@RequiredArgsConstructor
public class PlayerServiceImpl implements PlayerService {
    final PlayerRepository playerrepository;
    final ObjectMapper objectmapper;

    @Override
    public Player getById(long id) {
        return objectmapper.convertValue(playerrepository.findById(id),Player.class);
    }

    @Override
    public Player getByName(String name) {
        return objectmapper.convertValue(playerrepository.findByName(name), Player.class);
    }

    @Override
    public boolean add(Player player) {
        playerrepository.save(objectmapper.convertValue(player, PlayerEntity.class));
        return true;
    }

    @Override
    public boolean update(Player player) {
        playerrepository.save(objectmapper.convertValue(player, PlayerEntity.class));
        return true;
    }

    @Override
    public boolean delete(long id) {
        playerrepository.deleteById(id);
        return true;
    }

    @Override
    public List<Player> getAll() {
        List<PlayerEntity> list = playerrepository.findAll();
        List<Player> playerlist = new ArrayList<>();
        for (PlayerEntity entity : list) {
            playerlist.add(objectmapper.convertValue(entity, Player.class));
        }
        return playerlist;
    }
}
