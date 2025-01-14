package com.example.contentdelivery.dto;

import java.util.UUID;
import lombok.Builder;
import lombok.Value;

@Builder(toBuilder = true)
@Value
public class AddPageRequest {
  UUID mangaId;
  Long chapterNumber;
  Long pageNumber;
  String data;
}
