package com.soong;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.soong.mapper.BoardMapper;
import com.soong.vo.BoardVO;

@RunWith(SpringRunner.class)

@SpringBootTest
public class NegmanApplicationTests {

	@Autowired
	private BoardMapper mapper;
	

	
	@Test
	public void testMapper() throws Exception{
		BoardVO vo = new BoardVO();

		vo.setTitle("제목입니다.");
		vo.setContents("내용입니다.");
		vo.setReg_id("작성자입니다.");
		
		mapper.boardInsert(vo);

	}
	
//	@Autowired
//	private DataSource ds; // 작성
//
//	@Autowired
//	private SqlSessionFactory sqlSession; // 작성
//
//	@Autowired
//	private BoardMapper mapper;
//
//	@Test
//	public void contextLoads() {
//	}
//
//	
//
//	@Test
//	public void testConnection() throws Exception { // 작성
//		System.out.println("ds : " + ds);
//
//		Connection con = ds.getConnection(); // ds(DataSource)에서 Connection을
//												// 얻어내고
//
//		System.out.println("con : " + con); // 확인 후
//
//		con.close(); // close
//	}
//
//	@Test
//	public void testSqlSession() throws Exception {// 작성
//
//		System.out.println("sqlSession : " + sqlSession);
//
//	}

}