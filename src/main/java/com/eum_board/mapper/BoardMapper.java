package com.eum_board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.eum_board.domain.BoardDTO;
import com.eum_board.paging.Criteria;

@Mapper
public interface BoardMapper {
	
	public int insertBoard(BoardDTO params);

	public BoardDTO selectBoardDetail(Long idx);

	public int updateBoard(BoardDTO params);

	public int deleteBoard(Long idx);

	public List<BoardDTO> selectBoardList(BoardDTO params);

	public int selectBoardTotalCount(BoardDTO params);

}
