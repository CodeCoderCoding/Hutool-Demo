package com.supremepole.hutool.core.clone;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

/**
 * @ClassName DogParam
 * @Description
 * @Author yuzhihua
 * @Date 2022/3/8 16:09
 * @Version 1.0.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DogParam {
    private String name;
    private int age;
}
