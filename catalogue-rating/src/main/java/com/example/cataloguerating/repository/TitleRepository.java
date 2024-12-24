package com.example.cataloguerating.repository;

import com.example.cataloguerating.repository.entity.Title;

import java.util.Optional;
import java.util.UUID;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface TitleRepository extends CrudRepository<Title, UUID> {
  Optional<Title> getTitleById(UUID id);
  Page<Title> findAll(Pageable page);
}
