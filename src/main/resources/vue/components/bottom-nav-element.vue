<template id="bottom-nav-element">
  <v-btn :href="path" :ripple="false" :class="{ 'v-btn--active': currentPath === path }">
    <slot></slot>
    <v-icon>{{ icon }}</v-icon>
  </v-btn>
</template>
<script>
Vue.component("bottom-nav-element", {
  template: "#bottom-nav-element",
  props: ["path", "icon"],
  data: () => ({
    currentPath: window.location.pathname,
  }),
});
</script>
