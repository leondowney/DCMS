package com.DCMS.main.Saika.dao;

import com.DCMS.main.Saika.entity.Accident;
import com.DCMS.main.Saika.entity.AccidentCondition;

import java.util.List;

/**
 * Author：jiangtao_liu
 * Date：2023/3/10
 * Description：
 */
public interface AccidentDao {

    List<Accident> getAll(AccidentCondition ac);
}
