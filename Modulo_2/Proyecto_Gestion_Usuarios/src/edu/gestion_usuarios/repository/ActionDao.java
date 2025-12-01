package edu.gestion_usuarios.repository;

import edu.gestion_usuarios.model.Action;
import edu.gestion_usuarios.model.User;

public class ActionDao {
    private final Integer MAX_ACTIONS = 50;
    protected Action[] actions;

    public ActionDao() {
        this.actions = new Action[MAX_ACTIONS];
    }

    public void addActionToUser(User user, String descrption) {
        var action = new Action(descrption);
        user.getActions()[user.getCurrencyActions()] = action;
        user.setCurrencyActions(user.getCurrencyActions() + 1);    
    }

    public void displayActions(User user) {
        for (int i = 0; i < user.getActions().length; i++){
            if (user.getActions()[i] != null) {
                System.out.println(user.getActions()[i]);
            }
        }
    }
}
