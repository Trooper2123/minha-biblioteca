package com.minhabiblioteca;

import model.Book;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;



@Repository
public class BooksRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    class BookRowMapper implements RowMapper<Book>{
        @Override
        public Book mapRow(ResultSet rs, int RowNum) throws SQLException {
            Book book = new Book();
            book.setId(rs.getLong("id"));
            book.setName(rs.getString("name"));
            book.setSubject(rs.getString("subject"));
            book.setNumPages(rs.getString("numPages"));
            return book;
        }
    }

    public List<Book> findAll() {
        return jdbcTemplate.query("select * from book", new BookRowMapper());
    }

    public Optional<Book> findById(long id){
        return Optional.ofNullable(jdbcTemplate.queryForObject
                ("select * from book where id=?"
                , new Object[]{id},
                new BeanPropertyRowMapper< Book >(Book.class)));
    }
public int deleteById(Long id){
        return jdbcTemplate.update("delete from book where id=?", new Object[]{id});
}

public int insert (Book book){
        return jdbcTemplate.update("insert into book(id,name,subject,numPages)"
                 + "values(?, ?, ?, ?)",new Object[]{
                book.getId(),book.getName(),book.getSubject(),book.getNumPages()
        });
}

public int update(Book book){
        return jdbcTemplate.update("update book "+ "set name = ?, subject = ?, numPages = ?"
                + "where id = ?",new Object[]{
                        book.getName()
                ,book.getSubject()
                ,book.getNumPages()
                ,book.getId()
        });
}

}
