package com.codegym.blogofme.service.impl;

import com.codegym.blogofme.entity.Club;
import com.codegym.blogofme.repository.ClubRepository;
import com.codegym.blogofme.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClubServiceImpl implements ClubService {
    @Autowired
    ClubRepository clubRepository;

    @Override
    public Page<Club> findAllClub(Pageable pageable) {
        return clubRepository.findAll(pageable);
    }

    @Override
    public List<Club> findAllClubs() {
        return clubRepository.findAll();
    }

    @Override
    public Club findByIdClub(Long id) {
        return clubRepository.findById(id).orElse(null);
    }

    @Override
    public void saveClub(Club club) {
        clubRepository.save(club);
    }

    @Override
    public void deleteClub(Long id) {
        Club club = clubRepository.findAllByDeleteIsIsFalseAndIdIs(id);
        club.setDeleteIs(true);
        clubRepository.save(club);
    }
}
