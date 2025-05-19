import { createRouter, createWebHistory } from 'vue-router'

import AuthView from '@/views/auth/AuthView.vue'
import SigninView from '@/views/auth/SigninView.vue'
import SignupView from '@/views/auth/SignupView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      redirect: '/auth',
    },
    {
      path: '/auth',
      component: AuthView,
      children: [
        { path: '', redirect: '/auth/signin' },
        { path: 'signin', name: 'signin', component: SigninView },
        { path: 'signup', name: 'signup', component: SignupView },
      ],
    },
    {
      path: '/about',
      name: 'about',
      // route level code-splitting
      // this generates a separate chunk (About.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import('../views/AboutView.vue'),
    },
  ],
})

export default router
