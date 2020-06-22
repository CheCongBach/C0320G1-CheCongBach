package com.codegym.blogofme.controllers;

import com.codegym.blogofme.entity.Club;
import com.codegym.blogofme.entity.PlayerSoccer;
import com.codegym.blogofme.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/clubs")
public class ClubControllers {
    @Autowired
    ClubService clubService;

    @GetMapping("")
    public ModelAndView listClub(@PageableDefault(value = 3) Pageable pageable) {
        Page<Club> clubs = clubService.findAllClub(pageable);
        ModelAndView modelAndView = new ModelAndView("club/list");
        modelAndView.addObject("clubs",clubs);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreateFormClub() {
        ModelAndView modelAndView = new ModelAndView("club/create");
        modelAndView.addObject("club",new Club());
        return modelAndView;
    }

    @PostMapping("/create")
    public String saveCreateClub(Club club, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("message2","Create New Club SuccessFully!!!");
        clubService.saveClub(club);
        return "redirect:/clubs";
    }

    @GetMapping("edit-club/{id}")
    public ModelAndView showEditClubForm(@PathVariable Long id) {
        return new ModelAndView("club/edit","club",clubService.findByIdClub(id));
    }

    @PostMapping("/edit-club")
    public String updatePlayerSoccer(@ModelAttribute Club club, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("message2", "Edit Club SuccessFully!!!");
        clubService.saveClub(club);
        return "redirect:/clubs";
    }

    @GetMapping("delete-club/{id}")
    public ModelAndView showDeletePlayerSoccerForm(@PathVariable Long id) {
        return new ModelAndView("club/delete","club",clubService.findByIdClub(id));
    }

    @PostMapping("delete-club")
    public String deletePlayerSoccer(@ModelAttribute Club club, RedirectAttributes redirectAttributes) {
        try {
            clubService.deleteClub(club.getId());
        } catch (Exception e) {
            return "500";
        }
        redirectAttributes.addFlashAttribute("message", "Delete Club SuccessFully!!!");
        return "redirect:/clubs";
    }
}
