package name.nkonev.example.spring.data.jpa.json;

import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.Objects;

// records can't be entities https://thorben-janssen.com/java-records-embeddables-hibernate/
@Entity
@SequenceGenerator(
    name = "seqid-gen",
    sequenceName = "book_id_seq",
    initialValue = 1,
    allocationSize = 1)
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqid-gen")
    private Long id;
    private String title;
    private String author;
    @JdbcTypeCode(SqlTypes.JSON)
    private BookAttributes jsonbContent;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book that = (Book) o;
        return Objects.equals(id, that.id) && Objects.equals(title, that.title) && Objects.equals(author, that.author) && Objects.equals(jsonbContent, that.jsonbContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, jsonbContent);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BookAttributes getJsonbContent() {
        return jsonbContent;
    }

    public void setJsonbContent(BookAttributes jsonbContent) {
        this.jsonbContent = jsonbContent;
    }
}

