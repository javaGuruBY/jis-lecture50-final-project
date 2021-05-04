package by.jrr.fp.albums;

import by.jrr.fp.albums.bean.Photo;
import by.jrr.fp.albums.client.PhotoClient;
import by.jrr.fp.albums.repository.PhotoRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

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
