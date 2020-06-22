package com.codegym.blogofme.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "club")
public class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "club_name")
    private String nameClub;

    @Column(name = "deleteIs")
    private boolean deleteIs;

    @OneToMany(mappedBy = "club")
    private Set<PlayerSoccer> playerSoccers;

    public Club() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameClub() {
        return nameClub;
    }

    public void setNameClub(String nameClub) {
        this.nameClub = nameClub;
    }

    public boolean isDeleteIs() {
        return deleteIs;
    }

    public void setDeleteIs(boolean deleteIs) {
        this.deleteIs = deleteIs;
    }

    public Set<PlayerSoccer> getPlayerSoccers() {
        return playerSoccers;
    }

    public void setPlayerSoccers(Set<PlayerSoccer> playerSoccers) {
        this.playerSoccers = playerSoccers;
    }
}
