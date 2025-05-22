import { defineStore } from 'pinia'

const defaultStore = defineStore('default', {
  state: () => ({
    showNavbar: true,
    backgroundColor: 'light',
  }),
  actions: {
    changeShowNavbar() {
      this.showNavbar = !this.showNavbar
    }
  },
  getters: {
  },
})

export default defaultStore