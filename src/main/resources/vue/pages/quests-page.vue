<template id="quests-page">
  <app-frame>
    <h1 class="text-center mb-4">Quests</h1>
    <v-card>
      <v-img src="/imgs/wildDandelion.jpg" height="130px"></v-img>
      <v-card-title class="py-1">Collect 5 Dandelion seeds</v-card-title>
      <v-card-actions>
        <v-spacer></v-spacer>
        <v-btn @click="show = !show">
          Hint
          <v-icon v-if="show">mdi-chevron-up</v-icon>
          <v-icon v-if="!show">mdi-chevron-down</v-icon>
        </v-btn>
      </v-card-actions>
      <v-expand-transition>
        <div v-show="show">
          <v-divider></v-divider>
          <v-card-text>
            I'm a thing. But, like most politicians, he promised more than he
            could deliver. You won't have time for sleeping, soldier, not with
            all the bed making you'll be doing. Then we'll go with that data
            file! Hey, you add a one and two zeros to that or we walk! You're
            going to do his laundry? I've got to find a way to escape.
          </v-card-text>
        </div>
      </v-expand-transition>
    </v-card>
  </app-frame>
</template>
<script>
Vue.component("quests-page", {
  data: () => ({
    show: false,
  }),
  template: "#quests-page",
});
</script>
