package com.project.demo.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * 成绩分析：(PerformanceAnalysis)表实体类
 *
 */
@TableName("`performance_analysis`")
@Data
@EqualsAndHashCode(callSuper = false)
public class PerformanceAnalysis implements Serializable {

    // PerformanceAnalysis编号
    @TableId(value = "performance_analysis_id", type = IdType.AUTO)
    private Integer performance_analysis_id;

    // 课程名称
    @TableField(value = "`course_name`")
    private String course_name;
    // 考试名称
    @TableField(value = "`exam_name`")
    private String exam_name;
    // 授课教师
    @TableField(value = "`lecturer`")
    private Integer lecturer;
    // 考试人数
    @TableField(value = "`number_of_examiners`")
    private String number_of_examiners;
    // 最高分
    @TableField(value = "`maximum_score`")
    private String maximum_score;
    // 最低分
    @TableField(value = "`lowest_score`")
    private String lowest_score;
    // 平均分
    @TableField(value = "`average`")
    private String average;
    // 及格人数
    @TableField(value = "`number_of_passes`")
    private String number_of_passes;
    // 及格率
    @TableField(value = "`pass_rate`")
    private String pass_rate;
    // 成绩分析
    @TableField(value = "`performance_analysis`")
    private String performance_analysis;










    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
