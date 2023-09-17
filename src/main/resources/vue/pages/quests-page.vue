<template id="quests-page">
  <app-frame>
    <page-heading>Quests</page-heading>
    <v-card v-for="item in items" :key="item.id">
      <v-img :src="item.imageUrl" alt="Image" height="100px"></v-img>
      <v-card-title class="py-1">{{ item.title }}</v-card-title>
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
          <v-card-text>{{ item.description }} </v-card-text>
        </div>
      </v-expand-transition>
    </v-card>
  </app-frame>
</template>
<script>
Vue.component("quests-page", {
  data: () => ({
    items: [
      {
        id: 1,
        title: "Collect 5 Dandelion seeds",
        description: "Description for card 1",
        imageUrl: "/imgs/wild-dandelion.jpg",
      },
      {
        id: 2,
        title: "Water your plant 3 times",
        description: "Description for card 2",
        imageUrl: "/imgs/watering-flowers.jpg",
      },
    ],
    show: false,
  }),
  template: "#quests-page",
});
</script>
