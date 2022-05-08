<template>
  <v-sheet outlined class="ma-2 pa-3 rounded">
    <v-img :src="`/img/no-image.png`" height="200px" />
    {{ $route.params.itemId }}
    <v-row>
      <v-col cols="6">
        {{ itemAmount }}
      </v-col>
      <v-col cols="3">
        <v-select v-model="itemCount" :items="counts" dense />
      </v-col>
      <v-col cols="3">
        <v-btn @click="alert()"><v-icon>mdi-cart-plus</v-icon></v-btn>
      </v-col>
    </v-row>
  </v-sheet>
</template>

<script lang="ts">
import { Vue, Component } from 'nuxt-property-decorator';
import Item from '~/domains/item/Item';

@Component
export default class itemTop extends Vue {
  readonly item: Item = {
    id: 'itemId1',
    categoryId: 'categoryId1',
    name: 'item1',
    amount: 1980,
    images: '/img/no-image.png',
  };

  readonly counts: number[] = [...Array(5)].map((_, i) => i + 1);

  itemCount: number = 1;

  get itemAmount() {
    return this.item.amount.toLocaleString() + '円';
  }

  alert() {
    alert(this.itemCount);
  }
}
</script>
