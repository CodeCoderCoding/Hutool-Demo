package com.supremepole.hutool.core.javabean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
public class WebsiteParam {
    private int id;
    private String name;
    private String url;
    private String stringParam;
}
