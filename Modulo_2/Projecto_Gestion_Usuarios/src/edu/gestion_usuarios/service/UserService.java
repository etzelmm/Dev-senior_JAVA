package edu.gestion_usuarios.service;

import edu.gestion_usuarios.model.User;
import edu.gestion_usuarios.model.Role;
import edu.gestion_usuarios.repository.Dao;
import edu.gestion_usuarios.repository.ActionDao;

public class UserService {

    private Dao users;
    private ActionDao actions = new ActionDao();

    public UserService(Dao users) {
        this.users = users;
    }


    /**
     * validate if the id exist 
     * @param users = array of user in system
     * @param userId = the id you are validate
     * @return true if exist, false if not exist
     */
    public Boolean idExist (String userId) {
        if (users.find(userId, null) != null) {
            return true;
        }
        return false;
    }

    /**
     * validate if the user name exist 
     * @param users = array of user in system
     * @param userName = the user name you are validate
     * @return true if exist, false if not exist
     */
    public Boolean userNameExist (String userName) {
        if (users.find(null, userName) != null) {
            return  true;
        }
        return false;
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
    public void createUser(User userSession, String fullName, String userId, String userName, String password, Role role) {
        if (userSession.getRole() != Role.ADMINISTRATOR) {
            System.err.println("No tienes los permisos nececesarios para crear un usuario");        
        } else if (idExist(userId) || userNameExist(userName)) {
            System.err.println("El id de usuario ya existe ");
        } else {
            actions.addActionToUser(userSession, "Creacion");
            users.create(new User(fullName, userId, userName, password, role));
            System.out.println("usuario creado");
        }
    }

    /**
     * shearch a user by id and validate the rol of user actioner
     * @param users = array of users
     * @param user = user actioner
     * @param userId = of user shearch
     * @return object user
     */
    public User shearchUserById(User user, String userId) {
        if (idExist(userId)) {
            if (user.getRole() == Role.ADMINISTRATOR) {
                return users.find(userId, null);
            } else if (user.getUserId().equals(userId)) {
                return user;
            } else {
                System.err.println("No cuenta con los permisos para buscar usuarios");
                return null;
            }
        }
        System.err.printf("usuario con id: %s no existe%n", userId); 
        return null;
    }

    /**
     * shearch a user by user name and validate the rol of user actioner
     * @param users = array of users
     * @param user = user actioner
     * @param userName = of user shearch
     * @return object user
     */
    public User shearchUserByUserName(User user, String userName) {
            if (userNameExist(userName)) {
                if (user.getRole() == Role.ADMINISTRATOR) {
                    return users.find(null, userName);
                } else if (user.getUserName().equals(userName)) {
                    return user;
                } else {
                    System.err.println("No cuenta con los permisos para buscar usuarios");
                    return null;
                }
            }
        System.err.printf("UserName: %s no existe%n", userName); 
        return null;
    }

    public User login(String userName, String password) {
        User userSession;
        var userSessionIndex = users.getIndexByUsername(userName);
        if (userSessionIndex == null) {
            return null;
        }
        userSession = users.getUsers()[users.getIndexByUsername(userName)];    
        if (userNameExist(userName)) {
            if (userSession.getPassword().equals(password)) {
                actions.addActionToUser(userSession,"Login");
                return userSession;
            } else {
                System.err.println("Contrasenia incorrecta");
                return null;
            }
        } else{
            System.err.println("Usuario no Existe");
            return null;
        }
    }

    public void updatePassword(User userSession, String password, String newPassword) {
            if (userSession.getPassword().equals(password)) {
                users.update(userSession, newPassword, null, null);
                actions.addActionToUser(userSession, "Actualizacion de contrasenia");
            } else {
                System.err.println("Contrasenia incorrecta");
            }
    }

    public void updateFullName(User user, String newFullName) {
        users.update(user, null, newFullName, null);
        actions.addActionToUser(user, "Actualizacion de nombre");
    }
    
    public void deleteUser(User userSession, User userToDelete) {
        if(userSession.getRole() == Role.ADMINISTRATOR) {
            users.delete(userToDelete);
            actions.addActionToUser(userSession, "Elimiacion de usuario");
            System.out.println("usuario eliminado");
        }else {
            System.err.println("No tiene permisos para borrar usuarios");
        } 
    }

    public void displayActionsDao(User user) {
        displayActionsDao(user);
    }

    public void updateRole(User userSession, User user, Role role) {
        if (userSession.getRole() == Role.ADMINISTRATOR) {
            users.update(user, null, null, role);
            actions.addActionToUser(userSession, "Actualizacion de rol");
        }
        System.err.println("No tiene permisos Actulizar usuarios");
    }

    public String displayUser(User user)  {
        return user.toString();
    }

    public void displayUsersDao() {
        users.displayUsers();
    }
}


