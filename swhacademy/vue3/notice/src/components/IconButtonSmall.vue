<script setup>
const props = defineProps({
  icon: String,
  text: String,
  color: String,
  outline: Boolean,
  href: String,
})
</script>

<template>
  <a :href="href">
    <button type="button" class="btn btn-sm mx-2" :class="outline ? `btn-outline-${color}` : `btn-${color}`">
      <i :class="icon"></i>
      {{ text }}
    </button>
  </a>
</template>