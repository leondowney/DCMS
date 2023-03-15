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

 Date: 14/03/2023 11:43:37
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for experience
-- ----------------------------
DROP TABLE IF EXISTS `experience`;
CREATE TABLE `experience` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `start` date DEFAULT NULL,
  `end` date DEFAULT NULL,
  `addr` varchar(255) DEFAULT NULL,
  `experience` varchar(255) DEFAULT NULL,
  `pid` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `pid` (`pid`),
  KEY `addr` (`addr`),
  CONSTRAINT `pid` FOREIGN KEY (`pid`) REFERENCES `person` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of experience
-- ----------------------------
BEGIN;
INSERT INTO `experience` (`id`, `name`, `type`, `start`, `end`, `addr`, `experience`, `pid`) VALUES (1, '任职化工生产组长', '从业', '2016-03-14', NULL, '山西省太原市大宏化工有限责任公司', '管理生产线上的生产人员', 1);
INSERT INTO `experience` (`id`, `name`, `type`, `start`, `end`, `addr`, `experience`, `pid`) VALUES (2, '任职化工生产员', '从业', '2013-12-01', '2016-03-13', '山西省太原市大宏化工有限责任公司', '在生产车间生产化工产品', 1);
INSERT INTO `experience` (`id`, `name`, `type`, `start`, `end`, `addr`, `experience`, `pid`) VALUES (3, '学生', '教育', '2009-09-01', '2013-06-01', '太原市第五中学校', '学习', 1);
INSERT INTO `experience` (`id`, `name`, `type`, `start`, `end`, `addr`, `experience`, `pid`) VALUES (4, '学生', '教育', '2006-09-01', '2009-06-01', '太原市实验中学校', '学习', 1);
INSERT INTO `experience` (`id`, `name`, `type`, `start`, `end`, `addr`, `experience`, `pid`) VALUES (5, '任职化工生产组长', '从业', '2022-09-01', NULL, '山西省晋中市巴斯化工有限责任公司', '管理生产线上的生产人员', 2);
INSERT INTO `experience` (`id`, `name`, `type`, `start`, `end`, `addr`, `experience`, `pid`) VALUES (6, '任职化工生产员', '从业', '2020-09-01', '2022-06-01', '山西省晋中市巴斯化工有限责任公司', '在生产车间生产化工产品', 2);
INSERT INTO `experience` (`id`, `name`, `type`, `start`, `end`, `addr`, `experience`, `pid`) VALUES (7, '班长', '教育', '2016-09-01', '2020-06-01', '太原理工大学', '管理班级事务', 2);
INSERT INTO `experience` (`id`, `name`, `type`, `start`, `end`, `addr`, `experience`, `pid`) VALUES (8, '学生', '教育', '2013-09-01', '2016-06-01', '山西现代双语学校南校', '学习', 2);
INSERT INTO `experience` (`id`, `name`, `type`, `start`, `end`, `addr`, `experience`, `pid`) VALUES (9, '任职化工生产组长', '从业', '2022-09-01', NULL, '山西省大同市雪佛化工有限责任公司', '管理生产线上的生产人员', 3);
INSERT INTO `experience` (`id`, `name`, `type`, `start`, `end`, `addr`, `experience`, `pid`) VALUES (10, '任职化工生产员', '从业', '2020-09-01', '2022-06-01', '山西省大同市雪佛化工有限责任公司', '在生产车间生产化工产品', 3);
INSERT INTO `experience` (`id`, `name`, `type`, `start`, `end`, `addr`, `experience`, `pid`) VALUES (11, '班长', '教育', '2016-09-01', '2020-06-01', '山西大学', '管理班级事务', 3);
INSERT INTO `experience` (`id`, `name`, `type`, `start`, `end`, `addr`, `experience`, `pid`) VALUES (12, '学生', '教育', '2013-09-01', '2016-06-01', '太原师范学院附属中学', '学习', 3);
INSERT INTO `experience` (`id`, `name`, `type`, `start`, `end`, `addr`, `experience`, `pid`) VALUES (13, '任职化工生产组长', '从业', '2022-09-01', NULL, '山西省阳泉市阿克化工有限责任公司', '管理生产线上的生产人员', 4);
INSERT INTO `experience` (`id`, `name`, `type`, `start`, `end`, `addr`, `experience`, `pid`) VALUES (14, '任职化工生产员', '从业', '2020-09-01', '2022-06-01', '山西省阳泉市阿克化工有限责任公司', '在生产车间生产化工产品', 4);
INSERT INTO `experience` (`id`, `name`, `type`, `start`, `end`, `addr`, `experience`, `pid`) VALUES (15, '班长', '教育', '2016-09-01', '2020-06-01', '中北大学', '管理班级事务', 4);
INSERT INTO `experience` (`id`, `name`, `type`, `start`, `end`, `addr`, `experience`, `pid`) VALUES (16, '学生', '教育', '2013-09-01', '2016-06-01', '山西省实验中学', '学习', 4);
INSERT INTO `experience` (`id`, `name`, `type`, `start`, `end`, `addr`, `experience`, `pid`) VALUES (17, '任职化工生产组长', '从业', '2022-09-01', NULL, '山西省吕梁市苏诺化工有限责任公司', '管理生产线上的生产人员', 5);
INSERT INTO `experience` (`id`, `name`, `type`, `start`, `end`, `addr`, `experience`, `pid`) VALUES (18, '任职化工生产员', '从业', '2020-09-01', '2022-06-01', '山西省吕梁市苏诺化工有限责任公司', '在生产车间生产化工产品', 5);
INSERT INTO `experience` (`id`, `name`, `type`, `start`, `end`, `addr`, `experience`, `pid`) VALUES (19, '班长', '教育', '2016-09-01', '2020-06-01', '山西大学', '管理班级事务', 5);
INSERT INTO `experience` (`id`, `name`, `type`, `start`, `end`, `addr`, `experience`, `pid`) VALUES (20, '学生', '教育', '2013-09-01', '2016-06-01', '山西大学附属中学', '学习', 5);
INSERT INTO `experience` (`id`, `name`, `type`, `start`, `end`, `addr`, `experience`, `pid`) VALUES (21, '任职化工生产组长', '从业', '2022-09-01', NULL, '山西省运城市贝尔化工有限责任公司', '管理生产线上的生产人员', 6);
INSERT INTO `experience` (`id`, `name`, `type`, `start`, `end`, `addr`, `experience`, `pid`) VALUES (22, '任职化工生产员', '从业', '2020-09-01', '2022-06-01', '山西省运城市贝尔化工有限责任公司', '在生产车间生产化工产品', 6);
INSERT INTO `experience` (`id`, `name`, `type`, `start`, `end`, `addr`, `experience`, `pid`) VALUES (23, '班长', '教育', '2016-09-01', '2020-06-01', '山西财经大学', '管理班级事务', 6);
INSERT INTO `experience` (`id`, `name`, `type`, `start`, `end`, `addr`, `experience`, `pid`) VALUES (24, '学生', '教育', '2013-09-01', '2016-06-01', '太原师范学院附属中学', '学习', 6);
INSERT INTO `experience` (`id`, `name`, `type`, `start`, `end`, `addr`, `experience`, `pid`) VALUES (25, '任职化工生产组长', '从业', '2022-09-01', NULL, '山西省临汾市华泰化工有限责任公司', '管理生产线上的生产人员', 7);
INSERT INTO `experience` (`id`, `name`, `type`, `start`, `end`, `addr`, `experience`, `pid`) VALUES (26, '任职化工生产员', '从业', '2020-09-01', '2022-06-01', '山西省临汾市华泰化工有限责任公司', '在生产车间生产化工产品', 7);
INSERT INTO `experience` (`id`, `name`, `type`, `start`, `end`, `addr`, `experience`, `pid`) VALUES (27, '班长', '教育', '2016-09-01', '2020-06-01', '中北大学', '管理班级事务', 7);
INSERT INTO `experience` (`id`, `name`, `type`, `start`, `end`, `addr`, `experience`, `pid`) VALUES (28, '学生', '教育', '2013-09-01', '2016-06-01', '山西省实验中学', '学习', 7);
INSERT INTO `experience` (`id`, `name`, `type`, `start`, `end`, `addr`, `experience`, `pid`) VALUES (29, '任职化工生产组长', '从业', '2022-09-01', NULL, '山西省长治市神华化工有限责任公司', '管理生产线上的生产人员', 8);
INSERT INTO `experience` (`id`, `name`, `type`, `start`, `end`, `addr`, `experience`, `pid`) VALUES (30, '任职化工生产员', '从业', '2020-09-01', '2022-06-01', '山西省长治市神华化工有限责任公司', '在生产车间生产化工产品', 8);
INSERT INTO `experience` (`id`, `name`, `type`, `start`, `end`, `addr`, `experience`, `pid`) VALUES (31, '班长', '教育', '2016-09-01', '2020-06-01', '山西大学', '管理班级事务', 8);
INSERT INTO `experience` (`id`, `name`, `type`, `start`, `end`, `addr`, `experience`, `pid`) VALUES (32, '学生', '教育', '2013-09-01', '2016-06-01', '山西大学附属中学', '学习', 8);
INSERT INTO `experience` (`id`, `name`, `type`, `start`, `end`, `addr`, `experience`, `pid`) VALUES (33, '任职化工生产组长', '从业', '2022-09-01', NULL, '山西省晋城市索护化工有限责任公司', '管理生产线上的生产人员', 9);
INSERT INTO `experience` (`id`, `name`, `type`, `start`, `end`, `addr`, `experience`, `pid`) VALUES (34, '任职化工生产员', '从业', '2020-09-01', '2022-06-01', '山西省晋城市索护化工有限责任公司', '在生产车间生产化工产品', 9);
INSERT INTO `experience` (`id`, `name`, `type`, `start`, `end`, `addr`, `experience`, `pid`) VALUES (35, '班长', '教育', '2016-09-01', '2020-06-01', '山西财经大学', '管理班级事务', 9);
INSERT INTO `experience` (`id`, `name`, `type`, `start`, `end`, `addr`, `experience`, `pid`) VALUES (36, '学生', '教育', '2013-09-01', '2016-06-01', '太原师范学院附属中学', '学习', 9);
INSERT INTO `experience` (`id`, `name`, `type`, `start`, `end`, `addr`, `experience`, `pid`) VALUES (37, '任职化工生产组长', '从业', '2022-09-01', NULL, '山西省忻州市奇袭化工有限责任公司', '管理生产线上的生产人员', 10);
INSERT INTO `experience` (`id`, `name`, `type`, `start`, `end`, `addr`, `experience`, `pid`) VALUES (38, '任职化工生产员', '从业', '2020-09-01', '2022-06-01', '山西省忻州市奇袭化工有限责任公司', '在生产车间生产化工产品', 10);
INSERT INTO `experience` (`id`, `name`, `type`, `start`, `end`, `addr`, `experience`, `pid`) VALUES (39, '班长', '教育', '2016-09-01', '2020-06-01', '中北大学', '管理班级事务', 10);
INSERT INTO `experience` (`id`, `name`, `type`, `start`, `end`, `addr`, `experience`, `pid`) VALUES (40, '学生', '教育', '2013-09-01', '2016-06-01', '山西大学附属中学', '学习', 10);
INSERT INTO `experience` (`id`, `name`, `type`, `start`, `end`, `addr`, `experience`, `pid`) VALUES (41, '任职化工生产组长', '从业', '2022-09-01', NULL, '山西省朔州市天九化工有限责任公司', '管理生产线上的生产人员', 11);
INSERT INTO `experience` (`id`, `name`, `type`, `start`, `end`, `addr`, `experience`, `pid`) VALUES (42, '任职化工生产员', '从业', '2020-09-01', '2022-06-01', '山西省朔州市天九化工有限责任公司', '在生产车间生产化工产品', 11);
INSERT INTO `experience` (`id`, `name`, `type`, `start`, `end`, `addr`, `experience`, `pid`) VALUES (43, '班长', '教育', '2016-09-01', '2020-06-01', '山西大学', '管理班级事务', 11);
INSERT INTO `experience` (`id`, `name`, `type`, `start`, `end`, `addr`, `experience`, `pid`) VALUES (44, '学生', '教育', '2013-09-01', '2016-06-01', '山西省实验中学', '学习', 11);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
