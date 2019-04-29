package com.loadingcache;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.concurrent.TimeUnit;

/**
 * @author wangyue
 * @date 2019/4/17 17:46
 **/
public class LoadingCacheTest {
    LoadingCache<String, String> cache;

    public LoadingCacheTest(){
        cache = CacheBuilder.newBuilder()
                .expireAfterWrite(100, TimeUnit.SECONDS)
                .build(new CacheLoader<String, String>() {
                    @Override
                    public String load(String s) throws Exception {
                        return Integer.parseInt(s) + 100 +"";
                    }
                });
    }

    public static void main(String[] args) throws Exception{
        LoadingCacheTest loadingCacheTest = new LoadingCacheTest();
        LoadingCache<String, String> cache = loadingCacheTest.cache;
        System.out.println("size is " + cache.size());

        System.out.println("1 -> " + cache.getUnchecked("1"));
        String s = "2";
        //get(K, Callable<V>) 该方法中的callabe会替代默认的Load方法
        System.out.println("2 -> " + cache.get(s, () -> Integer.parseInt(s) + 200 + ""));


    }





}
