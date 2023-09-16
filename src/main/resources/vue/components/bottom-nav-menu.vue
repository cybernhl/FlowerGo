<template id="bottom-nav-menu">
  <v-bottom-navigation
    height="64"
    fixed
    grow
    class="bottom-nav elevation-0"
    :class="classes"
  >
    <slot></slot>
  </v-bottom-navigation>
</template>
<script>
Vue.component("bottom-nav-menu", {
  template: "#bottom-nav-menu",
  props: ["classes"],
});
</script>
<style>
.bottom-nav {
  background: #fff;
  border-top: 1px solid rgba(0, 0, 0, 0.12);
}

.bottom-nav {
  bottom: calc(env(safe-area-inset-bottom)) !important;
}

.bottom-nav .v-btn {
  letter-spacing: 0.5px;
  font-weight: 600 !important;
}

.bottom-nav .v-btn::before {
  background-color: transparent;
}

.bottom-nav i::before {
  width: 56px;
  height: 32px;
  align-items: center;
  border-radius: 32px;
  display: flex;
  justify-content: center;
  margin-bottom: 4px;
}

.bottom-nav .v-btn--active i::before {
  background: rgba(0, 76, 255, 0.07);
}
</style>
