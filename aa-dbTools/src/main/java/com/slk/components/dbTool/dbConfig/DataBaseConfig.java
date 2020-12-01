package com.slk.components.dbTool.dbConfig;

import com.slk.components.dbTool.anno.MysqlSupport;
import com.sun.istack.internal.NotNull;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportAware;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.Map;


// todo mysql单独拆出来，已经使用了自动配置
public class DataBaseConfig implements ImportAware {
	private String name;
	private String password;
	private String url;

	@Override
	public void setImportMetadata(@NotNull AnnotationMetadata importMetadata) {
		Map<String, Object> objectMap = importMetadata.getAnnotationAttributes(MysqlSupport.class.getName());
		AnnotationAttributes annotationAttributes = AnnotationAttributes.fromMap(objectMap);
		// todo 异常系统
		if (annotationAttributes == null)
			throw new RuntimeException("MySqlConnectAware(39): 可能没有使用EnableMysqlConnect注解");
		this.name = annotationAttributes.getString("username");
		this.password = annotationAttributes.getString("password");
		this.url = annotationAttributes.getString("url");
	}

	@Bean
	public DataSource dataSource() {
		return new DriverManagerDataSource(url, name, password);
	}

//	@Bean("transactionManager")
//	public DataSourceTransactionManager dataSourceTransactionManager(@Qualifier("dataSource") DataSource dataSource) {
//		return new DataSourceTransactionManager(dataSource);
//	}

	@Bean
	public SqlSessionFactory sqlSessionFactory(@Qualifier("dataSource") DataSource dataSource) throws Exception {
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(dataSource);
		return factoryBean.getObject();
	}


//    @Bean
//    public SqlSessionFactory sqlSessionFactory(@Qualifier("dataSource") DataSource dataSource) throws Exception {
//        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
//        factoryBean.setDataSource(dataSource);
//        return factoryBean.getObject();
//    }
}
