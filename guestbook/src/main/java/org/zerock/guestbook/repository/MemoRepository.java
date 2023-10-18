package org.zerock.guestbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import org.zerock.guestbook.entity.MemoEntity;

import java.util.List;
import java.util.Optional;

public interface MemoRepository extends JpaRepository<MemoEntity, Long> {

    @Query("SELECT m " +
            "FROM MemoEntity m " +
            "WHERE m.mno ")
    void findByMno();


//  where mno = ?
//    Optional<MemoEntity> findByMno(Long mno);

    List<MemoEntity> findByMnoBetweenOrderByMnoDesc(Long from, Long to);


//    List<MemoEntity> findByMnoBetweenOrderByMnoDesc(Long from, Long to);

//    Optional<MemoEntity> findByMno(Long mno);

//    @Query("SELECT m FROM MemoEntity m WHERE m.mno = :mno")
//    Optional<MemoEntity> findByMno(@Param("mno") Long mno);

    @Transactional
    @Modifying
    @Query("UPDATE MemoEntity m SET m.memoText = :memoText WHERE m.mno = :mno")
    int updateMemoText(@Param("mno") Long mno, @Param("memoText") String memoText);



}
