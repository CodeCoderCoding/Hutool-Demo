package com.supremepole.hutool.core.clone;

import cn.hutool.core.clone.CloneSupport;
import lombok.Data;

/**
 * @ClassName Dog
 * @Description 狗狗类，用于继承CloneSupport类
 * @Author yuzhihua
 * @Date 2022/3/8 16:07
 * @Version 1.0.0
 **/
@Data
public class Dog extends CloneSupport<Dog> {
    private String name;
    private int age;
}
