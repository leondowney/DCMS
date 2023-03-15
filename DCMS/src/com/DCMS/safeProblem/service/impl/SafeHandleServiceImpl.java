package com.DCMS.safeProblem.service.impl;

import com.DCMS.safeProblem.dao.SafeHandleDao;
import com.DCMS.safeProblem.dao.impl.SafeHandleDaoImpl;
import com.DCMS.safeProblem.entity.Result;
import com.DCMS.safeProblem.entity.SafeHandle;
import com.DCMS.safeProblem.entity.SafeHandleCondition;
import com.DCMS.safeProblem.service.SafeHandleService;

import java.util.List;

/**
 * Author：jiangtao_liu
 * Date：2023/3/14
 * Description：
 */
public class SafeHandleServiceImpl implements SafeHandleService {
    SafeHandleDao safeHandleDao = new SafeHandleDaoImpl();

    @Override
    public Result getAll(SafeHandleCondition shc) {

        List<SafeHandle> resList = safeHandleDao.getAll(shc);

        Result rs = new Result(0,"查询成功!",resList);

        return rs;
    }

    @Override
    public Result getOne(Integer id) {

        SafeHandle safeHandle = safeHandleDao.getOne(id);

        Result rs = new Result(0,"查询成功!",safeHandle);

        return rs;
    }

    @Override
    public Result update(SafeHandle safeHandle) {

        Integer i = safeHandleDao.update(safeHandle);

        System.out.println(i);
        Result rs = new Result(0,"修改成功!",i);

        return rs;
    }

    @Override
    public Result add(SafeHandle safeHandle) {
        Integer i = safeHandleDao.add(safeHandle);

        Result rs = new Result(0,"登记成功!",i);

        return rs;
    }
}
