package com.DCMS.main.Saika.util;

import com.DCMS.main.Saika.entity.CompanyCondition;
import com.DCMS.main.Saika.entity.Result;
import com.DCMS.main.Saika.service.CompanyService;
import com.DCMS.main.Saika.service.impl.CompanyServiceImpl;

/**
 * Author：jiangtao_liu
 * Date：2023/3/12
 * Description：
 */
public class test {

    public static void main(String[] args) {

        CompanyService companyService = new CompanyServiceImpl();

        CompanyCondition cc = new CompanyCondition("","");
        cc.setType("");
        Result analysisTAndL = companyService.getLineChart(cc);

    }
}
