package com.codegym.blogofme.service;

import com.codegym.blogofme.entity.Club;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ClubService {
    Page<Club> findAllClub(Pageable pageable);

    List<Club> findAllClubs();
    Club findByIdClub(Long id);

    void saveClub(Club club);

    void deleteClub(Long id);
}
