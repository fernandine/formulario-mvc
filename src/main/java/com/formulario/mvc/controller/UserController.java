package com.formulario.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.formulario.mvc.model.User;

@Controller
@RequestMapping("/users")
public class UserController {

	 @RequestMapping(method = RequestMethod.GET)
    public String usersForm(final Model model) {
        model.addAttribute("user", new User());

        return "userForm";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String result(@PathVariable User user) {
        return "result";
    }
}