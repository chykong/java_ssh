# java_ssh
SSH是做java开发必不可少的环节，应该说在应聘java开发的简历上不可缺少的一项，如果连这个都不清楚，建议先学习再找工作。

SSH为什么重要呢，为什么自己不能写一套SSH出来？刚开始很多人会困惑，明明最简单的JSP+JavaBean+Servlet就全都可以做了，而且代码相当简单，为什么还要有各种各样的框架来替代这些，而且各个框架的学习曲线都那么高，学了好久也不敢说精通。

一开始我也这种想法，项目不大，就Servlet全能搞定了，顶多重复写一些取值赋值的代码。后来随着项目的不断扩大，时间的不断紧迫，得有框架来提高开发效率，用框架来减少重复代码量，减少代码出错的机会。举个例子来讲，一个表单有40个字段，从页面的表单命名，到servlet取值赋给model，再到dao层写sql，依次赋值给prepareStatement，中间这么多环节，任何一个环节都有可能写错字段名。加上开发人员 的不仔细，出错的概率是非常非常大的。如果有了Struts或SpringMVC，就可以在控制层直接把表单传过来的值进行封装。在dao层，如果有hibernate或jdbctemplate，就能直接映射成model的字段，开发效率会大幅提高。

前两年我见过一个0配置的SSH框架，号称各层都是零配置全注解，dao层基于于集成基于泛型的hibernate父类，service层是集成基于泛型的service父类，controller层是集成泛型的controller父类，整个工程就没几句代码，一个model全搞定了。相当神奇！后来我一想，如果一句代码都没有，如果我想改业务逻辑，比如加个判断什么的，我去哪改代码啊！！简化有好处，如果简化的一句代码都没有了，那就呵呵。

说到这，还有几个框架比如Spring Play Framework，Jfinal等，都号称极速开发框架，自己开发了一套控制层、持久层的东西，但是一般建议不要用，原因就是社区没有那么活跃，碰到问题不好解决，既然有大众的框架了，这么多人都去踩坑，你掉进坑里的机会就小了很多，即使你掉进去了，你突然发现，原来坑里还有好多人，原来这个坑已经被填平了，不是坑了啊！

当然上面是题外话，引用SSH的好处还有很多很多，比如拦截器，比如AOP，等等，重用性非常高。因为有了这么多的框架，才使java开发的世界如此丰富多彩，才使系统的稳定性越来越高，才有了标准化流水化的开发思想。

这个专集主要讲解web开发一步一步的演进，SSH系列各个框架的入门级使用（想要深入掌握原理，去百度）。章节如下：
- [1.纯JSP项目](http://www.jianshu.com/p/b5dfb698fcb0)
- [2.JSP+JavaBean](http://www.jianshu.com/p/be410d876a6e)
- [3.JSP+JavaBean+Servlet](http://www.jianshu.com/p/461a44505cb4)
- [4.JSP+JavaBean+Struts2(anno)](http://www.jianshu.com/p/5665e2480789)
- [5.Hibernate](http://www.jianshu.com/p/227260477d1c)
- [6.MyBatis](http://www.jianshu.com/p/45cb9374ab51)
- [7.Spring](http://www.jianshu.com/p/736ef20e4306)
- [7.1Java静态代理和动态代理](http://www.jianshu.com/p/2f518a4a4c2b)
- [7.2 cglib动态代理](http://www.jianshu.com/p/758c0d529849)
- [7.3Spring IOC模拟](http://www.jianshu.com/p/dacfb4a9f461)
- [7.4Spring AOP概念及示例](http://www.jianshu.com/p/5a5e48d7d0c4)
- [8.Spring JdbcTemplate](http://www.jianshu.com/p/db4b9b628c1a)
- [9.SpringMVC](http://www.jianshu.com/p/15127e701024)
- [10.Spring+SpringMVC+JdbcTemplate整合](http://www.jianshu.com/p/312acf31a680)


本项目涉及一个数据表，建表脚本在test_1.0.sql