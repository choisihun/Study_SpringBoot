package org.zerock.guestbook.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.guestbook.entity.MemoEntity;

import java.util.Optional;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemoRepositoryTests {

    @Autowired
    private MemoRepository memoRepository;

    @Test
    void testInsert() {
        IntStream
                .rangeClosed(1, 100)
                .forEach( i -> {
            MemoEntity memoEntity = MemoEntity.builder()
                    .memoText("Sample..." + i)
                    .build();
            memoRepository.save(memoEntity);
        });
    }
    @Test
    void testSelect() {
        Long mno = 100L;
        Optional<MemoEntity> result = memoRepository.findById(mno);
        if(result.isPresent()) {
            MemoEntity memoEntity = result.get();
            System.out.println(memoEntity);
        } else {


        }

    }
    @Test
    void testUpdate() {
        MemoEntity memoEntity = MemoEntity.builder()
                .mno(100L)
                .memoText("updatd...")
                .build();
        memoRepository.save(memoEntity);
    }
    @Test
    void testDelete() {
        Long mno = 100L;
// memoRepository.deleteById(mno);
        MemoEntity memoEntity = MemoEntity.builder()
            .mno(99L)
                .build();
        memoRepository.delete(memoEntity);
    }
}