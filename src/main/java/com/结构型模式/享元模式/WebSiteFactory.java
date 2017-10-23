package com.结构型模式.享元模式;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Yuanping on 2017/10/23.
 * 使用工厂创建
 */
public class WebSiteFactory {
    //存储实例对象
    private static Map<String, WebSite> webSites = new HashMap<String, WebSite>();

    //禁止外部创建
    private WebSiteFactory() {
    }

    /**
     * type作为对象公共属性，使用改属性获取对应的对象实例
     * @param type
     * @return
     */
    public static WebSite createWebSite(String type) {
        WebSite webSite = webSites.get(type);
        if (webSite == null) {
            webSite = new ConcurrentWebSite(type);
            webSites.put(type, webSite);
        }
        return webSite;
    }

    /**
     * 获取实例对象的个数
     * @return
     */
    public static int webSitesCount() {
        return webSites.size();
    }
}
