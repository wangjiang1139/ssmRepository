/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: FileRequestBody
 * Author:   wangjiang
 * Date:     2019/11/5 23:00
 * Description: 文件操作请求实体类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cn.cmbc.batch.domain.request;

import com.cn.cmbc.batch.base.BaseBody;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br> 
 * 〈文件操作请求实体类〉
 *
 * @author wangjiang
 * @create 2019/11/5
 * @since 1.0.0
 */
public class FileRequestBody extends BaseBody implements Serializable {

    private FileUploadRequestBody body;

    public FileUploadRequestBody getBody() {
        return body;
    }

    public void setBody(FileUploadRequestBody body) {
        this.body = body;
    }
}
