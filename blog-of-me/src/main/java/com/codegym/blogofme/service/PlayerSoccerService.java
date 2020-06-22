package com.codegym.blogofme.service;

import com.codegym.blogofme.entity.PlayerSoccer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PlayerSoccerService {
    Page<PlayerSoccer> findAllPlayerSoccer(Pageable pageable);

    PlayerSoccer findByIdPlayerSoccer(Long id);

    void savePlayerSoccer(PlayerSoccer playerSoccer);

    void deletePlayerSoccer(Long id);

    Page<PlayerSoccer> findPlayerSoccerByName(String firstName, Pageable pageable);

    Page<PlayerSoccer> findPlayerSoccerByNameAndClubId(String firstName, Long club_id, Pageable pageable);

    Page<PlayerSoccer> findPlayerSoccerByLastNameAndAge(String lastName, Integer age, Pageable pageable);

    Page<PlayerSoccer> findPlayerSoccer(String firstName, String lastName, int age, double height, double weight, Long club_id, Pageable pageable);
}
