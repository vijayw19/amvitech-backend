package amvitech;

import org.springframework.boot.SpringApplication;
import amvitech.db.FeedbackRepository;
import amvitech.db.Feedback;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
@RestController
public class Application {
	
  @Autowired
  private FeedbackRepository repository;

  @RequestMapping("/Amvitech")
  public String home() {
	  // save a couple of customers
	  System.out.print("before save");
    repository.save(new Feedback("Sonu", "Monu"));
	System.out.print("after save");
	for (Feedback customer : repository.findAll()) {
      System.out.println(customer);
    }
    System.out.println();
    return "Welcome to Amvi Tech Solutions Home page";
  }
  
  @RequestMapping("/Amvitech/contacts")
  public String contacts() {
    return "Please see the contacts here:";
  }
  
  @RequestMapping("/Amvitech/enquiry")
  public String enquiry() {
    return "Welcome to Amvi Tech Solutions enquiry page";
  }

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

}