package com.github.messenger4j.quickstart.boot;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.github.messenger4j.quickstart.boot.model.Conversation;

@Repository
public class ConversationDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    class StudentRowMapper implements RowMapper<Conversation > {
        @Override
        public Conversation mapRow(ResultSet rs, int rowNum) throws SQLException {
            Conversation conv = new Conversation();
            conv.setId(rs.getInt("id"));
            conv.setPsid(rs.getString("psid"));
            conv.setNoeud(rs.getInt("noeud"));
            conv.setResponse(rs.getString("reponse"));
            return conv;
        }
    }
    public List < Conversation > findAll() {
        return jdbcTemplate.query("select * from conversation", new StudentRowMapper());
    }
    public Student findById(long id) {
        return jdbcTemplate.queryForObject("select * from student where id=?", new Object[] {
                id
            },
            new BeanPropertyRowMapper < Student > (Student.class));
    }
    public int deleteById(long id) {
        return jdbcTemplate.update("delete from student where id=?", new Object[] {
            id
        });
    }
    public int insert(Student student) {
        return jdbcTemplate.update("insert into student (id, name, passport_number) " + "values(?,  ?, ?)",
            new Object[] {
                student.getId(), student.getName(), student.getPassportNumber()
            });
    }
    public int update(Student student) {
        return jdbcTemplate.update("update student " + " set name = ?, passport_number = ? " + " where id = ?",
            new Object[] {
                student.getName(), student.getPassportNumber(), student.getId()
            });
    }
}