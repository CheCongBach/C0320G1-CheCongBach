package com.codegym.blogofme.repository;

import com.codegym.blogofme.entity.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClubRepository extends JpaRepository<Club, Long> {
    Club findAllByDeleteIsIsFalseAndIdIs(Long id);
}
