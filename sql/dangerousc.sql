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

 Date: 13/03/2023 09:28:05
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for dangerousc
-- ----------------------------
DROP TABLE IF EXISTS `dangerousc`;
CREATE TABLE `dangerousc`  (
  `no` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `goods` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `time` date NULL DEFAULT NULL,
  `unit` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `person` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `tele` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `num` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `cid` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`no`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of dangerousc
-- ----------------------------
INSERT INTO `dangerousc` VALUES ('CN20171201', '工业盐酸销售合同', '工业盐酸', '2017-06-11', '太原化工生产厂', '李田保', '123456', '500吨', 1);
INSERT INTO `dangerousc` VALUES ('CN20171202', '硫酸销售合同', '硫酸', '2017-06-05', '太原化工生产厂', '李田保', '123456', '1000吨', 1);
INSERT INTO `dangerousc` VALUES ('CN20171203', '硫磺销售合同', '硫磺', '2017-05-23', '太原化工生产厂', '李田保', '123456', '1000吨', 1);
INSERT INTO `dangerousc` VALUES ('CN20171204', '氢氧化钾销售合同', '氢氧化钾', '2017-05-19', '太原化工生产厂', '李田保', '123456', '1000吨', 1);
INSERT INTO `dangerousc` VALUES ('CN20171205', '硝酸钾销售合同', '硝酸钾', '2017-05-12', '太原化工生产厂', '李田保', '123456', '1000吨', 1);
INSERT INTO `dangerousc` VALUES ('CN20171206', '尿素销售合同', '尿素', '2017-04-07', '太原化工生产厂', '李田保', '123456', '1000吨', 1);
INSERT INTO `dangerousc` VALUES ('CN20171207', '磷酸销售合同', '磷酸', '2017-02-01', '太原化工生产厂', '李田保', '123456', '1000吨', 1);

SET FOREIGN_KEY_CHECKS = 1;
