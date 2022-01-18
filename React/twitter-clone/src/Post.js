import { Avatar } from '@material-ui/core';
import React from 'react';
import VerifiedUserIcon from "@material-ui/icons/VerifiedUser";
import './Post.css';
import  PublishIcon  from '@material-ui/icons/Publish'
import  ChatBubbleOutlineIcon  from '@material-ui/icons/ChatBubbleOutline'

import RepeatIcon from '@material-ui/icons/Repeat'
import FavoriteBorderIcon from '@material-ui/icons/FavoriteBorder'
function Post() {
    return (
        <div className="post">
          <div className="post_avatar"><Avatar /></div>
           <div className="post_body">
               <div className="post-header">
                   <div className="post_headerText">
                       <h3>Displsay</h3>
                       <span className="post_headerSpecial">
                          <VerifiedUserIcon />  @user
                        
                       </span>
                   </div> 
                 
               </div>

              
                        <p>text</p><img src="https://cdn.graciousquotes.com/wp-content/uploads/2020/05/For-every-day-I-miss-you.-For-every-hour-I-need-you.-For-every-minute-I-feel-you.-For-every-second-I-want-you.-Forever-I-love-you..jpg"/>
                 
                   <div className="post_footer">
                   <ChatBubbleOutlineIcon fontSize = "small" /> 
                    <RepeatIcon fontSize = "small" />
                    <FavoriteBorderIcon fontSize = "small" />
                    <PublishIcon  fontSize = "small" />


                   </div>
          </div>
          
        </div>
    )
}

export default Post;
