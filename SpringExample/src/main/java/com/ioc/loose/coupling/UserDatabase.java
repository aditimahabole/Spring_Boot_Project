package com.ioc.loose.coupling;

public class UserDatabase implements UserDataProviderInterface {
    //overriding getUserDetails from userDataProviderInterface
    @Override
    public String getUserDetails(){
        return "IOC EXAMPLE : user details from User Database";
    }
}
