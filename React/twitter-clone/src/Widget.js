import { Label } from '@material-ui/icons'
import React from 'react'

function Widget() {
    return (
        <div className="widget">
          <form action="/" method="get">
       
        <input
            type="text"
            id="header-search"
            placeholder="Search blog posts"
            name="s" 
        />
        <button type="submit">Search</button>
    </form>
           <form>

             <div>
             <label>UserId</label>
             <input type="text" /> 
             <label>password</label>
             <input type="password" />
             <button></button>
             </div>
           </form>

        </div>
    )
}

export default Widget

