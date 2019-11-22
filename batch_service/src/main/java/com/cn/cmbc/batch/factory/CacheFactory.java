package com.cn.cmbc.batch.factory;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;

/**
 * 具体生产缓存
 * @author wangjiang
 *
 */
public class CacheFactory {

	public static LoadingCache createCache(GavavAbstractCache abstractCache) {
		LoadingCache chacheBuidler = CacheBuilder.newBuilder().build(abstractCache);
		return chacheBuidler;
	}
}
