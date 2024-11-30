package PNUMEAT.Backend.domain.auth.entity;


import PNUMEAT.Backend.domain.article.entity.Article;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.UUID;
import lombok.Getter;

@Entity
@Getter
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String memberUniqueId;

    private String uuid;

    private String role;

    private String memberName;

    private String imageUrl;

    private String description;

    @OneToMany(mappedBy = "member")
    private List<Article> articles = new ArrayList<>();

    protected Member() {
    }

    public Member(String email, String memberUniqueId, String role) {
        this.email = email;
        this.memberUniqueId = memberUniqueId;
        this.role = role;
        this.uuid = UUID.randomUUID().toString();
    }
}