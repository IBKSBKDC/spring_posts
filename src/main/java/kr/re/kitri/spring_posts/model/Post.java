package kr.re.kitri.spring_posts.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data // 롬복을 사용하기 위함
@NoArgsConstructor // 파라미터 없는 생성자
@AllArgsConstructor // 파라미터를 모두 가지는 생성자
@Table(name="post_kdc")
public class Post {
    @Id
    private long id;
    private String title;
    private String body;
    private int likes;
}
