package com.smartcommunity.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.smartcommunity.pojo.Account;
import com.smartcommunity.pojo.AccountExample;
import com.smartcommunity.pojo.Meter;
import com.smartcommunity.pojo.MeterExample;

import edu.hust.smartcommunity.paginator.domain.PageList;

public interface TongYongMapper {


	    /**
	     * This method was generated by MyBatis Generator.
	     * This method corresponds to the database table meter
	     *
	     * @mbggenerated Sat Jan 24 16:00:04 CST 2015
	     */
	    int countByExample(MeterExample example);

	    int deleteByExample(MeterExample example);

	    int deleteByPrimaryKey(Integer id);


	    int insert(Meter record);


	    int insertSelective(Meter record);


	    List<Meter> selectByExample(MeterExample example);
    Meter selectByPrimaryKey(Integer id);


	    int updateByExampleSelective(@Param("record") Meter record, @Param("example") MeterExample example);

	
	    int updateByExample(@Param("record") Meter record, @Param("example") MeterExample example);


	    int updateByPrimaryKeySelective(Meter record);


	    int updateByPrimaryKey(Meter record);
	    /**
	     * add_y
	     */
	    PageList<Meter> selectByExample(MeterExample example,edu.hust.smartcommunity.paginator.domain.PageBounds pageBounds);;
}
