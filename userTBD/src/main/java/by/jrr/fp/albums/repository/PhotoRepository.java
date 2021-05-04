package by.jrr.fp.albums.repository;


import by.jrr.fp.albums.bean.Photo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//https://docs.spring.io/spring-data/rest/docs/current/reference/html/
//https://stackoverflow.com/questions/33018127/spring-data-rest-sort-by-multiple-properties
@RepositoryRestResource
public interface PhotoRepository extends JpaRepository<Photo, Long> {
//    title,asc
    Page<Photo> findAllByTitleContains(String title, Pageable pageable);

}
