<script setup>
import { ref, watch } from 'vue'
import UnderLineLink from '@/components/auth/UnderLineLink.vue'
import IconInput from '@/components/auth/IconInput.vue'

const title = '로그인'
const id = ref('')
const password = ref('')
const errorMessage = ref('')
const link = ref({
  path: '/auth/signup',
  text: '회원가입',
})

const submitForm = () => {

}
</script>

<template>
  <div class="card">
    <div class="card-header mx-4 border-0 rounded py-4 bg-black text-white" style="margin-top: -3rem;">
      <div class="container">
        <strong class="fs-5">{{ title }}</strong>
      </div>
    </div>
    <div class="card-body">
      <form class="mt-4" name="formin">
        <IconInput icon="bi bi-person" type="text" placeholder="ID" v-model="id" />
        <IconInput icon="bi bi-lock" type="password" placeholder="PASSWORD" v-model="password" />
        <p class="m-0 text-start text-danger">
          &nbsp;
          <small>{{ errorMessage }}</small>
        </p>
      </form>

      <div class="container mt-2 mb-4">
        <div class="mb-3">
          <button class="btn btn-dark w-100 py-3 fw-bold rounded-pill">
            {{ title }}
          </button>
        </div>
      </div>

      <div class="d-flex justify-content-center">
        <UnderLineLink href="#" text="아이디 찾기" />
        <div class="vr"></div>
        <UnderLineLink href="#" text="비밀번호 찾기" />
        <div class="vr"></div>
        <UnderLineLink :href="link.path" :text="link.text" />
      </div>
    </div>
  </div>
</template>