package com.supremepole.hutool.core.clone;

import cn.hutool.core.clone.CloneRuntimeException;
import cn.hutool.core.clone.Cloneable;

/**
 * @ClassName Cat
 * @Description 猫猫类，使用实现Cloneable方式
 * @Author yuzhihua
 * @Date 2022/3/8 16:04
 * @Version 1.0.0
 **/
public class Cat implements Cloneable<Cat>{
    private String name = "miaomiao";
    private int age = 2;

    @Override
    public Cat clone() {
        try {
            return (Cat) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new CloneRuntimeException(e);
        }
    }
}
