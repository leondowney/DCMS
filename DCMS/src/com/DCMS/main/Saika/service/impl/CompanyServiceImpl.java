package com.DCMS.main.Saika.service.impl;

import com.DCMS.main.Saika.dao.CompanyDao;
import com.DCMS.main.Saika.dao.impl.CompanyDaoImpl;
import com.DCMS.main.Saika.entity.*;
import com.DCMS.main.Saika.service.CompanyService;

import java.util.*;

/**
 * Author：jiangtao_liu
 * Date：2023/3/10
 * Description：
 */
public class CompanyServiceImpl implements CompanyService {

    CompanyDao companyDao = new CompanyDaoImpl();

    @Override
    public Result getAll(CompanyCondition cc) {

        List<Company> companyList = companyDao.getAll(cc);

        Result rs = new Result(0,"查询成功!",companyList);

        return rs;
    }

    @Override
    public Result getAnalysisType01(CompanyCondition cc) {

        List<CompanyAnalysis> companyList = companyDao.getAnalysisType01(cc);

        Result rs = new Result(0,"查询成功!",companyList);

        return rs;
    }

    @Override
    public Result getAnalysisLocation(CompanyCondition cc) {

        List<CompanyAnalysis> companyList = companyDao.getAnalysisLocation(cc);

        Result rs = new Result(0,"查询成功!",companyList);

        return rs;
    }

    @Override
    public Result getAnalysisTAndL(CompanyCondition cc) {

        List<CompanySuperposition> list = companyDao.getAnalysisTAndL(cc);
        List<CompanySuperposition> locationList = companyDao.getDistinctLocation(cc);

        Map<String,Integer> locationMap = new HashMap<String,Integer>();

        for (int i = 0 ; i < locationList.size();i++) {
            locationMap.put(locationList.get(i).getLocation(),i);
        }

        Map<String,int[]> map = new HashMap<>();

        for (int i = 0;i<list.size();i++) {

            String location = list.get(i).getLocation();
            int index = locationMap.get(location);

            String type01 = list.get(i).getType01();
            Integer count = list.get(i).getCount();

            if (map.get(type01) == null) {
                int[] ints = new int[locationList.size()];
                ints[index] = count;
                map.put(type01,ints);
            }else{
                int[] ints = map.get(type01);
                ints[index] = count;
                map.put(type01,ints);
            }
        }

        List<CompanyTAndLResult> ctlr = new ArrayList<>();


        Set<Map.Entry<String, int[]>> entries = map.entrySet();
        for (Map.Entry<String, int[]> entry : entries) {
            CompanyTAndLResult c = new CompanyTAndLResult();
            c.setType01(entry.getKey());
            c.setCount(entry.getValue());
            ctlr.add(c);
        }

        List<List> resList = new ArrayList<>();
        resList.add(ctlr);
        resList.add(locationList);

        Result rs = new Result(0,"查询成功!",resList);

        return rs;
    }

    @Override
    public Result getLineChart(CompanyCondition cc) {
        List<CompanyLineChart> list = companyDao.getLineChart(cc);
        List<CompanyLineChart> monthList = companyDao.getDistinctMonth(cc);

        Map<String,Integer> monthMap = new HashMap<>();

        for (int i = 0; i<monthList.size();i++) {
            String month = monthList.get(i).getMonth();

            CompanyLineChart clc = new CompanyLineChart();

            clc.setMonth(month);
            monthMap.put(month,i);
        }

        Map<String,int[]> map = new HashMap<>();

        for (int i = 0;i<list.size();i++) {
            String month = list.get(i).getMonth();
            int index = monthMap.get(month);

            String type01 = list.get(i).getType01();
            Integer count = list.get(i).getCount();

            if (map.get(type01) == null) {
                int[] ints = new int[monthList.size()];
                ints[index] = count;
                map.put(type01,ints);
            }else{
                int[] ints = map.get(type01);
                ints[index] = count;
                map.put(type01,ints);
            }
        }

        List<CompanyTAndLResult> ctlr = new ArrayList<>();


        Set<Map.Entry<String, int[]>> entries = map.entrySet();
        for (Map.Entry<String, int[]> entry : entries) {
            CompanyTAndLResult c = new CompanyTAndLResult();
            c.setType01(entry.getKey());
            c.setCount(entry.getValue());
            ctlr.add(c);
        }

        List<List> resList = new ArrayList<>();

        resList.add(ctlr);
        resList.add(monthList);

        Result rs = new Result(0,"查询成功!",resList);

        return rs;
    }
}
