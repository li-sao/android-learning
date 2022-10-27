package com.mapper;

import com.pojo.Team;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeamMapper {

    @Select("select * from table_team where contestName like #{contestNamae}")
    public List<Team> select(String contestName);

    @Select("select * from table_team where studentId = #{studentID}")
    public List<Team> selectByID(String studentID);

    @Select("select * from table_team where institute = #{institute}")
    public List<Team> selectBy(String institute);

    @Insert("insert  into table_team values (#{teamName},#{position},#{name},#{studentId},#{sex},#{age},#{institute},#{cls},#{contestName},#{contact})")
    boolean add(Team team);

}
