<template id="quests-page">
  <app-frame>
    <page-heading>Quests</page-heading>
    <flower-loader v-if="quests.loading"></flower-loader>
    <template v-for="quest in quests.data">
      <quest-card :quest="quest"></quest-card>
    </template>
  </app-frame>
</template>
<script>
Vue.component("quests-page", {
  data: () => ({
    quests: new LoadableData("/api/quests"),
  }),
  template: "#quests-page",
});
</script>
