package com.example.cataloguerating.controller;

import com.example.cataloguerating.model.RatingModel;
import com.example.cataloguerating.service.RatingService;
import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/rating")
public class RatingController {
  private final RatingService ratingService;

  @GetMapping("/list")
  PagedModel<RatingModel> getRatingList(@RequestParam Pageable pageRequest) {
    return ratingService.getRatingPage(pageRequest);
  }

  @GetMapping("/{id}")
  RatingModel getTitleRating(@PathVariable("id") UUID titleId) {
    return ratingService.getTitleRating(titleId);
  }

  @GetMapping("/test")
  List<String> test(@RequestBody List<String> data) {
    return data;
  }
}
