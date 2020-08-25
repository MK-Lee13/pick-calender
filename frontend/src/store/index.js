import Vue from 'vue';
import Vuex from 'vuex';
import createPersistedState from 'vuex-persistedstate';

Vue.use(Vuex);

import calenderStore from '@/store/modules/calenderStore';

const store = new Vuex.Store({
  modules: {
    calenderStore: calenderStore
  }
  // plugins: [createPersistedState()]
});

export default store;
