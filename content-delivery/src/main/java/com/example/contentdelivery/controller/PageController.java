package com.example.contentdelivery.controller;

import com.example.contentdelivery.dto.AddPageRequest;
import com.example.contentdelivery.feign.PageFeign;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/page")
@RequiredArgsConstructor
public class PageController {
  private final PageFeign pageFeign;

  @PostMapping
  void insertPage(@RequestBody AddPageRequest request) {
    pageFeign.insertPage(request);
  }

  @GetMapping
  Map<Long, String> getPage(@RequestParam String titleId,
               @RequestParam String chapterNumber,
               @RequestParam String pageNumber,
               @RequestParam String pageSize) {
    return pageFeign.getPage(titleId, chapterNumber, pageNumber, pageSize);
  }
}
