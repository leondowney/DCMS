package com.DCMS.safeProblem.dao;

import com.DCMS.safeProblem.entity.SafeHandle;
import com.DCMS.safeProblem.entity.SafeHandleCondition;

import java.util.List;

public interface SafeHandleDao {

    List<SafeHandle> getAll(SafeHandleCondition shc);

    SafeHandle getOne(Integer id);

    Integer update(SafeHandle safeHandle);

    Integer add(SafeHandle safeHandle);
}
