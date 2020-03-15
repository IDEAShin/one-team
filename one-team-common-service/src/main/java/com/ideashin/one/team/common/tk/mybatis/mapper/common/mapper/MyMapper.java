package com.ideashin.one.team.common.tk.mybatis.mapper.common.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 自己的Mapper
 * 特别注意，该接口不能被扫描到，否则会出错
 *
 * @Author: Shin
 * @Date: 13/3/2020 下午5:56
 * @Blog: ideashin.com
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
