package com.lucky.sgr.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author：LuckySgr.
 * @date: 2022/2/22
 */
public class Collection {
    //1、 数组类型属性
    private Course[] courses;
    //2、 list 集合类型属性
    private List<String> list;
    //3、 map 集合类型属性
    private Map<String, String> maps;
    //4、 set 集合类型属性
    private Set<String> sets;

    public Collection(Course[] courses, List<String> list, Map<String, String> maps, Set<String> sets) {
        this.courses = courses;
        this.list = list;
        this.maps = maps;
        this.sets = sets;
    }

    @Override
    public String toString() {
        return "Collection{" +
                "courses=" + Arrays.toString(courses) +
                ", list=" + list +
                ", maps=" + maps +
                ", sets=" + sets +
                '}';
    }
}
