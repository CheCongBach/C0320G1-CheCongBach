package com.codegym.blogofme.repository;

import com.codegym.blogofme.entity.PlayerSoccer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface PlayerSoccerRepository extends JpaRepository<PlayerSoccer, Long> {
    @Transactional
    @Modifying
    @Query("update PlayerSoccer p set p.deleteIs = true where p.id = :id")
    void findAllByDeleteIsIsFalseAndIdIs(Long id);

    Page<PlayerSoccer> findAllByFirstNameContaining(String firstName, Pageable pageable);

    Page<PlayerSoccer> findAllByFirstNameContainingAndClubId(String firstName, Long club_id, Pageable pageable);

    Page<PlayerSoccer> findAllByLastNameContainingAndAge(String lastName, Integer age, Pageable pageable);

    Page<PlayerSoccer> findAllByFirstNameAndLastNameAndAgeAndHeightAndWeightContainingAndClubId(String firstName, String lastName, int age, double height, double weight, Long club_id, Pageable pageable);
}
