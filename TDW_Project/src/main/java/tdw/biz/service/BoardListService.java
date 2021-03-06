package tdw.biz.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tdw.com.mapper.CommonMapper;

@Service
public class BoardListService {

	@Autowired
	CommonMapper commonMapper;
	
	private static final String SQL_PREFIX = "biz.boardList.";

	
	/**
	 * 게시판 목록 조회
	 * @param param
	 * @return
	 */
	public List<Map<String,Object>> selectBoardList(Map<String,Object> param) {
		return commonMapper.selectList(this.SQL_PREFIX + "selectBoardList", param);
		
	}
	
}
