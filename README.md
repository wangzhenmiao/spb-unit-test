# spb-unit-test

一、预备工作

1、service业务处理层注解：@Transactional

在Spring Boot中，配置一套使用MySQL的环境非常简单，而且当我们使用了spring-boot-starter-jdbc的时候，Spring Boot会自动注入DataSourceTransactionManager启用帮助配置数据库事务相关的类。

这个时候，Spring Boot已经默认添加好了事务相关的配置，@Transactional注解标记的方法或类就会被加上事务。

二、测试类的注解配置

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpbUnitTestApplication.class)

@RunWith(SpringRunner.class)：让测试运行在spring环境下

@SpringBootTest(classes = SpbUnitTestApplication.class)：SpbUnitTestApplication是项目启动类

三、MockMVc

mockmvc实现了对http请求的模拟，能够使用网络形式，对controller进行调用。

api详解：

mockMvc.perform：执行一个http请求，请求可以调用到controller中的一个方法。





