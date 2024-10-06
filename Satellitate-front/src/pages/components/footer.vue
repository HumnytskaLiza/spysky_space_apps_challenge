<template>
  <footer id="footer">
    <div id="footer-logo">
      <a href="#"><img src="../../assets/icons/logo_s.svg" /></a>
    </div>
    <ul>
      <a href="#about-us-block" id="no-underline-footer"><li>About Us</li></a>
      <a href="#our-mission-block" id="no-underline-footer"
        ><li>Our Mission</li></a
      >
      <a href="#pricing-block" id="no-underline-footer"><li>Pricing</li></a>
      <a href="#contact-us-block" id="no-underline-footer"><li>Contacts</li></a>
      <router-link to="/login" id="no-underline-footer"
        ><li>Log in</li></router-link
      >
      <router-link to="/signup" id="no-underline-footer"
        ><li>Sign up</li></router-link
      >
    </ul>
    <hr />
    <p>© 2024 SpySky</p>
  </footer>
</template>

<script>
export default {
  name: "Footer-component",
};
</script>

<style>
#footer {
  width: 100%;
  z-index: 10000;
  background-color: black;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  box-sizing: border-box;
  gap: 40px;
  padding: 60px 0;
  box-shadow: 0px 0px 29.6px 9px rgba(0, 0, 0, 0.85);
}

#footer ul {
  display: flex;
  flex-direction: row;
  list-style: none;
  gap: 2.5rem;
  font-size: 20px;
}

#footer ul li {
  font-size: 1rem;
}

#footer hr {
  width: 100%;
  opacity: 50%;
}

#footer #footer-logo img {
  height: 35px;
}

@media only screen and (max-width: 600px) {
  #footer {
    align-items: center;
    text-align: center;
  }

  #footer ul {
    flex-direction: column;
    gap: 1.5rem;
  }

  #footer ul li {
    font-size: 24px;
  }
}

@media only screen and (min-width: 601px) {
  #footer {
    align-items: center;
    text-align: center;
  }

  #footer ul {
    flex-direction: column;
    gap: 1.5rem;
  }

  #footer ul li {
    font-size: 22px;
  }
}

@media only screen and (min-width: 905px) {
  #footer {
    align-items: center;
    text-align: start;
  }

  #footer ul {
    flex-direction: row;
    gap: 1.5rem;
  }

  #footer ul li {
    font-size: 1rem;
  }
}
</style>
