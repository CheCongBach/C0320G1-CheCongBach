package controllers;

import dao.UsersDao;
import model.Login;
import model.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsersControllers {
    @GetMapping("/")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("login", "login", new Login());
        return modelAndView;
    }
    @PostMapping("/login")
    public ModelAndView login(@ModelAttribute("login")Login login) {
        Users users = UsersDao.checkLogin(login);
        if (users == null) {
            ModelAndView modelAndView = new ModelAndView("error");
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("users");
            modelAndView.addObject("users", users);
            return modelAndView;
        }
    }
}
