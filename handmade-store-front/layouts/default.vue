<template>
  <v-main>
    <v-app>
      <Header />
      <nuxt />
    </v-app>
  </v-main>
</template>

<script lang="ts">
import { Vue, Component } from 'nuxt-property-decorator';

@Component
export default class Default extends Vue {}
</script>
