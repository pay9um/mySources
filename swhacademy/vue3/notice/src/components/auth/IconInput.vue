<script setup>
const emit = defineEmits(['childClicked'])
const model = defineModel()
const props = defineProps({
  icon: String,
  type: String,
  placeholder: String,
  check: Boolean,
  subMessage: String,
})

function handleClick() {
  emit('childClicked')
}
</script>

<template>
  <div class="mb-4">
    <div class="input-group">
      <span class="input-group-text bg-black text-white">
        <i :class="props.icon"></i>
      </span>
      <input :type="props.type" class="form-control" :placeholder="props.placeholder" v-model="model" />
      <button type="button" class="btn btn-dark btn-sm" v-if="check" @click="handleClick()">
        중복 확인
      </button>
    </div>
    <div class="text-end me-4">
      <small>{{ subMessage }}</small>
      <div class="spinner-border spinner-border-sm" role="status" v-if="subMessage == 'loading'">
        <span class="visually-hidden">Loading...</span>
      </div>
    </div>
  </div>


</template>