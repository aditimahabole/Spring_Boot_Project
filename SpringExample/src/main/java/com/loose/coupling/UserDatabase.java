package com.loose.coupling;

public class UserDatabase implements UserDataProviderInterface {
    //overriding getUserDetails from userDataProviderInterface
    @Override
    public String getUserDetails(){
        return "user details";
    }
}
