import React from'react';
import UserService from '../services/UserService';

class UserComponent extends React.Component{
    constructor(props){
        super(props)
        this.state = {
            users:[]
        }
    }
    componentDidMount(){
        UserService.getUsers().then((response)=>{
         this.setState({users: response.data})
         });
    
    }
    render(){
        return(
            <div>
               <h1 className = "text-center">Users List</h1>
               <table className = "table table-striped">
                <thead>
                    <tr>
                       <td>User Id</td>
                       <td>User FirstName</td>
                       <td>User LastName</td>
                       <td>User EmailID</td>
                       <td>User Location</td>
                            
                    </tr>
                </thead>
                <tbody>
                    {
                        this.state.users.map(
                            user =>
                            <tr key = {user.id}>
                                
                                <td>{user.id}</td>
                                <td>{user.fName}</td>
                                <td>{user.lName}</td>
                                <td>{user.email}</td>
                                <td>{user.location}</td>

                            </tr>
                        )
                    }
                </tbody>
               </table>
            </div>
        )
    }


}

export default UserComponent