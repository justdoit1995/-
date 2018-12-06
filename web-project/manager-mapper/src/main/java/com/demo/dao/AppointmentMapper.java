package com.demo.dao;

import com.demo.model.Appointment;
import com.demo.model.AppointmentExample;
import com.demo.model.AppointmentKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppointmentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment
     *
     * @mbg.generated Wed Dec 05 23:21:39 CST 2018
     */
    long countByExample(AppointmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment
     *
     * @mbg.generated Wed Dec 05 23:21:39 CST 2018
     */
    int deleteByExample(AppointmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment
     *
     * @mbg.generated Wed Dec 05 23:21:39 CST 2018
     */
    int deleteByPrimaryKey(AppointmentKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment
     *
     * @mbg.generated Wed Dec 05 23:21:39 CST 2018
     */
    int insert(Appointment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment
     *
     * @mbg.generated Wed Dec 05 23:21:39 CST 2018
     */
    int insertSelective(Appointment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment
     *
     * @mbg.generated Wed Dec 05 23:21:39 CST 2018
     */
    List<Appointment> selectByExample(AppointmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment
     *
     * @mbg.generated Wed Dec 05 23:21:39 CST 2018
     */
    Appointment selectByPrimaryKey(AppointmentKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment
     *
     * @mbg.generated Wed Dec 05 23:21:39 CST 2018
     */
    int updateByExampleSelective(@Param("record") Appointment record, @Param("example") AppointmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment
     *
     * @mbg.generated Wed Dec 05 23:21:39 CST 2018
     */
    int updateByExample(@Param("record") Appointment record, @Param("example") AppointmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment
     *
     * @mbg.generated Wed Dec 05 23:21:39 CST 2018
     */
    int updateByPrimaryKeySelective(Appointment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment
     *
     * @mbg.generated Wed Dec 05 23:21:39 CST 2018
     */
    int updateByPrimaryKey(Appointment record);
}