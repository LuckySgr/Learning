create table storage
(
    id         bigint auto_increment
        primary key,
    product_id bigint null comment '产品id',
    total      int    null comment '总库存',
    used       int    null comment '已用库存',
    residue    int    null comment '剩余库存'
)
    charset = utf8;

INSERT INTO tx_test.storage (id, product_id, total, used, residue) VALUES (1, 1, 100, 0, 100);
