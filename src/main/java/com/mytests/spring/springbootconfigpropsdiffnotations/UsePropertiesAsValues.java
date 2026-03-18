package com.mytests.spring.springbootconfigpropsdiffnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class UsePropertiesAsValues {

    @Value("${my.props.underscores.prop-with-underscores-1}")
    String prop1;
    @Value("${my.props.underscores.propWithUnderscoresTwo}")
    String prop2;
    @Value("${my.props.underscores.listPropWithUnderscoresThree[0]}")
    String prop3;
    @Value("${my.props.underscores.list-prop-with-underscores-three[1]}")
    String prop4;
    @Value("${my.props.underscores.inner-pojo.pojo-prop}")
    String prop5;
    @Value("${my.props.underscores.map-prop-with-underscores-four.some-key}")
    String prop6;
    @Value("${my.props.underscores.map_prop_with_underscores_four.some_key}")
    String prop7;
    @Value("${my.props.underscores.mapPropWithUnderscoresFour.someKey}")
    String prop8;
    @Value("${my.props.ctor.underscores.propWithUnderscores1}")
    String prop9;
    @Value("${my.props.ctor.underscores.list-prop-with-underscores-three[0]}")
    String prop10;
    @Value("${my.props.ctor.underscores.map-prop-with-underscores-four.some-key1}")
    String prop11;
    @Value("${my.props.ctor.underscores.map_prop_with_underscores_four.some_key2}")
    String prop12;
    @Value("${my.props.ctor.underscores.mapPropWithUnderscoresFour.someKey3}")
    String prop13;

    @Value("${custom.config.my-prop-one}")
    String prop14;
    @Value("${custom.config.my-prop-two}")
    String prop15;
    @Value("${custom.config.my-prop-three}")
    String prop16;

    public void displayProps(){
        System.out.println(prop1 + "\n" + prop2 + "\n" + prop3 + "\n" + prop4 + "\n" + prop5 + "\n" + prop6 + "\n" + prop7 + "\n" + prop8 + "\n" + prop9 + "\n" + prop10 + "\n" + prop11 + "\n" + prop12 + "\n" + prop13 + "\n" + prop14 + "\n" + prop15 + "\n" + prop16);
    }

}
