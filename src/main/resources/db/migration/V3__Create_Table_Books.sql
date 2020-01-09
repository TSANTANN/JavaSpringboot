CREATE TABLE `book` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `author` longtext NULL,
  `launch_date` datetime(6) NOT NULL,
  `price` decimal(65,2) NOT NULL,
  `title` longtext NULL,
   PRIMARY KEY (`id`)
)  ENGINE=InnoDb AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;