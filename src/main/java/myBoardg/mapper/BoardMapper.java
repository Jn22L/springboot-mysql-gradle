package myBoardg.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import myBoardg.model.BoardVO;

@Mapper
public interface BoardMapper {
    public List<BoardVO> selectAll()throws Exception;
}