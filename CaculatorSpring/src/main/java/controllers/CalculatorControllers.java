package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorControllers {
    @GetMapping("calculator")
    public String calculator() {
        return "calculator";
    }

    @GetMapping("calculator2")
    public String result(@RequestParam double number1, @RequestParam double number2, @RequestParam String button, ModelMap modelMap) {
        double result ;
        switch (button) {
            case "Addition": {
                result = number1 + number2;
                break;
            }
            case "Subtraction": {
                result = number1 - number2;
                break;
            }
            case "Multiplication": {
                result = number1 * number2;
                break;
            }
            case "Division": {
                result = number1 / number2;
                break;
            }
            default:
                throw new IllegalStateException("Unexpected value: " + button);
        }
        modelMap.addAttribute("result", result);
        return "calculator";
    }
}
