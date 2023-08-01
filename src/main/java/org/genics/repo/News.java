@Table
@Entity
public class News extends Serialaizable {
    @NotBlank
    String body;
    @NotBlank
    String title;
    @CreationDate
    LocalDateTime created=LocalDateTime.now();
}
