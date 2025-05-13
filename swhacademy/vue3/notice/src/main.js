import './assets/main.css'

import { createApp } from 'vue'
import App from './App.vue'
import router from './router'

import { BootstrapVue3 } from 'bootstrap-vue-3'
import 'bootstrap/dist/css/bootstrap.min.css'
import 'bootstrap/dist/js/bootstrap.bundle.min.js'

const app = createApp(App)

app.use(router)
app.use(BootstrapVue3)

app.mount('#app')
