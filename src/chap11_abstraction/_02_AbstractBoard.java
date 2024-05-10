package chap11_abstraction;

import chap11_abstraction.board.Board;
import chap11_abstraction.board.FreeBoard;
import chap11_abstraction.board.NoticeBoard;

public class _02_AbstractBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board board = new FreeBoard(1,"안녕","추상화","김션","2024-05-02","첨부파일1");
		board.post();
		board.modify();
		board.delete();
		
		board = new NoticeBoard(1,"하이", "상속", "션팡", "2024-05-01", true);
		board.post();
		board.modify();
		board.delete();
	}

}
