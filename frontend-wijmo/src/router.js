
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import UsersManager from "./grid/UsersGrid"
import UsersDetail from "./components/listers/UsersDetail"
import DepartmentManager from "./grid/DepartmentGrid"
import DepartmentDetail from "./components/listers/DepartmentDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/users',
                name: 'UsersManager',
                component: UsersManager
            },
            {
                path: '/users/:id',
                name: 'UsersDetail',
                component: UsersDetail
            },
            {
                path: '/departments',
                name: 'DepartmentManager',
                component: DepartmentManager
            },
            {
                path: '/departments/:id',
                name: 'DepartmentDetail',
                component: DepartmentDetail
            },



    ]
})
