package com.example.contentdelivery.controller;

import com.example.contentdelivery.dto.RatingDto;
import com.example.contentdelivery.feign.RatingFeign;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/rating")
@RequiredArgsConstructor
public class RatingController {
  private final RatingFeign ratingFeign;

  @GetMapping("/{id}")
  RatingDto getRating(@PathVariable UUID id) {
    return ratingFeign.getRating(id);
  }
}
