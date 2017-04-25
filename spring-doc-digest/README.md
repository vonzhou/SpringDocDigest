
# Reading [Spring Document](https://docs.spring.io/spring/docs/current/spring-framework-reference/htmlsingle/)



[7. The IoC container](http://docs.spring.io/spring/docs/current/spring-framework-reference/htmlsingle/#beans)

[8. Resources](http://docs.spring.io/spring/docs/current/spring-framework-reference/htmlsingle/#resources)



## Spring AOP
[11. Aspect Oriented Programming with Spring](http://docs.spring.io/spring/docs/current/spring-framework-reference/htmlsingle/#aop)

笔记：

1. AOP是通过代理实现的，an object created by the AOP framework in order to implement the aspect contracts (advise method executions and so on). In the Spring Framework, an AOP proxy will be a JDK dynamic proxy or a CGLIB proxy.
2. 理清概念：PointCut定义把动作施加到哪些方法上, Advice定义施加的具体动作及时机
3. 明确常用Advice的使用场景：***Before advice***: Advice that executes before a join point, but which does not have the ability to prevent execution flow proceeding to the join point (unless it throws an exception). **After returning advice**: Advice to be executed after a join point completes normally: for example, if a method returns without throwing an exception.  ***After throwing advice***: Advice to be executed if a method exits by throwing an exception. ***After (finally) advice***: Advice to be executed regardless of the means by which a join point exits (normal or exceptional return). ***Around advice***: Advice that surrounds a join point such as a method invocation. This is the most powerful kind of advice. Around advice can perform custom behavior before and after the method invocation. It is also responsible for choosing whether to proceed to the join point or to shortcut the advised method execution by returning its own return value or throwing an exception.
4. @Aspect的用法
5. 举例：实现AOP实现service层方法的重试

[12. Spring AOP APIs](http://docs.spring.io/spring/docs/current/spring-framework-reference/htmlsingle/#aop-api)
