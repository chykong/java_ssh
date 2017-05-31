/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50534
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50534
File Encoding         : 65001

Date: 2017-05-13 23:57:45
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `staff`
-- ----------------------------
DROP TABLE IF EXISTS `staff`;
CREATE TABLE `staff` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20220 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of staff
-- ----------------------------
