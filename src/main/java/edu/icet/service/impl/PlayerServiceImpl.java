package edu.icet.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.dto.Player;
import edu.icet.entity.PlayerEntity;
import edu.icet.repository.PlayerRepository;
import edu.icet.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
@RequiredArgsConstructor
public class PlayerServiceImpl implements PlayerService {
    final PlayerRepository playerrepository;
    final ObjectMapper objectmapper;
    @Override
    public Player getPlayer(long id) {
        return objectmapper.convertValue(playerrepository.findById(id),Player.class);
    }

    @Override
    public boolean add(Player player) {
        playerrepository.save(objectmapper.convertValue(player, PlayerEntity.class));
        return true;
    }
}
