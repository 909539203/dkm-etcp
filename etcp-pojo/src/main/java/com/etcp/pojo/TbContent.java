package com.etcp.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "tb_content")
public class TbContent implements Serializable {
    /**
     * 内容id
     */
    @Id
    @Column(name = "content_id")
    private Long contentId;

    /**
     * 内容种类id
     */
    @Column(name = "category_id")
    private String categoryId;

    /**
     * 标题
     */
    private String title;

    /**
     * 图片跳转地址(例：www.diankamu.com)
     */
    private String url;

    /**
     * 图片所在地址(http://192.168.11.133/group1/M00/00/00/wKgZhVnIhVqAAa0jAActhhatATY291.png)
     */
    private String pic;

    /**
     * 备用字段1
     */
    private String key1;

    /**
     * 备用字段2
     */
    private String key2;

    /**
     * 备用字段3
     */
    private String key3;

    private static final long serialVersionUID = 1L;

    /**
     * 获取内容id
     *
     * @return content_id - 内容id
     */
    public Long getContentId() {
        return contentId;
    }

    /**
     * 设置内容id
     *
     * @param contentId 内容id
     */
    public void setContentId(Long contentId) {
        this.contentId = contentId;
    }

    /**
     * 获取内容种类id
     *
     * @return category_id - 内容种类id
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * 设置内容种类id
     *
     * @param categoryId 内容种类id
     */
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取图片跳转地址(例：www.diankamu.com)
     *
     * @return url - 图片跳转地址(例：www.diankamu.com)
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置图片跳转地址(例：www.diankamu.com)
     *
     * @param url 图片跳转地址(例：www.diankamu.com)
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取图片所在地址(http://192.168.11.133/group1/M00/00/00/wKgZhVnIhVqAAa0jAActhhatATY291.png)
     *
     * @return pic - 图片所在地址(http://192.168.11.133/group1/M00/00/00/wKgZhVnIhVqAAa0jAActhhatATY291.png)
     */
    public String getPic() {
        return pic;
    }

    /**
     * 设置图片所在地址(http://192.168.11.133/group1/M00/00/00/wKgZhVnIhVqAAa0jAActhhatATY291.png)
     *
     * @param pic 图片所在地址(http://192.168.11.133/group1/M00/00/00/wKgZhVnIhVqAAa0jAActhhatATY291.png)
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

    /**
     * 获取备用字段1
     *
     * @return key1 - 备用字段1
     */
    public String getKey1() {
        return key1;
    }

    /**
     * 设置备用字段1
     *
     * @param key1 备用字段1
     */
    public void setKey1(String key1) {
        this.key1 = key1;
    }

    /**
     * 获取备用字段2
     *
     * @return key2 - 备用字段2
     */
    public String getKey2() {
        return key2;
    }

    /**
     * 设置备用字段2
     *
     * @param key2 备用字段2
     */
    public void setKey2(String key2) {
        this.key2 = key2;
    }

    /**
     * 获取备用字段3
     *
     * @return key3 - 备用字段3
     */
    public String getKey3() {
        return key3;
    }

    /**
     * 设置备用字段3
     *
     * @param key3 备用字段3
     */
    public void setKey3(String key3) {
        this.key3 = key3;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", contentId=").append(contentId);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", title=").append(title);
        sb.append(", url=").append(url);
        sb.append(", pic=").append(pic);
        sb.append(", key1=").append(key1);
        sb.append(", key2=").append(key2);
        sb.append(", key3=").append(key3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}