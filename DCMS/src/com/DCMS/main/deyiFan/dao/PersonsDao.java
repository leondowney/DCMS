package com.DCMS.main.deyiFan.dao;


import com.DCMS.main.deyiFan.entity.Line;
import com.DCMS.main.deyiFan.entity.Person;


import java.util.List;

public interface PersonsDao {

    List<Person> getAll(String type, String begin, String end);
    List<Person> getAge(String type, String begin, String end);
    List<Person> getArea(String type, String begin, String end);
    List<Person> getType( String begin, String end);
    List<Line> getLine( );

}
