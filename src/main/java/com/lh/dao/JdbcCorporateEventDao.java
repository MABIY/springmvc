package com.lh.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

/**
 * Created by liuhua on 16-6-22.
 */
@Repository
public class JdbcCorporateEventDao implements CorporateEventDao {

//    private JdbcTemplate jdbcTemplate;

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }


    public int countOfActorsByFirstName() {

        String sql = "select count(*) from user  where id = :id";

        SqlParameterSource namedParameters = new MapSqlParameterSource("id",1);

        return this.namedParameterJdbcTemplate.queryForObject(sql, namedParameters, Integer.class);
    }


    // JDBC-backed implementations of the methods on the CorporateEventDao follow...
}
