package tdw.com.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface CommonMapper {
	List<Map<String, Object>> selectList(String mapper, Map<String,Object> paramMap);
	Map<String,Object> select(String mapper, Map<String,Object> paramMap);
	Map<String,Object> update(String mapper, Map<String,Object> paramMap);
	Map<String,Object> delete(String mapper, Map<String,Object> paramMap);
}
