package com.loose.coupling;

import com.loose.coupling.UserManager;

public class LooseCouplingExample {
    //object of interface = object of a class that implements that interface

    public static void main(String[] args) {

        UserDataProviderInterface userDatabaseProvider = new UserDatabase();
        UserManager userManagerwithDB = new UserManager(userDatabaseProvider);
        System.out.println(userManagerwithDB.getUserInfo());
    }
}
