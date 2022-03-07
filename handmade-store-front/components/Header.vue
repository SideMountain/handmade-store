<template>
  <div>
    <v-app-bar>
      <v-toolbar-title>Handmade Store</v-toolbar-title>
      <v-spacer />
      <nuxt-link to="/" class="ml-5">HOME</nuxt-link>
      <nuxt-link to="/" class="ml-5">NEWS</nuxt-link>
      <nuxt-link to="/" class="ml-5">INQUIRY</nuxt-link>
      <v-spacer />
      <v-btn class="ml-5" text>
        <v-icon x-large>mdi-magnify</v-icon>
      </v-btn>
      <v-btn class="ml-5" text @click="toCart()">
        <v-icon x-large>mdi-cart-outline</v-icon>
      </v-btn>
      <v-btn class="ml-5 mr-10" text @click="test()">
        <v-icon x-large>mdi-account</v-icon>
      </v-btn>
    </v-app-bar>
  </div>
</template>

<script lang="ts">
import { Vue, Component } from 'nuxt-property-decorator';
import Item from '@/domains/item/Item';

@Component
export default class Header extends Vue {
  sample!: Item;

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
