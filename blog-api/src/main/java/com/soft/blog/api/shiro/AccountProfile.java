package com.soft.blog.api.shiro;

import lombok.Data;

import java.io.Serializable;

/**
 * @description: 登陆账号类
 * @author: crq
 * @create: 2021-12-07 15:53
 **/
@Data
public class AccountProfile implements Serializable {

    private Long id;

    private String username;

    private String avatar;

    private String email;
}
