package com.codegym.blogofme.service.impl;

import com.codegym.blogofme.entity.PlayerSoccer;
import com.codegym.blogofme.repository.PlayerSoccerRepository;
import com.codegym.blogofme.service.PlayerSoccerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PlayerSoccerServiceImpl implements PlayerSoccerService {
    @Autowired
    PlayerSoccerRepository playerSoccerRepository;

    @Override
    public Page<PlayerSoccer> findAllPlayerSoccer(Pageable pageable) {
        return playerSoccerRepository.findAll(pageable);
    }

    @Override
    public PlayerSoccer findByIdPlayerSoccer(Long id) {
        return playerSoccerRepository.findById(id).orElse(null);
    }

    @Override
    public void savePlayerSoccer(PlayerSoccer playerSoccer) {
        playerSoccerRepository.save(playerSoccer);
    }

    @Override
    public void deletePlayerSoccer(Long id) {
          playerSoccerRepository.findAllByDeleteIsIsFalseAndIdIs(id);
//        playerSoccer.setDeleteIs(true);
//        playerSoccerRepository.save(playerSoccer);
    }

    @Override
    public Page<PlayerSoccer> findPlayerSoccerByName(String firstName, Pageable pageable) {
        return playerSoccerRepository.findAllByFirstNameContaining(firstName, pageable);
    }

    @Override
    public Page<PlayerSoccer> findPlayerSoccerByNameAndClubId(String firstName, Long club_id, Pageable pageable) {
        return playerSoccerRepository.findAllByFirstNameContainingAndClubId(firstName, club_id, pageable);
    }

    @Override
    public Page<PlayerSoccer> findPlayerSoccerByLastNameAndAge(String lastName, Integer age, Pageable pageable) {
        return playerSoccerRepository.findAllByLastNameContainingAndAge(lastName, age, pageable);
    }

    @Override
    public Page<PlayerSoccer> findPlayerSoccer(String firstName, String lastName, int age, double height, double weight, Long club_id, Pageable pageable) {
        return playerSoccerRepository.findAllByFirstNameAndLastNameAndAgeAndHeightAndWeightContainingAndClubId(firstName, lastName, age, height, weight, club_id, pageable);
    }
}
