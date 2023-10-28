<template id="plant-page">
  <app-frame>
    <page-heading>Plant</page-heading>
    <flower-loader v-if="inventory.loading === true"></flower-loader>
    <template v-if="inventory.loaded === true">
      <div
        v-for="seed in inventory.data.seedList"
        class="d-flex justify-space-between align-center mt-3"
      >
        <div>
          {{ seed.color }}
          {{ seed.flowerType }}
        </div>
        <v-btn color="primary" @click="plantFlower(seed)">Plant</v-btn>
      </div>
    </template>
  </app-frame>
</template>
<script>
Vue.component("plant-page", {
  data: () => ({
    inventory: new LoadableData("/api/inventory", false),
    planting: false,
  }),
  methods: {
    plantFlower(seed) {
      this.planting = true;
      axios.post("/api/plant", seed)
        .then(() => this.inventory.refresh(false))
        .catch(err => console.log("Error", err))
        .finally(() => this.planting = false);
    },
  },
  template: "#plant-page",
});
</script>
