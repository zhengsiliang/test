package annotationTest;

import com.google.common.collect.Lists;
import enumTest.Singleton;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author siliang.zheng
 * Date : 2018/6/5
 * Describle
 */
public class AnnotationDemo {
    public static void main(String[] args) throws NoSuchMethodException {
        //Singleton singleton = Singleton.getSingleton();
        //Method method = singleton.getClass().getMethod("getSingleton");
        //Test annotation = method.getAnnotation(Test.class);
        //System.out.println(annotation.name());
        //
        //double a = (double) (10 - 5) / 10;
        //System.out.println(a);

        //List a= Lists.newArrayList(1,2,3,4);
        //List b= Lists.newArrayList(5,6,3,4);
        //System.out.println(a.retainAll(b));
        //System.out.println(a);

        String str = "app-crm-admin                   bigdata-cook-service       github-FirstTest    kylin-picture         netty-4-user-guide-demos  pigeon-owitho           server                   test                          xbiz-service\n" +
                "argos-web                       cat                        java-nio-server     kylin-pms             openjdk                   print                   ssm                      untitled                      xtools-web\n" +
                "autotest-demo                   client_java                kylin-address       kylin-util            openjdk-u740              prometheus              store-commodity          vending-machine-service       zebra\n" +
                "awesome-business-web            essential-netty-in-action  kylin-crm-service   league-of-vm-service  openrack-common           prometheus-spring-boot  store-takeout            vertx-example\n" +
                "awesome-crm-service             geek-programming-books     kylin-customer-web  league-of-vm-web      owitho-yc-web             prometheusspringweb     store-takeout-admin-web  winner-winner-chicken-dinner\n" +
                "awesome-crm-statistics-service  gibbon                     kylin-machine-base  mapi-base             owo-api                   raphael-web             store-takeout-web        wms-service\n" +
                "awesome-crm-web                 gibbon-demo                kylin-oss-web       neo                   parentTest                sc-boot                 supply-core              wms-web";
        List<String> collect = Arrays.stream(str.split(" ")).filter(s -> !s.contains(" ")&&s.length()>0).collect(Collectors.toList());
        collect.forEach(s->{
            System.out.println("cd /c/Users/11069/workspace/owitho/"+s+";");
            System.out.println("for branch in `git branch -a | grep remotes | grep -v HEAD | grep -v master`; do     git branch --track ${branch##*/} $branch; done;");
            //System.out.println("git fetch --all");
            System.out.println("git pull");
        });
    }
}
