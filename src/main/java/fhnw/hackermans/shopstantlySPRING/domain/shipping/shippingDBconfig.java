package fhnw.hackermans.shopstantlySPRING.domain.shipping;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@Configuration
//@EnableTransactionManagement
//@EnableJpaRepositories(entityManagerFactoryRef = "shippingEntityManager", transactionManagerRef = "shippingTransactionManager", basePackages = "fhnw.hackermans.shopstantlySPRING.domain.shipping")
public class shippingDBconfig {

	/*@Primary
	@Bean
	public DataSource mysqlDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl(
				"jdbc:mysql://localhost:3306/db_shipping?useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=CET");
		dataSource.setUsername("testuser");
		dataSource.setPassword("testpw");
		return dataSource;
	}

	@Primary
	@Bean(name = "shippingEntityManager")
	public LocalContainerEntityManagerFactoryBean mysqlEntityManagerFactory(EntityManagerFactoryBuilder builder) {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(mysqlDataSource());
		em.setPackagesToScan(new String[] { "fhnw.hackermans.shopstantlySPRING.domain.shipping" });
		em.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		Properties additionalProperties = new Properties();
		additionalProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		additionalProperties.put("hibernate.ddl-auto", "update");
		em.setJpaProperties(additionalProperties);
		return em;
	}

	@Primary
	@Bean(name = "shippingTransactionManager")
	public PlatformTransactionManager mysqlTransactionManager(
			@Qualifier("shippingEntityManager") EntityManagerFactory entityManagerFactory) {
		return new JpaTransactionManager(entityManagerFactory);
	}*/

}
