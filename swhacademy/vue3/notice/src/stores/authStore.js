import { defineStore } from 'pinia'

const useAuthStore = defineStore('auth', {
  state: () => ({
    token: localStorage.getItem('token') || null,
    user: null,
    showNavbar: true,
  }),
  actions: {
    login(token, user) {
      this.token = token
      this.user = user
      localStorage.setItem('token', token)
    },
    logout() {
      this.token = null
      this.user = null
      localStorage.removeItem('token')
    }
  },
  getters: {
    isAuthenticated: (state) => !!state.token,
  },
})

export default useAuthStore