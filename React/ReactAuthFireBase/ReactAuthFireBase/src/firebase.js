import { initializeApp } from "firebase/app";
import { getAuth } from "firebase/auth";

const firebaseConfig = {
  apiKey: "AIzaSyDh-CtQ5jkX7PSumTKdzVua3b6IytgAOog",
  authDomain: "fir-auth-43c57.firebaseapp.com",
  projectId: "fir-auth-43c57",
  storageBucket: "fir-auth-43c57.appspot.com",
  messagingSenderId: "559345010251",
  appId: "1:559345010251:web:cb6a0bf21cd04a7fd56fce",
  measurementId: "G-TC1YK9MVPK"
};
// Initialize Firebase
const app = initializeApp(firebaseConfig);
export const auth = getAuth(app);
export default app;
