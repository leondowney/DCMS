package com.DCMS.main.Saika.service;

import com.DCMS.main.Saika.entity.AccidentCondition;
import com.DCMS.main.Saika.entity.Result;


public interface AccidentService {

    Result getAll(AccidentCondition ac);
}
