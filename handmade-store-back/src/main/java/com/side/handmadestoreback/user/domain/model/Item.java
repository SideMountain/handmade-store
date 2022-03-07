package com.side.handmadestoreback.user.domain.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {
  private String id;
  private String itemCategory;
  private String name;
  private Integer amount;
  private String images;
  private Integer sortNumber;
}
