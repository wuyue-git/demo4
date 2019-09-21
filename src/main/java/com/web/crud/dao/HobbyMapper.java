package com.web.crud.dao;

import com.web.crud.bean.Hobby;
import com.web.crud.bean.HobbyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HobbyMapper {
    long countByExample(HobbyExample example);

    int deleteByExample(HobbyExample example);

    int deleteByPrimaryKey(Integer hobbyId);

    int insert(Hobby record);

    int insertSelective(Hobby record);

    List<Hobby> selectByExample(HobbyExample example);

    Hobby selectByPrimaryKey(Integer hobbyId);

    int updateByExampleSelective(@Param("record") Hobby record, @Param("example") HobbyExample example);

    int updateByExample(@Param("record") Hobby record, @Param("example") HobbyExample example);

    int updateByPrimaryKeySelective(Hobby record);

    int updateByPrimaryKey(Hobby record);
}