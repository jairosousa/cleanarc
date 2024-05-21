# Cleanarc

## [Github repository]()
## Wiremock
```shell
java -jar .\wiremock-standalone-3.5.4.jar --port 8082
```
## Acessar o contanimer do mongodb

```shell
docker exec -it <<id container>> /bin/bash
```

```shell
root@ec913fbd31fa:/# mongosh -u root -p
Enter password: *******
```

```shell
use cleanarc
```

```shell
show collections
```

```shell
db.customers.find()
```
