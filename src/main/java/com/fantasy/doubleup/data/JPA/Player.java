package com.fantasy.doubleup.data.JPA;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
//import org.apache.commons.lang3.StringUtils;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@Entity
@Table(name="players")
public class Player implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String FantasyPlayerKey;

    @Column
    private Integer PlayerID;

    @Column
    private String Name;

    @Column
    private String Team;

    @Column
    private String Position;

    @Column
    private Double AverageDraftPosition;

    @Column
    private Double AverageDraftPositionPPR;

    @Column
    private Integer ByeWeek;

    @Column
    private Double LastSeasonFantasyPoints;

    @Column
    private Double ProjectedFantasyPoints;

    @Column
    private Integer AuctionValue;

    @Column
    private Integer AuctionValuePPR;

    @Column
    private Integer AverageDraftPositionIDP;

    @Column
    private Integer AverageDraftPositionRookie;

    @Column
    private Integer AverageDraftPositionDynasty;

    @Column
    private Integer AverageDraftPosition2QB;

}
