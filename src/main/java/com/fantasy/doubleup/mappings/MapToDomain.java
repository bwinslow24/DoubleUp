package com.fantasy.doubleup.mappings;

import com.fantasy.doubleup.domain.Player;
import com.fantasy.doubleup.domain.PlayerSeasonStats;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

public class MapToDomain {

    public static Player player(com.fantasy.doubleup.data.JPA.Player jpa) throws Exception {

        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(jpa, Player.class);
    }

    public static List<Player> player(List<com.fantasy.doubleup.data.JPA.Player> jpaList) throws Exception {
        List<Player> playerList = new ArrayList<>();

        for (com.fantasy.doubleup.data.JPA.Player player: jpaList){
            playerList.add(MapToDomain.player(player));
        }
        return playerList;
    }

    public static PlayerSeasonStats playerSeasonStats(com.fantasy.doubleup.data.JPA.PlayerSeasonStats jpa){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(jpa, PlayerSeasonStats.class);

    }

    public static List<PlayerSeasonStats> playerSeasonStats(List<com.fantasy.doubleup.data.JPA.PlayerSeasonStats> jpaList){
        List<PlayerSeasonStats> playerSeasonStatsList = new ArrayList<>();

        for (com.fantasy.doubleup.data.JPA.PlayerSeasonStats playerSeasonStats: jpaList){
            playerSeasonStatsList.add(MapToDomain.playerSeasonStats(playerSeasonStats));
        }
        return playerSeasonStatsList;
    }

}
