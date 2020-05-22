package com.tugos.dst.admin.utils;

import lombok.Data;

/**
 * 封装URL地址，自动添加应用上下文路径
 */
@Data
//@ApiModel("封装URL地址，自动添加应用上下文路径")
public class URL {

//    @ApiModelProperty("URL地址")
    private String url;

    public URL() {

    }

    /**
     * 封装URL地址，自动添加应用上下文路径
     *
     * @param url URL地址
     */
    public URL(String url) {
        this.url = HttpServletUtil.getRequest().getContextPath() + url;
    }

    @Override
    public String toString() {
        return this.url;
    }
}
