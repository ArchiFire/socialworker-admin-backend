package com.archifire.socialworker.dataprovider.databases.mysql.member;

import java.util.Optional;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.archifire.socialworker.dataprovider.databases.mysql.entity.MemberEntity;

@DataJpaTest
@ExtendWith(SpringExtension.class)
class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    @DisplayName("member 저장")
    void save() {
        MemberEntity member = new MemberEntity();
        member.setName("lee");
        member.setId("kkan799");
        member.setPw("1234");

        MemberEntity member2 = new MemberEntity();
        member2.setName("lee2");
        member2.setId("kkan799");
        member2.setPw("1234");

        MemberEntity save = memberRepository.save(member);
        MemberEntity save2 = memberRepository.save(member2);

        Assertions.assertNotNull(save);
        Assertions.assertNotNull(save2);
        Assertions.assertEquals("lee", save.getName());
        Assertions.assertEquals("lee2", save2.getName());

    }

    @Test
    @DisplayName("member 삭제")
    void delete() {
        MemberEntity member = new MemberEntity();
        member.setName("lee");
        member.setId("kkan799");
        member.setPw("1234");

        MemberEntity save = memberRepository.save(member);
        Long memberNo = save.getMemberNo();

        memberRepository.delete(member);

        Optional<MemberEntity> memberRepositoryById = memberRepository.findById(memberNo);
        MemberEntity memberEntity = memberRepositoryById.orElseGet(MemberEntity::new);

        Assertions.assertNull(memberEntity.getMemberNo());
    }

}