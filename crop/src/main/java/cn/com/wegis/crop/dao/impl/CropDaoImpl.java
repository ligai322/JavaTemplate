package cn.com.wegis.crop.dao.impl;

import cn.com.wegis.crop.dao.CropDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CropDaoImpl implements CropDao {

    @Autowired
    JdbcTemplate  jdbcTemplate;

    public List getRecord() {
        String sql = "select * from tc_gis_base_layer";
        List list = jdbcTemplate.queryForList(sql);
        return list;
    }
}
