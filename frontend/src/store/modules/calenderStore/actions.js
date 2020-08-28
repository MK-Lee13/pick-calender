/**
 *
 * 실제 비즈니스 로직을 실행하는 부분이다.
 * 비즈니스 로직 실행 후 mutation 을 통해서 state 를 변경해준다.
 *
 */

import axios from 'axios';

const actions = {
  GET_ALL_TASK: ({
    commit
  }, payload) => {
    return axios.get('/api/task/all', payload, {
      headers: payload.headers
    })
  },

  INSERT_TASK: ({
    commit
  }, payload) => {
    return axios.get('/api/task/insert', payload, {
      headers: payload.headers
    })
  },

  GET_ALL_TASK_TYPE: ({
    commit
  }, payload) => {
    return axios.get('/api/task/type/all', payload, {
      headers: payload.headers
    })
  },

  INSERT_TASK_TYPE: ({
    commit
  }, payload) => {
    return axios.get('/api/task/type/insert', payload, {
      headers: payload.headers
    })
  }
};

export default actions;
