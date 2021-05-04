package by.jrr.fp.web.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping("/")
    public ModelAndView openHome() {
        ModelAndView modelAndView = new ModelAndView();
        /* need to first step: prove it's working
        modelAndView.setViewName("app");
        modelAndView.addObject("text", "it is working!");
        */
        modelAndView.setViewName("home");
        modelAndView.addObject("title", "Home");
        return modelAndView;
    }
}
