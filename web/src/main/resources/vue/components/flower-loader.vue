<template id="flower-loader">
  <div class="flower-wrapper">
    <div class="flower">
      <div class="petals"></div>
      <div class="pistil"></div>
    </div>
  </div>
</template>
<script>
Vue.component("flower-loader", {
  template: "#flower-loader",
});
</script>
<style>
.flower-wrapper {
  background: rgba(255, 255, 255, 0.5);
  backdrop-filter: blur(5px);
  position: fixed;
  top: 0;
  left: 0;
  height: 100%;
  width: 100%;
  display: flex;
  justify-content: center;
  align-items: center;
}

.flower {
  position: relative;
  height: 120px;
  width: 120px;
  animation: rotate 4s linear infinite;
}

.petals,
.petals::after,
.petals::before {
  content: "";
  position: absolute;
  background: #ffb5d8;
  border-radius: 20px;
  width: 120px;
  height: 40px;
  z-index: 0;
  box-shadow: 5px 0 0 rgba(0, 0, 0, 0.15) inset,
    -5px 0 0 rgba(0, 0, 0, 0.15) inset;
}

.petals {
  left: 0;
  top: 40px;
}

.petals::after {
  transform: rotate(60deg);
}

.petals::before {
  transform: rotate(-60deg);
}

.pistil {
  position: absolute;
  left: 40px;
  height: 40px;
  top: 40px;
  width: 40px;
  border-radius: 20px;
  background: #fffbab;
  z-index: 1;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.2) inset, 0 0 3px rgba(0, 0, 0, 0.15);
}

@keyframes rotate {
  from {
    transform: rotate(0deg);
  }
  to {
    transform: rotate(360deg);
  }
}
</style>
