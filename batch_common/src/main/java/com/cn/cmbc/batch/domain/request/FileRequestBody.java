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
