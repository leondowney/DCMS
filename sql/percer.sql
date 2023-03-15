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

 Date: 14/03/2023 11:43:18
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for percer
-- ----------------------------
DROP TABLE IF EXISTS `percer`;
CREATE TABLE `percer` (
  `id` int NOT NULL,
  `pid` int DEFAULT NULL,
  `cid` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `perid` (`pid`),
  KEY `cid` (`cid`),
  CONSTRAINT `cid` FOREIGN KEY (`cid`) REFERENCES `certification` (`id`),
  CONSTRAINT `perid` FOREIGN KEY (`pid`) REFERENCES `person` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of percer
-- ----------------------------
BEGIN;
INSERT INTO `percer` (`id`, `pid`, `cid`) VALUES (1, 1, 1);
INSERT INTO `percer` (`id`, `pid`, `cid`) VALUES (2, 1, 3);
INSERT INTO `percer` (`id`, `pid`, `cid`) VALUES (3, 1, 5);
INSERT INTO `percer` (`id`, `pid`, `cid`) VALUES (4, 2, 1);
INSERT INTO `percer` (`id`, `pid`, `cid`) VALUES (5, 2, 2);
INSERT INTO `percer` (`id`, `pid`, `cid`) VALUES (6, 2, 3);
INSERT INTO `percer` (`id`, `pid`, `cid`) VALUES (7, 2, 4);
INSERT INTO `percer` (`id`, `pid`, `cid`) VALUES (8, 2, 5);
INSERT INTO `percer` (`id`, `pid`, `cid`) VALUES (9, 3, 2);
INSERT INTO `percer` (`id`, `pid`, `cid`) VALUES (10, 3, 3);
INSERT INTO `percer` (`id`, `pid`, `cid`) VALUES (11, 4, 1);
INSERT INTO `percer` (`id`, `pid`, `cid`) VALUES (12, 4, 3);
INSERT INTO `percer` (`id`, `pid`, `cid`) VALUES (13, 4, 4);
INSERT INTO `percer` (`id`, `pid`, `cid`) VALUES (14, 4, 5);
INSERT INTO `percer` (`id`, `pid`, `cid`) VALUES (15, 5, 2);
INSERT INTO `percer` (`id`, `pid`, `cid`) VALUES (16, 5, 3);
INSERT INTO `percer` (`id`, `pid`, `cid`) VALUES (17, 6, 1);
INSERT INTO `percer` (`id`, `pid`, `cid`) VALUES (18, 6, 2);
INSERT INTO `percer` (`id`, `pid`, `cid`) VALUES (19, 6, 4);
INSERT INTO `percer` (`id`, `pid`, `cid`) VALUES (20, 6, 5);
INSERT INTO `percer` (`id`, `pid`, `cid`) VALUES (21, 7, 2);
INSERT INTO `percer` (`id`, `pid`, `cid`) VALUES (22, 8, 2);
INSERT INTO `percer` (`id`, `pid`, `cid`) VALUES (23, 8, 3);
INSERT INTO `percer` (`id`, `pid`, `cid`) VALUES (24, 8, 4);
INSERT INTO `percer` (`id`, `pid`, `cid`) VALUES (25, 9, 3);
INSERT INTO `percer` (`id`, `pid`, `cid`) VALUES (26, 9, 4);
INSERT INTO `percer` (`id`, `pid`, `cid`) VALUES (27, 10, 1);
INSERT INTO `percer` (`id`, `pid`, `cid`) VALUES (28, 10, 2);
INSERT INTO `percer` (`id`, `pid`, `cid`) VALUES (29, 10, 4);
INSERT INTO `percer` (`id`, `pid`, `cid`) VALUES (30, 10, 5);
INSERT INTO `percer` (`id`, `pid`, `cid`) VALUES (31, 11, 2);
INSERT INTO `percer` (`id`, `pid`, `cid`) VALUES (32, 11, 4);
INSERT INTO `percer` (`id`, `pid`, `cid`) VALUES (33, 11, 5);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
