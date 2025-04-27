package com.loose.coupling;

public class AnotherDatabase implements UserDataProviderInterface{
    @Override
    public String getUserDetails() {
        return "user details from another database";
    }
}
