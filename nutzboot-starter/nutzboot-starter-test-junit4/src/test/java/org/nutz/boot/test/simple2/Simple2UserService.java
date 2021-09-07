package org.nutz.boot.test.simple2;

import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.lang.Strings;

@IocBean(name = "users")
public class Simple2UserService {

    public boolean login(String username, String password) {
        if (Strings.isBlank(username) || Strings.isBlank(password))
            return false;
        if (username.startsWith("admin") && password.startsWith("123"))
            return true;
        return false;
    }
}
