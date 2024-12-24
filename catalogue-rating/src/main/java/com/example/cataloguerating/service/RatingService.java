package com.example.cataloguerating.service;

import com.example.cataloguerating.model.RatingModel;
import com.example.cataloguerating.repository.TitleRepository;
import com.example.cataloguerating.repository.entity.Title;

// import java.util.Optional;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedModel;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RatingService {
  private final TitleRepository titleRepository;

  public RatingModel getTitleRating(UUID titleId) {
    // final Optional<Title> title = titleRepository.getTitleById(titleId);
    return RatingModel.builder()
        .titleId(titleId)
        .titleName("Some name")
        .rating(10.0f)
        .build();
  }

  public PagedModel<RatingModel> getRatingPage(Pageable pageRequest) {
    final Page<Title> titlePage = titleRepository.findAll(pageRequest);
    return new PagedModel<>(titlePage.map(title -> RatingModel.builder()
        .titleId(title.getId())
        .titleName(title.getName())
        .rating(10.0f)
        .build()));
  }
}
