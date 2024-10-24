package edu.icet.controller;

import edu.icet.dto.Player;
import edu.icet.service.PlayerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/player")
@RequiredArgsConstructor
@Slf4j
public class PlayerController {
    final PlayerService playerservice;
    @GetMapping("/get-Player/{id}")
    public Player getPlayer(@PathVariable String id){
        return playerservice.getPlayer(Long.parseLong(id));
    }
    @PostMapping("/add-Player")
    public String addPlayer(@RequestBody Player player){
        if(playerservice.add(player)){
            return "Player Added Successfully";
        }
        return "Player didn't Added Successfully";
    }
}
