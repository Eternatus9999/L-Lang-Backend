package edu.icet.service;

import edu.icet.dto.Player;
import org.springframework.stereotype.Service;

@Service
public interface PlayerService {
    Player getPlayer(long id);

    boolean add(Player player);
}
