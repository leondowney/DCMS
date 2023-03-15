package com.DCMS.main.LeonDowney.service;

import com.DCMS.main.LeonDowney.entity.PersonCondition;
import com.DCMS.main.LeonDowney.entity.Result;

/**
 * @author Leon Downey
 * @date 2023/3/12 10:08
 * @describe：
 */
public interface PersonService {

    Result getAll(PersonCondition cc);
    Integer getCount();
}
