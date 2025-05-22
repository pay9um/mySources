<script setup>
import defaultStore from './stores'
import Navbar from './components/navbar/Navbar.vue'

const store = defaultStore()
</script>

<template>
  <div :class="`bg-${store.backgroundColor}`" class="z-n1 position-fixed start-0 top-0 w-100 h-100 bg-gradient"></div>

  <main class="container-fluid pt-5">
    <Navbar v-if="store.showNavbar" />

    <RouterView />
  </main>
</template>
