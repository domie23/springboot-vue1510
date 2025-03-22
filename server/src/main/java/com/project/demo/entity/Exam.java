package com.project.demo.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * 考试
 */
@TableName("exam")
@Data
@EqualsAndHashCode(callSuper = false)
public class Exam implements Serializable {

    private static final long serialVersionUID = -89845695959527153L;

    /**
     * 考试id：[0,10000]
     */
    @TableId(value = "exam_id", type = IdType.AUTO)
    private Integer exam_id;

    /**
     * 考试名称：[2,32]
     */

    @TableField(value = "name")
    private String name;

    /**
     * 答题时长
     */

    @TableField(value = "duration")
    private Integer duration;

    /**
     * 总分
     */

    @TableField(value = "score")
    private Double score;

    /**
     * 状态：启用、禁用
     */

    @TableField(value = "status")
    private String status;

    /**
     * 创建时间：
     */


    @TableField(value = "create_time")
    private Timestamp createTime;

    /**
     * 更新时间：
     */


    @TableField(value = "update_time")
    private Timestamp updateTime;

}

