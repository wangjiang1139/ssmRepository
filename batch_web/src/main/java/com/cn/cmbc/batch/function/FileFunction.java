/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: FileFunction
 * Author:   wangjiang
 * Date:     2019/11/5 22:55
 * Description: 文件操作入口
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cn.cmbc.batch.function;

import com.cn.cmbc.batch.domain.FileRequestBody;
import com.cn.cmbc.batch.po.PlfService;
import com.cn.cmbc.batch.service.IFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈文件操作入口〉
 *
 * @author wangjiang
 * @create 2019/11/5
 * @since 1.0.0
 */
@Controller
@RequestMapping("/file")
public class FileFunction {

    @Autowired
    private IFileService fileService;

    @RequestMapping("/findAllPlfService")
    @ResponseBody
    public List<PlfService> findAll(@RequestBody FileRequestBody body){
        return fileService.findAll(body);
    }
}
