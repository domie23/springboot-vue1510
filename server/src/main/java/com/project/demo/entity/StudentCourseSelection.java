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
 * 学生选课：(StudentCourseSelection)表实体类
 *
 */
@TableName("`student_course_selection`")
@Data
@EqualsAndHashCode(callSuper = false)
public class StudentCourseSelection implements Serializable {

    // StudentCourseSelection编号
    @TableId(value = "student_course_selection_id", type = IdType.AUTO)
    private Integer student_course_selection_id;

    // 课程编号
    @TableField(value = "`course_id`")
    private String course_id;
    // 课程名称
    @TableField(value = "`course_name`")
    private String course_name;
    // 课程类型
    @TableField(value = "`course_type`")
    private String course_type;
    // 授课教师
    @TableField(value = "`lecturer`")
    private Integer lecturer;
    // 学生
    @TableField(value = "`student`")
    private Integer student;
    // 学生姓名
    @TableField(value = "`student_name`")
    private String student_name;
    // 班级名称
    @TableField(value = "`class_name`")
    private String class_name;
    // 备注
    @TableField(value = "`remarks`")
    private String remarks;










    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
