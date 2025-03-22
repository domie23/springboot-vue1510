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
 * 课程安排：(CourseArrangement)表实体类
 *
 */
@TableName("`course_arrangement`")
@Data
@EqualsAndHashCode(callSuper = false)
public class CourseArrangement implements Serializable {

    // CourseArrangement编号
    @TableId(value = "course_arrangement_id", type = IdType.AUTO)
    private Integer course_arrangement_id;

    // 课程编号
    @TableField(value = "`course_id`")
    private String course_id;
    // 课程名称
    @TableField(value = "`course_name`")
    private String course_name;
    // 授课教师
    @TableField(value = "`lecturer`")
    private Integer lecturer;
    // 教师姓名
    @TableField(value = "`teachers_name`")
    private String teachers_name;
    // 上课时间
    @TableField(value = "`class_time`")
    private String class_time;
    // 上课地点
    @TableField(value = "`class_location`")
    private String class_location;
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
