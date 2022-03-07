<template>
  <v-main id="main">
    <v-app>
      <header />
      <v-container>
        <nuxt />
      </v-container>
    </v-app>
  </v-main>
</template>

<script lang="ts">
import { Vue, Component } from 'nuxt-property-decorator';

@Component
export default class Default extends Vue {}
</script>
