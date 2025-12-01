package edu.gestion_usuarios.repository;

import edu.gestion_usuarios.model.User;
import edu.gestion_usuarios.model.Role;

public class Dao {
    
    private final Integer MAX_USERS = 100;
    private User[] users;

    public Dao() {
        this.users = new User[MAX_USERS];
        this.users[0] = new User("Etzel Molina", "123456", "Jeff", "elpapi23", Role.ADMINISTRATOR);
    }

    public User[] getUsers() {
        return users;
    }

    public void create(User user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = user;
                break;
            }
        }
    }

    public User find(String userId, String userName) {
        if (userId == null) {
            for (int i = 0; i < users.length; i ++) {
                if (users[i] != null && users[i].getUserName().equalsIgnoreCase(userName)) {
                    return users[i];
                }
            }
            return null;
        }else if (userName == null) {
            for (int i = 0; i < users.length; i ++) {
                if (users[i] != null && users[i].getUserId().equalsIgnoreCase(userId)) {
                    return users[i];
                }
            }
            return null;
        }
        return null;
    }

    public Integer getIndexByUsername(String userName) {
        for (int i = 0; i < users.length; i ++) {
            if (users[i] != null && users[i].getUserName().equalsIgnoreCase(userName)) {
                return i;
            }
        }
        return null;
    }

    public Integer getIndexByUserId(String userId) {
        for (int i = 0; i < users.length; i ++) {
            if (users[i] != null && users[i].getUserId().equalsIgnoreCase(userId)) {
                return i;
            }
        }
        return null;
    }

    public void update(User user, String password, String fullName, Role role) {
        if (fullName != null) {
            user.setFullName(fullName);
        }
        if (password != null) {
            user.setPassword(password);
        }
        if (role != null) {
            user.setRole(role);
        }
    }

    public void delete(User user) {
        users[getIndexByUserId(user.getUserId())] = null;
    }

    public void displayUsers() {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                System.out.println(users[i]);
            }
        }
    }
    

}
