import './App.css';
import { Route,Routes } from 'react-router-dom';
import ImageSlide from './ImageEffects/ImageSlide';
import ImageHover from './ImageEffects/ImageHover';
import Home from './Home';



function App() {
  return (
    <div className="App">
    <Routes>
    <Route exact path="/" element={<Home />} />  

    <Route  path="/imageslide" element={<ImageSlide />} />  
    
    <Route  path="/imagehover" element={<ImageHover />} />  

    </Routes>
     
    </div>
  );
}

export default App;
