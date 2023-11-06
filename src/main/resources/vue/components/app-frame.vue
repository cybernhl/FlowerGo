<template id="app-frame">
  <v-app>
    <v-main v-if="$javalin.state.needsTutorial">
      <v-container>
        <tutorial-section></tutorial-section>
      </v-container>
    </v-main>
    <v-main v-if="!$javalin.state.needsTutorial">
      <v-container>
        <slot>
          This will be replaced by the slot content
          (which is the content of each page)
        </slot>
      </v-container>
      <bottom-nav-menu>
        <bottom-nav-element icon="mdi-list-box-outline" path="/quests">
          Quests
        </bottom-nav-element>
        <bottom-nav-element icon="mdi-flower-outline" path="/garden">
          Garden
        </bottom-nav-element>
        <bottom-nav-element icon="mdi-shovel" path="/plant">
          Plant
        </bottom-nav-element>
      </bottom-nav-menu>
    </v-main>
  </v-app>
</template>
<script>
Vue.component("app-frame", {
  template: "#app-frame",
});
</script>
