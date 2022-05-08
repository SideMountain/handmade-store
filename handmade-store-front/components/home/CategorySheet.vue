<template>
  <div>
    <h2>カテゴリー</h2>
    <v-row class="mt-2">
      <v-col
        v-for="(category, index) in categories"
        :key="index"
        cols="3"
        class="d-flex pa-1"
      >
        <v-card outlined class="pa-1" @click="toCategory(category.id)">
          <v-img :src="`img/no-image.png`" height="60px" />
          <div class="px-0 py-1 text-caption">{{ category.name }}</div>
        </v-card>
      </v-col>
    </v-row>
  </div>
</template>

<script lang="ts">
import { Vue, Component } from 'nuxt-property-decorator';
import Category from '@/domains/category/Cateogry';

@Component
export default class CategorySheet extends Vue {
  readonly categories: Category[] = [
    { id: 'categoryId1', name: 'categoryName1' },
    { id: 'categoryId2', name: 'categoryName2' },
    { id: 'categoryId3', name: 'categoryName3' },
    { id: 'categoryId4', name: 'categoryName4' },
    { id: 'categoryId5', name: 'categoryName5' },
    { id: 'categoryId6', name: 'categoryName6' },
    { id: 'categoryId7', name: 'categoryName7' },
    { id: 'categoryId8', name: 'categoryName8' },
  ];

  toCategory(categoryId: string) {
    this.$router.push('/category/' + categoryId);
  }
}
</script>
