package com.mytests.spring.springbootconfigpropsdiffnotations;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;


@ConfigurationProperties(prefix = "my.props.ctor.underscores")
public class PropsUsingUnderscoresCtor {

    String prop_with_underscores_1;
    String prop_with_underscores_two;
    List<String> list_prop_with_underscores_three;
    Map<String, String> map_prop_with_underscores_four;

    public PropsUsingUnderscoresCtor(String prop_with_underscores_1,
                                     String prop_with_underscores_two,
                                     List<String> list_prop_with_underscores_three,
                                     Map<String, String> map_prop_with_underscores_four) {
        this.prop_with_underscores_1 = prop_with_underscores_1;
        this.prop_with_underscores_two = prop_with_underscores_two;
        this.list_prop_with_underscores_three = list_prop_with_underscores_three;
        this.map_prop_with_underscores_four = map_prop_with_underscores_four;
    }

    public String getProp_with_underscores_1() {
        return prop_with_underscores_1;
    }

    public void setProp_with_underscores_1(String prop_with_underscores_1) {
        this.prop_with_underscores_1 = prop_with_underscores_1;
    }

    public String getProp_with_underscores_two() {
        return prop_with_underscores_two;
    }

    public void setProp_with_underscores_two(String prop_with_underscores_two) {
        this.prop_with_underscores_two = prop_with_underscores_two;
    }

    public List<String> getList_prop_with_underscores_three() {
        return list_prop_with_underscores_three;
    }

    public void setList_prop_with_underscores_three(List<String> list_prop_with_underscores_three) {
        this.list_prop_with_underscores_three = list_prop_with_underscores_three;
    }

    public Map<String, String> getMap_prop_with_underscores_four() {
        return map_prop_with_underscores_four;
    }

    public void setMap_prop_with_underscores_four(Map<String, String> map_prop_with_underscores_four) {
        this.map_prop_with_underscores_four = map_prop_with_underscores_four;
    }
}
