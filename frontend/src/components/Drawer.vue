<template>
  <div id="drawer">
    <v-card height="100%" width="100%" class="mx-auto">
      <v-navigation-drawer permanent>
        <v-list-item>
          <v-list-item-content>
            <v-list-item-title class="head-line">
              {{ headLine }}
            </v-list-item-title>
          </v-list-item-content>
        </v-list-item>

        <v-divider></v-divider>

        <v-list dense nav>
          <v-list-item v-for="item in items" :key="item.title" link>
            <v-row @click="remotePath(item.link)">
              <v-list-item-icon>
                <v-icon>{{ item.icon }}</v-icon>
              </v-list-item-icon>

              <v-list-item-content>
                <v-list-item-title>{{ item.title }}</v-list-item-title>
              </v-list-item-content>
            </v-row>
          </v-list-item>
        </v-list>
      </v-navigation-drawer>
    </v-card>
  </div>
</template>

<script>
export default {
  data() {
    return {
      click: "",
      headLine: "Pick Calender",
      items: [
        { title: "Calender", icon: "mdi-view-dashboard", link: "/calender" },
        { title: "Chart", icon: "mdi-image", link: "/chart" },
        { title: "Task", icon: "mdi-help-box", link: "/task" }
      ],
      right: null
    };
  },

  mounted() {
    this.click = this.$route.name;
  },

  methods: {
    remotePath(link) {
      var router = this.$router;
      router.push(link);
    }
  }
};
</script>

<style scoped>
#drawer {
  background-color: aliceblue;
  width: 10% !important;
  height: 100vh;
  margin: 0;
  color: white;
  text-align: center;
}
.head-line {
  font-weight: bold;
  font-size: 1vw;
}

.route {
  text-align: center;
}

.drawer-img {
  width: 6vh;
}
</style>
