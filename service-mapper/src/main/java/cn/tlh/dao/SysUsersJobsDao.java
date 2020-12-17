package cn.tlh.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (SysUsersJobs)表数据库访问层
 *
 * @author makejava
 * @since 2020-12-17 09:51:59
 */
public interface SysUsersJobsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    SysUsersJobs queryById(Long userId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<SysUsersJobs> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param sysUsersJobs 实例对象
     * @return 对象列表
     */
    List<SysUsersJobs> queryAll(SysUsersJobs sysUsersJobs);

    /**
     * 新增数据
     *
     * @param sysUsersJobs 实例对象
     * @return 影响行数
     */
    int insert(SysUsersJobs sysUsersJobs);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<SysUsersJobs> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<SysUsersJobs> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<SysUsersJobs> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<SysUsersJobs> entities);

    /**
     * 修改数据
     *
     * @param sysUsersJobs 实例对象
     * @return 影响行数
     */
    int update(SysUsersJobs sysUsersJobs);

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 影响行数
     */
    int deleteById(Long userId);

}