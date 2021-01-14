package com.eum_board.service;

import java.util.List;

import com.eum_board.domain.BoardDTO;
import com.eum_board.paging.Criteria;

public interface BoardService {
	
	public boolean registerBoard(BoardDTO params);

	public BoardDTO getBoardDetail(Long idx);

	public boolean deleteBoard(Long idx);

	public List<BoardDTO> getBoardList(BoardDTO params);

}
