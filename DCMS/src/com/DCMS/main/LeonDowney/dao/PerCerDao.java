package com.DCMS.main.LeonDowney.dao;

import com.DCMS.main.LeonDowney.entity.Certification;

import java.util.List;

/**
 * @author Leon Downey
 * @date 2023/3/14 09:05
 * @describe：
 */
public interface PerCerDao {

    List<Certification> getAll(Integer id);
}
