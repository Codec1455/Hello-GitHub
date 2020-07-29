package com.zier.loader;

import com.zier.bean.Demo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author mengshuaibin
 */
public class BeanLoader {

    public static void main(String[] args) {
        Log log = LogFactory.getLog(Demo.class);
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
        Demo demo = (Demo) context.getBean("demo");
        System.out.println(demo);
        System.out.println(log);

    }


}
