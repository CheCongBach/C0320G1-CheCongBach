package controllers;

import model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
@RequestMapping("employee/")
public class EmployeeControllers {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public EmployeeControllers() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

//    @RequestMapping(value = "showForm", method = RequestMethod.GET)
//    public String email(Locale locale, Model model) {
//        return "employee/create";
//    }

    private boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    @GetMapping("showForm")
    public String showForm(ModelMap modelMap) {
        modelMap.addAttribute("employee", new Employee());
        return "employee/create";
    }

    @PostMapping("addEmployee")
    public String submit(@ModelAttribute("employee") Employee employee, BindingResult result, ModelMap modelMap) {
        boolean isValid = this.validate(employee.getEmail());
        if (!isValid ) {
            modelMap.addAttribute("message","Nhập email sai rồi bạn ơi");
            return "employee/create";
        }
        modelMap.addAttribute("id", employee.getId());
        modelMap.addAttribute("name", employee.getName());
        modelMap.addAttribute("email", employee.getEmail());
        modelMap.addAttribute("address", employee.getAddress());
        modelMap.addAttribute("contactNumber", employee.getContactNumber());
        return "employee/inform";
    }
}
