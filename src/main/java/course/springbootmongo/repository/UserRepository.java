package course.springbootmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import course.springbootmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String> {

}
