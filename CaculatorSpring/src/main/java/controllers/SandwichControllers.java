package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichControllers {
    @GetMapping("sandwich")
    public String sandwich() {
        return "sandwich";
    }

    @GetMapping("sandwich2")
    public String result(@RequestParam(defaultValue = "null")String condiment, ModelMap modelMap) {
        modelMap.addAttribute("condiment", condiment);
        return "showListCondiment";
    }
}
