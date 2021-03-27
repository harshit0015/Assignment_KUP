package com.knoldus.springboot.Controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * An Spring boot application with one Controller class (Maven project).
 *
 */

@SpringBootApplication
@RestController
public class Show_CurrentTime_interface_impl implements Show_CurrentTime_Interface {
  /**
  * Implementation of statusWithTime  Method which will be called when "localhost/status" api is called.
  *
  * @return Running with current time.
  */
  @GetMapping("/status")

  public String show_CurrentTime() {
    Date dateObj = new Date();
    DateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
    String localTime = timeFormat.format(dateObj);
   return "Running ".concat(localTime);
  /*  return systemMessage;*/
  }
}
