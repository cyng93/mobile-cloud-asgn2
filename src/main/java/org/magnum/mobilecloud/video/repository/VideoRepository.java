package org.magnum.mobilecloud.video.repository;

import java.util.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


// In order to let Spring DATA JPA auto generate similar code to manipulate underneath Video Entity,
// First, add `@Repository` annotation, Second, make sure the class extends `CrudRepository`
@Repository
public interface VideoRepository extends CrudRepository<Video, Long> {
    public List<Video> findByName(String name);
    public List<Video> findByNameAndCategory(String name, String cat);
    public List<Video> findByDurationLessThan(long duration);
}
