package myBoardg.controller;
 
import java.util.List;
 
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import myBoardg.model.BoardVO;
import myBoardg.mapper.BoardMapper;
 
@RestController
@MapperScan("myBoardg.mapper")
public class BoardController {
 
    @Autowired
    private BoardMapper boardMapper;
	    
    @RequestMapping("/selectAll")
    public List<BoardVO> selectAll() throws Exception{
        List<BoardVO> board = boardMapper.selectAll();
        return board;
    }
}