package com.ra.changelanguage.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping(value = {"/"," /login"})
    public String login(Model model){
        return "login";
    }
}