import React, { useState } from "react";


const AddUserForm = (props) => {
    const initialFormState = {id:null,name:'',username:''};

    const[user,setUser] = useState(initialFormState);

    const handleInputChange = (event) => {
        const setUser{name,value} = event.target;
        ({...user,[name]:value});
    }

    return(
        <form class="form-group"  onSubmit={ (event) => {
            event.preventDefault()
            if(!user.name || !user.username)

            return 
            props.adduser(user)
            setUser(initialFormState)
        }}>
            <label>
                Name
                <input type="text" name="name" class="form-control" value={user.name} onChange={handleInputChange}/>
            </label><label>
                User Name
                <input type="text" name="username" class="form-control" value={user.username} onChange={handleInputChange}/>
            </label>
            
            <button class="btn btn-primary">Add New User</button>
        </form>
    );

}

export default AddUserForm;