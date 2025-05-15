<script setup>
import { ref, watch } from 'vue'

const id = ref('')
const password = ref('')
const errorMessage = ref('')


// const showIdMessage = ref(false)
// const showPasswordMessage = ref(false)
// const isPossibleId = ref(false)
// const isPossiblePassword = ref(false)

// const regex = /^(?=.*[a-zA-Z])(?=.*\d)(?=.*[!@#$%^&*()])[a-zA-Z\d!@#$%^&*()]{8,}$/

// watch(id, (newId, oldId) => {
//   if (newId == '') { showIdMessage.value = false }
//   else {
//     showIdMessage.value = true
//   }
// })

// watch(password, (newPassword, oldPassword) => {
//   if (newPassword == '') { showPasswordMessage.value = false }
//   else {
//     showPasswordMessage.value = true
//     if (regex.test(newPassword)) {
//       console.log("성공")
//     }
//   }
// })
</script>

<template>
  <div class="position-absolute start-0 top-0 w-100 h-100 bg-dark bg-gradient">
    <main class="container">
      <section>
        <div class="min-vh-100 d-flex align-items-center">
          <div class="container">
            <div class="row">
              <div class="mx-auto col-xl-4 col-lg-5 col-md-7 d-flex flex-column">
                <div class="card">
                  <div class="card-header mx-4 bg-black border-0 rounded py-4" style="margin-top: -3rem;">
                    <div class="container text-white">
                      <strong class="fs-5">로그인</strong>
                    </div>
                  </div>
                  <div class="card-body">
                    <form class="mt-4">
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
                    <small>
                      <a href="#" class="text-decoration-none text-secondary">
                        Forgot Password?
                      </a>
                    </small>
                    <div class="container mt-4">
                      <div class="mb-3">
                        <button class="btn btn-dark w-100 py-3 fw-bold rounded-pill">
                          Sign In
                        </button>
                      </div>
                      <div class="mb-3">
                        <button class="btn btn-outline-dark w-100 py-3 fw-bold rounded-pill">
                          Sign Up
                        </button>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>
    </main>
  </div>
</template>
