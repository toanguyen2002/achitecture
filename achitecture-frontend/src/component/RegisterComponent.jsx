import React from 'react'
import SideBarComponent from './SideBarComponent'
import { Outlet } from 'react-router'

function RegisterComponent() {
    return (
        <div className='registerComponent'>
            <SideBarComponent />
            <Outlet />
        </div>
    )
}

export default RegisterComponent