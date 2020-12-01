package com.slk.components.dbTool.dbConfig;//package com.slk.dbConfig;
//
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.ImportSelector;
//import org.springframework.core.type.AnnotationMetadata;
//
//import javax.sql.DataSource;
//import java.util.Objects;
//
//
//public class MybatisConfig implements ImportSelector {
//
//    @SuppressWarnings("all")
//    @Autowired
//    private DataSource driverManagerDataSource;
//
//
//
//    @Override
//    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
//        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
//        factoryBean.setDataSource(driverManagerDataSource);
//        String factoryBeanFullName = null;
//        try {
//            factoryBeanFullName= Objects.requireNonNull(factoryBean.getObject()).getClass().getName();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return new String[]{factoryBeanFullName};
//    }
//}
