package hello.pictureMe.service;

import hello.pictureMe.entity.Board;
import hello.pictureMe.entity.enums.LocalType;
import hello.pictureMe.repository.BoardRepository;
import hello.pictureMe.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class BoardService {

    private MemberRepository memberRepository;
    @Autowired
    private BoardRepository boardRepository;

    @Transactional
    public Long saveBoard(Board board) {
        System.out.println("board = " + board);
        boardRepository.save(board);
        return board.getId();
    }

//    @Transactional
//    public void updateBoard(Long boardId, String title, String content, String local) {
//        Board board = boardRepository.findOne(boardId);
//        board.setTitle(title);
//        board.setContent(content);
//        board.setLocalType(LocalType.valueOf(local));
//    }
//
//    public List<Board> findBoards() {
//        return boardRepository.findAll();
//    }
//
//    public Board findOne(Long boardId) {
//        return boardRepository.findOne(boardId);
//    }


}
