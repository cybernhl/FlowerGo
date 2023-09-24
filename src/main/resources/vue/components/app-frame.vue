<template id="app-frame">
  <v-app>
    <v-main>
      <v-container>
        <slot>this will be replaced by the slot content</slot>
      </v-container>
      <bottom-nav-menu>
        <bottom-nav-element icon="mdi-list-box-outline" path="/quests"
          >Quests</bottom-nav-element
        >
        <bottom-nav-element icon="mdi-shovel" path="/plant"
          >Plant</bottom-nav-element
        >
        <bottom-nav-element icon="mdi-flower-outline" path="/garden"
          >Garden</bottom-nav-element
        >
      </bottom-nav-menu>
    </v-main>
  </v-app>
</template>
<script>
Vue.component("app-frame", {
  template: "#app-frame",
});
</script>
