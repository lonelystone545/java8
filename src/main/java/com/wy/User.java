package com.wy;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

/**
 * @Auther: wangyuan1
 * @Date: 2018/5/22 17:38
 * @Description:
 */
@Getter
@Setter
public class User {
    private Integer id2;
    private String name;

    public Boolean isStudent() {
        return id % 2 == 0;
    }
}
