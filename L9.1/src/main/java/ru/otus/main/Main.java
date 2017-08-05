package ru.otus.main;

/**
 * mysql> CREATE USER 'tully'@'localhost' IDENTIFIED BY 'tully';
 * mysql> GRANT ALL PRIVILEGES ON * . * TO 'tully'@'localhost';
 * mysql> select user, host from mysql.user;
 * mysql> create database db_example;
 * mysql> SET GLOBAL time_zone = '+3:00';
 */

public class Main {
    public static void main(String[] args) {
        ConnectionHelper.example();

        //ConnectWithStatements.example();
        //PreparedExample.example();
        //TExample.example();
        //DataSetExample.example();
    }
}
