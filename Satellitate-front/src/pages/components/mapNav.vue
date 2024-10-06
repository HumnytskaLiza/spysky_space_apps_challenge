<template>
  <div id="mapNavbar">
    <router-link to="/" id="no-underline"
      ><div id="logo"><img src="../../assets/icons/logo_s.svg" alt="" /></div
    ></router-link>
    <div class="nav-buttons">
      <div id="user" @click="showDropdown()">
        <img src="../../assets/icons/test_profile_photo.png" id="user-photo" />
        <div id="user-dropdown" v-show="isDropdownVisible">
          <div>
            <router-link to="/settings" id="no-underline-dropdown">
              <p>Profile settings</p>
            </router-link>
            <router-link to="/3d-map" id="no-underline-dropdown">
              <p>3D map</p>
            </router-link>
            <p>Dashboard</p>
          </div>
          <hr />
          <div id="logout" @click="deleteCookieAndRedirect()">
            <img src="../../assets/icons/log-out.svg" alt="" />
            <div>Log out</div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import { useRouter } from "vue-router";

export default {
  name: "mapNavbar-component",
  data() {
    return {
      isDropdownVisible: false,
      areNavlinksVisible: false,
      router: useRouter(),
    };
  },

  methods: {
    showDropdown() {
      this.isDropdownVisible = !this.isDropdownVisible;
    },

    deleteCookieAndRedirect() {
      try {
        document.cookie =
          "token=; expires=Thu, 01 Jan 1970 00:00:00 UTC; path=/;";
        this.cookies = document.cookie;
        this.router.push("/");
      } catch (e) {
        console.log(e);
      }
    },
  },
};
</script>

<style>
#mapNavbar {
  font-size: 1rem;
  color: white;
  font-family: "Exo 2", sans-serif;
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  height: 75px;
  z-index: 10000;
  background: rgba(0, 0, 0, 1);
  backdrop-filter: blur(6px);
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  box-sizing: border-box;
  align-items: center;
  padding: 0 30px;
  border-bottom: 2px solid #00142d;
}

#mapNavbar #logo img {
  height: 25px;
}

#mapNavbar #user {
  position: relative;
}

#mapNavbar #user-photo {
  width: 36px;
  cursor: pointer;
}

#mapNavbar .nav-buttons {
  display: flex;
  flex-direction: row;
  gap: 1.5rem;
  align-items: center;
}

#mapNavbar #active-nav {
  color: #ff8c71;
}

#mapNavbar .nav-buttons button {
  height: 2.25rem;
}

#mapNavbar > div {
  display: flex;
  flex-direction: row;
  list-style: none;
  gap: 2rem;
  align-items: center;
  position: relative;
}

#mapNavbar #user-dropdown {
  position: absolute;
  padding: 30px 70px 45px 30px;
  background-color: #000e1f;
  right: 0px;
  top: 60px;
  display: flex;
  width: 220px;
  flex-direction: column;
  box-sizing: border-box;
  gap: 30px;
  border-radius: 0.5rem;
  animation: dropdown-show 0.5s ease-in-out forwards;
}

#mapNavbar #user-dropdown p {
  transition: 0.5s;
}

#mapNavbar #user-dropdown p:hover {
  color: #ffc8c2;
  cursor: pointer;
}

@keyframes dropdown-show {
  from {
    opacity: 0;
    transform: translateY(-10px);
  }
  to {
    opacity: 1;
    transform: translateY(0);
  }
}

#mapNavbar #user-dropdown #logout {
  display: flex;
  flex-direction: row;
  gap: 1rem;
  cursor: pointer;
}

#mapNavbar #user-dropdown hr {
  width: 100%;
  border: 0;
  border-top: 1px solid rgba(255, 255, 255, 0.15);
  border-radius: 1px;
}

#mapNavbar #user-dropdown div {
  display: flex;
  flex-direction: column;
  gap: 1rem;
}

#mapNavbar #no-underline-dropdown {
  text-decoration: none;
  color: white;
}
</style>
