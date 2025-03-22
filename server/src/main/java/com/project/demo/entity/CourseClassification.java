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
 * 课程分类：(CourseClassification)表实体类
 *
 */
@TableName("`course_classification`")
@Data
@EqualsAndHashCode(callSuper = false)
public class CourseClassification implements Serializable {

    // CourseClassification编号
    @TableId(value = "course_classification_id", type = IdType.AUTO)
    private Integer course_classification_id;

    // 课程类型
    @TableField(value = "`course_type`")
    private String course_type;










    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
