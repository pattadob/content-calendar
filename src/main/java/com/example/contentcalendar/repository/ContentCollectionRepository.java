package com.example.contentcalendar.repository;

import com.example.contentcalendar.model.Content;
import com.example.contentcalendar.model.Status;
import com.example.contentcalendar.model.Type;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {

    private final List<Content> contents = new ArrayList<>();

    public void ContentControllerRepository(){
    }

    public List<Content> findAll(){
        return contents;
    }

    public Optional<Content> findById(Integer id){
        return contents.stream().filter(content -> Objects.equals(content.id(), id)).findFirst();
    }

    public void save(Content content){
        contents.removeIf(c -> Objects.equals(content.id(), c.id()));
        this.contents.add(content);
    }

    @PostConstruct
    private void init(){
        Content content = new Content(
                1,
                "My first blog post",
                "Hello, world!",
                Status.IDEA,
                Type.ARTICLE,
                LocalDateTime.now(),
                null,
                ""
        );
        this.contents.add(content);
    }

    public boolean existsById(Integer id) {
        return contents.stream().anyMatch(content -> Objects.equals(content.id(), id));
    }

    public void deleteById(Integer id) {
        contents.removeIf(content -> Objects.equals(content.id(), id));
    }
}
