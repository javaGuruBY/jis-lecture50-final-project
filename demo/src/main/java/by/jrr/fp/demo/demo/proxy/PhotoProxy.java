package by.jrr.fp.demo.demo.proxy;

import by.jrr.fp.demo.demo.model.Photo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "photo-service")//, url = "http://localhost:8080")
public interface PhotoProxy {
    String uri = "/photos";

    @GetMapping(uri)
    PagedModel<Photo> getAllPhotos();

}
