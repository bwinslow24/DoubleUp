package com.fantasy.doubleup.data.JPA;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;

@Data
@Entity
@Table(name="player_season_stats")
public class PlayerSeasonStats {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PlayerId", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Player player;

    @Column
    private Integer SeasonType;
    @Column
    private Integer Season;
    @Column
    private Integer Activated;
    @Column
    private Integer Played;
    @Column
    private Integer Started;
    @Column
    private Double PassingAttempts;
    @Column
    private Double PassingCompletions;
    @Column
    private Double PassingYards;
    @Column
    private Double PassingCompletionPercentage;
    @Column
    private Double PassingYardsPerAttempt;
    @Column
    private Double PassingYardsPerCompletion;
    @Column
    private Double PassingTouchdowns;
    @Column
    private Double PassingInterceptions;
    @Column
    private Double PassingRating;
    @Column
    private Double PassingLong;
    @Column
    private Double PassingSacks;
    @Column
    private Double PassingSackYards;
    @Column
    private Double RushingAttempts;
    @Column
    private Double RushingYards;
    @Column
    private Double RushingYardsPerAttempt;
    @Column
    private Double RushingTouchdowns;
    @Column
    private Double RushingLong;
    @Column
    private Double ReceivingTargets;
    @Column
    private Double Receptions;
    @Column
    private Double ReceivingYards;
    @Column
    private Double ReceivingYardsPerReception;
    @Column
    private Double ReceivingTouchdowns;
    @Column
    private Double ReceivingLong;
    @Column
    private Double Fumbles;
    @Column
    private Double FumblesLost;
    @Column
    private Double PuntReturns;
    @Column
    private Double PuntReturnYards;
    @Column
    private Double PuntReturnYardsPerAttempt;
    @Column
    private Double PuntReturnTouchdowns;
    @Column
    private Double PuntReturnLong;
    @Column
    private Double KickReturns;
    @Column
    private Double KickReturnYards;
    @Column
    private Double KickReturnYardsPerAttempt;
    @Column
    private Double KickReturnTouchdowns;
    @Column
    private Double KickReturnLong;
    @Column
    private Double SoloTackles;
    @Column
    private Double AssistedTackles;
    @Column
    private Double TacklesForLoss;
    @Column
    private Double Sacks;
    @Column
    private Double SackYards;
    @Column
    private Double QuarterbackHits;
    @Column
    private Double PassesDefended;
    @Column
    private Double FumblesForced;
    @Column
    private Double FumblesRecovered;
    @Column
    private Double FumbleReturnYards;
    @Column
    private Double FumbleReturnTouchdowns;
    @Column
    private Double Interceptions;
    @Column
    private Double InterceptionReturnYards;
    @Column
    private Double InterceptionReturnTouchdowns;
    @Column
    private Double BlockedKicks;
    @Column
    private Double SpecialTeamsSoloTackles;
    @Column
    private Double SpecialTeamsAssistedTackles;
    @Column
    private Double MiscSoloTackles;
    @Column
    private Double MiscAssistedTackles;
    @Column
    private Double FieldGoalsAttempted;
    @Column
    private Double FieldGoalsMade;
    @Column
    private Double FieldGoalsLongestMade;
    @Column
    private Double ExtraPointsMade;
    @Column
    private Double TwoPointConversionPasses;
    @Column
    private Double TwoPointConversionRuns;
    @Column
    private Double TwoPointConversionReceptions;
    @Column
    private Double FantasyPoints;
    @Column
    private Double FantasyPointsPPR;
    @Column
    private Double ReceptionPercentage;
    @Column
    private Double ReceivingYardsPerTarget;
    @Column
    private Double Tackles;
    @Column
    private Double OffensiveTouchdowns;
    @Column
    private Double DefensiveTouchdowns;
    @Column
    private Double SpecialTeamsTouchdowns;
    @Column
    private Double Touchdowns;
    @Column
    private String FantasyPosition;
    @Column
    private Double FieldGoalPercentage;
    @Column
    private Integer PlayerSeasonID;
    @Column
    private Double FumblesOwnRecoveries;
    @Column
    private Double FumblesOutOfBounds;
    @Column
    private Double KickReturnFairCatches;
    @Column
    private Double PuntReturnFairCatches;
    @Column
    private Double PuntTouchbacks;
    @Column
    private Double PuntInside20;
    @Column
    private Double PuntNetAverage;
    @Column
    private Double ExtraPointsAttempted;
    @Column
    private Double BlockedKickReturnTouchdowns;
    @Column
    private Double FieldGoalReturnTouchdowns;
    @Column
    private Double Safeties;
    @Column
    private Double FieldGoalsHadBlocked;
    @Column
    private Double PuntsHadBlocked;
    @Column
    private Double ExtraPointsHadBlocked;
    @Column
    private Double PuntLong;
    @Column
    private Double BlockedKickReturnYards;
    @Column
    private Double FieldGoalReturnYards;
    @Column
    private Double PuntNetYards;
    @Column
    private Double SpecialTeamsFumblesForced;
    @Column
    private Double SpecialTeamsFumblesRecovered;
    @Column
    private Double MiscFumblesForced;
    @Column
    private Double MiscFumblesRecovered;
    @Column
    private Double SafetiesAllowed;
    @Column
    private Double Temperature;
    @Column
    private Double Humidity;
    @Column
    private Double WindSpeed;
    @Column
    private Double OffensiveSnapsPlayed;
    @Column
    private Double DefensiveSnapsPlayed;
    @Column
    private Double SpecialTeamsSnapsPlayed;
    @Column
    private Double OffensiveTeamSnaps;
    @Column
    private Double DefensiveTeamSnaps;
    @Column
    private Double SpecialTeamsTeamSnaps;
    @Column
    private Double AuctionValue;
    @Column
    private Double AuctionValuePPR;
    @Column
    private Double TwoPointConversionReturns;
    @Column
    private Double FantasyPointsFanDuel;
    @Column
    private Double FieldGoalsMade0to19;
    @Column
    private Double FieldGoalsMade20to29;
    @Column
    private Double FieldGoalsMade30to39;
    @Column
    private Double FieldGoalsMade40to49;
    @Column
    private Double FieldGoalsMade50Plus;
    @Column
    private Double FantasyPointsDraftKings;
    @Column
    private Double FantasyPointsYahoo;
    @Column
    private Double AverageDraftPosition;
    @Column
    private Double AverageDraftPositionPPR;
    @Column
    private Double FantasyPointsFantasyDraft;
    @Column
    private Double AverageDraftPositionRookie;
    @Column
    private Double AverageDraftPositionDynasty;
    @Column
    private Double AverageDraftPosition2QB;


}
