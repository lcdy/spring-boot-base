package com.slk.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
@Entity
public class User implements Serializable {

	/**
	 * GenerationType.
	 * IDENTITY: 自增 MySQL
	 * SEQUENCE: 序列 Oracle
	 * TABLE: JPA提供的一种机制，通过一张数据库表的形式帮助我们完成主键自增
	 * AUTO: 自动
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  // 指定主键的生成策略
	@GenericGenerator(name="increment", strategy = "increment")
	private Integer id;

	/**
	 * column的属性：
	 * name： 指定数据库表名称
	 * unique： 是否唯一
	 * nullable： 是否可以为空
	 * insertable: 是否可以插入数据
	 * updateable：是否可以更新
	 * columnDefinition: 定义表时创建此列的DLL
	 * secondaryTable: 从表名。如果此列不建立在主表上，该属性定义该列所在从表的名字搭建开发环境
	 */
	@Column
	private String username;
	@Column
	private Integer age;
	@Column
	private String password;

}
