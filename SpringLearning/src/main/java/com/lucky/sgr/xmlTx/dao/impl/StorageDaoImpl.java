package com.lucky.sgr.xmlTx.dao.impl;

import com.lucky.sgr.xmlTx.dao.StorageDao;
import com.lucky.sgr.xmlTx.entity.Storage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author：LuckySgr.
 * @date: 2022/2/28
 */
@Repository
public class StorageDaoImpl implements StorageDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Storage selectByProductId(String productId) {
        String sql = "select * from tx_test.storage where product_id = ?";
        Storage storage = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Storage.class), productId);
        return storage;
    }

    @Override
    public int decrease(Storage record) {
        String sql = "update tx_test.storage set used =? ,residue=? where product_id = ?";
        int update = jdbcTemplate.update(sql, record.getUsed(), record.getResidue(), record.getProductId());
        return update;
    }
}
