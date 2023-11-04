<template id="garden-page">
  <app-frame>
    <h1 class="text-center mb-4">Garden</h1>
    <div v-if="garden.loading === true">
      <flower-loader></flower-loader>
    </div>
    <div v-if="garden.loadError">
      <v-alert type="error">
        Failed to load garden
      </v-alert>
    </div>
    <template v-if="garden.loaded === true">
      <div v-if="garden.data.length === 0">
        YOU DON'T HAVE ANY FLOWERS! HAHAHA!
      </div>
      <v-card v-for="flower in garden.data" class="d-flex justify-space-between align-center mt-3">
        {{ flower }}
      </v-card>
    </template>
  </app-frame>
</template>
<script>
Vue.component("garden-page", {
  template: "#garden-page",
  data: () => ({
    garden: new LoadableData("/api/garden"),
  }),
});
</script>
