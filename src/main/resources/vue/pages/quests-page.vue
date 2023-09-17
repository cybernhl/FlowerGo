<template id="quests-page">
  <app-frame>
    <page-heading>Quests</page-heading>
    <template v-for="item in items">
      <quest-card :quest="item"></quest-card>
    </template>
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
  }),
  template: "#quests-page",
});
</script>
