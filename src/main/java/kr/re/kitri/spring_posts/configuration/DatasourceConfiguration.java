package kr.re.kitri.spring_posts.configuration;

//import com.zaxxer.hikari.HikariConfig;
//import com.zaxxer.hikari.HikariDataSource;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//
//import javax.sql.DataSource;

//@Configuration
//@PropertySource("classpath:/application.properties")
//public class DatasourceConfiguration {
//
//    @Bean
//    @ConfigurationProperties(prefix = "spring.datasource.hikari")
//    public HikariConfig hikariConfig() {
//        return new HikariConfig();
//    }
//    @Bean
//    public DataSource dataSource() {
//        DataSource dataSource = new HikariDataSource(hikariConfig());
//        return dataSource;
//    }
//}
