// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Es6Promise from "es6-promise";
Es6Promise.polyfill();
import "babel-polyfill";
import Vue from "vue";
import App from "./App";
import router from "./router";

import store from "./store";

import "es6-promise/auto";
import "bootstrap/dist/css/bootstrap.css";
import "bootstrap-vue/dist/bootstrap-vue.css";

import vuetify from "@/plugins/vuetify";

import axios from "axios";

Vue.prototype.$http = axios;
Vue.config.productionTip = false;

/* eslint-disable no-new */
new Vue({
  el: "#app",
  router,
  store,
  vuetify,
  components: {
    App
  },
  template: "<App/>"
});
