import React from 'react';
import { Link } from "react-router-dom";

function Home() {
  return (
    <div>
    <p><Link to="/imageslide/">ImageSlide</Link></p>
    <Link to="/imagehover/">imagehover</Link>
       
    </div>
  )
}

export default Home
