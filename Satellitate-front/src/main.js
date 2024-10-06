import { createApp } from "vue";
import App from "./App.vue";

import { createRouter, createWebHistory } from "vue-router";

import login from "./pages/loginPage/index.vue";
import signup from "./pages/signupPage/index.vue";
import welcome from "./pages/welcomePage/index.vue";
import editProfile from "./pages/settingsPage/editProfile/index.vue";
import editNotifications from "./pages/settingsPage/editNotifications/index.vue";
import editSubscription from "./pages/settingsPage/editSubscription/index.vue";
import map from "./pages/mapPage/index.vue";

const routes = [
  {
    path: "/login",
    component: login,
  },
  {
    path: "/signup",
    component: signup,
  },
  {
    path: "/",
    component: welcome,
  },
  {
    path: "/settings",
    component: editProfile,
  },
  {
    path: "/settings/edit-notifications",
    component: editNotifications,
  },
  {
    path: "/settings/edit-subscription",
    component: editSubscription,
  },
  {
    path: "/3d-map",
    component: map,
  },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

router.beforeEach((to, from, next) => {
  window.scrollTo(0, 0);
  next();
});

const app = createApp(App);

app.use(router);
app.mount("#app");
