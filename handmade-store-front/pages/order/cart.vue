<template>
  <div>
    <h2>カート内の商品</h2>
    <v-sheet outlined class="ma-2 pa-3 rounded">
      <v-sheet
        outlined
        v-for="(item, index) in items"
        :key="index"
        class="mb-2 rounded"
      >
        <v-row>
          <v-col clos="3">
            <v-img :src="`/img/no-image.png`" width="80px" class="ml-2" />
          </v-col>
          <v-col cols="3" class="my-auto">
            <div>
              {{ item.name }}
            </div>
            <div>
              {{ itemAmount(item.amount) }}
            </div>
          </v-col>
          <v-col cols="2" class="my-auto">
            {{ item.quantity }}
          </v-col>
          <v-col cols="3" class="my-auto">
            {{ itemTotalAmount(item) }}
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
import CartItem from '@/domains/cart/CartItem';

@Component
export default class Cart extends Vue {
  readonly items: CartItem[] = [
    {
      id: 'itemId1',
      name: 'item1',
      amount: 1980,
      images: '/img/no-image.png',
      quantity: 2,
    },
    {
      id: 'itemId2',
      name: 'item2',
      amount: 1980,
      images: '/img/no-image.png',
      quantity: 5,
    },
  ];

  itemAmount(amount: number) {
    return amount.toLocaleString() + '円';
  }

  itemTotalAmount(item: CartItem) {
    return (item.amount * item.quantity).toLocaleString() + '円';
  }

  get totalAmount() {
    return (
      this.items
        .reduce((acc, curr) => acc + curr.amount * curr.quantity, 0)
        .toLocaleString() + '円'
    );
  }
}
</script>
