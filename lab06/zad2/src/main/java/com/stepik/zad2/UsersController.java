package com.stepik.zad2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsersController {

    @GetMapping("/")
    public String home(Model model) throws ParseException {
        String startDateString = "20/05/2007 07:32";
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date startDate = df.parse(startDateString);
        User user = new User(2, "Artur", 34, User.UserType.ADMIN, startDate);
        model.addAttribute("user", user);

        return "home";
    }
}
