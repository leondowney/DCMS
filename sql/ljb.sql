/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3306
 Source Schema         : ku1

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 13/03/2023 09:28:51
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for ljb
-- ----------------------------
DROP TABLE IF EXISTS `ljb`;
CREATE TABLE `ljb`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cid` int(11) NULL DEFAULT NULL,
  `zid` int(11) NULL DEFAULT NULL,
  `date` date NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ljb
-- ----------------------------
INSERT INTO `ljb` VALUES (1, 1, 1, '2023-03-14');
INSERT INTO `ljb` VALUES (2, 2, 2, '2023-03-15');
INSERT INTO `ljb` VALUES (3, 1, 2, '2023-03-06');

SET FOREIGN_KEY_CHECKS = 1;
