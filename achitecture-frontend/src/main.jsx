import React from 'react'
import ReactDOM from 'react-dom/client'
import App from './App.jsx'
import './index.css'
import {
  createBrowserRouter,
  RouterProvider,
} from "react-router-dom";
import RegisterComponent from './component/RegisterComponent.jsx';
import LoginComponent from './component/LoginComponent.jsx';
import RegisterChildComponent from './component/RegisterChildComponent.jsx';
import RegisterFather from './component/RegisterFatherComponent.jsx';
const router = createBrowserRouter([
  {
    path: "/",
    element: <LoginComponent />,
  },
  {
    path: "/register",
    element: <RegisterComponent />,
    children: [
      {
        path: "/register/RegisterFather/:id",
        element: <RegisterFather />,
        // loader: contactLoader,
      },
      {
        path: "/register/RegisterChild",
        element: <RegisterChildComponent />,
        // loader: contactLoader,
      },
    ],
  },
]);

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <RouterProvider router={router} />
  </React.StrictMode>,
)
