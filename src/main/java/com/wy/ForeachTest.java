package com.wy;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: wangyuan1
 * @Date: 2018/5/22 17:38
 * @Description:
 */
public class ForeachTest {

    private List<User> users = new ArrayList<>();
    @Before
    public void before() {
        users.add(new User(1,"a"));
        users.add(new User(2,"b"));
        users.add(new User(3,"c"));
        users.add(new User(4,"d"));
    }

    @Test
    public void test() {

        for(User user : users) {
            System.out.println(user);
        }
        System.out.println("-------------");

        users.forEach(System.out::println);
        System.out.println("-------------");

        users.forEach(user -> {
            System.out.println(user);
        });
        System.out.println("-------------");

        users.forEach((user)->{
            System.out.println(user);
        });
    }
}
