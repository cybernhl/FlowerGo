<template id="plant-page">
  <app-frame>
    <page-heading>Plant</page-heading>
    <flower-loader v-if="inventory.loading === true"></flower-loader>
    <template v-if="inventory.loaded === true">
      <v-alert
          v-model="seedPlanted"
          dismissible
          color="warning"
          icon="mdi-flower"
      >
        Your seed was planted!
        You can see it in your <a href="/garden">garden</a>.
      </v-alert>
      <div v-if="inventory.data.seedList.length === 0">
        YOU DON'T HAVE ANY SEEDS! HAHAHA!
      </div>
      <div
          v-for="seed in inventory.data.seedList"
          class="d-flex justify-space-between align-center mt-3"
      >
        <div>
          {{ seed.color }}
          {{ seed.flowerType }}
        </div>
        <v-btn color="primary" @click="plantFlower(seed)" :loading="inventory.refreshing">Plant</v-btn>
      </div>
    </template>
  </app-frame>
</template>
<script>
Vue.component("plant-page", {
  data: () => ({
    inventory: new LoadableData("/api/inventory"),
    planting: false,
    seedPlanted: false,
  }),
  methods: {
    plantFlower(seed) {
      if (this.planting) return;
      this.planting = true;
      let data = {
          row: Math.floor(Math.random() * 6) + 5,
          col: Math.floor(Math.random() * 6),
          seed: seed
      };
      axios.post("/api/plant", data)
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
