package cn.tlh.consumer.controller.system;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 用户角色关联(SysUsersRoles)表控制层
 *
 * @author makejava
 * @since 2020-12-17 09:51:54
 */
@RestController
@RequestMapping("sysUsersRoles")
public class SysUsersRolesController {
    /**
     * 服务对象
     */
    @Resource
    private SysUsersRolesService sysUsersRolesService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysUsersRoles selectOne(Long id) {
        return this.sysUsersRolesService.queryById(id);
    }

}