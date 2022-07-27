package org.zerock.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
//@ContextConfiguration(classes= {RootConfig.class})
@Log4j
public class BoardMapperTests {

	@Autowired
	private BoardMapper mapper;

//	@Test
//	public void testGetList() {
//		mapper.getList().forEach(board -> log.info(board));
//	}

//	@Test
//	public void testInsert() {
//
//		BoardVO board = new BoardVO();
//		board.setTitle("제목이다");
//		board.setContent("내용이다");
//		board.setWriter("작성자다");
//
//		mapper.insert(board);
//
//		log.info(board);
//	}

//	@Test
//	public void testInsertSelectKey() {
//
//		BoardVO board = new BoardVO();
//		board.setTitle("과연..");
//		board.setContent("바뀔것인가..");
//		board.setWriter("나최유");
//
//		mapper.insertSelectKey(board);
//
//		log.info(board);
//	}

//	@Test
//	public void testRead() {
//
//		BoardVO board = mapper.read(5L);
//
//		log.info("-------------------------");
//		log.info(board);
//
//	}

//	@Test
//	public void testDelete() {
//
//		mapper.delete(21L);
//	}

//	//수정
//	@Test
//	public void testUpdate() {
//
//		BoardVO board = new BoardVO();
//		board.setBno(22L);
//		board.setTitle("제목 수정..");
//		board.setContent("내용 수정...");
//		board.setWriter("수정 작성자");
//
//		int count = mapper.update(board);
//
//		log.info("update count: " + count);
//	}
	
//	//페이징 테스트
//	@Test
//	public void testPaging() {
//		
//		Criteria cri = new Criteria();
//		
//		// 한페이지당 10개씩 출력하는 3페이지
//		cri.setPageNum(3);
//		cri.setAmount(10);
//		
//		
//		List<BoardVO> list = mapper.getListWithPaging(cri);
//		list.forEach(board->log.info(board));
//		
//	}
	
	//검색 테스트
	@Test
	public void testSearch() {
		
		Criteria cri = new Criteria();
		cri.setType("새로");
		cri.setKeyword("TC");
		System.out.println("111111111111111111111111111111111111111111111111111111111111");
		List<BoardVO> list = mapper.getListWithPaging(cri);
		list.forEach(board -> log.info(board));
		
	}

}








