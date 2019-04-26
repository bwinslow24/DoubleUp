package com.fantasy.doubleup.controller;

import com.fantasy.doubleup.domain.Player;
import com.fantasy.doubleup.service.PlayerService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path="/players", produces = "application/json")
public class PlayerController {
    private static final Log LOG = LogFactory.getLog(PlayerController.class);

    private PlayerService playerService;

    @Autowired
    public PlayerController (PlayerService playerService){
        this.playerService = playerService;
    }
    @RequestMapping(path = "", method = RequestMethod.GET)
    public ResponseEntity<List<Player>> getPlayers() {
        try {
            List<Player> players = this.playerService.getPlayers();
            return new ResponseEntity<>(players, HttpStatus.OK);
        } catch (Exception e) {
            LOG.error("Error occurred retrieving all players "+"\n"+e.toString());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Player> getPlayerById(@PathVariable Integer id) {
        try {
            Player player = this.playerService.getPlayerById(id);
            return new ResponseEntity<>(player, HttpStatus.OK);
        } catch (Exception e) {
            LOG.error("Error occurred retrieving player " + id + "\n"+e.toString());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

    @RequestMapping(path= "/add", method = RequestMethod.POST)
    public ResponseEntity<?> addPlayers(@RequestBody List<Player> payload){
        try{
            List<Integer> response = new ArrayList<>();
            for (Player p: payload) {

                if (!StringUtils.isEmpty(p.getId())) {
                    LOG.warn("Id should not be present while creating a new player :" + p);
                    return new ResponseEntity<>(HttpStatus.CONFLICT);
                }

                Integer id = this.playerService.addPlayer(p);
                response.add(id);
                LOG.info("Successfully Created Player: " + p);

            }
            return new ResponseEntity<>(response,HttpStatus.CREATED);
        }catch (Exception e) {
            LOG.error("Error occurred Adding Player " + "\n" + e.toString());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

}