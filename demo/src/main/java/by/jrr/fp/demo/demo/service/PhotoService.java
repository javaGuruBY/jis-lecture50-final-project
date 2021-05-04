package by.jrr.fp.demo.demo.service;

import by.jrr.fp.demo.demo.model.Photo;
import by.jrr.fp.demo.demo.proxy.PhotoProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.PagedModel;
import org.springframework.stereotype.Service;

@Service
public class PhotoService {

    @Autowired
    PhotoProxy photoProxy;

    public PagedModel<Photo> getAllPhoto() {
        return photoProxy.getAllPhotos();
    }
}
