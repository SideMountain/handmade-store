<template>
  <v-sheet outlined class="ma-2 pa-3 rounded">
    <v-img :src="`/img/no-image.png`" height="200px" />
    {{ $route.params.itemId }}
    <v-row>
      <v-col cols="6">
        {{ displayAmount }}
      </v-col>
      <v-col cols="3">
        <v-select v-model="quantity" :items="quantities" dense />
      </v-col>
      <v-col cols="3">
        <v-btn @click="addCart()"><v-icon>mdi-cart-plus</v-icon></v-btn>
      </v-col>
    </v-row>
  </v-sheet>
</template>

<script lang="ts">
import { Vue, Component } from 'nuxt-property-decorator';
import Item from '@/domains/item/Item';
import Cart from '@/domains/cart/Cart';
import CartItem from '@/domains/cart/CartItem';
import CartDataManager from '@/domains/cart/CartDataManager';

@Component
export default class ItemTop extends Vue {
  readonly item: Item = {
    id: 'itemId1',
    categoryId: 'categoryId1',
    name: 'item1',
    amount: 1980,
    images: '/img/no-image.png',
  };

  readonly quantities: number[] = [...Array(5)].map((_, i) => i + 1);

  quantity: number = 1;
  cart!: Cart;
  cartItem!: CartItem;

  addCart() {
    this.cartItem = { item: this.item, quantity: this.quantity };
    this.cart = CartDataManager.getCart();
    this.cart.cartItems.push(this.cartItem);
    CartDataManager.setCart(this.cart);
  }

  get displayAmount() {
    return this.item.amount.toLocaleString() + '円';
  }

  alert() {
    alert(this.quantity);
  }
}
</script>
