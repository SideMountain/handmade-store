import Item from '@/domains/item/Item';

export default class CartItem {
  constructor(public item: Item, public quantity: number = 0) {}
}
