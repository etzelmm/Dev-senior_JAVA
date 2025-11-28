package edu.gestion_usuarios.service;

import edu.gestion_usuarios.model.User;
import edu.gestion_usuarios.model.Role;

import java.time.LocalDateTime;

import edu.gestion_usuarios.model.Action;

public class UserService {

    /**
     * validate if the id exist 
     * @param users = array of user in system
     * @param userId = the id you are validate
     * @return true if exist, false if not exist
     */
    public Boolean idExist (User[] users, String userId) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUserId().equalsIgnoreCase(userId)) {
                return  true;
            }
        }
        return false;
    }

    /**
     * validate if the user name exist 
     * @param users = array of user in system
     * @param userName = the user name you are validate
     * @return true if exist, false if not exist
     */
    public Boolean userNameExist (User[] users, String userName) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUserName().equalsIgnoreCase(userName)) {
                return  true;
            }
        }
        return false;
    }

    /**
     * validates if username exist and return the index in users array
     * @param users = array of users
     * @param userName = of user
     * @return index in array 
     */
    public Integer getIndexByUserName (User[] users, String userName) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUserName().equalsIgnoreCase(userName)) {
                return  i;
            }
        }
        return users.length + 1;
    }

    /**
     * create a new user and validate if its posible with role of user that create the new user
     * and new user id. Finally add one action to user
     * @param users = array of user in system
     * @param user = user that do the creation
     * @param fullName = of new user
     * @param userId = of new user
     * @param userName = of new user
     * @param password = of new user
     * @param role = of new user
     * @return ibject new user to add on array
     */
    public User createUser(User[] users, User user, String fullName, String userId, String userName, String password, Role role) {
        if (user.getRole() != Role.ADMINISTRATOR) {
            System.err.println("No tienes los permisos nececesarios para crear un usuario");
            return null;         
        } else if (idExist(users, userId) || userNameExist(users, userName)) {
            System.err.println("El id de usuario ya existe ");
            return null;
        } else {
            var actionCreate = new Action("Creacion", LocalDateTime.now());
            user.getActions()[user.getCurrencyActions()] = actionCreate;
            user.setCurrencyActions(user.getCurrencyActions() + 1);
            return new User(fullName, userId, userName, password, role);
        }
    }

    /**
     * shearch a user by id and validate the rol of user actioner
     * @param users = array of users
     * @param user = user actioner
     * @param userId = of user shearch
     * @return String whit info user
     */
    public String shearchUserById(User[] users, User user, String userId) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUserId().equalsIgnoreCase(userId)) {
                if (user.getRole() == Role.ADMINISTRATOR) {
                    return users[i].toString();
                } else if (user.getUserId().equals(userId)) {
                    return user.toString();
                } else {
                    return "No cuenta con los permisos para buscar usuarios";
                }
            }
        } 
        return user.toString();
    }

    /**
     * shearch a user by user name and validate the rol of user actioner
     * @param users = array of users
     * @param user = user actioner
     * @param userName = of user shearch
     * @return String whit info user
     */
    public String shearchUserByUserName(User[] users, User user, String UserName) {
        for (int i = 0; i < users.length; i++) {
            if (idExist(users, UserName)) {
                if (user.getRole() == Role.ADMINISTRATOR) {
                    return users[getIndexByUserName(users, UserName)].toString();
                } else if (user.getUserName().equals(UserName)) {
                    return user.toString();
                } else {
                    return "No cuenta con los permisos para buscar usuarios";
                }
            }
        } 
        return user.toString();
    }

    public Boolean login(User[] users, String userName, String password) {
        if (userNameExist(users, userName)) {
            if (users[getIndexByUserName(users, userName)].getPassword().equals(password)) {
                return true;
            } else {
                return false;
            }
        } else{
            System.err.println("Usuario no Existe");
            return false;
        }
    }

    public void updatePassword(User user, String password, String newPassword) {
        if (user.getPassword().equals(password)) {
            user.setPassword(newPassword);
        } else {
            System.err.println("Contrasenia incorrecta");
        } 
    }

}


