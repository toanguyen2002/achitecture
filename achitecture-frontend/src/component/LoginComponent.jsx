import React from 'react'
import { useNavigate } from 'react-router'

function LoginComponent() {
    const navigator = useNavigate()
    // register/RegisterFather
    const login = () => {
        navigator("/register")
    }
    return (
        <div class="login-form">
            <h2>CỔNG THÔNG TIN SINH VIÊN</h2>
            {/* <form> */}
            <label for="student-id">Nhập mã sinh viên</label>
            <input type="text" id="student-id" name="student-id" />

            <label for="password">Nhập mật khẩu</label>
            <input type="password" id="password" name="password" />

            <input type="submit" value="Đăng nhập" onClick={login} />
            {/* </form> */}
        </div>
    )
}

export default LoginComponent