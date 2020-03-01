//package com.es.demo.config;
//
//import org.apache.http.HttpHost;
//import org.elasticsearch.client.RestClient;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.beans.factory.config.AbstractFactoryBean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class ElasticSearchConfiguration extends AbstractFactoryBean {
//
//    private static final Logger LOG = LoggerFactory.getLogger(ElasticSearchConfiguration.class);
//
//    @Value("${elasticsearch.host}")
//    private String host;
//
//    private RestHighLevelClient restHighLevelClient;
//
//    @Override
//    public void destroy() throws Exception {
//        // 关闭Client
//        if (restHighLevelClient != null) {
//            restHighLevelClient.close();
//        }
//    }
//
//    @Override
//    public Class<RestHighLevelClient> getObjectType() {
//        return RestHighLevelClient.class;
//    }
//
//    @Override
//    public boolean isSingleton() {
//        return false;
//    }
//
//    @Override
//    protected Object createInstance() throws Exception {
//        try {
//            // 如果有多个节点，构建多个HttpHost
//            restHighLevelClient = new RestHighLevelClient(
//                    RestClient.builder(
//                            new HttpHost(host, 9200, "http")));
//        } catch (Exception e) {
//            LOG.error(e.getMessage());
//        }
//        return restHighLevelClient;
//    }
//}
