package tdw.biz.controller;

import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import tdw.biz.service.BoardListService;

@Controller
public class BoardListController {

	@Autowired
	BoardListService boardListService;

	@RequestMapping("/home")
	public String main() {
		return "HI";
	}

	@RequestMapping("/biz/boardList")
	public ModelAndView selectBoardList(@Param(value = "") Map<String, Object> params, ModelAndView model) {

		return model.addObject("", boardListService.selectBoardList(params));
	}

}
