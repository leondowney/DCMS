/*
 Navicat Premium Data Transfer

 Source Server         : JAVA2205
 Source Server Type    : MySQL
 Source Server Version : 80031
 Source Host           : localhost:3306
 Source Schema         : dcms

 Target Server Type    : MySQL
 Target Server Version : 80031
 File Encoding         : 65001

 Date: 13/03/2023 10:07:21
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for companystroy
-- ----------------------------
DROP TABLE IF EXISTS `companystroy`;
CREATE TABLE `companystroy`  (
  `id` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '产品批次',
  `proName` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '产品名称',
  `proType` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '产品类型',
  `anotherName` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '别命名',
  `molecule` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '分子式',
  `nums` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '数量',
  `companyId` int(0) NULL DEFAULT NULL COMMENT '公司序列号',
  `proTime` date NULL DEFAULT NULL COMMENT '生产日期',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of companystroy
-- ----------------------------
INSERT INTO `companystroy` VALUES ('301020162360231', '工业盐酸', '第8.1类(酸性腐蚀品)', '氢氯酸', 'HCl', '100吨', 1, '2023-03-10');
INSERT INTO `companystroy` VALUES ('301020162360232', '硫酸', '8.1类(酸性腐蚀品)', '无', 'H2SO4', '500升', 2, '2023-03-13');

SET FOREIGN_KEY_CHECKS = 1;
