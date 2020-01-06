package com.pp.springboot200102.core.service.impl;

import com.pp.springboot200102.core.dao.SysRoleMenuDao;
import com.pp.springboot200102.core.entity.SysRoleMenuEntity;
import com.pp.springboot200102.core.service.SysRoleMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @Description 角色与权限业务实现
 * @Author pp
 * @CreateTime 2019/6/14 15:57
 */
@Service("sysRoleMenuService")
public class SysRoleMenuServiceImpl extends ServiceImpl<SysRoleMenuDao, SysRoleMenuEntity> implements SysRoleMenuService {

}