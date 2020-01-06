package com.pp.springboot200102.core.service.impl;

import com.pp.springboot200102.core.dao.SysUserRoleDao;
import com.pp.springboot200102.core.entity.SysUserRoleEntity;
import com.pp.springboot200102.core.service.SysUserRoleService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @Description 用户与角色业务实现
 * @Author pp
 * @CreateTime 2019/6/14 15:57
 */
@Service("sysUserRoleService")
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleDao, SysUserRoleEntity> implements SysUserRoleService {

}