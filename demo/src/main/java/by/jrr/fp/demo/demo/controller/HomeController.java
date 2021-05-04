package by.jrr.fp.demo.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping("/")
    public ModelAndView openHomePage() {
        var modelAndView = new ModelAndView();
        modelAndView.setViewName("home");

        modelAndView.addObject("title", "myHome");
        return modelAndView;

    }
}
