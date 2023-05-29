package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController
{
    // same as @GetMapping("/hello")
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(Model model, @RequestParam(value = "name", required = false) String name)
    {
        model.addAttribute("greeting", "안녕하세요, " + name);
        return "hello";
    }
}