package com.fantasy.doubleup.mappings;

import com.fantasy.doubleup.domain.Player;

import java.util.ArrayList;
import java.util.List;

public class MapToDomain {

    public static Player player(com.fantasy.doubleup.data.JPA.Player jpa) throws Exception {
        Player domain = new Player();
        domain.setId(jpa.getId());
        domain.setFantasyPlayerKey(jpa.getFantasyPlayerKey());
        domain.setPlayerID(jpa.getPlayerID());
        domain.setName(jpa.getName());
        domain.setTeam(jpa.getTeam());
        domain.setPosition(jpa.getPosition());
        domain.setAverageDraftPosition(jpa.getAverageDraftPosition());
        domain.setAverageDraftPositionPPR(jpa.getAverageDraftPositionPPR());
        domain.setByeWeek(jpa.getByeWeek());
        domain.setLastSeasonFantasyPoints(jpa.getLastSeasonFantasyPoints());
        domain.setProjectedFantasyPoints(jpa.getProjectedFantasyPoints());
        domain.setAuctionValue(jpa.getAuctionValue());
        domain.setAuctionValuePPR(jpa.getAuctionValuePPR());
        domain.setAverageDraftPositionIDP(jpa.getAverageDraftPositionIDP());
        domain.setAverageDraftPositionRookie(jpa.getAverageDraftPositionRookie());
        domain.setAverageDraftPositionDynasty(jpa.getAverageDraftPositionDynasty());
        domain.setAverageDraftPosition2QB(jpa.getAverageDraftPosition2QB());
        return domain;
    }

    public static List<Player> player(List<com.fantasy.doubleup.data.JPA.Player> jpaList) throws Exception {
        List<Player> playerList = new ArrayList<>();

        for (com.fantasy.doubleup.data.JPA.Player player: jpaList){
            playerList.add(MapToDomain.player(player));
        }

        return playerList;
    }

}
