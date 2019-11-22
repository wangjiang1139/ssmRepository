package com.cn.cmbc.batch.cache;

import com.cn.cmbc.batch.factory.GavavAbstractCache;
import com.cn.cmbc.batch.po.Customer;
import org.springframework.stereotype.Service;

/**
 * 〈一句话功能简述〉<br> 
 * 〈客户缓存,缓存内容直接从数据库中查询〉
 *
 * @author wangjiang
 * @create 2019/11/22
 * @since 1.0.0
 */
@Service
public class CustomerCache extends GavavAbstractCache<String,Customer> {
    @Override
    public Customer load(String key) throws Exception {
        return null;
    }
}
