package edu.icet.controller;

import edu.icet.dto.Player;
import edu.icet.service.PlayerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/player")
@RequiredArgsConstructor
@Slf4j
public class PlayerController {
    final PlayerService playerservice;
    @GetMapping("/get-Player-id/{id}")
    public Player getPlayerById(@PathVariable String id){
        return playerservice.getById(Long.parseLong(id));
    }

    @GetMapping("/get-Player-name/{name}")
    public Player getPlayerByName(@PathVariable String name){
        return playerservice.getByName(name);
    }

    @PostMapping("/add-Player")
    public String addPlayer(@RequestBody Player player){
        if(playerservice.add(player)){
            return "Player Added Successfully";
        }
        return "Player didn't Added Successfully";
    }
    @PutMapping("/update-Player")
    public String updatePlayer(@RequestBody Player player){
        if(playerservice.update(player)){
            return "Player Updated Successfully";
        }
        return "Player didn't Updated Successfully";
    }
    @DeleteMapping("/delete-Player/{id}")
    public String deletePlayer(@PathVariable String id){
        if(playerservice.delete(Long.parseLong(id))){
            return "Player Deleted Successfully";
        }
        return "Player didn't Deleted Successfully";
    }
    @GetMapping
    public List<Player> getAll(){
        return playerservice.getAll();
    }
}
