package by.bsuir.dc.lab4.services.interfaces;

import by.bsuir.dc.lab4.entities.Comment;

import java.util.List;

public interface CommentDiscService {
    Comment add(Comment editor);

    void delete(long id);

    Comment update(Comment editor);

    Comment getById(long id);

    List<Comment> getAll();
}
