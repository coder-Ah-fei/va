package com.yang.va.entity;

import com.yang.va.enumerate.ResourcesType;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "t_resources")
public class Resources {

    @Id
    @GeneratedValue
    private Long id;

    /**
     * 资源路径
     */
    private String src;

    /**
     * 文件名称
     */
    private String name;

    /**
     * 资源类型
     */
    private ResourcesType resourcesType;
}
