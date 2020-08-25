<template>
  <div id="drawer">
    <!-- <v-row
      class="mx-auto my-5 py-3"
      :class="{ click: click == 'Login' }"
      @click="click = 'Login'"
    >
      <router-link to="/auth">
        <img id="drawer-home" class="drawer-img" src="@/assets/menu_home.png" />
      </router-link>
    </v-row> -->
    <v-row
      class="mx-auto my-5 py-3"
      :class="{ click: click == 'Calender' }"
      @click="click = 'Calender'"
    >
      <router-link to="/calender">
        <img
          id="drawer-history"
          class="drawer-img"
          src="@/assets/table_icon.svg"
        />
      </router-link>
    </v-row>
    <v-row
      class="mx-auto my-5 py-3"
      :class="{ click: click == 'Chart' }"
      @click="click = 'Chart'"
    >
      <router-link to="/chart">
        <img
          id="drawer-route"
          class="drawer-img"
          src="@/assets/chart_icon.svg"
        />
      </router-link>
    </v-row>
    <v-row
      class="mx-auto my-5 py-3"
      :class="{ click: click == 'Job' }"
      @click="click = 'Job'"
    >
      <router-link to="/task">
        <img id="drawer-plan" class="drawer-img" src="@/assets/task_icon.svg" />
      </router-link>
    </v-row>
  </div>
</template>

<script>
export default {
  data() {
    return {
      click: ""
    };
  },
  mounted() {
    this.click = this.$route.name;
  }
};
</script>

<style scoped>
#drawer {
  background: peachpuff;
  width: 6% !important;
  height: 100vh;
  margin: 0;
  color: white;
  text-align: center;
}

router-link {
  text-align: center;
}

.drawer-img {
  width: 5vw;
}
</style>
