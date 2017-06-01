package com.critc.dao;

import com.critc.model.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Dao
 *
 * @author 孔垂云
 */
@Repository
public class StaffDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 新增
     *
     * @param staff
     */
    public void add(Staff staff) {
        String sql = "insert into staff(name) values(:name)";
        NamedParameterJdbcTemplate namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(jdbcTemplate);
        SqlParameterSource paramSource = new BeanPropertySqlParameterSource(staff);
        namedParameterJdbcTemplate.update(sql, paramSource);
    }

    /**
     * 修改
     *
     * @param staff
     */
    public void update(Staff staff) {
        String sql = "update staff set name=:name where id=:id";
        NamedParameterJdbcTemplate namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(jdbcTemplate);
        SqlParameterSource paramSource = new BeanPropertySqlParameterSource(staff);
        namedParameterJdbcTemplate.update(sql, paramSource);
    }

    public void delete(int id) {
        String sql = "delete from staff  where id=?";
        Object[] params = new Object[]{id};
        jdbcTemplate.update(sql, params);
    }

    /**
     * 列表
     *
     * @return
     */
    public List<Staff> list() {
        return jdbcTemplate.query("select * from staff", new BeanPropertyRowMapper<>(Staff.class));
    }

    /**
     * 根据id获取对象
     *
     * @param id
     * @return
     */
    public Staff get(int id) {
        String sql = "select * from staff where id=?";
        Object[] params = new Object[]{id};
        List<Staff> list = jdbcTemplate.query(sql, params, new BeanPropertyRowMapper<>(Staff.class));
        if (list.size() > 0)
            return list.get(0);
        else
            return null;
    }

}
