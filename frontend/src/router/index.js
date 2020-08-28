import Vue from 'vue'
import Router from 'vue-router'

function loadView(view) {
  return () =>
    import( /* webpackChunkName: "view-[request]" */ `@/views/${view}`);
}

Vue.use(Router)

export default new Router({
  routes: [{
      path: '/',
      name: 'Index',
      component: loadView('')
    },
    {
      path: '/auth',
      name: 'Login',
      component: loadView('login')
    },
    {
      path: '/calender',
      name: 'Calender',
      component: loadView('calender')
    },
    {
      path: '/chart',
      name: 'Chart',
      component: loadView('chart')
    },
    {
      path: '/task',
      name: 'Job',
      component: loadView('job')
    }
  ]
})
