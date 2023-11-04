<template id="page-heading">
  <h1 class="text-center mb-4">
    <slot></slot>
  </h1>
</template>
<script>
Vue.component("page-heading", {
  template: "#page-heading",
});
</script>
<style></style>
