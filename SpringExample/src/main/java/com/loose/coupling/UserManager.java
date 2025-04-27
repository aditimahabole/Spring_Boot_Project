package com.loose.coupling;

public class UserManager {
    // not hardcode
    private UserDataProviderInterface userDatabaseProvider ;
    // injecting into constructor
    public UserManager(UserDataProviderInterface userDatabaseProvider) {
        this.userDatabaseProvider = userDatabaseProvider;
    }
    public String getUserInfo(){
        return userDatabaseProvider.getUserDetails();
    }
}
