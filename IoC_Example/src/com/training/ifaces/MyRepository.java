package com.training.ifaces;

import java.util.List;
import java.util.Map;

public interface MyRepository<T> {

    public int add(T t);
    public List<Map<String,Object>> findAll();
    public T findById(long key);
    public int update(T t);
    public int remove(long key);

}
