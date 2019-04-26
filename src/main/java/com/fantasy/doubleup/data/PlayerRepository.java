package com.fantasy.doubleup.data;

import com.fantasy.doubleup.data.JPA.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Transactional
@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer>{

    Player getPlayerById(Integer id);
}
