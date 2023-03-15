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

 Date: 14/03/2023 11:43:10
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `id` int NOT NULL,
  `num` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `age` int DEFAULT NULL,
  `num01` varchar(255) DEFAULT NULL,
  `addr` varchar(255) DEFAULT NULL,
  `tele` varchar(255) DEFAULT NULL,
  `num02` varchar(255) DEFAULT NULL,
  `company` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `oper` int DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `company` (`company`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of person
-- ----------------------------
BEGIN;
INSERT INTO `person` (`id`, `num`, `name`, `sex`, `age`, `num01`, `addr`, `tele`, `num02`, `company`, `oper`, `url`) VALUES (1, '5115231970020363215', '李和平', '男', 50, 's2013021365', '太原市', '13612302321', 'sn23611245663', '山西省太原市大宏化工有限责任公司', 1, 'img/avatar/1.jpg');
INSERT INTO `person` (`id`, `num`, `name`, `sex`, `age`, `num01`, `addr`, `tele`, `num02`, `company`, `oper`, `url`) VALUES (2, '513701199205027315', '张洁', '女', 36, 's2013021325', '晋中市', '18140127263', 'sn23612536210', '山西省晋中市巴斯化工有限责任公司', 1, 'img/avatar/2.jpg');
INSERT INTO `person` (`id`, `num`, `name`, `sex`, `age`, `num01`, `addr`, `tele`, `num02`, `company`, `oper`, `url`) VALUES (3, '513701195824575541', '李静', '女', 35, 's2013021468', '大同市', '15908478223', 'sn23612556788', '山西省大同市雪佛化工有限责任公司', 1, 'img/avatar/3.jpg');
INSERT INTO `person` (`id`, `num`, `name`, `sex`, `age`, `num01`, `addr`, `tele`, `num02`, `company`, `oper`, `url`) VALUES (4, '511523197002036594', '陈旭梅', '女', 25, 's2013021986', '阳泉市', '15325468748', 'sn23612455658', '山西省阳泉市阿克化工有限责任公司', 1, 'img/avatar/4.jpg');
INSERT INTO `person` (`id`, `num`, `name`, `sex`, `age`, `num01`, `addr`, `tele`, `num02`, `company`, `oper`, `url`) VALUES (5, '511523197002033569', '李雪梅', '女', 33, 's2013021315', '吕梁市', '18936525456', 'sn23612536256', '山西省吕梁市苏诺化工有限责任公司', 1, 'img/avatar/5.jpg');
INSERT INTO `person` (`id`, `num`, `name`, `sex`, `age`, `num01`, `addr`, `tele`, `num02`, `company`, `oper`, `url`) VALUES (6, '511523197002033658', '姜鹤', '男', 48, 's2013021789', '运城市', '13652458543', 'sn23612556353', '山西省运城市贝尔化工有限责任公司', 1, 'img/avatar/6.jpg');
INSERT INTO `person` (`id`, `num`, `name`, `sex`, `age`, `num01`, `addr`, `tele`, `num02`, `company`, `oper`, `url`) VALUES (7, '511523197002039685', '何辉', '男', 24, 's2013021333', '临汾市', '18140128563', 'sn23612596584', '山西省临汾市华泰化工有限责任公司', 1, 'img/avatar/7.jpg');
INSERT INTO `person` (`id`, `num`, `name`, `sex`, `age`, `num01`, `addr`, `tele`, `num02`, `company`, `oper`, `url`) VALUES (8, '511523197002056324', '李欢', '女', 29, 's2013021689', '长治市', '18963542332', 'sn23612569585', '山西省长治市神华化工有限责任公司', 1, 'img/avatar/8.jpg');
INSERT INTO `person` (`id`, `num`, `name`, `sex`, `age`, `num01`, `addr`, `tele`, `num02`, `company`, `oper`, `url`) VALUES (9, '511523197002068975', '但光明', '男', 35, 's2013021325', '晋城市', '18956523654', 'sn23612538856', '山西省晋城市索护化工有限责任公司', 1, 'img/avatar/9.jpg');
INSERT INTO `person` (`id`, `num`, `name`, `sex`, `age`, `num01`, `addr`, `tele`, `num02`, `company`, `oper`, `url`) VALUES (10, '511523197002034687', '何刚', '男', 25, 's2013021785', '忻州市', '18140158963', 'sn23612536365', '山西省忻州市奇袭化工有限责任公司', 1, 'img/avatar/10.jpg');
INSERT INTO `person` (`id`, `num`, `name`, `sex`, `age`, `num01`, `addr`, `tele`, `num02`, `company`, `oper`, `url`) VALUES (11, '511523197002034865', '李卫平', '男', 27, 's2013021325', '朔州市', '13612302321', 'sn23612538569', '山西省朔州市天九化工有限责任公司', 1, 'img/avatar/11.jpg');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
