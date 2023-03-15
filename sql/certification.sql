/*
 Navicat Premium Data Transfer

 Source Server         : leondowney
 Source Server Type    : MySQL
 Source Server Version : 80032 (8.0.32)
 Source Host           : localhost:3306
 Source Schema         : dc

 Target Server Type    : MySQL
 Target Server Version : 80032 (8.0.32)
 File Encoding         : 65001

 Date: 14/03/2023 11:43:54
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for certification
-- ----------------------------
DROP TABLE IF EXISTS `certification`;
CREATE TABLE `certification` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of certification
-- ----------------------------
BEGIN;
INSERT INTO `certification` (`id`, `name`, `url`) VALUES (1, '危险化学品经营许可证', 'img/certification/1.jpeg');
INSERT INTO `certification` (`id`, `name`, `url`) VALUES (2, '危险化学品登记证', 'img/certification/2.jpeg');
INSERT INTO `certification` (`id`, `name`, `url`) VALUES (3, '危险化学品特种作业证', 'img/certification/3.jpeg');
INSERT INTO `certification` (`id`, `name`, `url`) VALUES (4, '危险化学品安全合格证', 'img/certification/4.jpeg');
INSERT INTO `certification` (`id`, `name`, `url`) VALUES (5, '道路危险运输货物许可证', 'img/certification/5.jpeg');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
