package com.DCMS.main.yangLi.Servise;

import com.DCMS.main.yangLi.Bean.Dangerousc;
import com.DCMS.main.yangLi.Bean.DangerouscCondition;
import com.DCMS.main.yangLi.Bean.Zs;

import java.util.List;

public interface IDcService {
    List<Dangerousc> getAll(DangerouscCondition dc);


    public List<Zs> getone(Integer id);
}
