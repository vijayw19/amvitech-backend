package amvitech.db;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface FeedbackRepository extends MongoRepository<Feedback, String> {

  public Feedback findByFirstname(String firstName);
  //public List<Feedback> findByLastName(String lastName);

}