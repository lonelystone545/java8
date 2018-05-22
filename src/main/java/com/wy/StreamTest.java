package com.wy;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Auther: wangyuan1
 * @Date: 2018/5/22 17:38
 * @Description: stream流的测试
 */
public class StreamTest {


    private List<User> users = new ArrayList<>();

    @Before
    public void before() {
        users.add(new User(1, "a"));
        users.add(new User(2, "b"));
        users.add(new User(3, "c"));
        users.add(new User(4, "d"));
    }

    /**
     * 获取流的方式
     */
    public void test1() {
        //1
        Stream<User> stream1 = users.stream();
        //2
        Stream<String> stream2 = Stream.of("1", "2");
        //3
        String[] strs = {"1", "2"};
        Stream<String> stream3 = Arrays.stream(strs);
    }

    public void test2() {
        /**
         * filter接收lambda表达式，返回boolean类型，筛选出结果为true的元素
         */
        users = users.stream().filter(User::isStudent).collect(Collectors.toList());

        /**
         * distinct去除重复元素
         */
        Stream.of(1, 2, 3, 4, 3, 4).distinct().collect(Collectors.toList());

        /**
         * 截取前n个元素
         */
        users = users.stream().limit(2).collect(Collectors.toList());

        /**
         * 跳过前n个元素
         */
        users = users.stream().skip(2).collect(Collectors.toList());

        /**
         * 映射
         */
        List<Integer> list = users.stream().map(User::getId).collect(Collectors.toList());

    }

    /**
     * 合并多个流
     */
    @Test
    public void test3() {
        List<String> lists = new ArrayList<>();
        lists.add("I am a boy");
        lists.add("You are a girl");
        //首先按空格分割，此时是String数组，然后用flatMap将小流合并成大流
        lists.stream().map(s -> s.split(" ")).flatMap(Arrays::stream).distinct().collect(Collectors.toList())
                .forEach(System.out::print);
    }

    /**
     * anyMatch 判断流中是否至少有一个元素满足条件
     * allMatch 判断流中所有元素是否满足条件
     */
    @Test
    public void test4() {
        boolean b = users.stream().anyMatch(User::isStudent);
        System.out.println(b);
    }

    /**
     * 获取第一个元素
     */
    @Test
    public void test5() {
        Optional<User> op = users.stream().findFirst();
        if (op.isPresent()) {
            System.out.println(op.get());
        }
    }

    /**
     * reduce:归约即将集合中元素经过运算，折叠成一个元素输出
     * 两个参数：起始值  操作的lambda表达式
     */
    @Test
    public void test6() {

        int value1 = Stream.of(1, 2, 3, 4).reduce(100, (sum, item) -> {
            sum +=  item;
            return  sum;
        });

        int value2 = Stream.of(1,2,3,4).reduce(100,(sum,item)->sum+item);

        int value3 = Stream.of(1,2,3,4).reduce(0, Integer::sum);

//        int i = users.stream().reduce(10,(u1,u2)->u1.getId() + u2.getId());

        System.out.println(value1+":"+value2);


    }
}
