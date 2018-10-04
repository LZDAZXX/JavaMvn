##SSM整合
###一：导入必须的依赖
    -spring
    -mybatis
    -springmvc
    -jsp
    -servlet
###二：编写web.xml文件
    -spring web容器
    -乱码拦截器
    -spring监听器
    -springmvc
###三：编写spring-mybatis.xml配置文件
    -扫描注册类
    -读取与数据对接的配置文件信息
    -申明数据源
    -构造sqlSessionFactory
    -注册mapper类
###四：事务管理
    -声明事务
    -配置事务特性
###五：springmvc
    -扫描控制器
###六：日志功能

###七：编写测试代码
    -编写与数据库对应的实体类    