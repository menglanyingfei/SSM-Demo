# noinspection SqlNoDataSourceInspectionForFile

DROP TABLE IF EXISTS `user`;
  
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,  
  `user_name` varchar(40) NOT NULL,  
  `password` varchar(255) NOT NULL,  
  `age` int(4) NOT NULL,  
  PRIMARY KEY (`id`)  
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;  
  
/* Data for the table `user` */
  
insert  into `user`(`id`,`user_name`,`password`,`age`) values (1,'小阳','666',21);


