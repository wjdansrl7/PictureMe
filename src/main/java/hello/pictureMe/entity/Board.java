package hello.pictureMe.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Board {

    @Id
    @GeneratedValue
    @Column(name = "board_id")
    private Long id;

    private String title;
    private String content;
    private String location;

    @Embedded
    private Period period;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;




}
