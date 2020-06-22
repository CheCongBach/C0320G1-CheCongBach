package com.codegym.blogofme.controllers;

import com.codegym.blogofme.entity.Club;
import com.codegym.blogofme.entity.PlayerSoccer;
import com.codegym.blogofme.service.ClubService;
import com.codegym.blogofme.service.PlayerSoccerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("playersoccers")
public class PlayerSoccerControllers {
    @Autowired
    PlayerSoccerService playerSoccerService;

    @Autowired
    ClubService clubService;

    @ModelAttribute("clubs")
    public List<Club> clubs() {
        List<Club> clubs = clubService.findAllClubs();
        return clubs;
    }

    @GetMapping("")
    public ModelAndView listPlayerSoccer(@RequestParam("s") Optional<String> s, @RequestParam("s1") Optional<String> s1, @RequestParam("s2") Optional<Long> s2, @RequestParam("s3") Optional<String> s3, @RequestParam("s4") Optional<Integer> s4, @PageableDefault(value = 5) Pageable pageable) {
        ModelAndView modelAndView = new ModelAndView("playerSoccer/list");
        Page<PlayerSoccer> playerSoccers;
        if (s.isPresent()) {
            playerSoccers = playerSoccerService.findPlayerSoccerByName(s.get(), pageable);
            modelAndView.addObject("s", s.get());
        } else if (s1.isPresent() && s2.isPresent()) {
            playerSoccers = playerSoccerService.findPlayerSoccerByNameAndClubId(s1.get(), s2.get(), pageable);
            modelAndView.addObject("s1", s1.get());
            modelAndView.addObject("s2", s2.get());
        } else if (s3.isPresent() && s4.isPresent()) {
            playerSoccers = playerSoccerService.findPlayerSoccerByLastNameAndAge(s3.get(), s4.get(), pageable);
            modelAndView.addObject("s3", s3.get());
            modelAndView.addObject("s4", s4.get());
        } else {
            playerSoccers = playerSoccerService.findAllPlayerSoccer(pageable);
        }
        modelAndView.addObject("playerSoccers",playerSoccers);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreateFormPlayer() {
        ModelAndView modelAndView = new ModelAndView("playerSoccer/create");
        modelAndView.addObject("playerSoccer",new PlayerSoccer());
        return modelAndView;
    }

    @PostMapping("/create")
    public String savaCreatePlayerSoccer(@Valid @ModelAttribute("playerSoccer") PlayerSoccer playerSoccer, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return "playerSoccer/create";
        } else if (playerSoccer == null) {
            return "404";
        } else {
            try {
                playerSoccerService.savePlayerSoccer(playerSoccer);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            redirectAttributes.addFlashAttribute("message", "Create New Player SuccessFully!!!");
            return "redirect:/playersoccers";
        }
    }

    @GetMapping("edit-player/{id}")
    public ModelAndView showEditPlayerSoccerForm(@PathVariable Long id) {
        return new ModelAndView("playerSoccer/edit","playerSoccer",playerSoccerService.findByIdPlayerSoccer(id));
    }

    @PostMapping("/edit-player")
    public String updatePlayerSoccer(@ModelAttribute PlayerSoccer playerSoccer, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("message", "Edit Player SuccessFully!!!");
        playerSoccerService.savePlayerSoccer(playerSoccer);
        return "redirect:/playersoccers";
    }

    @GetMapping("delete-player/{id}")
    public ModelAndView showDeletePlayerSoccerForm(@PathVariable Long id) {
        return new ModelAndView("playerSoccer/delete","playerSoccer",playerSoccerService.findByIdPlayerSoccer(id));
    }

    @PostMapping("delete-player")
    public String deletePlayerSoccer(@ModelAttribute PlayerSoccer playerSoccer, RedirectAttributes redirectAttributes) {
        try {
            playerSoccerService.deletePlayerSoccer(playerSoccer.getId());
        } catch (Exception e) {
            return "500";
        }
        redirectAttributes.addFlashAttribute("message", "Delete Player SuccessFully!!!");
        return "redirect:/playersoccers";
    }
}
