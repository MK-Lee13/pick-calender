<template>
  <div id="app">
    <div id="app-wrapper">
      <drawer />
      <router-view />
    </div>
  </div>
</template>

<script>
import Drawer from "@/components/Drawer";
export default {
  name: "App",
  components: {
    Drawer
  },

  mounted() {
    this.click = this.$route.name;
  }
};
</script>

<style>
#app {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  height: 100vh;
}

#app-wrapper {
  display: flex;
}
</style>
