/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: BaseBody
 * Author:   wangjiang
 * Date:     2019/11/19 23:44
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cn.cmbc.batch.base;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author wangjiang
 * @create 2019/11/19
 * @since 1.0.0
 */
@XmlRootElement
public class BaseBody {

    private BaseHeander header;

    public BaseHeander getHeader() {
        return header;
    }

    public void setHeader(BaseHeander header) {
        this.header = header;
    }
}
