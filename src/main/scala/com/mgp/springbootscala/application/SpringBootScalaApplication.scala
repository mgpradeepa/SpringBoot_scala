package com.mgp.springbootscala.application

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SpringBootScalaApplication {

  object SpringBootWebApplication extends App {
    SpringApplication.run(classOf[SpringBootScalaApplication]);
  }
}
