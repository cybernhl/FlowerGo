<template id="flower-grid">
    <div class="flower-grid">
        <div v-for="row in 12" :key="row" class="row">
            <div v-for="col in 8" :key="col" class="cell">
                <v-icon>mdi-flower-tulip-outline</v-icon>
            </div>
        </div>
    </div>
</template>
<script>
    Vue.component("flower-grid", {
      template: "#flower-grid",
    });
</script>
<style>
    .row {
        width: 100vw;
    }
    .cell {
        width: calc(100vw/8);
        height: calc(100vw/8);
        border: 1px solid green;
        display: flex;
        justify-content: center;
        align-items: center;
    }
</style>