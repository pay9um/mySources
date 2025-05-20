import { defineStore } from 'pinia'

const defaultStore = defineStore('default', {
  state: () => ({
    showNavbar: true,
    backgroundColor: 'light',
  }),
  actions: {

  },
  getters: {
  },
})

export default defaultStore