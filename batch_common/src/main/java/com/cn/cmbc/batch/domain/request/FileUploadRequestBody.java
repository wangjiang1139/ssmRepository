/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: FileUploadRequestBody
 * Author:   wangjiang
 * Date:     2019/11/19 23:51
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cn.cmbc.batch.domain.request;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author wangjiang
 * @create 2019/11/19
 * @since 1.0.0
 */
public class FileUploadRequestBody {

    private  String flag;

    private  String batchId;

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }
}
