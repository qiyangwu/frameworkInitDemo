package com.study.demo.commons.database.dao;

import java.io.Serializable;

/**
 * 基础实体bean接口（序列化）。
 */
public abstract interface Model<PKT extends Serializable> extends Serializable {
    public abstract PKT getKey();
}