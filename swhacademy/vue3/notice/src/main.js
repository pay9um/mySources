import './assets/main.css'

import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import { createPinia } from 'pinia'

// Bootstrap CSS 적용
import 'bootstrap/dist/css/bootstrap.css'

// Bootstrap JS (Popper 포함) 적용
import 'bootstrap/dist/js/bootstrap.bundle.min.js'

// Bootstrap Icons 스타일 추가
import 'bootstrap-icons/font/bootstrap-icons.css'

const app = createApp(App)

app.use(router)
app.use(createPinia)

app.mount('#app')
