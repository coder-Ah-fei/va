package com.yang.va.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "t_video")
public class Video {
    @Id
    @GeneratedValue
    private Long id;

    /**
     * 视频名称
     */
    private String name;

    /**
     * 视频摘要
     */
    private String summary;

    /**
     * 导演、编剧、主演等介绍
     * 放html代码
     */
    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "staff_content", nullable = false, columnDefinition = "Text")
    private String staffContent;

    /**
     * 视频播放器的首页图片
     */
    @OneToOne
    @JoinColumn(name = "videoSrc")
    private Resources videoSrc;

    /**
     * 视频地址
     */
    @OneToOne
    @JoinColumn(name = "palyUrl")
    private Resources palyUrl;

    /**
     * 首页展示图
     */
    @OneToOne
    @JoinColumn(name = "titleSrc")
    private Resources titleSrc;

    /**
     * 剧情截图
     */
    @OneToMany
    @JoinColumn(name = "titleSrc")
    private List<Resources> images;


    @ManyToMany(cascade = CascadeType.REFRESH)
    @JoinTable(name = "t_video_videoClass", inverseJoinColumns = @JoinColumn(name = "videoClass_id"), joinColumns = @JoinColumn(name = "video_id"))
    private List<VideoClass> videoClasses;

}
