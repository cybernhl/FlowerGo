<template id="plant-page">
  <app-frame>
    <page-heading>Plant</page-heading>
    <flower-loader v-if="planting.loading"></flower-loader>
    <!-- Button to be placed in the footer -->
    <v-btn color="primary">Plant</v-btn>
  </app-frame>
</template>
<script>
Vue.component("plant-page", {
  data: () => ({
    planting: new LoadableData("/api/plant", false),
  }),
  template: "#plant-page",
});
</script>
