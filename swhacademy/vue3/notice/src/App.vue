<script setup>
import Navbar from './components/navbar/Navbar.vue'
</script>

<template>
  <main class="container-fluid pt-5">
    <Navbar v-if="false" />

    <RouterView />
  </main>
</template>
