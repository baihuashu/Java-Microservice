# 1. 初始化本地数据库用户和数据库
```
CREATE USER 'choerodon'@'%' IDENTIFIED BY "123456";
CREATE DATABASE IF NOT EXISTS study_service DEFAULT CHARACTER SET utf8mb4;
GRANT ALL PRIVILEGES ON study_service.* TO choerodon@'%';
FLUSH PRIVILEGES;
```
# 2. 初始化本地数据库表结构
```
sh init-local-database.sh
```
# 3. 根据id查询组织，并将组织机构和List<项目>存入到组织机构中。
- 网关访问(服务映射为/wzl/**) token自取见备注。
```
http://localhost:网关端口/wzl/v1/organization/1
```
- 不开网关访问
```
http://localhost:8888/v1/organization/1
```
# 4. 根据组织id和用户id查询用户，并存储User。
- 网关访问(服务映射为/wzl/**) token自取见备注。

```
http://localhost:网关端口/wzl/v1/organization/1/users/1
```
- 不开网关访问
```
http://localhost:8888/v1/organization/1/users/1
```
# 5. 根据id查询本地组织。
- 网关访问(服务映射为/wzl/**)  token自取见备注。

```
http://localhost:网关端口/wzl/v1/organization/local/1
```
- 不开网关访问
```
http://localhost:8888/v1/organization/local/1
```
# 6. 根据id查询本地用户。
- 网关访问(服务映射为/wzl/**) token自取见备注。

```
http://localhost:网关端口/wzl/v1/organization/local/users/1
```
- 不开网关访问
```
http://localhost:8888/v1/organization/local/users/1
```
# 7. 分页查询项目。
- 网关访问(服务映射为/wzl/**) token自取见备注。

```
http://localhost:网关端口/wzl/v1/project/?page=2&pageSize=2
```
- 不开网关访问
```
http://localhost:8888/v1/project/?page=2&pageSize=2
```

# 备注:token取得方式
```$xslt
TOKEN=$(curl 'http://api.dev.devopseasy.com/oauth/oauth/token?client_id=client&client_secret=secret&grant_type=password&password=YWRtaW4%3D&username=admin' -X POST -H 'Accept: application/json, text/plain, */*' | jq -r '.access_token')
echo $TOKEN

```xixi
