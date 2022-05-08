<template>
  <header>
    <v-app-bar app>
      <v-app-bar-nav-icon @click="showDrawer = true"></v-app-bar-nav-icon>
      <v-spacer />
      <v-toolbar-title>Handmade Store</v-toolbar-title>
      <v-spacer />
      <v-btn class="ml-auto mr-n5" text @click="toCart()">
        <v-icon>mdi-cart-outline</v-icon>
      </v-btn>
    </v-app-bar>
    <nav-drawer :show-drawer.sync="showDrawer" />
  </header>
</template>

<script lang="ts">
import { Vue, Component } from 'nuxt-property-decorator';
import Item from '@/domains/item/Item';

@Component
export default class Header extends Vue {
  sample!: Item;
  showDrawer: boolean = false;

  toCart() {
    this.$router.push('/order/cart');
  }

  async test() {
    // const sample2 = await this.$axios.get('/test/message', {
    //   withCredentials: true,
    // });
    this.sample = await this.$axios.get('/test/message');
  }
}
</script>
