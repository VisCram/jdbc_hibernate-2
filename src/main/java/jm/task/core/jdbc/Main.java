package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    private final static UserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        userService.createUsersTable();

        userService.saveUser("Ninfea", "Pixie Queen", (byte) 100);
        userService.saveUser("Concorda", "Guard the Codex in the Alfea", (byte) 70);
//        userService.saveUser("Discorda", "Guard the Codex in the Cloud Tower", (byte) 65);
//        userService.saveUser("Athena", "Guard the Codex in the Red Fountain", (byte) 80);
//
//        userService.removeUserById(2);
//
//        userService.getAllUsers();
//
//        userService.cleanUsersTable();
//
//        userService.dropUsersTable();

    }
}
