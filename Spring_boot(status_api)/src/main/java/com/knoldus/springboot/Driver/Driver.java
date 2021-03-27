package com.knoldus.springboot.Driver;

import org.springframework.boot.SpringApplication;
import com.knoldus.springboot.Controller.Show_CurrentTime_interface_impl;

/**
 * Class with main method that runs SpringBoot Application.
 */

public final class Driver {
  private Driver() { }
  /**
   * main method runs spring boot Application.
   * @param args String array.
   */

  public static void main(final String[] args)
  {
    SpringApplication.run(Show_CurrentTime_interface_impl.class, args);
  }
}
