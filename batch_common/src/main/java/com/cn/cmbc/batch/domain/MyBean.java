/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: MyBean
 * Author:   wangjiang
 * Date:     2019/11/23 23:34
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cn.cmbc.batch.domain;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author wangjiang
 * @create 2019/11/23
 * @since 1.0.0
 */
@XmlRootElement
public class MyBean {

    private String data;

    private String header;

    private int id;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "data='" + data + '\'' +
                ", header='" + header + '\'' +
                ", id=" + id +
                '}';
    }
}
