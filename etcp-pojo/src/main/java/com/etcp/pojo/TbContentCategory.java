package com.etcp.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "tb_content_category")
public class TbContentCategory implements Serializable {
    /**
     * 推送类别id
     */
    @Id
    @Column(name = "category_id")
    private Long categoryId;

    /**
     * 推送类别名称(例：轮播图，今日推荐)
     */
    private String name;

    private static final long serialVersionUID = 1L;

    /**
     * 获取推送类别id
     *
     * @return category_id - 推送类别id
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * 设置推送类别id
     *
     * @param categoryId 推送类别id
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 获取推送类别名称(例：轮播图，今日推荐)
     *
     * @return name - 推送类别名称(例：轮播图，今日推荐)
     */
    public String getName() {
        return name;
    }

    /**
     * 设置推送类别名称(例：轮播图，今日推荐)
     *
     * @param name 推送类别名称(例：轮播图，今日推荐)
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", categoryId=").append(categoryId);
        sb.append(", name=").append(name);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}