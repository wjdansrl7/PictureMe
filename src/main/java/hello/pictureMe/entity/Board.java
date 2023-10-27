package hello.pictureMe.entity;

import hello.pictureMe.entity.enums.LocalType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@Entity
//@Getter @Setter
@Data
@RequiredArgsConstructor
public class Board {

    @Id
    @GeneratedValue
    @Column(name = "board_id")
    private Long id;

    private String title;
    private String content;
//    private String location;

    @Enumerated(EnumType.STRING)
    private LocalType localType;

    private LocalDateTime createdAt;
//    private LocalDateTime modifiedAt;

//    @Embedded
//    private Period period;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "member_id")
//    private Member member;

    public void setCreatedAt() {
        this.createdAt = LocalDateTime.now();
    }

//    public void setModifiedAt(LocalDateTime modifiedAt) {
//        this.modifiedAt = modifiedAt;
//    }

    //==연관관계 편의 메서드==//
//    public void /setMember(Member member) {
//        this.member = member;
//        member.getBoards().add(this);
//    }

    //==생성 메서드==//
//    public static Board createBoard(Member member) {
//        Board board = new Board();
//
//        board.setMember(member);
//        board.setCreatedAt(LocalDateTime.now());
//        board.setModifiedAt(LocalDateTime.now());
//    }




}
