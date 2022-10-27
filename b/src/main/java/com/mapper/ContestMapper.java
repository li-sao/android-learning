package com.mapper;

import com.pojo.Contest;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.sql.Date;
import java.util.List;

public interface ContestMapper {

    @Insert("insert into table_contest values (#{contestName},#{contestType},#{contestDetail},#{startTime},#{endTime},#{contact},#{contestTime},#{contestVenue},#{award},#{sponsor},#{contestant})")
    void add(Contest contest);
//    void add(@Param("contestName") String contestName,@Param("contestType") String contestType,@Param("contestDetail") String contestDetail,
//             @Param("startTime") Date startTime,@Param("endTime") Date endTime,@Param("contact") String contact, @Param("contestTime") Date contestTime,
//             @Param("contestVenue") String contestVenue, @Param("award") String award,@Param("sponsor") String sponsor, @Param("contestant") String contestant);
    @Select("select * from table_contest where contestName=#{contestName} and contestTime=#{contestTime}")
    Contest selectByNameTime( @Param("contestName") String contestName, @Param("contestTime") Date contestTime);

    @Select("select * from table_contest where contestName=#{contestName}")
    public Contest selectByContestName(String contestName);

    @Select("select * from table_contest")
    public List<Contest> selectAll();
}
