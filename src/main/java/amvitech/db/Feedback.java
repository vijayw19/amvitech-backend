package amvitech.db;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


public class Feedback {

  @Id
  public String id;

  public String firstname;
  public String lastname;

  public Feedback() {}

  public Feedback(String firstname, String lastname) {
    this.firstname = firstname;
    this.lastname = lastname;
  }

}