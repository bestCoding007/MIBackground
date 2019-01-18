/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50506
Source Host           : localhost:3306
Source Database       : midb

Target Server Type    : MYSQL
Target Server Version : 50506
File Encoding         : 65001

Date: 2019-01-03 08:47:25
*/
drop database  if exists `midb`;
create database `midb`;

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `administrator`
-- ----------------------------
DROP TABLE IF EXISTS `administrator`;
CREATE TABLE `administrator` (
  `administratorId` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `administratorName` varchar(100) DEFAULT NULL COMMENT '姓名',
  `administratorUsername` varchar(100) DEFAULT NULL COMMENT '用户名',
  `administratorPassword` varchar(100) DEFAULT NULL COMMENT '密码',
  `administratorNewPassword` varchar(100) DEFAULT NULL COMMENT '密码',
  `administratorPhoto` varchar(200) DEFAULT NULL COMMENT '用户头像',
  PRIMARY KEY (`administratorId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of administrator
-- ----------------------------
INSERT INTO `administrator` VALUES ('1', '超级管理员', 'admin', '202cb962ac59075b964b07152d234b70', '202cb962ac59075b964b07152d234b70', '../img/administrator.jpg');
INSERT INTO `administrator` VALUES ('3', '123', 'jack', '21218cca77804d2ba1922c33e0151105', '21218cca77804d2ba1922c33e0151105', null);
INSERT INTO `administrator` VALUES ('4', '陈司机', 'Driver_Chen', '05052ab3fe7ba4e0a8eb566d80e4fede', '05052ab3fe7ba4e0a8eb566d80e4fede', null);

-- ----------------------------
-- Table structure for `lineitem`
-- ----------------------------
DROP TABLE IF EXISTS `lineitem`;
CREATE TABLE `lineitem` (
  `lineId` int(11) NOT NULL COMMENT '订单项目编号',
  `userId` int(11) DEFAULT NULL COMMENT '用户编号',
  `productId` int(11) DEFAULT NULL COMMENT '商品编号',
  `orderId` int(11) DEFAULT NULL COMMENT '订单编号',
  `newPrice` decimal(10,2) DEFAULT NULL COMMENT '商品单价',
  `productNumber` int(11) DEFAULT NULL COMMENT '商品数量',
  `productCount` decimal(10,2) DEFAULT NULL COMMENT '商品总价',
  `shopId` int(11) DEFAULT NULL COMMENT '订单来源店铺编号',
  `orderOtherId` int(11) DEFAULT NULL COMMENT '订单来源卖家编号',
  `quantity` int(11) DEFAULT NULL COMMENT '订单项数目',
  `unitPrice` decimal(10,2) DEFAULT NULL COMMENT '该订单价格',
  PRIMARY KEY (`lineId`),
  KEY `userId` (`userId`),
  KEY `orderId` (`orderId`),
  KEY `shopId` (`shopId`),
  KEY `lineitem_ibfk_2` (`productId`),
  CONSTRAINT `lineitem_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `users` (`userid`),
  CONSTRAINT `lineitem_ibfk_2` FOREIGN KEY (`productId`) REFERENCES `productclass` (`catId`),
  CONSTRAINT `lineitem_ibfk_3` FOREIGN KEY (`orderId`) REFERENCES `userorder` (`orderId`),
  CONSTRAINT `lineitem_ibfk_4` FOREIGN KEY (`shopId`) REFERENCES `shopinfo` (`shopId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of lineitem
-- ----------------------------

-- ----------------------------
-- Table structure for `product`
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `productId` int(11) NOT NULL AUTO_INCREMENT,
  `catId` int(11) DEFAULT NULL COMMENT '商品类别编号',
  `productName` varchar(200) DEFAULT NULL COMMENT '商品名称',
  `oldPrice` decimal(10,2) DEFAULT NULL COMMENT '市场价格',
  `productPhoto` varchar(200) DEFAULT NULL COMMENT '图片',
  `productDesc` text COMMENT '商品简介',
  `productCount` int(11) DEFAULT NULL COMMENT '库存量',
  `shopId` int(11) DEFAULT NULL COMMENT '店面编号',
  `productColor` varchar(50) DEFAULT NULL COMMENT '颜色',
  `isNewProduct` int(11) DEFAULT NULL COMMENT '是否新品',
  `isHotProduct` int(11) DEFAULT NULL COMMENT '是否热门',
  PRIMARY KEY (`productId`),
  KEY `shopId` (`shopId`),
  KEY `FK_ID` (`catId`),
  CONSTRAINT `FK_ID` FOREIGN KEY (`catId`) REFERENCES `productclass` (`catId`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `product_ibfk_1` FOREIGN KEY (`shopId`) REFERENCES `shopinfo` (`shopId`)
) ENGINE=InnoDB AUTO_INCREMENT=128 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('1', '1', '小米8 青春版', '1399.00', '1.jpg', '潮流镜面渐变色，自拍旗舰', '1000', '1', '黑', '1', '1');
INSERT INTO `product` VALUES ('2', '2', '红米6A', '569.00', '2.jpg', '好用好看不贵', '1000', '1', '红', '1', '0');
INSERT INTO `product` VALUES ('3', '3', '小米6X', '1299.00', '3.jpg', '轻薄美观的拍照手机', '1000', '1', '宝石蓝', '1', '1');
INSERT INTO `product` VALUES ('4', '1', '小米8 SE', '1499.00', '4.jpg', '三星 AMOLED 全面屏', '1000', '1', '玫瑰红', '0', '1');
INSERT INTO `product` VALUES ('6', '1', '黑鲨游戏手机 Helo', '3199.00', '6.jpg', '双液冷，更能打', '1000', '1', '暗红', '1', '1');
INSERT INTO `product` VALUES ('7', '1', '红米6', '699.00', '7.jpg', 'AI双摄 高颜值大电量', '1000', '1', '暗红', '1', '1');
INSERT INTO `product` VALUES ('8', '2', '小米电视4A 32英寸', '899.00', '8.jpg', '人工智能系统，高清液晶屏', '1000', '1', '银', '0', '0');
INSERT INTO `product` VALUES ('9', '12', '红米6 Pro', '813.00', '45642df3c2fa4e31be31403d9641ab79.jpeg', 'AI双摄 高颜值大电量', '1000', '1', '樱花粉', '1', '1');
INSERT INTO `product` VALUES ('10', '10', '小米MIX 3', '3599.00', '11.jpg', ' 磁动力滑盖全面屏丨前后旗舰 AI 双摄 四曲面彩色陶瓷机身丨故宫特别版', '1000', '1', '宝石蓝', '1', '1');
INSERT INTO `product` VALUES ('11', '7', '红米Note 5', '839.00', '802a816fa2c644feb993bddb2efbb0f9.jpeg', 'AI双摄 暗红逆光更出色', '1000', '1', '红', '0', '0');
INSERT INTO `product` VALUES ('21', '10', '小米MIx 2S', '2899.00', '35e51591213e4c23b77bee641a095410.jpeg', '骁龙 845 旗舰处理器 |......', '1000', '1', '炫酷黑', '0', '0');
INSERT INTO `product` VALUES ('22', '11', '小米Max 3', '1599.00', '8ed33c1eea5749d99b48d74537d43ae2.jpeg', '巨无霸级全面屏，充电宝级大电量', '1000', '1', '黑', '1', '1');
INSERT INTO `product` VALUES ('23', '11', '小米平板4 / 小米平板4 Plus', '1399.00', '34e32fc4eca84e48a79cb99b43aad1ae.jpeg', '大电量，超长续航 / 支持AI人脸识别 / 后置1300万，前置500万摄像头 / 金属机身，超窄边框 / 骁龙660八核处理器', '1000', '1', '象牙白', '1', '1');
INSERT INTO `product` VALUES ('126', '10', '小米Play', '1099.00', '74a422d57a5f4a92963986e6fb7ab2eb.jpeg', '内含高速流量 10GB/月 | 高颜值流光渐变色  5.84” 小水滴全面屏 | 八核高性能处理器', '1000', '1', '梦幻蓝', '1', '1');
INSERT INTO `product` VALUES ('127', '10', '小米Play', '1099.00', '3f693f28c9754e8daeaa059131a3a024.jpeg', '内含高速流量 10GB/月 | 高颜值流光渐变色  5.84” 小水滴全面屏 | 八核高性能处理器', '1000', '1', '黑', '1', '1');

-- ----------------------------
-- Table structure for `productclass`
-- ----------------------------
DROP TABLE IF EXISTS `productclass`;
CREATE TABLE `productclass` (
  `catId` int(11) NOT NULL COMMENT '类别编号',
  `catName` varchar(200) DEFAULT NULL COMMENT '类别名称',
  PRIMARY KEY (`catId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of productclass
-- ----------------------------
INSERT INTO `productclass` VALUES ('1', '红米-mix系列');
INSERT INTO `productclass` VALUES ('2', '红米-max系列');
INSERT INTO `productclass` VALUES ('3', '小米-note系列-移动版');
INSERT INTO `productclass` VALUES ('4', '小米-note系列-联通版');
INSERT INTO `productclass` VALUES ('5', '小米-note系列-电信版');
INSERT INTO `productclass` VALUES ('6', '小米-note系列-全网通低配');
INSERT INTO `productclass` VALUES ('7', '小米-note系列-全网通高配');
INSERT INTO `productclass` VALUES ('8', '小米-note系列-双网通低配');
INSERT INTO `productclass` VALUES ('9', '小米-note系列-双网通高配');
INSERT INTO `productclass` VALUES ('10', '小米-mix系列');
INSERT INTO `productclass` VALUES ('11', '小米-max系列');
INSERT INTO `productclass` VALUES ('12', '红米-pro系列');

-- ----------------------------
-- Table structure for `shopinfo`
-- ----------------------------
DROP TABLE IF EXISTS `shopinfo`;
CREATE TABLE `shopinfo` (
  `shopId` int(11) NOT NULL COMMENT '店面编号',
  `shopName` varchar(200) DEFAULT NULL COMMENT '店面名字',
  `userId` int(11) DEFAULT NULL COMMENT '用户编号',
  `uName` varchar(200) DEFAULT NULL COMMENT '评论者姓名',
  `userComment` text COMMENT '用户评价',
  `merchant` text COMMENT '商家回复',
  `shopAddress` text COMMENT '店面地址',
  PRIMARY KEY (`shopId`),
  KEY `userId` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of shopinfo
-- ----------------------------
INSERT INTO `shopinfo` VALUES ('1', '神光', '1', 'tom', '手机真的不错', '谢谢', '广东省珠海市');

-- ----------------------------
-- Table structure for `userinfo`
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `userInfoId` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户评论编号',
  `userId` int(11) DEFAULT NULL COMMENT '用户编号',
  `uName` varchar(100) DEFAULT NULL COMMENT '评论者姓名',
  `userComment` text COMMENT '评价',
  `userNewComment` text COMMENT '最新评论',
  `userTime` varchar(200) DEFAULT NULL COMMENT '评论时间',
  `merchant` varchar(200) DEFAULT NULL COMMENT '商家评论',
  PRIMARY KEY (`userInfoId`),
  KEY `userId` (`userId`),
  CONSTRAINT `userinfo_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `users` (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
INSERT INTO `userinfo` VALUES ('1', '1', 'jack', '这个商品很不错哦，推荐购买', '使用流畅', '2018-11-20 11:22:33', '谢谢支持');
INSERT INTO `userinfo` VALUES ('2', '2', 'tom', '商品不错', '使用方便', '2018-11-21', '谢谢');
INSERT INTO `userinfo` VALUES ('3', '3', 'make', '很好用', '手机外形很酷，使用流畅', '2018-11-22', '谢谢买家的支持');

-- ----------------------------
-- Table structure for `usermoneyinfo`
-- ----------------------------
DROP TABLE IF EXISTS `usermoneyinfo`;
CREATE TABLE `usermoneyinfo` (
  `userMoneyId` int(11) NOT NULL COMMENT '用户支付编号',
  `userId` int(11) DEFAULT NULL COMMENT '用户编号',
  `orderPayment` int(11) DEFAULT NULL COMMENT '支付方式',
  `orderTotalPrice` decimal(10,2) DEFAULT NULL COMMENT '商品总价',
  `payMoney` decimal(10,2) DEFAULT NULL COMMENT '支付总价',
  `payTime` varchar(100) DEFAULT NULL COMMENT '支付时间',
  `orderOtherId` int(11) DEFAULT NULL COMMENT '订单来源卖家编号',
  PRIMARY KEY (`userMoneyId`),
  KEY `userId` (`userId`),
  KEY `orderOtherId` (`orderOtherId`),
  CONSTRAINT `usermoneyinfo_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `users` (`userid`),
  CONSTRAINT `usermoneyinfo_ibfk_2` FOREIGN KEY (`orderOtherId`) REFERENCES `userorder` (`orderId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of usermoneyinfo
-- ----------------------------

-- ----------------------------
-- Table structure for `userorder`
-- ----------------------------
DROP TABLE IF EXISTS `userorder`;
CREATE TABLE `userorder` (
  `orderId` int(11) NOT NULL COMMENT '订单编号',
  `userId` int(11) DEFAULT NULL COMMENT '订购人（用户）',
  `orderTime` varchar(200) DEFAULT NULL COMMENT '订单创建日期',
  `orderReName` varchar(50) DEFAULT NULL COMMENT '订单接收人姓名',
  `orderReAddress` text COMMENT '订单接收地址',
  `orderEmail` varchar(50) DEFAULT NULL COMMENT '订单邮编',
  `orderPhone` varchar(50) DEFAULT NULL COMMENT '订单人联系方式',
  `orderAction` varchar(50) DEFAULT NULL COMMENT '订单运送方式',
  `orderMoney` decimal(10,2) DEFAULT NULL COMMENT '订单运费',
  `orderTotalPrice` decimal(10,2) DEFAULT NULL COMMENT '订单总价',
  `orderPayment` varchar(100) DEFAULT NULL COMMENT '支付方式',
  `statu` int(11) DEFAULT '0' COMMENT '未处理0	 已处理1 已发货2',
  PRIMARY KEY (`orderId`),
  KEY `userId` (`userId`),
  CONSTRAINT `userorder_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `users` (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userorder
-- ----------------------------

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `userId` int(11) NOT NULL DEFAULT '0',
  `uName` varchar(100) DEFAULT NULL COMMENT '姓名',
  `passWord` varchar(50) DEFAULT NULL COMMENT '密码',
  `userLevel` int(11) DEFAULT NULL COMMENT '用户级别',
  `userTime` date DEFAULT NULL COMMENT '注册时间',
  `userSex` varchar(4) DEFAULT '男' COMMENT '性别',
  `userAge` int(11) DEFAULT NULL COMMENT '年龄',
  `userPhone` varchar(50) DEFAULT NULL COMMENT '手机',
  `userAddress` varchar(200) DEFAULT NULL COMMENT '地址',
  `userEmail` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `userPhoto` varchar(200) DEFAULT NULL COMMENT '照片',
  `nickname` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'jack', 'e10adc3949ba59abbe56e057f20f883e', '1', '2013-10-02', '男', '24', '12433637584', '广东省珠海市香洲区', '13243535364@qq.com', 'user1.jpg', 'JOJO');
INSERT INTO `users` VALUES ('2', 'tom', 'e10adc3949ba59abbe56e057f20f883e', '1', '2015-04-22', '男', '18', '1243527584', '广东省珠海市斗门区', '13253245364@qq.com', 'user2.jpg', '素还真');
INSERT INTO `users` VALUES ('3', 'make', 'e10adc3949ba59abbe56e057f20f883e', '1', '2017-12-18', '男', '32', '1753637580', '广东省珠海市前山', '1324525364@qq.com', 'user3.jpg', '弃天帝');
