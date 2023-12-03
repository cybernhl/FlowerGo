<template id="flower-grid">
    <div class="flower-grid">
        <div class="flowers">
            <div v-for="currentRow in 12" :key="currentRow" class="flower-row">
                <div
                        class="flower-cell"
                        :class="{'active': selectedRow === currentRow && selectedCol === currentCol}"
                        v-for="currentCol in 8"
                        :key="currentCol"
                        v-if="currentRow % 2 === 1 || currentCol < 8"
                        @click="setCell(currentRow, currentCol)"
                >
                    <v-icon>mdi-flower-tulip-outline</v-icon>
                </div>
            </div>
        </div>
        <div class="flower-panel pa-3">
            <h1>{{ selectedRow }}:{{ selectedCol }}</h1>
        </div>
    </div>
</template>
<script>
    Vue.component("flower-grid", {
      template: "#flower-grid",
      data: () => ({
          selectedRow: null,
          selectedCol: null,
      }),
      methods: {
          setCell(row, col) {
              this.selectedRow = row;
              this.selectedCol = col;
          }
      }
    });
</script>
<style>
    .flower-grid {
        background: #aa7e57;
        position: fixed;
        top: 0;
        left: 0;
        width: 100%;
    }
    .flower-grid .flowers {
        padding: 12px;
    }
    .flower-row {
        width: 100vw;
        display: flex;
    }
    .flower-row:nth-child(even) {
        margin-left: calc(100vw/8/2);
    }
    .flower-cell {
        border-radius: 16px;
        width: calc(calc(100vw - 24px)/8);
        height: calc(calc(100vw - 24px)/8);
        display: flex;
        justify-content: center;
        align-items: center;
        transition: all 300ms ease-in-out;
    }
    .flower-cell.active {
        background: #BC7F49;
        box-shadow: 0 3px 0 0 rgba(0, 0, 0, 0.3), 0 0 0 1px rgba(0, 0, 0, 0.2);
        padding-bottom: 2px;
    }
    .flower-panel {
        background: rgba(0, 0, 0, .1);
        height: calc(100vh - calc(12 * calc(calc(100vw - 24px)/8)) - 64px);
    }
</style>