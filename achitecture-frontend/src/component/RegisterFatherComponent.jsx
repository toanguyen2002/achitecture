import React from 'react'
import { useNavigate, useParams } from 'react-router-dom'

function RegisterFather() {
    const navigator = useNavigate()
    const params = useParams()
    // { userId, pass }
    // const [userId, pass] = params.id.split("&");
    // console.log(userId);
    // console.log(pass);
    console.log(params);
    return (
        <div className='RegisterFather'>
            <div className="">
                <input type="submit" value="send" onClick={() => navigator("/")} />
            </div>

        </div>
    )
}

export default RegisterFather