package com.mytests.spring.springbootconfigpropsdiffnotations;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = "custom.config")
public class MyProperties {

    String myPropOne;
    String myPropTwo;
    String myPropThree;

    public String getMyPropOne() {
        return myPropOne;
    }

    public void setMyPropOne(String myPropOne) {
        this.myPropOne = myPropOne;
    }

    public String getMyPropTwo() {
        return myPropTwo;
    }

    public void setMyPropTwo(String myPropTwo) {
        this.myPropTwo = myPropTwo;
    }

    public String getMyPropThree() {
        return myPropThree;
    }

    public void setMyPropThree(String myPropThree) {
        this.myPropThree = myPropThree;
    }
}
