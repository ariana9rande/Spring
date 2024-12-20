package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterController
{
    @Autowired
    private MemberRegisterService memberRegisterService;

    @RequestMapping("/register/step1")
    public String handleStep1()
    {
        return "register/step1";
    }

    @RequestMapping(value = "/register/step2", method = RequestMethod.POST)
    public String handleStep2(@RequestParam(value = "agree", defaultValue = "false") Boolean agree,
                              Model model)
    {
        if (!agree)
        {
            return "register/step1";
        }
        model.addAttribute("registerRequest", new RegisterRequest());
        return "register/step2";
    }

    @RequestMapping(value = "/register/step2", method = RequestMethod.GET)
    public String handleStep2Get()
    {
        return "redirect:step1";
    }

    @RequestMapping(value = "/register/step3", method = RequestMethod.POST)
    public String handleStep3(RegisterRequest regReq)
    {
        try
        {
            memberRegisterService.regist(regReq);
            return "register/step3";
        } catch (AlreadyExistingMemberException | Exception ex)
        {
            return "register/step2";
        }
    }
}