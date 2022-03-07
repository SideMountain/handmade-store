package com.side.handmadestoreback.user.domain.repository;

import com.side.handmadestoreback.user.domain.model.ItemEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<ItemEntity, String> {}
