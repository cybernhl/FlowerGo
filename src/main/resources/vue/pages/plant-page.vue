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
      <v-alert
        v-model="seedPlanted"
        dismissible
        color="warning"
        icon="mdi-flower"
      >
        Your seed was planted!
        You can see it in your <a href="/garden">garden</a>.
      </v-alert>
    </template>
  </app-frame>
</template>
<script>
Vue.component("plant-page", {
  data: () => ({
    inventory: new LoadableData("/api/inventory", false),
    planting: false,
    seedPlanted: false,
  }),
  methods: {
    plantFlower(seed) {
      this.planting = true;
      axios.post("/api/plant", seed)
        .then(() => {
          this.inventory.refresh(false);
          this.seedPlanted = true;
        })
        .catch(err => console.log("Error", err))
        .finally(() => this.planting = false);
    },
  },
  template: "#plant-page",
});
</script>
<style>
  .v-alert a {
    color: inherit !important;
  }
</style>