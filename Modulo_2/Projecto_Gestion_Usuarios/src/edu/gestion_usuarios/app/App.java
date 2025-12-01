package edu.gestion_usuarios.app;


import java.util.Scanner;

import edu.gestion_usuarios.model.Role;
import edu.gestion_usuarios.model.User;
import edu.gestion_usuarios.repository.Dao;
import edu.gestion_usuarios.service.UserService;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        var users = new Dao();
        var userService = new UserService(users);


        var userSession = homePage(input, userService);

        while (userSession == null) {
            userSession = homePage(input, userService);
        }

        while (userSession != null) {
            System.out.println("""
                    ===  MENU  ===

                    [1] Crear usuarios
                    [2] Buscar usuario
                    [3] Cerrar sesion
                    [4] Ver todos los usuarios
                    [5] Salir
                    """);
            System.out.print("opc: ");
            var opc = input.nextInt();
            input.nextLine();
            switch (opc) {
                case 1:
                    createUserPage(input, userService, userSession);
                    break;
                case 2:
                    var user = shearchPage(input, userService, userSession);
                    if (user == null) {
                        break;
                    }
                    var back = userPage(input, userService, userSession, user);
                    if (back) {
                        break;
                    }
                case 3:
                    System.out.println("Sesion cerrada");
                    userSession = homePage(input, userService);
                    break;
                case 4:
                    userService.displayUsersDao();
                    break;
                case 5:
                    System.out.println("--------------------- ADIOS ---------------------");
                    userSession = null;
                    break;
                default:
                    System.out.println("INGRESE UNA OPCION VALIDA");
                    System.out.println();
                    break;
            }
        }
        
        
        

        input.close();
    }

    public static User homePage(Scanner input, UserService userService) {
        Boolean isLogued = false;
        while (isLogued == false) {
            System.err.println("""
                    ===== SISTEMA DE GESTION DE USUARIOS ====

                    [1] Iniciar sesion
                    [2] Salir
                    """);
            System.out.print("opc: ");
            var opc = input.nextInt();
            input.nextLine();
            System.out.println();
            switch (opc) {
            case 1:
                var userSession = loginPage(input, userService);
                return userSession;
            case 2:
                System.out.println("Adios");
                break;
            default:
                System.out.println("""
                    _______________
                    OPCION INVALIDA
                    _______________
                """);
                continue;
                
            }
            break;
        }
        return null;
    }

    public static User loginPage (Scanner input, UserService userService) {
        System.out.println("==  login  ==");
        System.out.println("---------------------");
        System.out.print("INGRESE SU SUSARIO: ");
        var userName = input.nextLine();
        System.out.println("---------------------");
        System.out.println();
        System.out.println("------------------------");
        System.out.print("INGRESE SU CONTRASENIA: ");
        var password = input.nextLine();
        System.out.println("------------------------");
        return userService.login(userName, password); 
    }

    public static Role roleAsignate(Scanner input) {
        var validRole = false;
        while (validRole == false) {
            System.out.println("""
                Asigne un rol:
                [1] Administrador
                [2] Estandar
            """);
            System.out.print("opc: ");
            var opc = input.nextInt();
            input.nextLine();
            System.out.println();
            switch (opc) {
                case 1:
                    return Role.ADMINISTRATOR;
                case 2:
                    return Role.STANDAR;
                default:
                    System.out.println(" INGRESE UN ROL VALIDO ");
                    validRole = false;
                    continue;
            }
        }
        return null;
    }
    
    public static void createUserPage (Scanner input, UserService userService, User userSession) {
        System.out.println("---- CREACION DE USUARIO ----");
        System.out.print("Ingrsee el nombre completo: ");
        var fullName = input.nextLine();
        System.out.println();
        System.out.print("Ingrese el nombre de usuario: ");
        var userName = input.nextLine();
        System.out.println();
        System.out.print("Ingrese el id del usuarios: ");
        var userId = input.nextLine();
        System.out.println();
        System.out.print("Asigne una contrasenia al usuario: ");
        var password = input.nextLine();
        var role = roleAsignate(input);
        userService.createUser(userSession, fullName, userId, userName, password, role);
    }

    public static User shearchPage(Scanner input, UserService userService, User userSession) {
        var validOpc = false;
        System.out.println("""
                ---- Busqueda de usuarios ----

                Desea consultar por :
                [1] Id
                [2] Nombre de usuario
                [0] Volver
                """);
        System.out.print("opc: ");
        var opc = input.nextInt();
        input.nextLine();
        System.out.println();
        while (validOpc == false) {
            switch (opc) {
                case 1:
                    System.out.print("Ingrese el ide del usuario: ");
                    var userId = input.nextLine();
                    System.out.println();
                    return userService.shearchUserById(userSession, userId);
                case 2:
                    System.out.print("Ingrese el nombre de usuario: ");
                    var userName = input.nextLine();
                    System.out.println();
                    return userService.shearchUserByUserName(userSession, userName);
                case 0:
                    return null;
                default:
                    System.out.println("INGRESE UNA OPCION VALIDA");
                    System.out.println();
                    validOpc = false;
                    continue;
            }
        }
        return null;
    }

    public static Boolean userPage(Scanner input, UserService userService, User userSession, User user) {
        var opc = 1;
        while (opc != 0) {
            System.out.println(userService.displayUser(user));
            System.out.println("""
                    ---- MENU USUARIO ----
                    [1] Cambiar nombre
                    [2] Cambiar contrasenia
                    [3] Cambiar rol
                    [4] Ver acciones del usuario
                    [5] Eliminar usuario
                    [0] Volver
                    """);
            System.out.print("opc: ");
            opc = input.nextInt();
            input.nextLine();
            System.out.println();
            switch (opc) {
                case 1:
                    System.out.print("Ingrese el nuevo nombre: ");
                    var newFullName = input.nextLine();
                    userService.updateFullName(user, newFullName);
                    break;
                case 2:
                    System.out.print("Ingrese su contrasenia actual: ");
                    var password = input.nextLine();
                    System.out.println();
                    System.out.print("Ingrese su nueva contrasenia: ");
                    var newPassword = input.nextLine();
                    userService.updatePassword(userSession, password, newPassword);
                    break;
                case 3:
                    var role = roleAsignate(input);
                    userService.updateRole(userSession, user, role);
                    break;
                case 4:
                    userService.displayActionsDao(user);
                    break;
                case 5:
                    userService.deleteUser(userSession, user);
                    break;
                case 0:
                    return true;
                default:
                    System.out.println("SELECIONE UNA OPCION VALIDA");
                    continue;
            }
        }
        return true;
    }

}
