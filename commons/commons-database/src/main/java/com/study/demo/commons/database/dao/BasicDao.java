package com.study.demo.commons.database.dao;

import java.io.Serializable;

/**
 * DAO模型,DAO基础类, 数据库操作基本方法, 如save, update, delete
 */
public abstract class BasicDao<T> {

    /**
     * 抽象的保存方法 。
     *
     * @param entity 实体
     * @return int
     */
    public abstract int save(T entity);

    /**
     * 抽象的更新方法 。
     *
     * @param entity 实体
     * @return int
     */
    public abstract int update(T entity);

    /**
     * 抽象的删除方法 。
     *
     * @param primaryKey 主键
     * @return int
     */
    public abstract int delete(Serializable primaryKey);
}
