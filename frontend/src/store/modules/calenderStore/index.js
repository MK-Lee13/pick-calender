import state from './state.js';
import mutations from './mutations.js';
import actions from './actions.js';
import getters from './getters.js';

const calenderStore = {
  namespaced: true,
  state: state,
  getters: getters,
  actions: actions,
  mutations: mutations
};

export default calenderStore;
