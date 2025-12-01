package edu.gestion_usuarios.model;


public class User {

    private String fullName;
    private String userId;
    private String userName;
    private String password;
    private Role role;
    private Action[] actions;
    private Integer currencyActions;

    public User(String fullName, String userId, String userName, String password, Role role) {
        this.fullName = fullName;
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.role = role;
        this.actions = new Action[100];
        this.currencyActions = 0;
    }

    public String getFullName() {
        return fullName;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }

    public Action[] getActions() {
        return actions;
    }

    public Integer getCurrencyActions() {
        return currencyActions;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setCurrencyActions(Integer currencyActions) {
        this.currencyActions = currencyActions;
    }


    @Override
    public String toString() {
        return String.format("Usuario: %s%nNombre de usuario: %s%nId: %s%nRol: %s%n", getFullName(), getUserName(), getUserId(), getRole().toString());
    }
 
}