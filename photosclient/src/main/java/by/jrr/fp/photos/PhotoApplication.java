package by.jrr.fp.photos;

import by.jrr.fp.photos.bean.Photo;
import by.jrr.fp.photos.client.PhotoClient;
import by.jrr.fp.photos.repository.PhotoRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class PhotoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(PhotoApplication.class, args);

		PhotoClient photoClient = ctx.getBean(PhotoClient.class);
		PhotoRepository photoRepository = ctx.getBean(PhotoRepository.class);

		Iterable<Photo> photos = photoClient.getPhotos();
		photoRepository.saveAll(photos);

	}

}
