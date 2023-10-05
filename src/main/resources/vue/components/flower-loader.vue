<template id="flower-loader">
  <div class="flower">
    <div class="petals"></div>
    <div class="pistil"></div>
  </div>
</template>
<script>
Vue.component("flower-loader", {
  template: "#flower-loader",
});
</script>
<style>
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
  background: #517bd6;
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
  background: #ffee00;
  z-index: 1;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.4) inset, 0 0 3px rgba(0, 0, 0, 0.3);
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
