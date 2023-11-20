<template id="flower-card">
    <v-card class="flower-card">
        <v-card-actions class="pa-3">
            {{ flower.flowerType }}
            <v-btn small @click="showDetails = !showDetails" class="pl-3">
                Details
                <v-icon v-if="showDetails">mdi-chevron-up</v-icon>
                <v-icon v-if="!showDetails">mdi-chevron-down</v-icon>
            </v-btn>
        </v-card-actions>
        <v-expand-transition>
            <div v-show="showDetails">
                {{ flower }}
            </div>
        </v-expand-transition>
    </v-card>
</template>
<script>
    Vue.component("flower-card", {
      props: ["flower"],
      data: () => ({
        showDetails: false,
      }),
      template: "#flower-card",
    });
</script>
<style>
</style>
