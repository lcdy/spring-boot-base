package com.slk.dao.repository;

import com.slk.domain.User;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>, JpaSpecificationExecutor<User> {

	/**
	 * 简单查询：继承JpaRepository的方法
	 */


	/**
	 * JPQL:
	 *
	 */
	// select user.* from user where id = 1
	@Query("from User where id = ?1 and username = ?2")
	List<User> jpql_findAll(Integer id, String username);

	@Query("update User set username = ?1 where id = ?2")
	@Modifying  // 代表更新
	void jpql_update(String username, Integer id);

	// 单纯使用sql
	@Query(value = "select * from User where id = ?1", nativeQuery = true)
	User jpql_sql(Integer id);

	/**
	 * 方法名查询，根据idea提示: 返回值 xx(有提示...)
	 */


	/**
	 * JpaSpecificationExecutor
	 */
	Specification<User> queryCondition = new Specification<User>() {
		@Override
		public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
			return null;
		}
	};

}
