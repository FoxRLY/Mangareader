package com.example.contentdelivery.feign;

import com.example.contentdelivery.dto.AddPageRequest;
import java.util.Map;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

8085:80

@FeignClient(name = "page-management", url = "http://page-management")
public interface PageFeign {
  @GetMapping("/pages")
  Map<Long, String> getPage(@RequestParam String titleId,
                            @RequestParam String chapterNumber,
                            @RequestParam String pageNumber,
                            @RequestParam String pageSize);

  @PostMapping("/pages")
  void insertPage(@RequestBody AddPageRequest request);
}
