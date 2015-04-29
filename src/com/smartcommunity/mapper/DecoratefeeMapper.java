package com.smartcommunity.mapper;

import com.smartcommunity.pojo.Decoratefee;
import com.smartcommunity.pojo.DecoratefeeExample;

import edu.hust.smartcommunity.paginator.domain.PageList;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface DecoratefeeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoratefee
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    int countByExample(DecoratefeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoratefee
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    int deleteByExample(DecoratefeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoratefee
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoratefee
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    int insert(Decoratefee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoratefee
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    int insertSelective(Decoratefee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoratefee
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    List<Decoratefee> selectByExample(DecoratefeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoratefee
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    Decoratefee selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoratefee
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    int updateByExampleSelective(@Param("record") Decoratefee record, @Param("example") DecoratefeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoratefee
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    int updateByExample(@Param("record") Decoratefee record, @Param("example") DecoratefeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoratefee
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    int updateByPrimaryKeySelective(Decoratefee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoratefee
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    int updateByPrimaryKey(Decoratefee record);
    /** add_y */

    PageList<Decoratefee> selectByExample(DecoratefeeExample example, edu.hust.smartcommunity.paginator.domain.PageBounds pageBounds);
}