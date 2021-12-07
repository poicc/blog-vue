package com.soft.blog.api.service.impl;

import com.soft.blog.api.entity.User;
import com.soft.blog.api.mapper.UserMapper;
import com.soft.blog.api.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author crq
 * @since 2021-12-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
