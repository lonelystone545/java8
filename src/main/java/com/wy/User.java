package com.wy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @Auther: wangyuan1
 * @Date: 2018/5/22 17:38
 * @Description:
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class User123 {
    private Integer id123;
    private String name123;

    public Boolean isStudent() {
        return id123 % 2 == 0;
    }
}
