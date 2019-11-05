package com.cn.cmbc.batch.service;

import com.cn.cmbc.batch.domain.FileRequestBody;
import com.cn.cmbc.batch.po.PlfService;

import java.util.List;

public interface IFileService {

    List<PlfService> findAll(FileRequestBody body);
}
