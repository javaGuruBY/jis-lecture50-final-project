package by.jrr.fp.web.proxy;

import by.jrr.fp.web.model.Photo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "photo-service", url = "http://localhost:8080")
public interface PhotoProxy {
    String uri = "/photos";

    @GetMapping(uri)
    PagedModel<Photo> getAllPhotos();
}
