package com.zhuzz.ssmDemo.mapper.base;

import java.util.List;

/** 
 * @Author: Zezhao.Zhu 
 * @Description: 
 * @Date: 9:33 2018/5/4
 */
public interface BaseMapper<T> {

    List<T> find(T t);
    
    void add(T t);

    void del(T t);

    int update(T t);
}
