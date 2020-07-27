-----------------------------------------------------------------------------------WEB服务配置：
server.port=8081
    WEB服务开放的端口
server.servlet.context-path=/demo-chess-module
    启动服务的服务名，默认为 /
server.error.path=./error
    当服务异常时，跳转到的路径
server.servlet.session.timeout=30m
    WEBSession超时时间(JSession)

-----------------------------------------------------------------------------------tomcat配置：
server.tomcat.basedir=D:\\ideaworkspace\\demo-chess
    tomcat的根目录
server.tomcat.internal-proxies=172\\.16\\.0\\.112|172\\.16\\.0\\.78|172\\.1[0-9]{1}\\.2\\.d{1,3}
    可信任客户端IP配置(当前配置不生效？？？)
server.tomcat.remote-ip-header=X-FORWARDED-FOR
    获取客户端 IP 地址的头名称(用于处理均衡器等原因找不到真正客户端IP的问题)
server.tomcat.background-processor-delay=0
   延时调用后台程序时间，单位 秒
server.tomcat.uri-encoding=UTF-8
    解码请求的编码格式
server.tomcat.max-threads=8000
    最大处理线程数
server.tomcat.min-spare-threads=0
    最小处理线程数(预留线程，等待处理业务)
server.tomcat.max-connections=5000
    并发处理最大连接数

-----------------------------------------------------------------------------------数据源配置：
spring.datasource.trade.driver-class-name=com.mysql.jdbc.Driver
    设置 trade 库连接驱动
spring.datasource.trade.url=jdbc\:mysql\://172.16.2.77\:3306/demochess?useUnicode\=true&characterEncoding\=UTF-8
    设置 trade 库连接地址
spring.datasource.trade.username=demochess
    设置 trade 数据库登录用户名
spring.datasource.trade.password=password
    设置 trade 数据库密码
spring.datasource.trade.initial-size=10
    设置初始化连接数
spring.datasource.trade.max-active=50
    设置数据库最大活跃数
spring.datasource.trade.min-idle=10
    设置数据库最小空闲
spring.datasource.trade.max-wait=30000
    设置最大等待连接时长
spring.datasource.trade.type=com.alibaba.druid.pool.DruidDataSource
    设置使用的连接池(这个设置不生效，执行时没有给 type 赋值，不知道原因)
Spring.datasource.connection-init-sqls
    创建连接后，放到连接池前执行的sql语句

-----------------------------------------------------------------------------------日志配置：
server.tomcat.accesslog.directory=logs
    设置文件目录，可以是相对 tomcat 的相对目录，也可以是绝对目录
server.tomcat.accesslog.prefix=demo-chess-module
    设置文件名称
server.tomcat.accesslog.file-date-format=-yyyy-MM-dd
    日志文件格式(demo-chess-module-yyyy-MM-dd.log)
server.tomcat.accesslog.rename-on-rotate=false
    是否到转天时才加上日期，当天日志文件名不带日期
server.tomcat.accesslog.suffix=.log
    日志文件后缀
server.tomcat.accesslog.pattern=common
    格式化访问日志模式(??????)
server.tomcat.accesslog.request-attributes-enabled=true
    设置日志中是否展示访问客户端的 IP 地址
server.tomcat.accesslog.rotate=true
    设置访问日志旋转(???????)
server.tomcat.accesslog.enabled=false
    是否启动访问日志([01/Nov/2019:08:33:06 +0800] "GET /demo-chess-module/baybay HTTP/1.1" 200 31)
server.tomcat.accesslog.buffered=false
    日志是否缓冲，定期写文件

-----------------------------------------------------------------------------------HTTPS配置：
server.ssl.key-store=demo-chess-module04/sang.p12
    证书存放位置
server.ssl.key-alias=tomcathttps
    证书别名
server.ssl.key-store-password=demochess
    证书密码

-----------------------------------------------------------------------------------banner配置：
spring.main.banner-mode=console
    是否打印 banner，console 打印；off 不打印
spring.banner.charset=UTF-8
    设置打印 banner 的编码格式
spring.banner.location=file:D:/banner.txt
    设置打印 banner 的文件位置
spring.banner.image.location=file:D:\\flower.jpg
    spring.banner.image 为设置打印图片的配置，但因为打印的是控制台，所以都是乱码，不知道怎么用
    location：图片位置 file:D:\\flower.jpg
    height：高度 20
    width：宽度 20
    invert：是否反转 true
    margin：边缘大小 2








-------------------------------------------------------------------------------------------other
server.tomcat.accept-count= # Maximum queue length for incoming connection requests when all possible request processing threads are in use.
server.tomcat.additional-tld-skip-patterns= # Comma-separated list of additional patterns that match jars to ignore for TLD scanning.
server.tomcat.max-http-header-size=0 # Maximum size in bytes of the HTTP message header.
server.tomcat.max-http-post-size=0 # Maximum size in bytes of the HTTP post content.
server.tomcat.port-header=X-Forwarded-Port # Name of the HTTP header used to override the original port value.
server.tomcat.protocol-header= # Header that holds the incoming protocol, usually named "X-Forwarded-Proto".
server.tomcat.protocol-header-https-value=https # Value of the protocol header that indicates that the incoming request uses SSL.
server.tomcat.redirect-context-root= # Whether requests to the context root should be redirected by appending a / to the path.
spring.tomcat.resource.cache-ttl=5000 # Time-to-live in milliseconds of the static resource cache.















