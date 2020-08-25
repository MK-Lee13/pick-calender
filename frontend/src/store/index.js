import Vue from 'vue';
import Vuex from 'vuex';
import createPersistedState from 'vuex-persistedstate';

Vue.use(Vuex);

import historyStore from '@/store/modules/historyStore';
import planStore from '@/store/modules/planStore';

const store = new Vuex.Store({
  modules: {
    calenderStore: calenderStore
  }
  // plugins: [createPersistedState()]
});

export default store;
