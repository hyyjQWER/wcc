/**
 * @ProjectName: github
 * @Package: PACKAGE_NAME
 * @Description: java类作用描述
 * @Author: 王陈
 * @CreateDate: 2020/11/14 16:56
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */


public class GItHub {
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "GItHub{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
