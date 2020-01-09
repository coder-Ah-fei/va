package com.yang.va.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * 视频分类
 */
@Data
@Entity
@Table(name = "t_video_class")
public class VideoClass {

    @Id
    @GeneratedValue
    private Long id;

    private String className;

    @ManyToOne
    @JoinColumn(name = "parentId")
    private VideoClass parent;

    @ManyToMany(
            cascade = CascadeType.REFRESH,
            mappedBy = "videoClasses",//通过维护端的属性关联
            fetch = FetchType.LAZY)
    private List<Video> videos;

}
