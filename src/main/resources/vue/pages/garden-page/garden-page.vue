<template id="garden-page">
  <app-frame>
    <div v-if="garden.loading === true">
      <flower-loader></flower-loader>
    </div>
    <div v-if="garden.loadError">
      <v-alert type="error">Failed to load garden</v-alert>
    </div>
    <template v-if="garden.loaded === true">
      <div v-if="garden.data.length === 0">
        <v-alert type="info">
          You don't have any flowers yet! Click the button below to plant your
          first flower.
        </v-alert>
        <div class="text-center">
          <v-btn color="primary" href="/plant">Plant a flower</v-btn>
        </div>
      </div>
      <flower-grid></flower-grid>
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
