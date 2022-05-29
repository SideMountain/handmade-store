<template>
  <div v-if="!$fetchState.pending">
    <h2>カート内の商品</h2>
    <v-sheet outlined class="ma-2 pa-3 rounded">
      <v-sheet
        outlined
        v-for="(cartItem, index) in cart.cartItems"
        :key="index"
        class="mb-2 rounded"
      >
        <v-row>
          <v-col clos="3">
            <v-img :src="`/img/no-image.png`" width="80px" class="ml-2" />
          </v-col>
          <v-col cols="3" class="my-auto">
            <div>
              {{ cartItem.item.name }}
            </div>
            <div>
              {{ itemAmount(cartItem.item.amount) }}
            </div>
          </v-col>
          <v-col cols="2" class="my-auto">
            {{ cartItem.quantity }}
          </v-col>
          <v-col cols="3" class="my-auto">
            {{ itemTotalAmount(cartItem) }}
          </v-col>
        </v-row>
      </v-sheet>
      <div class="text-right text-h6">
        {{ totalAmount }}
      </div>
    </v-sheet>
  </div>
</template>

<script lang="ts">
import { Vue, Component } from 'nuxt-property-decorator';
import Cart from '@/domains/cart/Cart';
import CartItem from '@/domains/cart/CartItem';
import CartDataManager from '@/domains/cart/CartDataManager';

@Component
export default class CartTop extends Vue {
  cart!: Cart;

  async fetch() {
    this.cart = await CartDataManager.getCart();
  }

  itemAmount(amount: number) {
    return amount.toLocaleString() + '円';
  }

  itemTotalAmount(cartItem: CartItem) {
    return (cartItem.item.amount * cartItem.quantity).toLocaleString() + '円';
  }

  get totalAmount() {
    return (
      this.cart.cartItems
        .reduce((acc, curr) => acc + curr.item.amount * curr.quantity, 0)
        .toLocaleString() + '円'
    );
  }
}
</script>
