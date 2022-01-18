import { Avatar, Button } from '@material-ui/core'
import React from 'react'
import './TweetBox.css';

function TweetBox() {
    return (
        <div className="tweetbox">
            
           <form className="tweet_input">
              <div className="tweetbox_input">
                  <Avatar src="https://encrypted-tbn0.gstatic.com/
                  images?q=tbn:ANd9GcTeMNQrP-U_aGEawv0zNy-prdtlkMVpaMFUyA&usqp=CAU"/>
                  <input type="text"
                  placeholder="Whats Going On"/>
              </div>
             
                    <input 
                    className="TweetBox_imginput" 
                    type="text" 
                    placeholder="Oops Shere Your Photo with your world"/>
                    <Button className="tweetBox_tweetButton">Tweet</Button>
             
           </form>
        </div>
    )
}

export default TweetBox
