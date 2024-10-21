package com.hjh.movie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController
{
    @GetMapping("/admin/dashboard")
    public String dashboard()
    {
        return "admin/dashboard";
    }
}
