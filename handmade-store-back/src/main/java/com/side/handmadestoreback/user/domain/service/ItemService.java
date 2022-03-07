package com.side.handmadestoreback.user.domain.service;

import javax.transaction.Transactional;

import com.side.handmadestoreback.user.domain.model.Item;
import com.side.handmadestoreback.user.domain.model.ItemEntity;
import com.side.handmadestoreback.user.domain.repository.ItemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ItemService {
  
  @Autowired
  private ItemRepository itemRepository;

  public Item getItemById(String id) {
    ItemEntity itemEntity = itemRepository.findById(id).get();
    Item item = new Item();
    copyEntityToBean(itemEntity, item);
    return item;
  }

  private void copyEntityToBean(ItemEntity itemEntity, Item item) {
    item.setId(itemEntity.getId());
    item.setItemCategory(itemEntity.getItemCategory());
    item.setName(itemEntity.getName());
    item.setAmount(itemEntity.getAmount());
    item.setImages(itemEntity.getImages());
    item.setSortNumber(itemEntity.getSortNumber());
  }
}
