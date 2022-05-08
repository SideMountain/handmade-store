<template>
  <v-navigation-drawer v-model="showDrawer_" fixed temporary>
    <v-list nav dense>
      <v-list-item-group>
        <v-list-item @click="showDrawer_ = false"> ✖ </v-list-item>
        <template v-for="(nav, index) in navigations">
          <v-list-item
            :key="index"
            :name="nav.name"
            exact-active-class="primary"
            @click="pageTransition(nav.to)"
          >
            {{ nav.title }}
          </v-list-item>
        </template>
      </v-list-item-group>
    </v-list>
  </v-navigation-drawer>
</template>

<script lang="ts">
import { Vue, Component, PropSync } from 'nuxt-property-decorator';

@Component
export default class NavDrawer extends Vue {
  @PropSync('showDrawer', { type: Boolean })
  showDrawer_!: boolean;

  readonly navigations = [
    {
      title: 'HOME',
      name: 'home',
      to: '/',
    },
    {
      title: 'NEWS',
      name: 'news',
      to: '/news',
    },
    {
      title: 'INQUARY',
      name: 'inquary',
      to: '/inquary',
    },
    {
      title: 'ACCOUNT',
      name: 'account',
      to: '/account',
    },
  ];

  pageTransition(to: any) {
    this.showDrawer_ = false;
    this.$router.push(to);
  }
}
</script>
