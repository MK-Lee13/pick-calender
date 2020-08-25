<template>
  <div class="Test">
    <h1>{{ msg }}</h1>
    <h1>
      <router-link to="/auth">Login</router-link>
    </h1>
    <h1>
      <router-link to="/chart">Chart</router-link>
    </h1>
    <h1>
      <router-link to="/calender">Calender</router-link>
    </h1>
    <h1>
      <router-link to="/task">Task</router-link>
    </h1>
  </div>
</template>

<script>
export default {
  name: "Test",
  data() {
    return {
      msg: "Test Page"
    };
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1,
h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
