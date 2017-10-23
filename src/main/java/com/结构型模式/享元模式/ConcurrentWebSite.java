package com.结构型模式.享元模式;

/**
 * Created by Yuanping on 2017/10/23.
 */
public class ConcurrentWebSite extends WebSite {
    /**
     * 公共的部分，交给父类
     * @param type
     */
    public ConcurrentWebSite(String type) {
        super(type);
    }

    /**
     * 不同的部分
     * @param user
     */
    @Override
    public void use(User user) {
        System.out.println("该网站的类型是:" + type);
        System.out.println("用户名：" + user.getUserName());
        System.out.println("密码:" + user.getPassWd());
        System.out.println();
    }
}
