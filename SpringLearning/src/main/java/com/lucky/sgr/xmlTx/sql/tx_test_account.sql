create table account
(
    id      bigint auto_increment comment 'id'
        primary key,
    user_id bigint            null comment '用户id',
    total   decimal           null comment '总额度',
    used    decimal           null comment '已用余额',
    residue decimal default 0 null comment '剩余可用额度'
)
    charset = utf8;

INSERT INTO tx_test.account (id, user_id, total, used, residue) VALUES (1, 1, 1000, 0, 1000);
