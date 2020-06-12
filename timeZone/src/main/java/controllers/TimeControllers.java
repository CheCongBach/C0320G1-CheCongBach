package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.TimeZone;

@Controller
public class TimeControllers {
    @GetMapping("/")
    public String getTimeByTimeZone(ModelMap modelMap, @RequestParam(name = "city", required = false, defaultValue = "Asia/Ho_Chi_Minh")String city) {
        Date date = new Date();
        TimeZone timeZone = TimeZone.getDefault();
        TimeZone timeZone1 = TimeZone.getTimeZone(city);
        long local_time = date.getTime() + (timeZone1.getRawOffset() - timeZone.getRawOffset());
        date.setTime(local_time);
        modelMap.addAttribute("city", city);
        modelMap.addAttribute("date", date);
        return "timezone";
    }
}
