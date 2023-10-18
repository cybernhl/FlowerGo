<template id="plant-page">
  <app-frame>
    <page-heading>Plant</page-heading>
    <flower-loader v-if="inventory.loading"></flower-loader>

    {{ inventory.data }}
    <v-btn color="primary">Plant</v-btn>
  </app-frame>
</template>
<script>
Vue.component("plant-page", {
  data: () => ({
    inventory: new LoadableData("/api/inventory", false),
  }),
  template: "#plant-page",
});
</script>
