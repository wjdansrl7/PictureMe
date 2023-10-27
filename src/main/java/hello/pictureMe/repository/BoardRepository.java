package hello.pictureMe.repository;

import hello.pictureMe.entity.Board;
import hello.pictureMe.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

public interface BoardRepository extends JpaRepository<Board, Long>, QuerydslPredicateExecutor<Board> {
//    Board findByMember(Member member);

}
