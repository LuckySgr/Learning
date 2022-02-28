create table `order`
(
    id         bigint auto_increment
        primary key,
    order_id   varchar(200) not null,
    user_id    varchar(200) not null comment '用户id',
    product_id varchar(200) not null comment '产品id',
    count      int          null comment '数量',
    money      decimal(11)  null comment '金额',
    status     int          null comment '订单状态：0：创建中；1：已完结'
)
    charset = utf8;

