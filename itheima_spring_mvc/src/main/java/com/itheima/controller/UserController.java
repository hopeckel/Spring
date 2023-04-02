package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/quick")
    public String save() {
        System.out.println("Controller save running");
        return "success";
    }

    @RequestMapping("/quick2")
    public ModelAndView save2() {
        /**
         *
         */
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("username", "itcast");
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("/quick3")
    public ModelAndView save3(ModelAndView modelAndView) {

        modelAndView.addObject("username", "itcast");
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("/quick4")
    public String save4(Model model) {
        model.addAttribute("username", "itheima");
        return "success";
    }

    @RequestMapping("/quick5")
    public String save5(HttpServletRequest request) {
        request.setAttribute("username", "itheima222");
        return "success";
    }
}
