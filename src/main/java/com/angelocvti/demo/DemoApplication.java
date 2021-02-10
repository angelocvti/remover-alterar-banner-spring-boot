package com.angelocvti.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) {
    /*
    SpringApplication app = new SpringApplication(DemoApplication.class);
    app.setBannerMode(Banner.Mode.OFF);
    app.run(args);
    */

    // new SpringApplicationBuilder(DemoApplication.class).bannerMode(Banner.Mode.OFF).run(args);

    SpringApplication.run(DemoApplication.class, args);
  }
}
