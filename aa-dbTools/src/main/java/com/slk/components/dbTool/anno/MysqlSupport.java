package com.slk.components.dbTool.anno;


import com.slk.components.dbTool.dbConfig.DataBaseConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(DataBaseConfig.class)
public @interface MysqlSupport {

    String username() default "root";
    String password() default "roottt";
    String dbName() default "";
    String url() default "jdbc:mysql://localhost:3306/SFNotes?serverTimezone=UTC&characterEncoding=utf-8";
}
