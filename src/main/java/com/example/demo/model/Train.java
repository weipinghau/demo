package com.example.demo.model;

/**
 * mybatis-genertor自动生成
 */
public class Train {
    private String sqlId;

    private String width;

    private String height;

    private String age;

    public String getSqlId() {
        return sqlId;
    }

    public void setSqlId(String sqlId) {
        this.sqlId = sqlId == null ? null : sqlId.trim();
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width == null ? null : width.trim();
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height == null ? null : height.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }
}