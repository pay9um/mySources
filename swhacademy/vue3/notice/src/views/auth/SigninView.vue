<script setup>
import UnderLineLink from '@/components/auth/UnderLineLink.vue'

</script>
<template>
  <div class="card">
    <div class="card-header mx-4 border-0 rounded py-4 bg-black text-white" style="margin-top: -3rem;">
      <div class="container">
        <strong class="fs-5">로그인</strong>
      </div>
    </div>
    <div class="card-body">
      <form class="mt-4" v-if="isSignIn">
        <div class="input-group mb-3">
          <span class="input-group-text bg-black text-white">
            <i class="bi bi-person"></i>
          </span>
          <input type="text" class="form-control" placeholder="ID" v-model="id" />
        </div>
        <div class="input-group mb-3">
          <span class="input-group-text bg-black text-white">
            <i class="bi bi-lock"></i>
          </span>
          <input type="password" class="form-control" placeholder="password" v-model="password" />
        </div>
        <p class="m-0 text-start text-danger">
          <small>{{ errorMessage }}</small>
        </p>
        <!-- <div class="mb-3">
                        <input type="password" class="form-control" placeholder="password" v-model="password" />
                        <div class="form-text">
                          <small class="text-danger" v-if="showPasswordMessage">
                            비밀번호는 영문자, 숫자, 특수문자를 포함하여 최소 8자 이상 작성 해야 합니다.
                          </small>
                        </div>
                      </div> -->
      </form>

      <div class="container mt-4">
        <div class="mb-3">
          <button class="btn btn-dark w-100 py-3 fw-bold rounded-pill">
            로그인
          </button>
        </div>
      </div>

      <div class="d-flex justify-content-center">
        <UnderLineLink href="#" text="아이디 찾기" />
        <div class="vr"></div>
        <UnderLineLink href="#" text="비밀번호 찾기" />
        <div class="vr"></div>
        <UnderLineLink href="#" text="회원가입" />
      </div>
    </div>
  </div>
</template>