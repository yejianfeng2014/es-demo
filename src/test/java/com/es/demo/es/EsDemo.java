package  com.es.demo.es;

import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class EsDemo {

    //从ES中查询数据
    @Test
    public void test1() throws UnknownHostException {
        //指定ES集群
        Settings setting = Settings.builder().put("cluster.name",
                "my-application").build();

        //创建访问ES服务器的客户端
        TransportClient client = new PreBuiltTransportClient(Settings.EMPTY)
                .addTransportAddress(
                        new TransportAddress(
                                InetAddress.getByName("192.168.206.133"),9300));
        //get方式数据查询 ,参数为Index,type和id
        GetResponse response = client.prepareGet("project","person","1").get();

        System.out.println(response.getSourceAsString());
        client.close();
    }
}