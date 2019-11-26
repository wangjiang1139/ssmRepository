/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: FileService
 * Author:   wangjiang
 * Date:     2019/11/5 23:03
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cn.cmbc.batch.service.impl;

import com.cn.cmbc.batch.domain.MyBean;
import com.cn.cmbc.batch.domain.request.FileRequestBody;
import com.cn.cmbc.batch.mapper.PlfServiceMapper;
import com.cn.cmbc.batch.po.PlfService;
import com.cn.cmbc.batch.service.IFileService;
import com.cn.cmbc.exception.MyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author wangjiang
 * @create 2019/11/5
 * @since 1.0.0
 */
@Service
public class FileService implements IFileService{
    @Override
    public MyBean getMyBean(MyBean myBean) {
        System.out.println(myBean);
        return myBean;
    }

    @Override
    public List<PlfService> findAllJson(FileRequestBody body) {
        System.out.println(body);
        return plfServiceMapper.selectByExample(null);
    }

    @Autowired
    private PlfServiceMapper plfServiceMapper;

    @Override
    public List<PlfService> findAll(FileRequestBody body) {
      try{
          return plfServiceMapper.selectByExample(null);
      }catch (Exception e){
          throw new MyException("A00301","查询异常");
      }
    }

    @Override
    public List<PlfService> findAll() {
        return plfServiceMapper.selectByExample(null);
    }
}
