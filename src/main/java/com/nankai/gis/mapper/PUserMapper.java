package com.nankai.gis.mapper;

import com.nankai.gis.domain.PUser;
import com.nankai.gis.domain.PUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PUserMapper {
    int countByExample(PUserExample example);

    int deleteByExample(PUserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(PUser record);

    int insertSelective(PUser record);

    List<PUser> selectByExample(PUserExample example);

    PUser selectByPrimaryKey(Integer userId);

    PUser selectUser(String userName);

    int updateByExampleSelective(@Param("record") PUser record, @Param("example") PUserExample example);

    int updateByExample(@Param("record") PUser record, @Param("example") PUserExample example);

    int updateByPrimaryKeySelective(PUser record);

    int updateByPrimaryKey(PUser record);
}