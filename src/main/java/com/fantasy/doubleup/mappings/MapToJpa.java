package com.fantasy.doubleup.mappings;

import com.fantasy.doubleup.data.JPA.Player;
import org.springframework.util.StringUtils;

public class MapToJpa {

    public static Player player(Player playerJpa, com.fantasy.doubleup.domain.Player payload) throws Exception {

        if (StringUtils.isEmpty(playerJpa)){
            playerJpa = new Player();
        }
        if (payload.getId() != null){
            playerJpa.setId(payload.getId());
        }
        if (payload.getFantasyPlayerKey() != null){
            playerJpa.setFantasyPlayerKey(payload.getFantasyPlayerKey());
        }
        if (payload.getPlayerID() != null){
            playerJpa.setPlayerID(payload.getPlayerID());
        }
        if (payload.getName() != null){
            playerJpa.setName(payload.getName());
        }
        if (payload.getTeam() != null){
            playerJpa.setTeam(payload.getTeam());
        }

        playerJpa.setPosition(payload.getPosition());
        playerJpa.setAverageDraftPosition(payload.getAverageDraftPosition());
        playerJpa.setAverageDraftPositionPPR(payload.getAverageDraftPositionPPR());
        playerJpa.setByeWeek(payload.getByeWeek());
        playerJpa.setLastSeasonFantasyPoints(payload.getLastSeasonFantasyPoints());
        playerJpa.setProjectedFantasyPoints(payload.getProjectedFantasyPoints());
        playerJpa.setAuctionValue(payload.getAuctionValue());
        playerJpa.setAuctionValuePPR(payload.getAuctionValuePPR());
        playerJpa.setAverageDraftPositionIDP(payload.getAverageDraftPositionIDP());
        playerJpa.setAverageDraftPositionRookie(payload.getAverageDraftPositionRookie());
        playerJpa.setAverageDraftPositionDynasty(payload.getAverageDraftPositionDynasty());
        playerJpa.setAverageDraftPosition2QB(payload.getAverageDraftPosition2QB());

        return playerJpa;

    }
}
