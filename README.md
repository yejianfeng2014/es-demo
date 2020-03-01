# es-demo
使用java 操作es  java 版本1.8 es 版本6.2.4 


1,安装es
curl -L -O https://artifacts.elastic.co/downloads/elasticsearch/elasticsearch-6.2.4.tar.gz

tar -xvf elasticsearch-6.2.4.tar.gz -C /opt

cd  /opt/elasticsearch-6.2.4/bin
启动 
./elasticsearch 

如果需要外网访问添加 把localhost 修改为  0.0.0.0

groupadd es                                    新增elsearch用户组
useradd es -g es -p es        创建elsearch用户
chown -R es:es ./elasticsearch-6.2.4     用户目录权限

安装kibana
curl -L -O https://artifacts.elastic.co/downloads/kibana/kibana-6.2.4-linux-x86_64.tar.gz

在config/kibana.yml中配置 elasticsearch.url的值为 ES的访问地址
把访问地址前面的# 给去掉。
如果为了外网访问 需要把 localhost 修改我0.0.0.0

三、集成Ikanalyzer
curl -L -O https://github.com/medcl/elasticsearch-analysis-ik/releases/download/v6.2.4/elasticsearch-analysis-ik-6.2.4.zip


