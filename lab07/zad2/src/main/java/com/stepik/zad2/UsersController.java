package com.stepik.zad2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;

@Controller
public class UsersController {

    private List<User> users;

    public UsersController() {
        this.users = new ArrayList<>(List.of(
                new User(1, "Alice", 25, User.UserType.REGISTERED, getRandomDate()),
                new User(2, "Bob", 30, User.UserType.ADMIN, getRandomDate()),
                new User(3, "Charlie", 22, User.UserType.GUEST, getRandomDate()),
                new User(4, "David", 28, User.UserType.REGISTERED, getRandomDate()),
                new User(5, "Eva", 35, User.UserType.ADMIN, getRandomDate()),
                new User(6, "Frank", 19, User.UserType.GUEST, getRandomDate()),
                new User(7, "Grace", 27, User.UserType.REGISTERED, getRandomDate()),
                new User(8, "Henry", 32, User.UserType.ADMIN, getRandomDate()),
                new User(9, "Ivy", 23, User.UserType.GUEST, getRandomDate()),
                new User(10, "Jack", 31, User.UserType.REGISTERED, getRandomDate())));
    }

    @GetMapping("/")
    public String home(Model model) throws ParseException {
        String startDateString = "20/05/2007 07:32";
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date startDate = df.parse(startDateString);
        User user = new User(2, "Artur", 29, User.UserType.ADMIN, startDate);
        model.addAttribute("user", user);

        return "home";
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("users", users);

        return "list";
    }

    @GetMapping("/create")
    public String createUser(Model model) {
        model.addAttribute("user", new User());

        return "form";
    }

    @PostMapping("/create")
    public String processUser(@Valid User user, Errors errors) {
        if (errors.hasErrors()) {
            return "form";
        }

        user.setId(users.size() + 1);
        user.setRegistrationDate(new Date());
        users.add(user);

        return "redirect:/list";
    }

    private static Date getRandomDate() {
        long startMillis = System.currentTimeMillis() - (365 * 24 * 60 * 60 * 1000);
        long endMillis = System.currentTimeMillis();

        long randomMillisSinceEpoch = ThreadLocalRandom.current().nextLong(startMillis, endMillis);

        return new Date(randomMillisSinceEpoch);
    }
}
