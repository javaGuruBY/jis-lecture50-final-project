package by.jrr.fp.demo.demo.controller;

import by.jrr.fp.demo.demo.model.Photo;
import by.jrr.fp.demo.demo.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.PagedModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PhotoController {

    @Autowired
    PhotoService photoService;

    @GetMapping("/photo")
    public ModelAndView openPhoto() {
        var model = new ModelAndView();
        model.setViewName("photos");
        model.addObject("title", "My Photos");

        PagedModel<Photo> photosDto = photoService.getAllPhoto();
        model.addObject("photos", photosDto.getContent());
        model.addObject("pages_meta", photosDto.getMetadata());
        model.addObject("pages_links", photosDto);

        photosDto.getMetadata().getNumber();
        photosDto.getMetadata().getSize();
        photosDto.getMetadata().getTotalElements();
        photosDto.getMetadata().getTotalPages();

        photosDto.getNextLink();
        photosDto.getPreviousLink();

        return model;
    }
}
