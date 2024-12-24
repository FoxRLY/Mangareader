package com.example.contentdelivery.dto;

import java.util.UUID;
import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class RatingDto {
  UUID titleId;
  String titleName;
  Float rating;
}

