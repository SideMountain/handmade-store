<template>
  <v-row>
    <v-col
      v-for="(item, index) in items"
      :key="index"
      class="d-flex pa-1"
      cols="4"
    >
      <v-card outlined class="pa-1" @click="toItem(item.id)">
        <v-img :src="`/img/no-image.png`" height="80px" class="mb-1" />
        <v-card-sub-title>
          {{ item.name }}
        </v-card-sub-title>
        <div>
          <v-card-text class="px-0 pb-0 text-right">
            {{ itemAmount(item.amount) }}
          </v-card-text>
        </div>
      </v-card>
    </v-col>
  </v-row>
</template>

<script lang="ts">
import { Vue, Component, Prop } from 'nuxt-property-decorator';
import Item from '@/domains/item/Item';

@Component
export default class Items extends Vue {
  @Prop()
  items!: Item[];

  itemAmount(amount: number) {
    return amount.toLocaleString() + '円';
  }

  toItem(itemId: string) {
    this.$router.push('/item/' + itemId);
  }
}
</script>
