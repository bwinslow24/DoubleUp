package com.fantasy.doubleup.service;


import com.fantasy.doubleup.data.PlayerRepository;
import com.fantasy.doubleup.domain.Player;
import com.fantasy.doubleup.mappings.MapToDomain;
import com.fantasy.doubleup.mappings.MapToJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class PlayerService {

    private PlayerRepository playerRepository;

    @Autowired
    public  PlayerService(PlayerRepository playerRepository){

        this.playerRepository = playerRepository;
    }

    public List<Player> getPlayers() throws Exception {
        List<com.fantasy.doubleup.data.JPA.Player> jpaPlayerList = this.playerRepository.findAll();
        return MapToDomain.player(jpaPlayerList);
    }

    public Player getPlayerById(Integer id) throws Exception {
        com.fantasy.doubleup.data.JPA.Player jpaPlayer = this.playerRepository.getPlayerById(id);
        return MapToDomain.player(jpaPlayer);
    }

    public Integer addPlayer(Player payload) throws Exception {
        com.fantasy.doubleup.data.JPA.Player savedPlayer = this.playerRepository.saveAndFlush(MapToJpa.player(null, payload));
        return savedPlayer.getId();
    }

}
