<template>
  <div>
    <h2>{{ $route.params.categoryId }}</h2>
    <v-sheet outlined class="ma-2 pa-3 rounded">
      <items :items="items" />
    </v-sheet>
  </div>
</template>

<script lang="ts">
import { Vue, Component } from 'nuxt-property-decorator';
import Item from '@/domains/item/Item';

@Component
export default class CateforyTop extends Vue {
  readonly items: Item[] = [
    {
      id: 'itemId1',
      categoryId: 'categoryId1',
      name: 'item1',
      amount: 1980,
      images: '/img/no-image.png',
    },
    {
      id: 'itemId2',
      categoryId: 'categoryId1',
      name: 'item2',
      amount: 1980,
      images: '/img/no-image.png',
    },
    {
      id: 'itemId3',
      categoryId: 'categoryId1',
      name: 'item3',
      amount: 1980,
      images: '/img/no-image.png',
    },
    {
      id: 'itemId4',
      categoryId: 'categoryId1',
      name: 'item4',
      amount: 1980,
      images: '/img/no-image.png',
    },
    {
      id: 'itemId5',
      categoryId: 'categoryId1',
      name: 'item5',
      amount: 1980,
      images: '/img/no-image.png',
    },
    {
      id: 'itemId6',
      categoryId: 'categoryId1',
      name: 'item6',
      amount: 1980,
      images: '/img/no-image.png',
    },
    {
      id: 'itemId7',
      categoryId: 'categoryId1',
      name: 'item7',
      amount: 1980,
      images: '/img/no-image.png',
    },
    {
      id: 'itemId8',
      categoryId: 'categoryId1',
      name: 'item8',
      amount: 1980,
      images: '/img/no-image.png',
    },
    {
      id: 'itemId9',
      categoryId: 'categoryId1',
      name: 'item9',
      amount: 1980,
      images: '/img/no-image.png',
    },
  ];
}
</script>
