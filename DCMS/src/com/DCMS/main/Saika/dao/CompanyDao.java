package com.DCMS.main.Saika.dao;

import com.DCMS.main.Saika.entity.*;

import java.util.List;

public interface CompanyDao {

    List<Company> getAll(CompanyCondition cc);

    List<CompanyAnalysis> getAnalysisType01(CompanyCondition cc);

    List<CompanyAnalysis> getAnalysisLocation(CompanyCondition cc);

    List<CompanySuperposition> getAnalysisTAndL(CompanyCondition cc);

    List<CompanySuperposition> getDistinctLocation(CompanyCondition cc);

    List<CompanyLineChart> getLineChart(CompanyCondition cc);

    List<CompanyLineChart> getDistinctMonth(CompanyCondition cc);
}
