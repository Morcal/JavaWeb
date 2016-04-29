package com.qdh.spring;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;
import net.sf.ehcache.constructs.blocking.BlockingCache;

/**
 * Created by lyqdhgo on 2016/4/29.
 */
public class EhcacheTest {

    public void cacheTest() {
        CacheManager cacheManager = CacheManager.create();
        // 获取ehcache配置文件中的一个cache
        Cache sample = cacheManager.getCache("sample");
        // 获取页面缓存
        BlockingCache cache = new BlockingCache(cacheManager.getEhcache("SimplePageCachingFilter"));
        // 添加数据到缓存
        Element element = new Element("key", "val");

        sample.put(element);

        Element result = sample.get("key");
        // 删除缓存
        sample.remove("key");
        sample.removeAll();

        // 得到所有缓存器器中配置的缓存配置名称
        for (String cacheName : cacheManager.getCacheNames()) {
            System.out.print("cacheName" + cacheName);
        }

        // 得到所有缓存对象
        for (Object key : cache.getKeys()) {
            System.out.print("key" + key);
        }

        // 得到缓存对象数
        cache.getSize();
        // 获取缓存对象内存大小
        cache.getMemoryStoreSize();
    }


}
