<script setup>
defineProps({
  href: String,
  text: String,
  customClass: String,
})
</script>

<template>
  <small>
    <a :href="href" class="link-secondary link-offset-2 link-underline-opacity-25 link-underline-opacity-100-hover mx-2"
      :class="customClass">
      {{ text }}
    </a>
  </small>
</template>