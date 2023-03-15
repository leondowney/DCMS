package com.DCMS.main.LeonDowney.dao;

import com.DCMS.main.LeonDowney.entity.Experience;
import com.DCMS.main.LeonDowney.entity.ExperienceCondition;

import java.util.List;

/**
 * @author Leon Downey
 * @date 2023/3/13 17:22
 * @describe：
 */
public interface ExperienceDao {
    List<Experience> getAll(ExperienceCondition ec);

}
