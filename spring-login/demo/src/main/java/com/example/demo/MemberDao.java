package com.example.demo;

import java.util.List;
import java.sql.ResultSet;
import javax.sql.DataSource;

import org.springframework.jdbc.core.*;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

public class MemberDao
{
    private final JdbcTemplate jdbcTemplate;

    public MemberDao(DataSource dataSource)
    {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public Member selectByEmail(String email)
    {
        List<Member> results = jdbcTemplate.query("SELECT * FROM member WHERE email = ?", new Object[]{email}, new BeanPropertyRowMapper<>(Member.class));
        return results.isEmpty() ? null : results.get(0);
    }

    public void insert(Member member)
    {
        KeyHolder keyHolder = new GeneratedKeyHolder();
    }
}