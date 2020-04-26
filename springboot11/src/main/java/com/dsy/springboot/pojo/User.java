package com.dsy.springboot.pojo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;

import java.sql.Date;

/**
 * @author trueway
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    /**
     * 修改时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
    /**
     *  @TableLogic  用于逻辑删除的注解
     *  逻辑删除标记
     */
    @TableField(fill = FieldFill.INSERT)
    @TableLogic
    private Integer deleted;
    /**
     *  乐观锁版本号
     */
    @TableField(fill = FieldFill.INSERT)
    @Version
    private Integer version;
}
