package com.example.springbootdockersecrets;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDockerSecretsApplication {

  //@Value("${db_username}")
  //public String dbUserNamePath;

  public static void main(String[] args) {

    SpringApplication.run(SpringbootDockerSecretsApplication.class, args);
  }

  @GetMapping("/greet")
  public String greet() throws IOException {
    var mySecret = System.getenv("MY_SECRET");
    var mySecret2 = System.getenv("ANOTHER_SECRET");

    //String dbUserName = new String(Files.readAllBytes(Paths.get(dbUserNamePath)));
    System.out.println("Hello your secret is " + mySecret + " and" + mySecret2);
    return "Hello the db username is "; // + dbUserName;
  }
}
