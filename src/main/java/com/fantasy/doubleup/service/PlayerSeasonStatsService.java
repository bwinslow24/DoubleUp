package com.fantasy.doubleup.service;

import com.fantasy.doubleup.data.PlayerSeasonStatsRepository;
import com.fantasy.doubleup.domain.PlayerSeasonStats;
import com.fantasy.doubleup.mappings.MapToDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class PlayerSeasonStatsService {

    private PlayerSeasonStatsRepository playerSeasonStatsRepository;

    @Autowired
    public  PlayerSeasonStatsService(PlayerSeasonStatsRepository playerSeasonStatsRepository){

        this.playerSeasonStatsRepository = playerSeasonStatsRepository;
    }

    public List<PlayerSeasonStats> getAllSeasonStats(){
        List<com.fantasy.doubleup.data.JPA.PlayerSeasonStats> playerSeasonStatsList = this.playerSeasonStatsRepository.findAll();
        return MapToDomain.playerSeasonStats(playerSeasonStatsList);
    }

//    public List<PlayerSeasonStats> getSeasonStatsByPlayerId(Integer id){
//        List<com.fantasy.doubleup.data.JPA.PlayerSeasonStats> playerSeasonStatsList = this.playerSeasonStatsRepository.getPlayerSeasonStatsByPlayerId(id);
//        return MapToDomain.playerSeasonStats(playerSeasonStatsList);
//    }

}
