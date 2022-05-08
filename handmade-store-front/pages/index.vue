<template>
  <div>
    <calousel />
    <category-sheet />
    <recommend-item-sheet />
  </div>
</template>

<script lang="ts">
import { Vue, Component } from 'nuxt-property-decorator';

@Component
export default class Top extends Vue {}
</script>
