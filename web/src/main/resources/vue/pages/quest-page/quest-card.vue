<template id="quest-card">
  <v-card class="quest-card mt-5">
    <v-img :src="quest.imageUrl" alt="Image" height="100px"></v-img>
    <v-card-actions class="pa-3">
      <h2>{{ quest.title }}</h2>
      <v-spacer></v-spacer>
      <v-btn small @click="show = !show" class="pl-3">
        Hint
        <v-icon v-if="show">mdi-chevron-up</v-icon>
        <v-icon v-if="!show">mdi-chevron-down</v-icon>
      </v-btn>
    </v-card-actions>
    <v-expand-transition>
      <div v-show="show">
        <v-divider></v-divider>
        <v-card-text>{{ quest.description }}</v-card-text>
      </div>
    </v-expand-transition>
  </v-card>
</template>
<script>
Vue.component("quest-card", {
  props: ["quest"],
  data: () => ({
    show: false,
  }),
  template: "#quest-card",
});
</script>
<style>
.quest-card .v-card__actions {
  background: #d9f067;
}

.quest-card {
  box-shadow: 0 3px 0 0 #233713 !important;
}

.quest-card h2 {
  font-size: min(22px, 5vw);
}
</style>
