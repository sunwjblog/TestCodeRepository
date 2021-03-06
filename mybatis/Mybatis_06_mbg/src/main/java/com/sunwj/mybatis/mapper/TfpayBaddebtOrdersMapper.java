package com.sunwj.mybatis.mapper;

import com.sunwj.mybatis.bean.TfpayBaddebtOrders;
import com.sunwj.mybatis.bean.TfpayBaddebtOrdersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TfpayBaddebtOrdersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TF_PAYBADDEBT_ORDERS
     *
     * @mbg.generated Sat May 08 16:03:28 CST 2021
     */
    long countByExample(TfpayBaddebtOrdersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TF_PAYBADDEBT_ORDERS
     *
     * @mbg.generated Sat May 08 16:03:28 CST 2021
     */
    int deleteByExample(TfpayBaddebtOrdersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TF_PAYBADDEBT_ORDERS
     *
     * @mbg.generated Sat May 08 16:03:28 CST 2021
     */
    int deleteByPrimaryKey(String channelOrderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TF_PAYBADDEBT_ORDERS
     *
     * @mbg.generated Sat May 08 16:03:28 CST 2021
     */
    int insert(TfpayBaddebtOrders record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TF_PAYBADDEBT_ORDERS
     *
     * @mbg.generated Sat May 08 16:03:28 CST 2021
     */
    int insertSelective(TfpayBaddebtOrders record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TF_PAYBADDEBT_ORDERS
     *
     * @mbg.generated Sat May 08 16:03:28 CST 2021
     */
    List<TfpayBaddebtOrders> selectByExample(TfpayBaddebtOrdersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TF_PAYBADDEBT_ORDERS
     *
     * @mbg.generated Sat May 08 16:03:28 CST 2021
     */
    TfpayBaddebtOrders selectByPrimaryKey(String channelOrderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TF_PAYBADDEBT_ORDERS
     *
     * @mbg.generated Sat May 08 16:03:28 CST 2021
     */
    int updateByExampleSelective(@Param("record") TfpayBaddebtOrders record, @Param("example") TfpayBaddebtOrdersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TF_PAYBADDEBT_ORDERS
     *
     * @mbg.generated Sat May 08 16:03:28 CST 2021
     */
    int updateByExample(@Param("record") TfpayBaddebtOrders record, @Param("example") TfpayBaddebtOrdersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TF_PAYBADDEBT_ORDERS
     *
     * @mbg.generated Sat May 08 16:03:28 CST 2021
     */
    int updateByPrimaryKeySelective(TfpayBaddebtOrders record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TF_PAYBADDEBT_ORDERS
     *
     * @mbg.generated Sat May 08 16:03:28 CST 2021
     */
    int updateByPrimaryKey(TfpayBaddebtOrders record);
}