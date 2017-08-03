USE SWU_TEAM5;

CREATE TABLE `tjoin` (
  `USER_ID` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `USER_PW` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `CM` int(11) DEFAULT NULL,
  `KG` int(11) DEFAULT NULL,
  `H_KG` int(11) DEFAULT NULL,
  `WORD` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`USER_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


insert into `tjoin`(`USER_ID`,`USER_PW`,`CM`,`KG`,`H_KG`,`WORD`) values ('111','111',111,80,50,'111');
insert into `tjoin`(`USER_ID`,`USER_PW`,`CM`,`KG`,`H_KG`,`WORD`) values ('1234','1234',160,60,40,'');
insert into `tjoin`(`USER_ID`,`USER_PW`,`CM`,`KG`,`H_KG`,`WORD`) values ('222','222',160,55,40,'');
insert into `tjoin`(`USER_ID`,`USER_PW`,`CM`,`KG`,`H_KG`,`WORD`) values ('123','123',0,0,0,'');
insert into `tjoin`(`USER_ID`,`USER_PW`,`CM`,`KG`,`H_KG`,`WORD`) values ('bbb','bbb',40,40,40,'dsdfsfsdfsdf
sfsdf');
insert into `tjoin`(`USER_ID`,`USER_PW`,`CM`,`KG`,`H_KG`,`WORD`) values ('jjjj','',0,0,0,'');
insert into `tjoin`(`USER_ID`,`USER_PW`,`CM`,`KG`,`H_KG`,`WORD`) values ('sohyun4283','alsdk',155,55,45,'우와된다수정');
insert into `tjoin`(`USER_ID`,`USER_PW`,`CM`,`KG`,`H_KG`,`WORD`) values ('1111','33',0,0,0,'');
