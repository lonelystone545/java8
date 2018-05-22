package com.wy;

import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: wangyuan1
 * @Date: 2018/5/22 17:38
 * @Description: stream流的测试
 */
public class StreamTest {

    private List<User> users = new ArrayList<>();
    @Before
    public void before() {
        users.add(new User(1,"a"));
        users.add(new User(2,"b"));
        users.add(new User(3,"c"));
        users.add(new User(4,"d"));
    }
    
}
