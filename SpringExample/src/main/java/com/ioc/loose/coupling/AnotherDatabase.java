package com.ioc.loose.coupling;

public class AnotherDatabase implements UserDataProviderInterface {
    @Override
    public String getUserDetails() {
        return "IOC EXAMPLE :  user details from another database";
    }
}
