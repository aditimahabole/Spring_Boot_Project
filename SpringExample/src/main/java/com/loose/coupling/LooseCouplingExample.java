package com.loose.coupling;

import com.loose.coupling.UserManager;

public class LooseCouplingExample {
    //object of interface = object of a class that implements that interface

    public static void main(String[] args) {
        // reference variable as interface
        // userDatabase
        UserDataProviderInterface userDatabaseProvider = new UserDatabase();
        UserManager userManagerwithDB = new UserManager(userDatabaseProvider);
        System.out.println(userManagerwithDB.getUserInfo());

        //anotherDatabase
        UserDataProviderInterface anotherDatabaseProvider = new AnotherDatabase();
        userManagerwithDB = new UserManager(anotherDatabaseProvider);
        System.out.println(userManagerwithDB.getUserInfo());

        // output :
        //user details from UserDatabase
        //user details from another database
    }
}
