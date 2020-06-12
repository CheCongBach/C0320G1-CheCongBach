package controllers;

import com.sun.org.apache.xpath.internal.objects.XBoolean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
public class validateEmail {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public validateEmail() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String email(Locale locale, Model model) {
        return "email-validate";
    }

    private boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    @RequestMapping(value = "/validate", method = RequestMethod.POST)
    public String users(@RequestParam("email")String email, ModelMap modelMap) {
        boolean isvalid = this.validate(email);
        if (!isvalid) {
            modelMap.addAttribute("message","Email không hợp lệ");
            return "email-validate";
        }
        modelMap.addAttribute("email",email);
        return "email-success";
    }
}
