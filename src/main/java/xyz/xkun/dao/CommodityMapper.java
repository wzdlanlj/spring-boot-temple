package xyz.xkun.dao;

import xyz.xkun.po.Commodity;

public interface CommodityMapper {
    int deleteByPrimaryKey(Integer fkSpNo);

    int insert(Commodity record);

    int insertSelective(Commodity record);

    Commodity selectByPrimaryKey(Integer fkSpNo);

    int updateByPrimaryKeySelective(Commodity record);

    int updateByPrimaryKey(Commodity record);
}