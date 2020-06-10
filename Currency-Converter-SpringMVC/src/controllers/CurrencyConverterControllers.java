package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyConverterControllers {
    @GetMapping("/converter")
    public String converter() {
        return "currencyConverter";
    }
    @PostMapping("/usd")
    public String currencyConverter(@RequestParam("usd") String usd,@RequestParam("rate") String rate, Model model) {
        float vnd = Float.parseFloat(usd) * Float.parseFloat(rate);
        model.addAttribute("vnd1",vnd);
        return "vnd";
    }
}
