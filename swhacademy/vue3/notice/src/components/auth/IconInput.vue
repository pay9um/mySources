<script setup>
const model = defineModel()
const props = defineProps({
  icon: String,
  type: String,
  placeholder: String,
})
</script>

<template>
  <div class="input-group mb-4">
    <span class="input-group-text bg-black text-white">
      <i :class="props.icon"></i>
    </span>
    <input :type="props.type" class="form-control" :placeholder="props.placeholder" v-model="model" />
  </div>
</template>