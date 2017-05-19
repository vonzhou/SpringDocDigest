# Read Spring Framework Document - web part

---


## 22. Web MVC framework

- [X] [22.1 Introduction to Spring Web MVC framework](http://docs.spring.io/spring/docs/current/spring-framework-reference/html/mvc.html#mvc-introduction)

The Spring Web model-view-controller (MVC) framework is designed around a DispatcherServlet that dispatches requests to handlers, with configurable handler mappings, view resolution, locale, time zone and theme resolution as well as support for uploading files. The default handler is based on the @Controller and @RequestMapping annotations, offering a wide range of flexible handling methods.

开闭原则："Open for extension…​" A key design principle in Spring Web MVC and in Spring in general is the "Open for extension, closed for modification" principle.

- [X] [22.2 The DispatcherServlet](http://docs.spring.io/spring/docs/current/spring-framework-reference/html/mvc.html#mvc-servlet)

Spring MVC处理请求过程：

![mvc](mvc.png)

The WebApplicationContext is bound in the ServletContext, and by using static methods on the RequestContextUtils class you can always look up the WebApplicationContext if you need access to it.

DispatcherServlet 使用的默认bean type配置在DispatcherServlet.properties文件中。


- [ ] [22.3 Implementing Controllers]()


















