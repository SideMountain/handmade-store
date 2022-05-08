<template>
  <div>
    <v-carousel height="200">
      <v-carousel-item
        v-for="(item, i) in items"
        :key="i"
        :src="item.src"
        reverse-transition="fade-transition"
        transition="fade-transition"
      />
    </v-carousel>
  </div>
</template>

<script lang="ts">
import { Vue, Component } from 'nuxt-property-decorator';

@Component
export default class Calousel extends Vue {
  items = [
    {
      src: '/img/no-image.png',
    },
    {
      src: '/img/no-image.png',
    },
    {
      src: '/img/no-image.png',
    },
    {
      src: '/img/no-image.png',
    },
  ];
}
</script>
