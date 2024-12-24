package com.example.contentdelivery.feign;

import com.example.contentdelivery.dto.RatingDto;
import java.util.UUID;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "catalogur-rating", url = "http://catalogue-rating")
public interface RatingFeign {
  @GetMapping("/rating/{id}")
  RatingDto getRating(@PathVariable("id") UUID id);
}
