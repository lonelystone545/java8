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
public class User {
    private Integer id1;
    private String name;

    public Boolean isStudent() {
        return id % 2 == 0;
    }
}
