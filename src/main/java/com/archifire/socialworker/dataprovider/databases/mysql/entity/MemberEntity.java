package com.archifire.socialworker.dataprovider.databases.mysql.entity;

import javax.persistence.*;

import lombok.*;


@Data
@EqualsAndHashCode(callSuper = true)
@Entity(name = "member")
@Table(indexes = {
    @Index(name="unique_idx_id", columnList = "id", unique = true)
})
public class MemberEntity extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberNo;

    private String id;

    private String pw;

    private String name;

    private String sex;
}
