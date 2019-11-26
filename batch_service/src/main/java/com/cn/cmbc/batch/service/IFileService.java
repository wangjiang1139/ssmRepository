package com.cn.cmbc.batch.service;

import com.cn.cmbc.batch.domain.MyBean;
import com.cn.cmbc.batch.domain.request.FileRequestBody;
import com.cn.cmbc.batch.po.PlfService;
import com.cn.cmbc.core.WebServiceBase;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.List;
public interface IFileService extends WebServiceBase{

    @POST
    @Path("/findAll")
    List<PlfService> findAll(FileRequestBody body);

    @GET
    @Path("/file")
    List<PlfService> findAll();

    @GET
    @Path("/getValue")
    List<PlfService> findAllJson(FileRequestBody body);


    @POST
    @Path("/getMyBean")
    MyBean getMyBean(MyBean myBean);
}