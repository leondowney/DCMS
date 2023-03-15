package com.DCMS.safeProblem.service;

import com.DCMS.safeProblem.entity.Result;
import com.DCMS.safeProblem.entity.SafeHandle;
import com.DCMS.safeProblem.entity.SafeHandleCondition;

public interface SafeHandleService {

    Result getAll(SafeHandleCondition shc);

    Result getOne(Integer id);

    Result update(SafeHandle safeHandle);

    Result add(SafeHandle safeHandle);
}
