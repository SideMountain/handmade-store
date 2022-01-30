<template>
  <div>
    testtest
    <span>
      {{ test }}
    </span>
  </div>
</template>

<script lang="ts">
import { Vue, Component } from 'nuxt-property-decorator';

@Component
export default class Test extends Vue {
  test: string = 'aaa';
}
</script>
