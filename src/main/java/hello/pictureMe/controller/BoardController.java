package hello.pictureMe.controller;

import hello.pictureMe.entity.Board;
import hello.pictureMe.entity.enums.LocalType;
import hello.pictureMe.repository.BoardRepository;
import hello.pictureMe.repository.MemberRepository;
import hello.pictureMe.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @ModelAttribute("localTypes")
    public LocalType[] localTypes() {
        return LocalType.values();
    }

    @GetMapping("/list")
    public String boardList() {
        return "/board/list";
    }

    @GetMapping("")
    public String createForm(Model model) {
        model.addAttribute("board", new Board());
        return "/board/form";
    }

    @PostMapping("")
    public String create(@ModelAttribute Board board) {
        log.info(board.getContent());
        log.info(board.getTitle());
//        Board createBoard = new Board();
        board.setCreatedAt();
//        log.info(toString(board.getCreatedAt()));
//        createBoard.setContent(board.getContent());
//        createBoard.setTitle(board.getTitle());
//        createBoard.setLocalType(board.getLocalType());

//        board.setLocalType(LocalType.valueOf(form.getLocal()));
//        board.setTitle(form.getTitle());
//        board.setContent(form.getContent());

        boardService.saveBoard(board);

        return "redirect:/board/list";
    }
}
