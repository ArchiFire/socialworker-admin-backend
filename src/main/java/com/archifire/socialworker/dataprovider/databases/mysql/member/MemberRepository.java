package com.archifire.socialworker.dataprovider.databases.mysql.member;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.archifire.socialworker.dataprovider.databases.mysql.entity.MemberEntity;

@Repository
public interface MemberRepository extends CrudRepository<MemberEntity, Long>, MemberCustomRepository {
}
