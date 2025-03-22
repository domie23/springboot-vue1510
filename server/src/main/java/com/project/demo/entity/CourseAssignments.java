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
 * 课程作业：(CourseAssignments)表实体类
 *
 */
@TableName("`course_assignments`")
@Data
@EqualsAndHashCode(callSuper = false)
public class CourseAssignments implements Serializable {

    // CourseAssignments编号
    @TableId(value = "course_assignments_id", type = IdType.AUTO)
    private Integer course_assignments_id;

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
    // 作业名称
    @TableField(value = "`job_name`")
    private String job_name;
    // 相关附件
    @TableField(value = "`related_attachments`")
    private String related_attachments;
    // 提交时间
    @TableField(value = "`submission_time`")
    private Timestamp submission_time;
    // 作业内容
    @TableField(value = "`assignment_content`")
    private String assignment_content;










    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
