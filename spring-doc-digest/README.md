
# Reading [Spring Document](https://docs.spring.io/spring/docs/current/spring-framework-reference/htmlsingle/)



[7. The IoC container](http://docs.spring.io/spring/docs/current/spring-framework-reference/htmlsingle/#beans)

[8. Resources](http://docs.spring.io/spring/docs/current/spring-framework-reference/htmlsingle/#resources)



## Spring AOP
[11. Aspect Oriented Programming with Spring](http://docs.spring.io/spring/docs/current/spring-framework-reference/htmlsingle/#aop)

- [X] [11.1 Introduction](https://docs.spring.io/spring/docs/current/spring-framework-reference/htmlsingle/#aop-introduction)
- [X] [11.2 @AspectJ support](https://docs.spring.io/spring/docs/current/spring-framework-reference/htmlsingle/#aop-ataspectj)
- [X] [11.3 Schema-based AOP support](https://docs.spring.io/spring/docs/current/spring-framework-reference/htmlsingle/#aop-schema)
- [X] [11.6 Proxying mechanisms](https://docs.spring.io/spring/docs/current/spring-framework-reference/htmlsingle/#aop-proxying)
- [ ] ---

笔记：

1. AOP是通过代理实现的，an object created by the AOP framework in order to implement the aspect contracts (advise method executions and so on). In the Spring Framework, an AOP proxy will be a JDK dynamic proxy or a CGLIB proxy.
2. 理清概念：PointCut定义把动作施加到哪些方法上, Advice定义施加的具体动作及时机
3. 明确常用Advice的使用场景：***Before advice***: Advice that executes before a join point, but which does not have the ability to prevent execution flow proceeding to the join point (unless it throws an exception). **After returning advice**: Advice to be executed after a join point completes normally: for example, if a method returns without throwing an exception.  ***After throwing advice***: Advice to be executed if a method exits by throwing an exception. ***After (finally) advice***: Advice to be executed regardless of the means by which a join point exits (normal or exceptional return). ***Around advice***: Advice that surrounds a join point such as a method invocation. This is the most powerful kind of advice. Around advice can perform custom behavior before and after the method invocation. It is also responsible for choosing whether to proceed to the join point or to shortcut the advised method execution by returning its own return value or throwing an exception.
4. @Aspect的用法
5. 举例：实现AOP实现service层方法的重试


- [X] [17.3 Understanding the Spring Framework transaction abstraction](https://docs.spring.io/spring/docs/current/spring-framework-reference/htmlsingle/#transaction-strategies)

区分Global transactions和Local transactions

理解几个重要的抽象，PlatformTransactionManager，TransactionDefinition，TransactionStatus，DataSourceTransactionManager。

- [X] [17.5 Declarative transaction management](https://docs.spring.io/spring/docs/current/spring-framework-reference/htmlsingle/#transaction-declarative)

底层TransactionAwareDataSourceProxy作为目标DataSource的代理，来处理spring管理的事务。

spring中的事务管理支持回滚规则（rollback rules）,可以通过指定对应的异常实现自动回滚。

The most important concepts to grasp with regard to the Spring Framework’s declarative transaction support are that this support is enabled via AOP proxies, and that the transactional advice is driven by metadata (currently XML- or annotation-based). The combination of AOP with transactional metadata yields an AOP proxy that uses a TransactionInterceptor in conjunction with an appropriate PlatformTransactionManager implementation to drive transactions around method invocations.

项目中实战：指定哪些异常rollback。

You are strongly encouraged to use the declarative approach to rollback if at all possible. Programmatic rollback is available should you absolutely need it, but its usage flies in the face of achieving a clean POJO-based architecture.

知道`<tx:advice/>`默认的事务属性！

https://docs.spring.io/spring/docs/current/spring-framework-reference/html/transaction.html#transaction-declarative-annotations




