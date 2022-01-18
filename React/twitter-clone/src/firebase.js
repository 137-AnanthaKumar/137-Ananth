// Import the functions you need from the SDKs you need
import { initializeApp } from "firebase/app";
import { getAnalytics } from "firebase/analytics";
// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
// For Firebase JS SDK v7.20.0 and later, measurementId is optional
const firebaseConfig = {
  apiKey: "AIzaSyDV7umBan1d-KxswDNXdxfur-5x2gaki_g",
  authDomain: "twitter-clone-1ef86.firebaseapp.com",
  projectId: "twitter-clone-1ef86",
  storageBucket: "twitter-clone-1ef86.appspot.com",
  messagingSenderId: "467044137668",
  appId: "1:467044137668:web:4f63f0085d5dc18828a791",
  measurementId: "G-TRBCEYG9QV"
};

// Initialize Firebase
const app = initializeApp(firebaseConfig);
const analytics = getAnalytics(app);