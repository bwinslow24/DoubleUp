package com.fantasy.doubleup.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.Data;

import java.util.List;

@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
@Data
public class Player {

    private Integer id;
    private String FantasyPlayerKey;
    private Integer PlayerID;
    private String Name;
    private String Team;
    private String Position;
    private Double AverageDraftPosition;
    private Double AverageDraftPositionPPR;
    private Integer ByeWeek;
    private Double LastSeasonFantasyPoints;
    private Double ProjectedFantasyPoints;
    private Integer AuctionValue;
    private Integer AuctionValuePPR;
    private Integer AverageDraftPositionIDP;
    private Integer AverageDraftPositionRookie;
    private Integer AverageDraftPositionDynasty;
    private Integer AverageDraftPosition2QB;

    public Player() {
    }
}

