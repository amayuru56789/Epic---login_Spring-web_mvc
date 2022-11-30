package lk.epic.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(basePackages = "lk.epic.spring.repo")
@EnableTransactionManagement
@PropertySource("classpath:application.properties")
public class JPAConfig {

    @Autowired
    Environment environment;

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource ds, JpaVendorAdapter va){
        LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
        bean.setJpaVendorAdapter(va);
        bean.setDataSource(ds);
        bean.setPackagesToScan(environment.getRequiredProperty("entity.package.name"));
        return bean;
    }

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(environment.getRequiredProperty("epic.app.url"));
        dataSource.setUsername(environment.getRequiredProperty("epic.app.username"));
        dataSource.setPassword(environment.getRequiredProperty("epic.app.password"));
        dataSource.setDriverClassName(environment.getRequiredProperty("epic.app.driverclassname"));
        return dataSource;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter(){
        HibernateJpaVendorAdapter vendor = new HibernateJpaVendorAdapter();
        vendor.setDatabasePlatform(environment.getRequiredProperty("epic.app.dialect"));
        vendor.setDatabase(Database.MYSQL);
        vendor.setShowSql(true);
        vendor.setGenerateDdl(true);
        return vendor;
    }

    /*@Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory emf){
        return new JpaTransactionManager(emf);
    }*/
}
