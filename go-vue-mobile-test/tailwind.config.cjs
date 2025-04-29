/* eslint-env node */

module.exports = {
  content: [
    "./index.html",
    "./src/**/*.{vue,js,ts,jsx,tsx}",
  ],
  theme: {
    extend: {
      colors: {
      primary: "#f8931e",
      secondary: "#376179",
      accent: "#053a58",
    }
    }
  },
  darkMode: ['selector', '[class="dark"]'],
  plugins: [],
}

