import React from 'react';
import TwitterIcon from '@material-ui/icons/Twitter';
import HomeIcon from '@material-ui/icons/Home';
import SearchIcon from '@material-ui/icons/Search';
import NotificationsNoneIcon from '@material-ui/icons/NotificationsNone';
import MailOutlineIcon from '@material-ui/icons/MailOutlineOutlined';
import BookmarkBorderIcon from '@material-ui/icons/BookmarkBorder';
import ListAltIcon from '@material-ui/icons/ListAlt';
import PermIdentityIcon from '@material-ui/icons/PermIdentity';
import MoreHorizIcon from '@material-ui/icons/MoreHoriz';

import SidebarOptions from './SidebarOptions';
import './Sidebar.css';
import { Button } from '@material-ui/core';

function Sidebar() {
    return (
        //BEN convention
        <div className="sidebar">
                
              <TwitterIcon className="sidebar_twitterIcon" />
              <SidebarOptions active Icon={HomeIcon} text="Home"/>
              <SidebarOptions Icon={SearchIcon} text="Search"/>
              <SidebarOptions Icon={NotificationsNoneIcon} text="Notification" />
              <SidebarOptions Icon={MailOutlineIcon} text="Message"/>
              <SidebarOptions Icon={BookmarkBorderIcon} text="BookMarks"/>
              <SidebarOptions  Icon={ListAltIcon} text="Lists" />
              <SidebarOptions Icon={PermIdentityIcon} text="Profile" />
              <SidebarOptions Icon={MoreHorizIcon} text="More" />

              <Button className="sidebar_tweet" variant="outlined">Tweet</Button>
              
            
        </div>
    )
}

export default Sidebar;
