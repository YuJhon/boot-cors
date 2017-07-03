# boot-cors
    Spring Boot 使用CORS解决跨域问题示例

### 服务器端的CORS配置
![服务器端的CORS配置](http://jiangblog.oss-cn-shanghai.aliyuncs.com/boot-cors/server-code-project.png)

### 客户端AJAX示例
![客户端AJAX示例](http://jiangblog.oss-cn-shanghai.aliyuncs.com/boot-cors/Request-page.png)

### 正确访问结果
![正确访问结果](http://jiangblog.oss-cn-shanghai.aliyuncs.com/boot-cors/CROS-Result-Of-Header.png)

### 错误访问结果
![修改允许访问的源](http://jiangblog.oss-cn-shanghai.aliyuncs.com/boot-cors/modified-allow-origins.png)

![错误访问结果](http://jiangblog.oss-cn-shanghai.aliyuncs.com/boot-cors/client-error.png)

### 注意：
    CORS是在Spring 4.2之后才能用CORSOrigin注解
