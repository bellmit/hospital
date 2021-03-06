package com.litbo.hospitalzj.supplier.service;

import com.litbo.hospitalzj.supplier.entity.JgLx;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JgLxService {
	List<JgLx> findAll();
	void insert(JgLx qyLx);
	void update(JgLx qyLx);
	List<JgLx> findByJgLxNameLike(@Param("jgLx") String jgLx);
	void delete(Integer jgId);
}
