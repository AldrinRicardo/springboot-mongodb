package course.springbootmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import course.springbootmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}
