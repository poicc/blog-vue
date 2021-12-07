package com.soft.blog.api.util;

import com.soft.blog.api.shiro.AccountProfile;
import org.apache.shiro.SecurityUtils;

/**
 * @description: ShiroUtil工具类
 * @author: crq
 * @create: 2021-12-07 15:30
 **/
public class ShiroUtil {
    public static AccountProfile getProfile() {
        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }
}
