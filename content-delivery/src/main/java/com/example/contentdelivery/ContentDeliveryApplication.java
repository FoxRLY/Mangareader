package com.example.contentdelivery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ContentDeliveryApplication {

  public static void main(String[] args) {
    SpringApplication.run(ContentDeliveryApplication.class, args);
  }

}
