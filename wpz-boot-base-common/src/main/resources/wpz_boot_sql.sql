CREATE TABLE `user` (
  `id` varchar(100) DEFAULT NULL,
  `name` varchar(10) DEFAULT NULL,
  `age` varchar(5) DEFAULT NULL,
  `sex` varchar(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表'

-- shuixins.t_user definition

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `user_id` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '用户id',
  `username` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '用户名/谁信号',
  `nickname` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '昵称',
  `password` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '密码',
  `phone_no` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '手机号',
  `tele_code` char(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '手机电信区号',
  `gender` tinyint(1) NOT NULL DEFAULT '0' COMMENT '性别 0女 1男',
  `img_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '头像地址',
  `cover_url` varchar(2000) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '封面地址',
  `sign` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '个性签名',
  `birth_day` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '出生日期',
  `country_area` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '国家地区',
  `id_no` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '身份证号',
  `location` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '位置',
  `default_device_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '设备id',
  `email` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '邮箱地址',
  `type` tinyint(1) DEFAULT '0' COMMENT '用户类型 0-游客 1-注册用户 2-官方账户 9-客服',
  `enable_state` tinyint(1) NOT NULL DEFAULT '1' COMMENT '0 停用 1正常 2 注销 7灰名单 8黑名单 9红名单 10 冻结',
  `create_time` bigint(20) DEFAULT NULL COMMENT '创建时间',
  `update_date` bigint(20) DEFAULT NULL COMMENT '更新时间',
  `delete_time` bigint(20) DEFAULT NULL COMMENT '删除时间',
  `remark` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '备注',
  `verify_id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '最近一次审核id',
  `verify_time` bigint(20) DEFAULT NULL COMMENT '最近一次审核时间',
  `phone_type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '手机类型 苹果 安卓',
  `education` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '学历',
  `constellation` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '星座',
  `online_status` tinyint(1) DEFAULT '0' COMMENT '是否在线 0-不在线 1-在线',
  `last_login_time` bigint(20) DEFAULT NULL COMMENT '最近登录时间',
  `long_phone_no` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '国际区号加电话号码',
  `msg_switch` tinyint(4) NOT NULL DEFAULT '0' COMMENT ' 消息状态开关：1开启，0不开启',
  `follow_switch` tinyint(4) DEFAULT NULL COMMENT '1-允许关注   0-不允许关注',
  `agent_flag` tinyint(4) DEFAULT NULL COMMENT '1-注册不成功（仅在谁信注册完成 代理商未完成注册）',
  `plaza_news_switch` tinyint(4) DEFAULT '0' COMMENT '广场动态状态   0 关闭隐藏动态  1.开启隐藏动态  ',
  `dynamic_range` tinyint(4) DEFAULT '0' COMMENT '动态范围 0.全部 ；1.最近三天；2.近一个月；3.最近半年 ',
  `trade_switch` tinyint(4) DEFAULT '0' COMMENT '交易通知提醒免打扰  0.不启用 1.开启免打扰',
  `user_source` tinyint(2) DEFAULT NULL COMMENT '用户来源 1：代理商1.0  2：代理商2.0 3：盛迪嘉钱包 4：谁信APP 5：运营后台  6：谁信拉新活动 I 期—盛迪嘉钱包 7：谁信拉新活动 I 期—公众号 ',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE KEY `username` (`username`) USING BTREE COMMENT '谁信号唯一约束',
  UNIQUE KEY `username_2` (`username`) USING BTREE COMMENT '谁信号唯一约束',
  KEY `index_user_id` (`user_id`),
  KEY `ix_create_time` (`create_time`)
) ENGINE=InnoDB AUTO_INCREMENT=609484067423002625 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin ROW_FORMAT=DYNAMIC;