<template id="quest-card">
  <div class="center-container">
    <v-card width="300px">
      <v-img :src="app.flowergo.quest.imageUrl" alt="Image" height="100px"></v-img>
      <v-card-title class="py-1">{{ quest.title }}</v-card-title>
      <v-card-actions>
        <v-spacer></v-spacer>
        <v-btn small @click="show = !show">
          Hint
          <v-icon v-if="show">mdi-chevron-up</v-icon>
          <v-icon v-if="!show">mdi-chevron-down</v-icon>
        </v-btn>
      </v-card-actions>
      <v-expand-transition>
        <div v-show="show">
          <v-divider></v-divider>
          <v-card-text>{{ quest.description }} </v-card-text>
        </div>
      </v-expand-transition>
    </v-card>
  </div>
</template>
<style>
.center-container {
  display: flex;
  justify-content: center;
  align-items: center;
  /* height: 100vh; Optional: Centers vertically within the viewport */
}
</style>
<script>
Vue.component("app.flowergo.quest-card", {
  props: ["quest"],
  data: () => ({
    show: false,
  }),
  template: "#app.flowergo.quest-card",
});
</script>
