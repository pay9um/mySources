<script setup>
import { onMounted } from 'vue'
import defaultStore from '@/stores'

const store = defaultStore()

function init() {
  if (store.showNavbar) {
    store.changeShowNavbar()
  }
}

onMounted(() => {
  init()
})
</script>

<template>
  <a href="/" class="btn position-absolute start-0 top-0 p-0 ms-2 mt-1">
    <i class="bi bi-arrow-left-square-fill fs-1 px-1"></i>
  </a>
  <main class="container p-0">
    <section>
      <div class="d-flex align-items-center">
        <div class="container">
          <div class="row">
            <div class="mx-auto col-xl-4 col-lg-5 col-md-7 d-flex flex-column p-0">
              <RouterView />
            </div>
          </div>
        </div>
      </div>
    </section>
  </main>
</template>
