package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyConverter {
    @GetMapping("/currency")
    public String index() {
        return "currency-converter";
    }
    @PostMapping("/converter")
    public String converter(@RequestParam String usd, @RequestParam String rate, Model model) {
        float result = Float.parseFloat(usd) * Float.parseFloat(rate);
        model.addAttribute("vnd", result);
        return "vnd";
    }
}
