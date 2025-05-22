<script setup>
import { reactive, ref, watch } from 'vue'
import UnderLineLink from '@/components/auth/UnderLineLink.vue'
import IconInput from '@/components/auth/IconInput.vue'
import axios from 'axios'

const title = ref('회원가입')
const form = reactive({
  id: '',
  name: '',
  password: '',
  passwordCheck: '',
})

const idMessage = ref('')

function runParentFunction() {
  console.log(123123123)
}

async function submitForm() {
  try {
    const response = await axios.post('http://localhost:8080/api/auth/signup', {
      id: form.id,
      name: form.name,
      password: form.password,
      passwordCheck: form.passwordCheck
    })

    console.log('회원가입 성공:', response.data)
    alert('회원가입 완료!')
  } catch (error) {
    console.error('회원가입 실패:', error.response?.data || error.message)
    alert('회원가입 실패: ' + (error.response?.data?.message || '알 수 없는 오류'))
  }
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
      <form class="mt-4" name="formup">
        <IconInput icon="bi bi-person" type="text" placeholder="ID" :check="true" :sub-message="idMessage"
          v-model="form.id" @child-clicked="runParentFunction" />
        <IconInput icon="bi bi-person-bounding-box" type="text" placeholder="NAME" v-model="form.name" />
        <IconInput icon="bi bi-lock" type="password" placeholder="PASSWORD" v-model="form.password" />
        <IconInput icon="bi bi-lock" type="password" placeholder="PASSWORD CHECK" v-model="form.passwordCheck" />
        <!-- <p class="m-0 text-start text-danger">
          &nbsp;
          <small>{{ errorMessage }}</small>
        </p> -->
      </form>

      <div class="container mt-2 mb-4">
        <div class="mb-3">
          <button class="btn btn-dark w-100 py-3 fw-bold rounded-pill" @click="submitForm()">
            {{ title }}
          </button>
        </div>
      </div>

      <div class="d-flex justify-content-center">
        <UnderLineLink href="#" text="아이디 찾기" />
        <div class="vr"></div>
        <UnderLineLink href="#" text="비밀번호 찾기" />
        <div class="vr"></div>
        <UnderLineLink href="/auth/signin" text="로그인" />
      </div>
    </div>
  </div>
</template>