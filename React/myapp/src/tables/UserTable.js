import React from "react";
import './UserTable.css';



const UserTable = (props) => {

    return(
        <table class="table table-condensed">
            <thead>
                <tr>
                    <th class="text-muted" >Name</th>
                    <th class="text-muted">UserName</th>
                    <th class="text-muted">Action</th>
                </tr>
            </thead>
            <tbody>
                {props.users.length > 0 ? (
                    props.users.map( (user) =>
                <tr key={user.id}>
                    <td>{user.name}</td>
                    <td>{user.username}</td>
                    <td>
                        <button onClick={() => {
                            props.editRow(user)
                            }
                        }                    
                            className="btn btn-primary">Edit</button>
                        <button onClick={
                            () => props.deleteUser(user.id)
                        } className="btn btn-primary">Delete</button>
                    </td>
                </tr>
                )):(
                    <tr>
                        <td colSpan={3}>No User Found.</td>
                    </tr>

                )}
            </tbody>
        </table>
    );

}

export default UserTable;