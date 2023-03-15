package com.DCMS.main.Saika.service;

import com.DCMS.main.Saika.entity.CompanyCondition;
import com.DCMS.main.Saika.entity.Result;

/**
 * Author：jiangtao_liu
 * Date：2023/3/10
 * Description：
 */
public interface CompanyService {

    Result getAll(CompanyCondition cc);

    Result getAnalysisType01(CompanyCondition cc);

    Result getAnalysisLocation(CompanyCondition cc);

    Result getAnalysisTAndL(CompanyCondition cc);

    Result getLineChart(CompanyCondition cc);

}
