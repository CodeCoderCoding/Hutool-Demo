package com.supremepole.hutool.core.javabean;

import cn.hutool.core.bean.BeanUtil;

/**
 * @ClassName Test
 * @Description
 * @Author yuzhihua
 * @Date 2022/3/8 16:48
 * @Version 1.0.0
 **/
public class Test {
    public static void main(String[] args) {
        //test the function of bean copy
        WebsiteParam websiteParam=new WebsiteParam(1, "SupremePole CS", "https://cs.supremepole.com", "stringParam");
        Website website=new Website();
        BeanUtil.copyProperties(websiteParam, website);
        System.out.println(website);
    }
}
