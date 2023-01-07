package course.springbootmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import course.springbootmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

	List<Post> findByTitleContainingIgnoreCase(String text); //query method
}
