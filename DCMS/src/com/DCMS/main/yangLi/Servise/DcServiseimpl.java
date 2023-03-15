package com.DCMS.main.yangLi.Servise;

import com.DCMS.main.yangLi.Bean.Dangerousc;
import com.DCMS.main.yangLi.Bean.DangerouscCondition;
import com.DCMS.main.yangLi.Bean.Zs;
import com.DCMS.main.yangLi.Dao.DcDaoimpl;
import com.DCMS.main.yangLi.Dao.IDcDao;

import java.util.List;

/**
 * author: 李洋
 * datetime:2023/3/10 11:34
 * email:1473321819@qq.com
 *
 * @description:
 */
public class DcServiseimpl implements  IDcService {

    IDcDao iDcDao=new DcDaoimpl();
    @Override
    public List<Dangerousc> getAll(DangerouscCondition dc) {

        return iDcDao.getAll(dc);
    }

    @Override
    public List<Zs> getone(Integer id) {
        return iDcDao.getone(id);
    }
}
