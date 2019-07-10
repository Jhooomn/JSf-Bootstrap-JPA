/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.entity.User;
import com.services.UserServices;
import java.util.LinkedList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Jhon Baron
 */
@ManagedBean
@SessionScoped
public class userController {

    User user;
    List<User> users = new LinkedList();
    UserServices us = new UserServices();

    /**
     * Creates a new instance of userController
     */
    public userController() {
        user = new User();
        list();
    }

    public void add() {
        us.crear(user);
        user = new User();
        list();
    }
    public void delete(User user){
        us.eliminar(user);
        list();
    }

    public void list() {
        users = us.consultarTodo(User.class);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

}
