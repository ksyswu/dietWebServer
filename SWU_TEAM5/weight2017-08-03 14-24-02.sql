USE SWU_TEAM5;

CREATE TABLE `weight` (
  `DATE` datetime NOT NULL,
  `D_KG` varchar(20) DEFAULT NULL,
  `USER_ID` varchar(20) NOT NULL,
  PRIMARY KEY (`DATE`,`USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


insert into `weight`(`DATE`,`D_KG`,`USER_ID`) values ('2017-07-27 00:00:00','80','111');
insert into `weight`(`DATE`,`D_KG`,`USER_ID`) values ('2017-07-28 00:00:00','70','111');
insert into `weight`(`DATE`,`D_KG`,`USER_ID`) values ('2017-07-29 00:00:00','75','111');
insert into `weight`(`DATE`,`D_KG`,`USER_ID`) values ('2017-07-30 00:00:00','70','111');
insert into `weight`(`DATE`,`D_KG`,`USER_ID`) values ('2017-07-30 00:00:00','65','bbbb');
insert into `weight`(`DATE`,`D_KG`,`USER_ID`) values ('2017-07-31 00:00:00','50','bbbb');
insert into `weight`(`DATE`,`D_KG`,`USER_ID`) values ('2017-08-01 00:00:00','70','111');
insert into `weight`(`DATE`,`D_KG`,`USER_ID`) values ('2017-08-01 00:00:00','5','123');
insert into `weight`(`DATE`,`D_KG`,`USER_ID`) values ('2017-08-01 00:00:00','10','bbb');
insert into `weight`(`DATE`,`D_KG`,`USER_ID`) values ('2017-08-02 00:00:00','47','');
insert into `weight`(`DATE`,`D_KG`,`USER_ID`) values ('2017-08-02 00:00:00','50','1234');
insert into `weight`(`DATE`,`D_KG`,`USER_ID`) values ('2017-08-02 00:00:00','5000','12345');
insert into `weight`(`DATE`,`D_KG`,`USER_ID`) values ('2017-08-02 00:00:00','50','222');
insert into `weight`(`DATE`,`D_KG`,`USER_ID`) values ('2017-08-03 00:00:00','60','111');
