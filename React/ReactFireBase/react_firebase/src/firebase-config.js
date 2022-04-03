
import { initializeApp } from "firebase/app";
import { getFirestore } from "firebase/firestore";


const firebaseConfig = {
  apiKey: "AIzaSyDfBs0xDl-cuwdxCQhwHeigC_3E3Sy6APQ",
  authDomain: "reactfirebase-9af5a.firebaseapp.com",
  projectId: "reactfirebase-9af5a",
  storageBucket: "reactfirebase-9af5a.appspot.com",
  messagingSenderId: "441166722316",
  appId: "1:441166722316:web:254c2db4f45eb1281f0529",
  measurementId: "G-HXRJBZQDC2"
};

const app = initializeApp(firebaseConfig);

export const db = getFirestore(app);