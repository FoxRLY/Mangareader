package com.example.cataloguerating.model;

import java.util.UUID;
import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class RatingModel {
  UUID titleId;
  String titleName;
  Float rating;
}
