package com.supremepole.hutool.core.clone;


/**
 * @ClassName CloneTest
 * @Description
 * @Author yuzhihua
 * @Date 2022/3/8 16:11
 * @Version 1.0.0
 **/
public class CloneTest {
    public static void main(String[] args) {
        DogParam dogParam=new DogParam("dog", 12);
        DogParam dogParam1=dogParam;
        System.out.println("Name: "+dogParam1.getName()+", Age: "+dogParam1.getAge());
    }
}
