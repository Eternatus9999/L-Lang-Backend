package edu.icet.service;

import edu.icet.dto.Player;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PlayerService {
    Player getById(long id);

    Player getByName(String name);

    boolean add(Player player);

    boolean update(Player player);

    boolean delete(long id);

    List<Player> getAll();
}
