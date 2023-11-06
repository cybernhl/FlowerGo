<template id="tutorial-section">
  <div v-if="$javalin.state.needsTutorial">
    <v-alert color="green" dark>
      <p>
        Welcome to your garden! You can plant flowers here, and they will grow over time.
        You can also use fertilizer to make them grow faster.
        Remember to water your flowers, or they will die!
      </p>
      <p>
        Flowers need different weather conditions to grow. The weather in your garden is
        determined by the weather at your current location. You can change your location
        by traveling to a new place (in real life). We will use the geolocation API to
        determine your current location.
      </p>
      <p>
        You need to enable location services in your browser for FlowerGo to work properly
      </p>
      <v-btn @click="setTutorialRead" block depressed>Got it!</v-btn>
    </v-alert>
  </div>
</template>
<script>
Vue.component("tutorial-section", {
  template: "#tutorial-section",
  methods: {
    setTutorialRead() {
      axios.patch("/api/tutorial-read")
          .then(() => location.reload())
          .catch(err => console.error("Failed to set tutorial read. Error: ", err));
    },
  },
});
</script>
