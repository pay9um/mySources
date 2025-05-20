<script setup>
import IconButtonSmall from '../IconButtonSmall.vue'
</script>

<template>
  <nav class="navbar fixed-top bg-dark border-bottom border-body" data-bs-theme="dark">
    <div class="container-fluid">
      <a class="navbar-brand" href="/">Pallery</a>

      <div class="d-flex align-items-center">
        <!-- <div class="text-white">
          <i class="bi bi-person-circle fs-4 m-1 p-0 px-1 pt-0 btn"></i>
        </div> -->

        <!-- <RouterLink to="/auth/signin"> -->
        <IconButtonSmall icon="bi bi-person" text="로그인" color="light" href="/auth/signin" :outline="true" />
        <!-- </RouterLink> -->


        <!-- <IconButtonSmall icon="bi bi-person-circle" text="프로필" color="light" /> -->
        <!-- <IconButtonSmall icon="bi bi-box-arrow-right" text="로그아웃" color="danger" /> -->
      </div>
    </div>
  </nav>
</template>
