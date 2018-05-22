package com.wy;

import lombok.*;

/**
 * @Auther: wangyuan1
 * @Date: 2018/5/22 17:38
 * @Description:
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    private Integer id;
    private String name;

    public Boolean isStudent() {
        return id % 2 == 0;
    }

}

