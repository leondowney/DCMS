package com.DCMS.main.LeonDowney.service;

import com.DCMS.main.LeonDowney.entity.ExperienceCondition;
import com.DCMS.main.LeonDowney.entity.Result;

/**
 * @author Leon Downey
 * @date 2023/3/13 17:35
 * @describe：
 */
public interface ExperienceService {
    Result getAll(ExperienceCondition ec);
}
