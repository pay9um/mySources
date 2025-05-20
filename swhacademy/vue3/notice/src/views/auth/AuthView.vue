<script setup>
import { ref, watch } from 'vue'

import UnderLineLink from '@/components/auth/UnderLineLink.vue'

const id = ref('')
const password = ref('')
const errorMessage = ref('')
const isSignIn = ref(true)
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
  <main class="container my-5">
    <section>
      <div class="d-flex align-items-center">
        <div class="container">
          <div class="row">
            <div class="mx-auto col-xl-4 col-lg-5 col-md-7 d-flex flex-column">
              <RouterView />
            </div>
          </div>
        </div>
      </div>
    </section>
  </main>
</template>
