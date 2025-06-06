package com.example.shardinngdemo.config;//package com.example.encryptionandmaskingdemo.config;
//
//import org.apache.shardingsphere.driver.api.ShardingSphereDataSourceFactory;
//import org.apache.shardingsphere.encrypt.api.EncryptRuleConfiguration;
//import org.apache.shardingsphere.encrypt.api.EncryptorConfiguration;
//import org.apache.shardingsphere.infra.config.algorithm.ShardingSphereAlgorithmConfiguration;
//import org.apache.shardingsphere.infra.config.mode.ModeConfiguration;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.sql.DataSource;
//import java.sql.SQLException;
//import java.util.*;
//
//@Configuration
//public class ShardingSphereConfig {
//
//    @Bean
//    public DataSource dataSource() throws SQLException {
//        // 配置数据源
//        Map<String, DataSource> dataSourceMap = new HashMap<>();
//        com.zaxxer.hikari.HikariDataSource dataSource = new com.zaxxer.hikari.HikariDataSource();
//        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/db_snowid_demo");
//        dataSource.setUsername("root");
//        dataSource.setPassword("2640");
//        dataSourceMap.put("ds0", dataSource);
//
//        // 配置加密规则
//        EncryptorConfiguration encryptorConfig = new EncryptorConfiguration(
//                "AES",
//                new Properties() {{
//                    setProperty("aes-key-value", "123456abcdefghij");
//                }}
//        );
//        ShardingSphereAlgorithmConfiguration encryptorAlgorithm = new ShardingSphereAlgorithmConfiguration("AES", new Properties() {{
//            setProperty("aes-key-value", "123456abcdefghij");
//        }});
//
//        Map<String, ShardingSphereAlgorithmConfiguration> encryptors = new HashMap<>();
//        encryptors.put("aes_encryptor", encryptorAlgorithm);
//
//        EncryptRuleConfiguration encryptRuleConfig = new EncryptRuleConfiguration();
//        encryptRuleConfig.getEncryptors().putAll(encryptors);
//
//        // 这里配置 user2 表的加密列
//        Map<String, org.apache.shardingsphere.encrypt.api.EncryptColumnRuleConfiguration> columns = new HashMap<>();
//        columns.put("password", new org.apache.shardingsphere.encrypt.api.EncryptColumnRuleConfiguration(
//                "password",
//                "password_cipher",
//                "",
//                "aes_encryptor"
//        ));
//        org.apache.shardingsphere.encrypt.api.EncryptTableRuleConfiguration tableConfig = new org.apache.shardingsphere.encrypt.api.EncryptTableRuleConfiguration(columns);
//        encryptRuleConfig.getTables().put("user2", tableConfig);
//
//        // 配置模式
//        ModeConfiguration modeConfig = new ModeConfiguration("Standalone", new Properties());
//
//        // 创建 ShardingSphere 数据源
//        return ShardingSphereDataSourceFactory.createDataSource(dataSourceMap, Collections.singletonList(encryptRuleConfig), modeConfig, new Properties());
//    }
//}
