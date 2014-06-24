/*
Navicat SQLite Data Transfer

Source Server         : mySqLite
Source Server Version : 30714
Source Host           : :0

Target Server Type    : SQLite
Target Server Version : 30714
File Encoding         : 65001

Date: 2014-06-24 14:35:22
*/

PRAGMA foreign_keys = OFF;

-- ----------------------------
-- Table structure for BEWDKL07
-- ----------------------------
DROP TABLE IF EXISTS "BEWDKL07";
CREATE TABLE "BEWDKL07" (
"NR"  NUMBER(12) NOT NULL,
"KENMDT07_NR"  INTEGER NOT NULL,
"BEWOPE07_NR"  NUMBER(12) NOT NULL,
"ERFASSUNGSDATUM"  DATE NOT NULL,
"MITAPE07_NR"  NUMBER(12) NOT NULL,
"ENDEDATUM"  DATE,
"ENDE_MITAPE07_NR"  NUMBER(12),
"KOERPERSTELLE"  VARCHAR2(200),
"KOERPERSTELLE_CODE"  INTEGER NOT NULL,
"GROESSE1"  INTEGER,
"GROESSE2"  INTEGER,
"TIEFE"  INTEGER,
"BEMERKUNG"  VARCHAR2(2000),
"ENTSTEHUNG"  VARCHAR2(1),
"KENDEK07_NR"  INTEGER,
"KENWUN07_NR"  INTEGER,
"DEKUBITUSNR"  NUMBER(12) NOT NULL,
PRIMARY KEY ("NR" ASC, "KENMDT07_NR" ASC)
)

;

-- ----------------------------
-- Records of BEWDKL07
-- ----------------------------
BEGIN;
INSERT INTO "BEWDKL07" VALUES (96, 1, 658, '2013-07-09 00:00:00.0', 7, null, null, 'Kreuzbein', 0, 40, 50, 2, null, 9, 102, 18, 1);
INSERT INTO "BEWDKL07" VALUES (94, 1, 650, '2013-04-10 00:00:00.0', 7, null, null, 'Schulter hinten rechts', 0, 1, 1, null, null, 6, 104, 18, 4);
INSERT INTO "BEWDKL07" VALUES (89, 1, 650, '2012-12-05 00:00:00.0', 29, null, null, 'Schulterblatt unten links', 0, 5, 5, 5, null, 6, 104, 18, 2);
INSERT INTO "BEWDKL07" VALUES (88, 1, 650, '2012-12-03 00:00:00.0', 29, null, null, 'Gesäß rechts', 0, 5, 5, 5, null, 6, 103, 18, 1);
INSERT INTO "BEWDKL07" VALUES (97, 1, 648, '2013-11-28 00:00:00.0', 7, null, null, 'Analfalte', 0, 1, 2, 1, null, 9, 103, 18, 1);
INSERT INTO "BEWDKL07" VALUES (81, 1, 645, '2012-10-15 00:00:00.0', 7, null, null, 'Kreuzbein', 0, 296, null, null, null, 9, 103, 18, 1);
INSERT INTO "BEWDKL07" VALUES (77, 1, 643, '2012-09-26 00:00:00.0', 37, null, null, 'Schulterblatt oben links', 0, 20, 10, 2, null, 6, 102, 18, 1);
INSERT INTO "BEWDKL07" VALUES (98, 1, 641, '2013-12-03 00:00:00.0', 7, null, null, 'Analfalte', 0, 3, 2, 1, null, 9, 103, 18, 1);
INSERT INTO "BEWDKL07" VALUES (40, 1, 639, '2012-03-23 00:00:00.0', 29, null, null, 'Schulterblatt oben links', 0, 2, null, null, null, 6, 77, 14, 1);
INSERT INTO "BEWDKL07" VALUES (69, 1, 638, '2012-06-29 00:00:00.0', 7, null, null, 'Kreuzbein', 0, 10, 5, null, null, 9, 56, 13, 2);
INSERT INTO "BEWDKL07" VALUES (66, 1, 638, '2012-06-22 00:00:00.0', 29, null, null, 'Wirbelsäule', 0, 28, null, null, null, 6, 56, 13, 1);
INSERT INTO "BEWDKL07" VALUES (43, 1, 627, '2012-03-21 00:00:00.0', 37, null, null, 'Schulterblatt oben links', 0, 60, null, null, null, 6, 55, 13, 1);
INSERT INTO "BEWDKL07" VALUES (59, 1, 623, '2012-05-04 00:00:00.0', 29, null, null, 'Kreuzbein', 0, 1095, null, 5, null, 6, 55, 13, 1);
INSERT INTO "BEWDKL07" VALUES (38, 1, 604, '2012-03-21 00:00:00.0', 29, null, null, 'Schienbein rechts', 0, 10, 5, 1, null, 9, 90, 16, 1);
INSERT INTO "BEWDKL07" VALUES (47, 1, 602, '2012-03-29 00:00:00.0', 7, null, null, 'Großer Rollhügel links', 0, 1330, null, null, null, 9, 56, 13, 1);
INSERT INTO "BEWDKL07" VALUES (39, 1, 586, '2012-03-21 00:00:00.0', 29, null, null, 'Hand außen rechts', 0, 2, 4, null, null, 6, 55, 13, 1);
INSERT INTO "BEWDKL07" VALUES (49, 1, 585, '2012-03-29 00:00:00.0', 13, null, null, 'Kniekehle rechts', 0, 2, 2, 2, null, null, 55, 13, 1);
INSERT INTO "BEWDKL07" VALUES (41, 1, 582, '2012-03-23 00:00:00.0', 29, null, null, 'Schädelansatz', 0, 0, null, null, null, 6, 55, 13, 1);
INSERT INTO "BEWDKL07" VALUES (60, 1, 574, '2012-05-07 00:00:00.0', 29, null, null, 'Wirbelsäule', 0, 6, null, null, null, null, 55, 13, 1);
INSERT INTO "BEWDKL07" VALUES (42, 1, 563, '2012-03-20 00:00:00.0', 13, null, null, 'Schulterblatt oben rechts', 0, 50, null, null, null, 6, 55, 13, 1);
INSERT INTO "BEWDKL07" VALUES (82, 1, 561, '2012-10-16 00:00:00.0', 13, null, null, 'Oberschenkel hinten rechts', 0, 2, 2, 1, null, 9, 103, 18, 2);
INSERT INTO "BEWDKL07" VALUES (46, 1, 561, '2012-03-29 00:00:00.0', 7, null, null, 'Schienbein rechts', 0, 2883, null, null, null, 9, 91, 16, 1);
INSERT INTO "BEWDKL07" VALUES (80, 1, 540, '2012-10-04 00:00:00.0', 13, null, null, 'Oberschenkel hinten rechts', 0, 2, 2, 1, null, null, 103, 18, 4);
INSERT INTO "BEWDKL07" VALUES (62, 1, 540, '2012-05-07 00:00:00.0', 29, null, null, 'Schulterblatt unten rechts', 0, 15, null, null, null, 6, 55, 13, 3);
INSERT INTO "BEWDKL07" VALUES (61, 1, 540, '2012-05-07 00:00:00.0', 29, null, null, 'Gesäß rechts', 0, 11, null, null, null, null, 55, 13, 2);
INSERT INTO "BEWDKL07" VALUES (48, 1, 540, '2012-03-29 00:00:00.0', 13, null, null, 'Wade rechts', 0, 5, 5, 2, null, null, 56, 13, 1);
INSERT INTO "BEWDKL07" VALUES (87, 1, 529, '2012-11-21 00:00:00.0', 13, null, null, 'Schulterblatt oben links', 0, 50, null, 3, null, 6, 103, 18, 1);
INSERT INTO "BEWDKL07" VALUES (34, 1, 502, '2012-03-20 00:00:00.0', 11, null, null, 'Schulterblatt unten links', 0, 2, 4, 2, null, 6, 55, 13, 1);
INSERT INTO "BEWDKL07" VALUES (75, 1, 479, '2012-08-16 00:00:00.0', 11, null, null, 'Hand links', 0, 1, 1, null, null, null, 55, 13, 11);
INSERT INTO "BEWDKL07" VALUES (71, 1, 479, '2012-08-13 00:00:00.0', 11, null, null, 'Kreuzbein', 0, 1, 1, null, null, null, 55, 13, 10);
INSERT INTO "BEWDKL07" VALUES (70, 1, 479, '2012-07-25 00:00:00.0', 11, null, null, 'Brustbein', 0, 1, 1, null, null, 6, 55, 13, 9);
INSERT INTO "BEWDKL07" VALUES (68, 1, 479, '2012-06-26 00:00:00.0', 7, null, null, 'Schulterblatt oben links', 0, 2, 2, 2, null, 6, 56, 13, 8);
INSERT INTO "BEWDKL07" VALUES (67, 1, 479, '2012-06-23 00:00:00.0', 11, null, null, 'Schulterblatt unten links', 0, 1, 1, null, null, 6, 55, 13, 7);
INSERT INTO "BEWDKL07" VALUES (58, 1, 463, '2012-05-04 00:00:00.0', 29, null, null, 'Gesäß rechts', 0, 2, null, null, null, 6, 55, 13, 1);
INSERT INTO "BEWDKL07" VALUES (63, 1, 451, '2012-05-07 00:00:00.0', 29, null, null, 'Wirbelsäule', 0, 35, null, null, null, 6, 55, 13, 1);
INSERT INTO "BEWDKL07" VALUES (74, 1, 436, '2012-08-15 00:00:00.0', 11, null, null, 'Schulterblatt oben rechts', 0, 1, 1, null, null, null, 55, 13, 4);
INSERT INTO "BEWDKL07" VALUES (73, 1, 436, '2012-08-15 00:00:00.0', 11, null, null, 'Ferse links', 0, 1, 1, null, null, null, 64, 14, 3);
INSERT INTO "BEWDKL07" VALUES (72, 1, 436, '2012-08-15 00:00:00.0', 11, null, null, 'Kreuzbein', 0, 1, 1, null, null, null, 55, 13, 2);
INSERT INTO "BEWDKL07" VALUES (92, 1, 426, '2013-02-21 00:00:00.0', 7, null, null, 'Gesäß rechts', 0, 742, null, null, null, null, 103, 18, 2);
INSERT INTO "BEWDKL07" VALUES (51, 1, 426, '2012-03-29 00:00:00.0', 11, null, null, 'Schulterblatt oben links', 0, 4, 4, null, null, null, 56, 13, 1);
INSERT INTO "BEWDKL07" VALUES (95, 1, 328, '2013-07-02 00:00:00.0', 7, null, null, 'Fersenunterseite rechts', 0, 1342, null, 3, null, 9, 102, 18, 7);
INSERT INTO "BEWDKL07" VALUES (91, 1, 328, '2013-01-15 00:00:00.0', 7, null, null, 'Zehenunterseite links', 0, 3058, null, null, null, 9, 103, 18, 6);
INSERT INTO "BEWDKL07" VALUES (83, 1, 328, '2012-10-18 00:00:00.0', 7, null, null, 'Kreuzbein', 0, 10, 12, 2, null, 9, 103, 18, 5);
INSERT INTO "BEWDKL07" VALUES (44, 1, 259, '2012-03-22 00:00:00.0', 29, null, null, 'Oberschenkel vorne rechts', 0, 55, null, null, null, 6, 55, 13, 1);
INSERT INTO "BEWDKL07" VALUES (36, 1, 162, '2012-03-21 00:00:00.0', 29, null, null, 'Oberam hinten links', 0, 1, 1, null, null, 6, 55, 13, 1);
INSERT INTO "BEWDKL07" VALUES (50, 1, 152, '2012-03-29 00:00:00.0', 11, null, null, 'Schulterblatt oben rechts', 0, 4, 4, null, null, null, 57, 13, 1);
INSERT INTO "BEWDKL07" VALUES (33, 1, 559, '2012-03-19 00:00:00.0', 11, null, null, 'Schulterblatt unten links', 0, 10, null, null, 'xycyxcyxc
yxcyxc
yxcyx', 6, 55, 13, 1);
INSERT INTO "BEWDKL07" VALUES (65, 1, 451, '2012-05-10 00:00:00.0', 13, null, null, 'Schulterblatt unten rechts', 0, 10, 10, 2, 'sragttrtrt', 9, 55, 13, 2);
INSERT INTO "BEWDKL07" VALUES (85, 1, 502, '2012-11-15 00:00:00.0', 13, null, null, 'Oberschenkel hinten rechts', 0, 10, 12, 2, 'rgethrhrh', 6, 103, 18, 2);
INSERT INTO "BEWDKL07" VALUES (86, 1, 502, '2012-11-15 00:00:00.0', 13, null, null, 'Ferse rechts', 0, 1, 2, 1, 'rfergeg', 6, 103, 18, 3);
INSERT INTO "BEWDKL07" VALUES (84, 1, 540, '2012-11-13 00:00:00.0', 13, null, null, 'Wirbelsäule', 0, 2, 2, 1, 'fhfghfg', 9, 103, 18, 5);
INSERT INTO "BEWDKL07" VALUES (90, 1, 650, '2012-12-13 00:00:00.0', 13, null, null, 'Oberschenkel hinten rechts', 0, 4, 5, 1, 'dgdffhfhfgh', 6, 103, 18, 3);
INSERT INTO "BEWDKL07" VALUES (32, 1, 209, '2012-03-19 00:00:00.0', 11, null, null, 'Schulterblatt unten links', 0, 5, 2, 4, 'askljjasdhfasd
ßfasödkjfjhasödlf
asdflkjasdjasd', 6, 55, 13, 1);
INSERT INTO "BEWDKL07" VALUES (78, 1, 644, '2012-09-26 00:00:00.0', 37, null, null, 'Wade links', 0, 4, 6, 2, 'Einzug 26.09.2012', 1, 102, 18, 1);
INSERT INTO "BEWDKL07" VALUES (76, 1, 642, '2012-09-13 00:00:00.0', 7, null, null, 'Wirbelsäule', 0, 22, null, 1, 'Einzug 13.09.2012', 3, 103, 18, 1);
COMMIT;

-- ----------------------------
-- Table structure for BEWOPE07
-- ----------------------------
DROP TABLE IF EXISTS "BEWOPE07";
CREATE TABLE "BEWOPE07" (
"NR"  NUMBER(12) NOT NULL,
"KENMDT07_NR"  INTEGER NOT NULL,
"NAME"  VARCHAR2(35),
"VORNAME"  VARCHAR2(35),
"GESCHLECHT"  VARCHAR2(100),
"ANREDE"  VARCHAR2(100),
"TITEL"  VARCHAR2(100),
"GEBDATUM"  DATE,
"ZIMMER"  VARCHAR2(8),
"STATIONEN07_NR"  INTEGER,
"SUCHBEZ"  VARCHAR2(35),
"EINZUG"  DATE,
"UNTERBRINGUNG"  VARCHAR2(1),
PRIMARY KEY ("NR" ASC, "KENMDT07_NR" ASC)
)

;

-- ----------------------------
-- Records of BEWOPE07
-- ----------------------------
BEGIN;
INSERT INTO "BEWOPE07" VALUES (405, 1, 'Räumung', 'Helmut', 'männlich', null, null, '1925-01-03 00:00:00.0', 'A507', 15, 'Räumung; Helmut', '2005-01-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (587, 1, 'Pfeifer', 'Elfriede', 'weiblich', null, null, '1925-04-11 00:00:00.0', 'N004', 8, 'Pfeifer; Elfriede', '2000-11-16 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (568, 1, 'Reinhardt', 'Erwin', 'männlich', 'Herr', null, '1925-08-22 00:00:00.0', 'N037', 3, 'Reinhardt; Erwin', '2001-10-15 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (585, 1, 'Dörfle', 'Lotte', 'weiblich', 'Frau', null, '1926-10-12 00:00:00.0', 'N013', 2, 'Dörfle; Lotte', '2000-11-08 00:00:00.0', 'k');
INSERT INTO "BEWOPE07" VALUES (565, 1, 'Untermann', 'Maria', 'weiblich', null, null, '1927-02-15 00:00:00.0', 'N206', 6, 'Untermann; Maria', '2000-05-15 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (454, 1, 'Wespe', 'Kurt', 'männlich', null, null, '1927-12-23 00:00:00.0', 'HPF', 17, 'Wespe; Kurt', '2009-01-01 00:00:00.0', 'w');
INSERT INTO "BEWOPE07" VALUES (566, 1, 'Sauter', 'Elfriede', 'weiblich', 'Frau', null, '1928-01-05 00:00:00.0', 'N104', 4, 'Sauter; Elfriede', '2000-05-26 00:00:00.0', null);
INSERT INTO "BEWOPE07" VALUES (564, 1, 'Pflege', 'Otto', 'männlich', null, null, '1928-05-09 00:00:00.0', 'K1', 15, 'Pflege; Otto', '2005-01-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (544, 1, 'Bauer', 'Artur', 'männlich', null, null, '1928-07-13 00:00:00.0', 'M6', 10, 'Bauer; Artur', '2002-01-01 00:00:00.0', 'w');
INSERT INTO "BEWOPE07" VALUES (574, 1, 'Brändle', 'Elisabeth', 'weiblich', 'Frau', null, '1928-09-24 00:00:00.0', 'N137', 5, 'Brändle; Elisabeth', '2001-06-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (328, 1, 'Engel', 'Manfred', 'männlich', 'Herr', null, '1928-12-07 00:00:00.0', 'N103', 4, 'Engel; Manfred', '1994-09-29 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (557, 1, 'Glass', 'Anna', 'weiblich', 'Frau', null, '1929-09-28 00:00:00.0', 'N038', 3, 'Glass; Anna', '2000-03-13 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (396, 1, 'Vesto', 'Jan', 'männlich', null, null, '1931-05-24 00:00:00.0', 'A409', 15, 'Vesto; Jan', '2005-01-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (352, 1, 'Katze', 'Elisabeth', 'weiblich', null, null, '1932-02-11 00:00:00.0', 'HPF', 17, 'Katze; Elisabeth', '2009-01-01 00:00:00.0', 'w');
INSERT INTO "BEWOPE07" VALUES (526, 1, 'Streicher', 'Jakob', 'männlich', null, null, '1934-05-18 00:00:00.0', 'N203', 6, 'Streicher; Jakob', '1999-08-03 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (502, 1, 'Blahetek', 'Marga', 'weiblich', 'Frau', null, '1935-08-23 00:00:00.0', 'N007', 2, 'Blahetek; Marga', '1999-02-15 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (538, 1, 'Pfau', 'Kathrin', 'weiblich', null, null, '1936-03-18 00:00:00.0', 3, 7, 'Pfau; Kathrin', '2001-01-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (616, 1, 'Fischer', 'Christine', null, null, null, '1940-05-11 00:00:00.0', 'C1', 8, 'Fischer; Christine', '2003-06-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (625, 1, 'Eisbär', 'Heidi', null, null, null, '1940-11-11 00:00:00.0', 'HPF', 17, 'Eisbär; Heidi', '2009-01-01 00:00:00.0', 'w');
INSERT INTO "BEWOPE07" VALUES (619, 1, 'demmer', 'wolfgang', null, null, null, '1945-01-01 00:00:00.0', 'P1', 8, 'demmer; wolfgang', '2003-01-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (613, 1, 'Eichel', 'Heinrich', 'männlich', 'Herr', null, '1952-05-11 00:00:00.0', 'E03', 3, 'Eichel; Heinrich', '2002-01-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (612, 1, 'Sommer', 'Katrin', 'weiblich', 'Frau', null, '1975-06-15 00:00:00.0', 'E02', 3, 'Sommer; Katrin', '2002-05-10 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (609, 1, 'Berner', 'Heike', null, null, null, null, 'M6', 9, 'Berner; Heike', '2002-01-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (607, 1, 'Pfahlei', 'Barbara', null, null, null, null, 'M3', 10, 'Pfahlei; Barbara', '2002-01-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (614, 1, 'Taube', 'Isolde', 'weiblich', 'Frau', null, null, 'B07', 3, 'Taube; Isolde', '2003-01-01 00:00:00.0', 't');
INSERT INTO "BEWOPE07" VALUES (623, 1, 'Trommel', 'Erwin', 'männlich', 'Herr', null, null, 'A209', 1, 'Trommel; Erwin', '2006-05-09 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (576, 1, 'Geschwandner', 'Egon', 'männlich', 'Herr', 'Dr. Ing.', '1934-04-01 00:00:00.0', 'N112', 4, 'Geschwandner; Egon', '2000-10-06 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (626, 1, 'Betreut', 'Heinrich', 'männlich', null, null, '1922-04-11 00:00:00.0', 'N205', 6, 'Betreut; Heinrich', '2011-10-01 00:00:00.0', 'w');
INSERT INTO "BEWOPE07" VALUES (600, 1, 'Estheim', 'Esther', 'weiblich', 'Frau', null, '1912-07-03 00:00:00.0', 'M1', 10, 'Estheim; Esther', '2002-01-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (596, 1, 'Maier', 'Elsa', 'weiblich', 'Frau', null, '1914-05-18 00:00:00.0', 117, 2, 'Maier; Elsa', '2001-02-05 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (601, 1, 'Ertem', 'Elise', 'weiblich', 'Frau', null, '1915-05-06 00:00:00.0', 'E01', 3, 'Ertem; Elise', '2001-03-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (606, 1, 'Ernst', 'Erna', 'weiblich', 'Frau', null, '1915-06-04 00:00:00.0', 'E02', 3, 'Ernst; Erna', '2001-02-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (602, 1, 'Edenhofer', 'Erika', 'weiblich', 'Frau', null, '1916-08-07 00:00:00.0', 'E01', 3, 'Edenhofer; Erika', '2001-03-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (617, 1, 'Friedel', 'Hilde', 'weiblich', 'Frau', null, '1921-11-11 00:00:00.0', 'E03', 3, 'Friedel; Hilde', '2003-01-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (591, 1, 'Burg', 'Erika', 'weiblich', 'Frau', null, '1924-04-13 00:00:00.0', 'b02', 10, 'Burg; Erika', '2003-01-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (592, 1, 'Bartenbach', 'Margarete', 'weiblich', 'Frau', null, '1925-04-23 00:00:00.0', 'B10', 8, 'Bartenbach; Margarete', '2003-01-01 00:00:00.0', 'k');
INSERT INTO "BEWOPE07" VALUES (603, 1, 'Erler', 'Erich', 'männlich', 'Herr', null, '1910-07-06 00:00:00.0', 'b01', 2, 'Erler; Erich', '2003-01-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (618, 1, 'Lippe', 'Hans', 'männlich', 'Herr', null, '1911-11-11 00:00:00.0', 'B5', 8, 'Lippe; Hans', '2003-01-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (582, 1, 'Abschlag', 'Erich', 'männlich', 'Herr', 'Dipl.-Ing.', '1911-12-21 00:00:00.0', 'B 2', 10, 'Abschlag; Erich', '2003-01-01 00:00:00.0', 'w');
INSERT INTO "BEWOPE07" VALUES (611, 1, 'Hecht', 'Hans', 'männlich', 'Herr', null, null, 'E02', 2, 'Hecht; Hans', '2002-06-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (152, 1, 'Schiffer', 'Juliane', 'weiblich', 'Frau', null, '1897-01-06 00:00:00.0', 'N107', 4, 'Schiffer; Juliane', '1991-03-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (161, 1, 'Christo', 'Berta', 'weiblich', 'Frau', null, '1898-11-01 00:00:00.0', 'N012', 2, 'Christo; Berta', '1991-04-17 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (530, 1, 'Epple', 'Emma', 'weiblich', 'Frau', null, '1902-10-21 00:00:00.0', 'A304', 1, 'Epple; Emma', '1999-08-26 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (511, 1, 'Käfer', 'Frieda', 'weiblich', null, null, '1903-08-08 00:00:00.0', 'HPF', 17, 'Käfer; Frieda', '2009-01-01 00:00:00.0', 'w');
INSERT INTO "BEWOPE07" VALUES (424, 1, 'Mauch', 'Emma', 'weiblich', null, null, '1903-11-22 00:00:00.0', 'M3', 10, 'Mauch; Emma', '2003-01-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (513, 1, 'Krauss', 'Marta', 'weiblich', null, null, '1904-04-02 00:00:00.0', 'N005', 8, 'Krauss; Marta', '1999-04-23 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (528, 1, 'Spinne', 'Ilse', 'weiblich', null, null, '1904-06-26 00:00:00.0', 'HPF', 17, 'Spinne; Ilse', '2009-01-01 00:00:00.0', 'w');
INSERT INTO "BEWOPE07" VALUES (330, 1, 'Vogt', 'Else', 'weiblich', 'Frau', null, '1904-07-10 00:00:00.0', 'N113', 4, 'Vogt; Else', '1994-12-02 00:00:00.0', null);
INSERT INTO "BEWOPE07" VALUES (14, 1, 'Lindner', 'Gertrud', 'weiblich', null, null, '1904-08-04 00:00:00.0', 'N002', 8, 'Lindner; Gertrud', '1988-08-15 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (389, 1, 'Tiger', 'Klara', 'weiblich', null, null, '1904-09-27 00:00:00.0', 'HPF', 17, 'Tiger; Klara', '2009-01-01 00:00:00.0', 'w');
INSERT INTO "BEWOPE07" VALUES (343, 1, 'Kolske', 'Elsa', 'weiblich', 'Frau', null, '1905-01-27 00:00:00.0', 'N109', 4, 'Kolske; Elsa', '1997-09-29 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (414, 1, 'Böse', 'Anna', 'weiblich', null, null, '1905-06-06 00:00:00.0', 'N003', 8, 'Böse; Anna', '1996-12-03 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (69, 1, 'Willhauck', 'Anna', 'weiblich', 'Frau', null, '1905-06-20 00:00:00.0', 'N104', 4, 'Willhauck; Anna', '1987-04-10 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (507, 1, 'Stehle', 'Karl', 'männlich', null, null, '1905-12-25 00:00:00.0', 'A302', 8, 'Stehle; Karl', '1999-03-08 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (162, 1, 'Zimmer', 'Rosa', 'weiblich', null, null, '1906-01-14 00:00:00.0', 'N028', 3, 'Zimmer; Rosa', '1991-04-27 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (470, 1, 'Geck', 'Gertrud', 'weiblich', 'Frau', null, '1906-06-07 00:00:00.0', 'N107', 4, 'Geck; Gertrud', '1998-03-17 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (333, 1, 'Zuschuss', 'Clara', 'weiblich', null, null, '1906-07-23 00:00:00.0', 'M6', 9, 'Zuschuss; Clara', '2005-01-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (438, 1, 'Bertsch', 'Lydia', 'weiblich', null, null, '1906-11-19 00:00:00.0', 'B5', 8, 'Bertsch; Lydia', '2003-01-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (498, 1, 'Zebra', 'Werner', 'männlich', null, null, '1907-04-24 00:00:00.0', 'HPF', 17, 'Zebra; Werner', '2009-01-01 00:00:00.0', 'w');
INSERT INTO "BEWOPE07" VALUES (360, 1, 'Faiss', 'Gertrud', 'weiblich', 'Frau', null, '1907-06-28 00:00:00.0', 'N031', 3, 'Faiss; Gertrud', '1997-04-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (350, 1, 'Ermold', 'Annalisette', 'weiblich', 'Frau', null, '1907-06-29 00:00:00.0', 'N014', 2, 'Ermold; Annalisette', '1995-04-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (391, 1, 'Kurz', 'Hedwig', 'weiblich', null, null, '1907-11-02 00:00:00.0', 'N005', 8, 'Kurz; Hedwig', '2005-01-01 00:00:00.0', 'k');
INSERT INTO "BEWOPE07" VALUES (282, 1, 'Hofmann', 'Elise', 'weiblich', 'Frau', null, '1908-03-24 00:00:00.0', 'N009', 2, 'Hofmann; Elise', '1993-11-15 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (61, 1, 'Schürle', 'Hedwig', 'weiblich', 'Frau', null, '1908-03-28 00:00:00.0', 'N109', 4, 'Schürle; Hedwig', '1987-12-07 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (214, 1, 'Kurz', 'Marta', 'weiblich', 'Frau', null, '1908-04-16 00:00:00.0', 'N129', 5, 'Kurz; Marta', '1992-03-23 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (488, 1, 'Kranken', 'Viktor', 'weiblich', null, null, '1908-05-22 00:00:00.0', 'A207', 15, 'Kranken; Viktor', '2005-01-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (484, 1, 'Lützow', 'Annalise', 'weiblich', 'Frau', null, '1908-06-05 00:00:00.0', 'N138', 5, 'Lützow; Annalise', '1998-06-22 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (457, 1, 'Wagner', 'Elsa', 'weiblich', 'Frau', null, '1908-06-13 00:00:00.0', 'N013', 2, 'Wagner; Elsa', '1997-10-20 00:00:00.0', null);
INSERT INTO "BEWOPE07" VALUES (311, 1, 'Hailfinger', 'Ernestine', 'weiblich', 'Frau', null, '1908-07-19 00:00:00.0', 'N026', 3, 'Hailfinger; Ernestine', '1994-07-12 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (478, 1, 'Lenkeit', 'Anna Maria', 'weiblich', 'Frau', null, '1908-12-20 00:00:00.0', 'A007', 1, 'Lenkeit; Anna Maria', '1998-04-30 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (368, 1, 'Böhm', 'Lina', 'weiblich', null, null, '1909-08-08 00:00:00.0', 'P1', 8, 'Böhm; Lina', '1995-10-23 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (560, 1, 'Gruber', 'Lina', 'weiblich', 'Frau', null, '1909-10-30 00:00:00.0', 'A204', 1, 'Gruber; Lina', '2000-05-03 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (529, 1, 'Schweiker', 'Wilhelmine', 'weiblich', 'Frau', 'Stud.-Dir.', '1909-10-31 00:00:00.0', 'N110', 4, 'Schweiker; Wilhelmine', '1999-10-25 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (298, 1, 'Maus', 'Emil', 'weiblich', null, null, '1910-02-12 00:00:00.0', 1, 7, 'Maus; Emil', '2001-06-15 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (458, 1, 'Huber', 'Luise', 'weiblich', 'Frau', null, '1910-04-09 00:00:00.0', 'A111', 1, 'Huber; Luise', '1997-11-19 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (540, 1, 'Brück', 'Adolf', 'männlich', 'Herr', null, '1910-05-11 00:00:00.0', 'N135', 5, 'Brück; Adolf', '1999-10-11 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (392, 1, 'Hespelt', 'Emilie', 'weiblich', 'Frau', null, '1910-07-03 00:00:00.0', 'A002', 1, 'Hespelt; Emilie', '1998-12-11 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (436, 1, 'Becker', 'Hedwig', 'weiblich', 'Frau', null, '1910-09-30 00:00:00.0', 'N013', 2, 'Becker; Hedwig', '1997-07-01 00:00:00.0', null);
INSERT INTO "BEWOPE07" VALUES (559, 1, 'Duburg', 'Emma', 'weiblich', 'Frau', null, '1910-10-29 00:00:00.0', 'N013', 2, 'Duburg; Emma', '2000-04-03 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (589, 1, 'Reh', 'August', null, null, null, '1910-12-10 00:00:00.0', 'HPF', 17, 'Reh; August', '2009-01-01 00:00:00.0', 'w');
INSERT INTO "BEWOPE07" VALUES (583, 1, 'Schlaier', 'Emma', 'weiblich', 'Frau', null, '1911-03-31 00:00:00.0', 'A003', 1, 'Schlaier; Emma', '2000-11-02 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (353, 1, 'Biene', 'Irma', 'weiblich', null, null, '1911-04-05 00:00:00.0', 'HPF', 17, 'Biene; Irma', '2009-01-01 00:00:00.0', 'w');
INSERT INTO "BEWOPE07" VALUES (430, 1, 'Abwesend', 'Sophie', 'weiblich', null, null, '1911-04-25 00:00:00.0', 'A001', 15, 'Abwesend; Sophie', '2005-01-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (537, 1, 'Trinkaus', 'Ludwig', 'männlich', 'Herr', null, '1911-06-03 00:00:00.0', 'A205', 1, 'Trinkaus; Ludwig', '1999-10-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (539, 1, 'Kosten', 'Edgar', 'männlich', null, null, '1911-06-04 00:00:00.0', 'A008', 10, 'Kosten; Edgar', '2005-01-01 00:00:00.0', 'w');
INSERT INTO "BEWOPE07" VALUES (407, 1, 'Seebach', 'Emma', 'weiblich', 'Frau', null, '1911-06-28 00:00:00.0', 'A103', 1, 'Seebach; Emma', '1996-09-24 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (426, 1, 'Braun', 'Martha', 'weiblich', 'Frau', null, '1911-08-04 00:00:00.0', 'N009', 2, 'Braun; Martha', '1998-02-04 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (460, 1, 'Klaiber', 'Lina', 'weiblich', 'Frau', null, '1911-08-10 00:00:00.0', 'N110', 4, 'Klaiber; Lina', '1997-12-22 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (235, 1, 'Klaiber', 'Adele', 'weiblich', 'Frau', null, '1911-08-11 00:00:00.0', 'N012', 2, 'Klaiber; Adele', '1992-09-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (549, 1, 'Kladeck', 'Gertrud', 'weiblich', 'Frau', null, '1911-10-23 00:00:00.0', 'N126', 5, 'Kladeck; Gertrud', '1999-12-15 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (615, 1, 'Karl', 'Ernst', 'männlich', null, null, '1911-11-11 00:00:00.0', 'B10', 8, 'Karl; Ernst', '2003-01-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (620, 1, 'Wilhelm', 'Theo', null, null, null, '1911-11-11 00:00:00.0', 'B3', 8, 'Wilhelm; Theo', '2003-01-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (479, 1, 'Baumann', 'Anna', 'weiblich', 'Frau', null, '1911-11-15 00:00:00.0', 'E02', 2, 'Baumann; Anna', '2002-01-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (475, 1, 'Korb', 'Anna', 'weiblich', 'Frau', null, '1911-12-15 00:00:00.0', 'A208', 1, 'Korb; Anna', '1998-04-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (413, 1, 'Stupak', 'Ewfrosina', 'weiblich', 'Frau', null, '1912-01-12 00:00:00.0', 'N138', 5, 'Stupak; Ewfrosina', '1996-12-02 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (543, 1, 'Wurm', 'Maria', 'weiblich', null, null, '1912-01-30 00:00:00.0', 'HPF', 17, 'Wurm; Maria', '2009-01-01 00:00:00.0', 'w');
INSERT INTO "BEWOPE07" VALUES (518, 1, 'Bauer', 'Linda Elisabeth', 'weiblich', null, null, '1912-03-17 00:00:00.0', 'S1', 8, 'Bauer; Linda Elisabeth', '2003-01-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (504, 1, 'Vogel', 'Luise', 'weiblich', null, null, '1912-06-18 00:00:00.0', 'HPF', 17, 'Vogel; Luise', '2009-01-01 00:00:00.0', 'w');
INSERT INTO "BEWOPE07" VALUES (598, 1, 'Eck', 'Erika', 'weiblich', 'Frau', null, '1912-07-03 00:00:00.0', 'b01', 2, 'Eck; Erika', '2001-03-13 00:00:00.0', null);
INSERT INTO "BEWOPE07" VALUES (599, 1, 'Eck', 'Erika', 'weiblich', 'Frau', null, '1912-07-03 00:00:00.0', 'N012', 2, 'Eck; Erika', '2001-03-01 00:00:00.0', null);
INSERT INTO "BEWOPE07" VALUES (90, 1, 'Hügel', 'Hilde', 'weiblich', 'Frau', null, '1912-10-17 00:00:00.0', 'N038', 3, 'Hügel; Hilde', '1989-08-14 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (402, 1, 'Tag', 'Franz', 'männlich', null, null, '1913-05-14 00:00:00.0', 'T108', 16, 'Tag; Franz', '2005-01-01 00:00:00.0', 't');
INSERT INTO "BEWOPE07" VALUES (16, 1, 'Pichl', 'Ernestine', 'weiblich', 'Frau', null, '1913-05-19 00:00:00.0', 'N114', 4, 'Pichl; Ernestine', '1978-04-27 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (418, 1, 'Erlewein', 'Emilie', 'weiblich', 'Frau', null, '1913-06-10 00:00:00.0', 'N111', 4, 'Erlewein; Emilie', '1996-12-10 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (545, 1, 'Gazda', 'Martha', 'weiblich', 'Frau', null, '1913-06-11 00:00:00.0', 'A206', 1, 'Gazda; Martha', '1999-12-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (375, 1, 'Hund', 'Theresia', 'weiblich', null, null, '1913-06-12 00:00:00.0', 'HPF', 17, 'Hund; Theresia', '2009-01-01 00:00:00.0', 'w');
INSERT INTO "BEWOPE07" VALUES (315, 1, 'Dietz', 'Frieda', 'weiblich', 'Frau', null, '1913-09-17 00:00:00.0', 'N025', 3, 'Dietz; Frieda', '1994-07-28 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (558, 1, 'Scholtze', 'Ursula', 'weiblich', 'Frau', null, '1913-11-04 00:00:00.0', 'A110', 1, 'Scholtze; Ursula', '2000-03-22 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (567, 1, 'Schloßbach', 'Agnes', 'weiblich', 'Frau', null, '1913-12-24 00:00:00.0', 'N104', 4, 'Schloßbach; Agnes', '2000-06-05 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (303, 1, 'Faas', 'Frieda', 'weiblich', null, null, '1914-02-26 00:00:00.0', 'N006', 8, 'Faas; Frieda', '1994-04-25 00:00:00.0', null);
INSERT INTO "BEWOPE07" VALUES (542, 1, 'Klukowski', 'Ursula', 'weiblich', null, null, '1914-05-07 00:00:00.0', 'A303', 8, 'Klukowski; Ursula', '2000-08-29 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (174, 1, 'Lechner', 'Hedwig', 'weiblich', 'Frau', null, '1914-05-23 00:00:00.0', 'N011', 2, 'Lechner; Hedwig', '1991-07-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (287, 1, 'Weispfenning', 'Albert', 'männlich', null, null, '1914-07-17 00:00:00.0', 'S1', 8, 'Weispfenning; Albert', '2003-01-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (398, 1, 'Koppenhöfer', 'Elise', 'weiblich', 'Frau', null, '1914-11-13 00:00:00.0', 'N130', 5, 'Koppenhöfer; Elise', '1996-07-11 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (157, 1, 'Igel', 'Magdalena', 'weiblich', null, null, '1915-01-26 00:00:00.0', 'HPF', 17, 'Igel; Magdalena', '2009-01-01 00:00:00.0', 'w');
INSERT INTO "BEWOPE07" VALUES (441, 1, 'Beihilf', 'Emma', 'weiblich', null, null, '1915-06-09 00:00:00.0', 'A507', 15, 'Beihilf; Emma', '2005-01-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (209, 1, 'Eckert', 'Ida', 'weiblich', 'Frau', null, '1915-06-24 00:00:00.0', 'N115', 4, 'Eckert; Ida', '1992-03-09 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (453, 1, 'Wieland', 'Hilda', 'weiblich', 'Frau', null, '1915-07-19 00:00:00.0', 'N105', 4, 'Wieland; Hilda', '1997-11-10 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (551, 1, 'Löwe', 'Franziska', 'weiblich', null, null, '1915-08-29 00:00:00.0', 'HPF', 17, 'Löwe; Franziska', '2009-01-01 00:00:00.0', 'w');
INSERT INTO "BEWOPE07" VALUES (243, 1, 'Ester', 'Elise', 'weiblich', 'Frau', null, '1915-09-30 00:00:00.0', 'N007', 2, 'Ester; Elise', '1992-10-20 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (561, 1, 'Edam', 'Lina', 'weiblich', 'Frau', null, '1916-02-03 00:00:00.0', 'N111', 4, 'Edam; Lina', '2000-08-03 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (452, 1, 'Osterburg', 'Theresia', 'weiblich', null, null, '1916-04-05 00:00:00.0', 'A302', 8, 'Osterburg; Theresia', '2003-01-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (580, 1, 'Wieland', 'Martha', 'weiblich', 'Frau', null, '1916-05-27 00:00:00.0', 'N010', 2, 'Wieland; Martha', '2000-11-02 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (503, 1, 'Lohmann', 'Martha', 'weiblich', 'Frau', null, '1916-07-22 00:00:00.0', 'A108', 1, 'Lohmann; Martha', '1999-02-11 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (572, 1, 'Laus', 'Hans', 'männlich', null, null, '1916-10-09 00:00:00.0', 2, 7, 'Laus; Hans', '2000-07-21 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (415, 1, 'Biewald', 'Walter', 'männlich', null, null, '1916-10-20 00:00:00.0', 'F1', 8, 'Biewald; Walter', '1996-12-06 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (586, 1, 'Kaiser', 'Hilda', 'weiblich', 'Frau', null, '1917-08-07 00:00:00.0', 'N112', 4, 'Kaiser; Hilda', '2000-11-08 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (371, 1, 'Friedrich', 'Maria', 'weiblich', 'Frau', null, '1917-12-12 00:00:00.0', 'N127', 5, 'Friedrich; Maria', '1995-12-04 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (20, 1, 'Stolz', 'Elisabeth', 'weiblich', null, null, '1918-03-30 00:00:00.0', 'N004', 8, 'Stolz; Elisabeth', '1984-08-28 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (555, 1, 'Weik', 'Klara', 'weiblich', null, null, '1918-04-03 00:00:00.0', 'N202', 6, 'Weik; Klara', '2000-03-01 00:00:00.0', 'w');
INSERT INTO "BEWOPE07" VALUES (604, 1, 'Eberwein', 'Emil', 'männlich', 'Herr', null, '1918-05-08 00:00:00.0', 117, 2, 'Eberwein; Emil', '2001-02-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (510, 1, 'Mall', 'Helene', 'weiblich', 'Frau', null, '1918-10-23 00:00:00.0', 'N137', 5, 'Mall; Helene', '2000-07-12 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (516, 1, 'Osterstock', 'Lieselotte', 'weiblich', null, null, '1918-10-24 00:00:00.0', 'A303', 8, 'Osterstock; Lieselotte', '2003-01-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (474, 1, 'Ordnung', 'Juliane', 'weiblich', null, null, '1918-11-04 00:00:00.0', 'A207', 15, 'Ordnung; Juliane', '2005-04-15 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (505, 1, 'Eder', 'Maria', 'weiblich', null, null, '1918-11-06 00:00:00.0', 'N006', 8, 'Eder; Maria', '1999-02-26 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (486, 1, 'Leibig', 'Gertrud', 'weiblich', 'Frau', null, '1919-04-28 00:00:00.0', 'N126', 5, 'Leibig; Gertrud', '1998-07-03 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (597, 1, 'Schiller', 'Hans', 'männlich', 'Herr', null, '1919-05-13 00:00:00.0', 'b01', 2, 'Schiller; Hans', '2001-02-06 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (429, 1, 'Reservierung', 'Berta', 'weiblich', null, null, '1919-05-26 00:00:00.0', 'A001', 15, 'Reservierung; Berta', '2005-01-15 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (463, 1, 'Hirsch', 'Erwin', 'männlich', 'Herr', null, '1919-10-16 00:00:00.0', 'A212', 1, 'Hirsch; Erwin', '1998-01-05 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (523, 1, 'Stuttgart', 'Mechthilde', 'weiblich', null, null, '1919-10-17 00:00:00.0', 'B3', 8, 'Stuttgart; Mechthilde', '2003-01-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (590, 1, 'Vogel', 'Kathrin', 'weiblich', null, 'Amtsrat', '1920-03-12 00:00:00.0', 3, 7, 'Vogel; Kathrin', '2001-07-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (593, 1, 'Probe', 'Jutta', 'weiblich', 'Frau', null, '1920-12-03 00:00:00.0', 'B07', 3, 'Probe; Jutta', '2001-02-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (584, 1, 'Bär', 'Maria', 'weiblich', null, null, '1920-12-13 00:00:00.0', 'HPF', 17, 'Bär; Maria', '2009-01-01 00:00:00.0', 'w');
INSERT INTO "BEWOPE07" VALUES (579, 1, 'Gereke', 'Herta', 'weiblich', 'Frau', null, '1921-02-20 00:00:00.0', 'A305', 1, 'Gereke; Herta', '2000-09-19 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (259, 1, 'Walter', 'Lotte', 'weiblich', 'Frau', 'Dr. med.', '1921-03-02 00:00:00.0', 'N106', 4, 'Walter; Lotte', '1993-05-29 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (437, 1, 'Breitner', 'Josef', 'männlich', null, null, '1921-03-29 00:00:00.0', 'B3', 8, 'Breitner; Josef', '2003-01-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (588, 1, 'Petermeier', 'Amanda', 'weiblich', 'Frau', null, '1921-05-11 00:00:00.0', 'N013', 2, 'Petermeier; Amanda', '2002-01-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (508, 1, 'Moll', 'Friedhilde', 'weiblich', 'Frau', null, '1921-05-22 00:00:00.0', 'N131', 5, 'Moll; Friedhilde', '1999-03-12 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (385, 1, 'Hiemer', 'Johanna', 'weiblich', 'Frau', null, '1921-05-26 00:00:00.0', 'N012', 2, 'Hiemer; Johanna', '1996-05-09 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (468, 1, 'Horn', 'Edith', 'weiblich', null, null, '1921-08-22 00:00:00.0', 'N002', 8, 'Horn; Edith', '1998-02-06 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (547, 1, 'Strittmatter', 'Heinz', 'männlich', 'Herr', null, '1921-10-09 00:00:00.0', 'A107', 1, 'Strittmatter; Heinz', '1999-12-18 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (531, 1, 'Gerwert', 'Ilse', 'weiblich', null, null, '1922-01-02 00:00:00.0', 'N201', 6, 'Gerwert; Ilse', '1999-09-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (466, 1, 'Knödler', 'Luise', 'weiblich', 'Frau', null, '1922-02-04 00:00:00.0', 'N010', 2, 'Knödler; Luise', '1998-01-12 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (495, 1, 'Bräuer', 'Berta', 'weiblich', null, null, '1922-05-03 00:00:00.0', 4, 7, 'Bräuer; Berta', '1998-12-15 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (563, 1, 'Sänger', 'Lieselotte', 'weiblich', 'Frau', null, '1922-07-27 00:00:00.0', 'N102', 4, 'Sänger; Lieselotte', '2000-05-11 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (435, 1, 'Hamburg', 'Erika', 'weiblich', null, null, '1922-08-12 00:00:00.0', 'K1', 15, 'Hamburg; Erika', '2006-10-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (533, 1, 'Winter Ella', null, 'weiblich', 'Frau', null, '1922-09-04 00:00:00.0', 'N137', 5, 'Winter Ella; ', '1999-09-17 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (562, 1, 'Eberle', 'Walter', 'männlich', 'Herr', null, '1923-02-23 00:00:00.0', 'N013', 2, 'Eberle; Walter', '2000-05-08 00:00:00.0', null);
INSERT INTO "BEWOPE07" VALUES (451, 1, 'Burckardt', 'Else', 'weiblich', 'Frau', null, '1923-11-27 00:00:00.0', 'N015', 2, 'Burckardt; Else', '1997-09-26 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (180, 1, 'Pfau', 'Lara', 'weiblich', 'Frau', null, '1924-06-04 00:00:00.0', 'N012', 2, 'Pfau; Lara', '2002-01-01 00:00:00.0', null);
INSERT INTO "BEWOPE07" VALUES (465, 1, 'Nowadnick', 'Theresia', 'weiblich', null, null, '1924-06-06 00:00:00.0', 'N204', 6, 'Nowadnick; Theresia', '1998-01-10 00:00:00.0', 'w');
INSERT INTO "BEWOPE07" VALUES (111, 1, 'Riethmayer', 'Anna', 'weiblich', 'Frau', null, '1924-07-28 00:00:00.0', 'A203', 1, 'Riethmayer; Anna', '1990-03-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (628, 1, 'Richert', 'Klaus', 'männlich', 'Herr', 'Dr.', '1929-09-02 00:00:00.0', 'N113', 4, 'Richert; Klaus', '2012-03-15 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (629, 1, 'Neuer', 'Manfred', 'männlich', 'Herr', 'Dipl.-Ing.', '1944-05-11 00:00:00.0', 'N011', 2, 'Neuer; Manfred', '2012-03-16 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (632, 1, 'Mare', 'Magdalena', 'weiblich', 'Frau', null, null, 'DG102', 2, 'Mare; Magdalena', '2011-03-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (635, 1, 'Sommer', 'Ida-Maria', 'weiblich', 'Frau', null, '1948-09-09 00:00:00.0', 'A210', 1, 'Sommer; Ida-Maria', '2012-03-16 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (634, 1, 'Frühling', 'Michael', 'männlich', 'Herr', null, '1958-06-12 00:00:00.0', 'A109', 1, 'Frühling; Michael', '2012-03-15 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (636, 1, 'Löwe', 'Sintra', 'weiblich', 'Frau', null, '1922-09-09 00:00:00.0', 'A211', 1, 'Löwe; Sintra', '2012-03-16 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (639, 1, 'Winter', 'Sebastian', 'männlich', 'Herr', 'General a.D.', '1966-08-06 00:00:00.0', 'N333', 5, 'Winter; Sebastian', '2012-03-16 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (630, 1, 'Sonnenblume', 'Marianne', 'weiblich', 'Frau', null, '1939-11-29 00:00:00.0', 'DG101', 2, 'Sonnenblume; Marianne', '2012-03-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (631, 1, 'Schön', 'Tabea', 'weiblich', 'Frau', null, '1955-02-05 00:00:00.0', 'DG101', 2, 'Schön; Tabea', '2012-03-19 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (637, 1, 'Meinhaus', 'Olga', 'weiblich', 'Frau', null, '1945-05-17 00:00:00.0', 'B07', 3, 'Meinhaus; Olga', '2012-03-16 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (638, 1, 'Friesenjong', 'Michael', 'männlich', 'Herr', null, '1944-03-12 00:00:00.0', 'N222', 5, 'Friesenjong; Michael', '2012-03-16 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (640, 1, 'Herbst', 'Thomas', 'männlich', 'Herr', null, '1933-08-08 00:00:00.0', 'N333', 5, 'Herbst; Thomas', '2012-03-16 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (627, 1, 'Helgert', 'Matthias', 'männlich', 'Herr', null, '1935-03-16 00:00:00.0', 'N105', 4, 'Helgert; Matthias', '2012-03-15 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (648, 1, 'Brecht', 'Berta', 'weiblich', 'Frau', null, '1944-05-17 00:00:00.0', 'N101', 4, 'Brecht; Berta', '2012-11-13 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (650, 1, 'Bardot', 'Brigitte', 'weiblich', 'Frau', null, '1945-01-15 00:00:00.0', 'N037', 3, 'Bardot; Brigitte', '2012-11-15 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (654, 1, 'Williams', 'Miriam', 'weiblich', 'Frau', null, '1950-04-06 00:00:00.0', 'Z1', 1, 'Williams; Miriam', '2013-04-05 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (656, 1, 'Fritz', 'Heike', 'weiblich', 'Frau', null, '1944-12-12 00:00:00.0', 'Z1', 1, 'Fritz; Heike', '2013-04-08 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (657, 1, 'Mustermax', 'Maxime', 'weiblich', 'Frau', null, null, 'N300', 4, 'Mustermax; Maxime', '2013-04-10 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (642, 1, 'Meyer', 'Manfred', 'männlich', 'Herr', null, null, 'N102', 4, 'Meyer; Manfred', '2012-09-13 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (643, 1, 'Lierenfeld', 'Hans Heinrich', 'männlich', 'Herr', null, '0057-01-19 00:00:00.0', 'N124', 4, 'Lierenfeld; Hans Heinrich', '2012-09-17 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (644, 1, 'Sonthofen', 'Markus', 'männlich', 'Herr', null, '1932-01-19 00:00:00.0', 'N106', 4, 'Sonthofen; Markus', '2012-09-26 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (645, 1, 'Schöpp', 'Christian', 'männlich', 'Herr', null, null, 'F2', 1, 'Schöpp; Christian', '2012-10-08 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (646, 1, 'Mustermann', 'Max', 'männlich', 'Herr', null, null, 'DG102', 2, 'Mustermann; Max', '2012-10-25 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (649, 1, 'Krebs', 'Andreas', 'männlich', 'Herr', null, '1966-12-15 00:00:00.0', 'N103', 4, 'Krebs; Andreas', '2012-11-13 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (651, 1, 'Winter', 'Michael', 'männlich', 'Herr', null, null, 'Test Zim', 4, 'Winter; Michael', '2013-01-22 00:00:00.0', 't');
INSERT INTO "BEWOPE07" VALUES (652, 1, 'Frühling', 'Klaus', 'männlich', 'Herr', null, '1949-02-11 00:00:00.0', 'Test Zim', 4, 'Frühling; Klaus', '2013-01-23 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (653, 1, 'Mustermann', 'Michael', 'männlich', 'Herr', null, '1955-09-29 00:00:00.0', 'Test Zim', 4, 'Mustermann; Michael', '2013-03-12 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (655, 1, 'Frisch', 'Arno', 'männlich', 'Herr', null, '1912-12-12 00:00:00.0', 'Z1', 1, 'Frisch; Arno', '2013-04-05 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (658, 1, 'Meiering', 'Michael', 'männlich', 'Herr', null, '1944-09-29 00:00:00.0', 'L100', 5, 'Meiering; Michael', '2013-07-01 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (659, 1, 'Testmann', 'Marius', 'männlich', 'Herr', null, null, 'L100', 5, 'Testmann; Marius', '2013-08-12 00:00:00.0', 's');
INSERT INTO "BEWOPE07" VALUES (641, 1, 'Fischer', 'Christine', 'weiblich', null, null, null, 'N101', 4, 'Fischer; Christine', '2012-06-15 00:00:00.0', 's');
COMMIT;

-- ----------------------------
-- Table structure for BEWWBS07
-- ----------------------------
DROP TABLE IF EXISTS "BEWWBS07";
CREATE TABLE "BEWWBS07" (
"NR"  INTEGER NOT NULL,
"KENMDT07_NR"  INTEGER NOT NULL,
"BEWDKL07_NR"  NUMBER(12) NOT NULL,
"DATUM"  DATE NOT NULL,
"MITAPE07_NR"  NUMBER(12) NOT NULL,
"TASCHEN"  VARCHAR2(1),
"TASCHLOK"  VARCHAR2(200),
"TASCHRICHT"  VARCHAR2(200),
"BEMERKUNG"  VARCHAR2(2000),
"GROESSE1"  INTEGER,
"GROESSE2"  INTEGER,
"KENDEK07_NR"  INTEGER,
"KENWUN07_NR"  INTEGER NOT NULL,
"TIEFE"  INTEGER,
PRIMARY KEY ("NR" ASC, "KENMDT07_NR" ASC)
)

;

-- ----------------------------
-- Records of BEWWBS07
-- ----------------------------
BEGIN;
INSERT INTO "BEWWBS07" VALUES (88, 1, 98, '2013-12-03 14:01:59.0', 7, null, null, null, null, 3, 2, 103, 18, 1);
INSERT INTO "BEWWBS07" VALUES (87, 1, 97, '2013-11-28 14:05:16.0', 7, null, null, null, null, 1, 2, 103, 18, 1);
INSERT INTO "BEWWBS07" VALUES (85, 1, 95, '2013-07-02 14:50:03.0', 7, 'j', null, null, null, 1342, null, 102, 18, 3);
INSERT INTO "BEWWBS07" VALUES (84, 1, 94, '2013-05-15 10:22:25.0', 7, null, null, null, null, 1, 1, 104, 18, null);
INSERT INTO "BEWWBS07" VALUES (79, 1, 92, '2013-02-21 15:55:21.0', 7, null, null, null, null, 742, null, 103, 18, null);
INSERT INTO "BEWWBS07" VALUES (81, 1, 91, '2013-03-11 11:16:35.0', 7, 'j', 'distal', '2 Uhr', null, 1319, null, 103, 18, null);
INSERT INTO "BEWWBS07" VALUES (76, 1, 91, '2013-01-15 13:18:44.0', 7, 'n', null, null, null, 3058, null, 103, 18, null);
INSERT INTO "BEWWBS07" VALUES (75, 1, 90, '2012-12-13 11:00:21.0', 13, null, null, null, null, 4, 5, 103, 18, 1);
INSERT INTO "BEWWBS07" VALUES (73, 1, 89, '2012-12-05 16:12:10.0', 29, null, null, null, null, 5, 5, 104, 18, 5);
INSERT INTO "BEWWBS07" VALUES (72, 1, 88, '2012-12-03 15:00:28.0', 29, 'n', null, null, null, 5, 5, 103, 18, 5);
INSERT INTO "BEWWBS07" VALUES (71, 1, 87, '2012-11-21 14:05:50.0', 13, null, null, null, null, 50, null, 103, 18, 3);
INSERT INTO "BEWWBS07" VALUES (70, 1, 85, '2012-11-15 14:54:49.0', 13, 'j', 'reggrtrtgrt', 'fdeferer', null, 10, 12, 103, 18, 2);
INSERT INTO "BEWWBS07" VALUES (86, 1, 83, '2013-07-29 11:33:37.0', 7, null, null, null, null, 10, 12, 103, 18, 2);
INSERT INTO "BEWWBS07" VALUES (83, 1, 83, '2013-04-11 13:27:51.0', 7, null, null, null, null, 10, 12, 103, 18, 2);
INSERT INTO "BEWWBS07" VALUES (82, 1, 83, '2013-04-10 15:06:19.0', 7, null, null, null, null, 10, 12, 103, 18, 2);
INSERT INTO "BEWWBS07" VALUES (69, 1, 81, '2012-10-15 14:19:40.0', 7, null, null, null, null, 296, null, 103, 18, null);
INSERT INTO "BEWWBS07" VALUES (67, 1, 80, '2012-10-04 14:29:53.0', 13, null, null, null, null, 2, 2, 103, 18, 1);
INSERT INTO "BEWWBS07" VALUES (66, 1, 80, '2012-10-04 14:29:07.0', 13, null, null, null, null, 2, 2, 103, 18, 1);
INSERT INTO "BEWWBS07" VALUES (64, 1, 76, '2012-09-13 14:25:22.0', 7, null, null, null, null, 22, null, 103, 18, 1);
INSERT INTO "BEWWBS07" VALUES (80, 1, 75, '2013-03-07 11:33:38.0', 7, 'j', null, '4 Uhr', null, 1, 1, 55, 13, null);
INSERT INTO "BEWWBS07" VALUES (63, 1, 75, '2012-08-16 10:46:56.0', 11, 'j', null, '4 Uhr', null, 1, 1, 55, 13, null);
INSERT INTO "BEWWBS07" VALUES (62, 1, 74, '2012-08-15 20:00:01.0', 11, 'j', null, '1 Uhr', null, 1, 1, 55, 13, null);
INSERT INTO "BEWWBS07" VALUES (59, 1, 73, '2012-08-15 18:21:16.0', 11, 'j', null, '4 Uhr', null, 1, 1, 64, 14, null);
INSERT INTO "BEWWBS07" VALUES (58, 1, 72, '2012-08-15 17:34:17.0', 11, 'j', null, '5 Uhr', null, 1, 1, 55, 13, null);
INSERT INTO "BEWWBS07" VALUES (57, 1, 71, '2012-08-13 12:07:54.0', 11, 'j', null, '4 Uhr', null, 1, 1, 55, 13, null);
INSERT INTO "BEWWBS07" VALUES (56, 1, 71, '2012-08-13 12:06:08.0', 11, null, null, null, null, 1, 1, 55, 13, null);
INSERT INTO "BEWWBS07" VALUES (53, 1, 70, '2012-07-25 22:27:44.0', 11, 'j', null, '2 Uhr', null, 1, 1, 55, 13, null);
INSERT INTO "BEWWBS07" VALUES (49, 1, 68, '2012-06-26 11:13:07.0', 7, null, null, null, null, 2, 2, 56, 13, 2);
INSERT INTO "BEWWBS07" VALUES (74, 1, 67, '2012-12-11 13:48:42.0', 7, 'j', null, '10 Uhr', null, 2, 1, 55, 13, null);
INSERT INTO "BEWWBS07" VALUES (55, 1, 67, '2012-08-13 11:18:55.0', 11, 'j', null, '10 Uhr', null, 2, 1, 55, 13, null);
INSERT INTO "BEWWBS07" VALUES (54, 1, 67, '2012-08-13 11:16:31.0', 11, 'j', null, null, null, 2, 1, 55, 13, null);
INSERT INTO "BEWWBS07" VALUES (51, 1, 67, '2012-07-10 15:20:50.0', 29, 'j', null, null, null, 1, 1, 55, 13, null);
INSERT INTO "BEWWBS07" VALUES (48, 1, 67, '2012-06-23 17:17:03.0', 11, 'j', null, null, null, 1, 1, 55, 13, null);
INSERT INTO "BEWWBS07" VALUES (50, 1, 66, '2012-06-29 14:00:01.0', 7, null, null, null, null, 28, null, 56, 13, null);
INSERT INTO "BEWWBS07" VALUES (47, 1, 66, '2012-06-22 14:26:42.0', 29, null, null, null, null, 28, null, 56, 13, null);
INSERT INTO "BEWWBS07" VALUES (78, 1, 65, '2013-01-30 13:54:39.0', 7, null, null, null, null, 10, 10, 55, 13, 2);
INSERT INTO "BEWWBS07" VALUES (44, 1, 63, '2012-05-07 17:47:05.0', 29, null, null, null, null, 35, null, 55, 13, null);
INSERT INTO "BEWWBS07" VALUES (52, 1, 62, '2012-07-21 20:34:01.0', 7, 'j', null, null, null, 15, null, 55, 13, null);
INSERT INTO "BEWWBS07" VALUES (43, 1, 62, '2012-05-07 17:30:34.0', 29, null, null, null, null, 15, null, 55, 13, null);
INSERT INTO "BEWWBS07" VALUES (42, 1, 61, '2012-05-07 16:55:59.0', 29, null, null, null, null, 11, null, 55, 13, null);
INSERT INTO "BEWWBS07" VALUES (41, 1, 60, '2012-05-07 16:53:27.0', 29, null, null, null, null, 6, null, 55, 13, null);
INSERT INTO "BEWWBS07" VALUES (40, 1, 59, '2012-05-04 15:47:24.0', 29, null, null, null, null, 1095, null, 55, 13, 5);
INSERT INTO "BEWWBS07" VALUES (39, 1, 58, '2012-05-04 15:27:55.0', 29, null, null, null, null, 2, null, 55, 13, null);
INSERT INTO "BEWWBS07" VALUES (35, 1, 49, '2012-03-29 10:10:25.0', 13, null, null, null, null, 2, 2, 55, 13, 2);
INSERT INTO "BEWWBS07" VALUES (34, 1, 48, '2012-03-29 09:34:22.0', 13, null, null, null, null, 5, 5, 56, 13, 2);
INSERT INTO "BEWWBS07" VALUES (29, 1, 44, '2012-03-26 13:30:01.0', 29, null, null, null, null, 30, null, 55, 13, null);
INSERT INTO "BEWWBS07" VALUES (28, 1, 44, '2012-03-25 13:28:27.0', 29, null, null, null, null, 30, null, 55, 13, null);
INSERT INTO "BEWWBS07" VALUES (27, 1, 44, '2012-03-24 13:27:58.0', 29, null, null, null, null, 40, null, 55, 13, null);
INSERT INTO "BEWWBS07" VALUES (26, 1, 44, '2012-03-23 13:27:27.0', 29, null, null, null, null, 50, null, 55, 13, null);
INSERT INTO "BEWWBS07" VALUES (25, 1, 44, '2012-03-22 13:26:53.0', 29, null, null, null, null, 55, null, 55, 13, null);
INSERT INTO "BEWWBS07" VALUES (24, 1, 43, '2012-03-25 13:21:12.0', 37, null, null, null, null, 30, null, 55, 13, null);
INSERT INTO "BEWWBS07" VALUES (23, 1, 43, '2012-03-24 13:20:43.0', 37, null, null, null, null, 30, null, 55, 13, null);
INSERT INTO "BEWWBS07" VALUES (22, 1, 43, '2012-03-23 13:19:42.0', 37, null, null, null, null, 30, null, 55, 13, null);
INSERT INTO "BEWWBS07" VALUES (21, 1, 43, '2012-03-22 13:18:05.0', 37, null, null, null, null, 50, null, 55, 13, null);
INSERT INTO "BEWWBS07" VALUES (20, 1, 43, '2012-03-21 13:16:46.0', 37, null, null, null, null, 60, null, 55, 13, null);
INSERT INTO "BEWWBS07" VALUES (19, 1, 42, '2012-03-25 13:11:58.0', 13, null, null, null, null, 20, null, 55, 13, null);
INSERT INTO "BEWWBS07" VALUES (18, 1, 42, '2012-03-23 13:10:09.0', 13, null, null, null, null, 30, null, 55, 13, null);
INSERT INTO "BEWWBS07" VALUES (17, 1, 42, '2012-03-22 13:08:23.0', 13, null, null, null, null, 40, null, 55, 13, null);
INSERT INTO "BEWWBS07" VALUES (16, 1, 42, '2012-03-21 13:05:08.0', 13, null, null, null, null, 40, null, 55, 13, null);
INSERT INTO "BEWWBS07" VALUES (15, 1, 42, '2012-03-20 13:03:35.0', 13, null, null, null, null, 50, null, 55, 13, null);
INSERT INTO "BEWWBS07" VALUES (9, 1, 41, '2012-03-23 10:28:41.0', 29, 'j', null, '1 Uhr', null, 0, null, 55, 13, null);
INSERT INTO "BEWWBS07" VALUES (61, 1, 40, '2012-08-15 19:54:35.0', 11, 'j', null, '2 Uhr', null, 2, null, 77, 14, null);
INSERT INTO "BEWWBS07" VALUES (8, 1, 40, '2012-03-23 08:54:18.0', 29, null, null, null, null, 2, null, 77, 14, null);
INSERT INTO "BEWWBS07" VALUES (7, 1, 39, '2012-03-21 15:29:06.0', 29, null, null, null, null, 2, 4, 55, 13, null);
INSERT INTO "BEWWBS07" VALUES (6, 1, 38, '2012-03-21 15:13:47.0', 29, null, null, null, null, 10, 5, 90, 16, 1);
INSERT INTO "BEWWBS07" VALUES (60, 1, 34, '2012-08-15 18:52:39.0', 11, 'j', null, '2 Uhr', null, 2, 4, 55, 13, 2);
INSERT INTO "BEWWBS07" VALUES (4, 1, 34, '2012-03-20 12:03:27.0', 11, null, null, null, null, 2, 4, 55, 13, 2);
INSERT INTO "BEWWBS07" VALUES (2, 1, 33, '2012-03-20 09:07:42.0', 11, null, null, null, null, 30, null, 55, 13, null);
INSERT INTO "BEWWBS07" VALUES (1, 1, 33, '2012-03-19 15:38:35.0', 11, null, null, null, null, 10, null, 55, 13, null);
INSERT INTO "BEWWBS07" VALUES (36, 1, 51, '2012-03-29 10:21:29.0', 11, 'j', null, '4 Uhr', 'gggg', 4, 4, 56, 13, null);
INSERT INTO "BEWWBS07" VALUES (3, 1, 32, '2012-03-20 09:24:31.0', 11, null, null, null, 'bla bla
bla', 5, 2, 55, 13, 4);
COMMIT;

-- ----------------------------
-- Table structure for BEWWBZ07
-- ----------------------------
DROP TABLE IF EXISTS "BEWWBZ07";
CREATE TABLE "BEWWBZ07" (
"NR"  INTEGER NOT NULL,
"KENMDT07_NR"  INTEGER NOT NULL,
"KENWBS07_NR"  NUMBER(12),
"BEWWBS07_NR"  NUMBER(12) NOT NULL,
"FREITEXT"  VARCHAR2(4000),
PRIMARY KEY ("NR" ASC, "KENMDT07_NR" ASC)
)

;

-- ----------------------------
-- Records of BEWWBZ07
-- ----------------------------
BEGIN;
INSERT INTO "BEWWBZ07" VALUES (76, 1, 360, 1, null);
INSERT INTO "BEWWBZ07" VALUES (84, 1, 361, 1, null);
INSERT INTO "BEWWBZ07" VALUES (164, 1, 371, 1, null);
INSERT INTO "BEWWBZ07" VALUES (204, 1, 376, 1, null);
INSERT INTO "BEWWBZ07" VALUES (241, 1, 380, 1, null);
INSERT INTO "BEWWBZ07" VALUES (350, 1, 332, 2, null);
INSERT INTO "BEWWBZ07" VALUES (360, 1, 345, 2, null);
INSERT INTO "BEWWBZ07" VALUES (370, 1, 352, 2, null);
INSERT INTO "BEWWBZ07" VALUES (390, 1, 356, 2, null);
INSERT INTO "BEWWBZ07" VALUES (408, 1, 359, 2, null);
INSERT INTO "BEWWBZ07" VALUES (416, 1, 360, 2, null);
INSERT INTO "BEWWBZ07" VALUES (424, 1, 361, 2, null);
INSERT INTO "BEWWBZ07" VALUES (432, 1, 362, 2, null);
INSERT INTO "BEWWBZ07" VALUES (504, 1, 371, 2, null);
INSERT INTO "BEWWBZ07" VALUES (512, 1, 372, 2, null);
INSERT INTO "BEWWBZ07" VALUES (520, 1, 373, 2, null);
INSERT INTO "BEWWBZ07" VALUES (581, 1, 380, 2, null);
INSERT INTO "BEWWBZ07" VALUES (594, 1, 385, 2, null);
INSERT INTO "BEWWBZ07" VALUES (607, 1, 386, 2, null);
INSERT INTO "BEWWBZ07" VALUES (748, 1, 359, 3, null);
INSERT INTO "BEWWBZ07" VALUES (756, 1, 360, 3, null);
INSERT INTO "BEWWBZ07" VALUES (772, 1, 362, 3, null);
INSERT INTO "BEWWBZ07" VALUES (788, 1, 364, 3, null);
INSERT INTO "BEWWBZ07" VALUES (852, 1, 372, 3, null);
INSERT INTO "BEWWBZ07" VALUES (876, 1, 375, 3, null);
INSERT INTO "BEWWBZ07" VALUES (892, 1, 377, 3, null);
INSERT INTO "BEWWBZ07" VALUES (921, 1, 380, 3, null);
INSERT INTO "BEWWBZ07" VALUES (947, 1, 386, 3, null);
INSERT INTO "BEWWBZ07" VALUES (960, 1, 387, 3, null);
INSERT INTO "BEWWBZ07" VALUES (1021, 1, 389, 3, null);
INSERT INTO "BEWWBZ07" VALUES (1445, 1, 361, 5, null);
INSERT INTO "BEWWBZ07" VALUES (1461, 1, 363, 5, null);
INSERT INTO "BEWWBZ07" VALUES (1533, 1, 372, 5, null);
INSERT INTO "BEWWBZ07" VALUES (1541, 1, 373, 5, null);
INSERT INTO "BEWWBZ07" VALUES (1615, 1, 385, 5, null);
INSERT INTO "BEWWBZ07" VALUES (1628, 1, 386, 5, null);
INSERT INTO "BEWWBZ07" VALUES (1641, 1, 387, 5, null);
INSERT INTO "BEWWBZ07" VALUES (1667, 1, 393, 5, null);
INSERT INTO "BEWWBZ07" VALUES (1702, 1, 388, 5, null);
INSERT INTO "BEWWBZ07" VALUES (1712, 1, 539, 6, null);
INSERT INTO "BEWWBZ07" VALUES (1722, 1, 552, 6, null);
INSERT INTO "BEWWBZ07" VALUES (1732, 1, 557, 6, null);
INSERT INTO "BEWWBZ07" VALUES (1778, 1, 567, 6, null);
INSERT INTO "BEWWBZ07" VALUES (1802, 1, 570, 6, null);
INSERT INTO "BEWWBZ07" VALUES (1906, 1, 583, 6, null);
INSERT INTO "BEWWBZ07" VALUES (1943, 1, 587, 6, null);
INSERT INTO "BEWWBZ07" VALUES (1969, 1, 593, 6, null);
INSERT INTO "BEWWBZ07" VALUES (2052, 1, 331, 7, null);
INSERT INTO "BEWWBZ07" VALUES (2142, 1, 363, 7, null);
INSERT INTO "BEWWBZ07" VALUES (2206, 1, 371, 7, null);
INSERT INTO "BEWWBZ07" VALUES (2214, 1, 372, 7, null);
INSERT INTO "BEWWBZ07" VALUES (2392, 1, 408, 8, null);
INSERT INTO "BEWWBZ07" VALUES (2412, 1, 424, 8, null);
INSERT INTO "BEWWBZ07" VALUES (2570, 1, 449, 8, null);
INSERT INTO "BEWWBZ07" VALUES (2578, 1, 450, 8, null);
INSERT INTO "BEWWBZ07" VALUES (2636, 1, 460, 8, null);
INSERT INTO "BEWWBZ07" VALUES (2662, 1, 462, 8, null);
INSERT INTO "BEWWBZ07" VALUES (2723, 1, 464, 8, null);
INSERT INTO "BEWWBZ07" VALUES (2733, 1, 331, 9, null);
INSERT INTO "BEWWBZ07" VALUES (2753, 1, 349, 9, null);
INSERT INTO "BEWWBZ07" VALUES (2763, 1, null, 9, 'keiner');
INSERT INTO "BEWWBZ07" VALUES (2773, 1, 356, 9, null);
INSERT INTO "BEWWBZ07" VALUES (2783, 1, null, 9, 'keine');
INSERT INTO "BEWWBZ07" VALUES (2791, 1, 359, 9, null);
INSERT INTO "BEWWBZ07" VALUES (2799, 1, 360, 9, null);
INSERT INTO "BEWWBZ07" VALUES (2887, 1, 371, 9, null);
INSERT INTO "BEWWBZ07" VALUES (2895, 1, 372, 9, null);
INSERT INTO "BEWWBZ07" VALUES (2964, 1, 380, 9, null);
INSERT INTO "BEWWBZ07" VALUES (2977, 1, 385, 9, null);
INSERT INTO "BEWWBZ07" VALUES (2990, 1, 386, 9, null);
INSERT INTO "BEWWBZ07" VALUES (3003, 1, 387, 9, null);
INSERT INTO "BEWWBZ07" VALUES (3064, 1, 381, 9, null);
INSERT INTO "BEWWBZ07" VALUES (3065, 1, 388, 9, null);
INSERT INTO "BEWWBZ07" VALUES (3085, 1, 348, 10, null);
INSERT INTO "BEWWBZ07" VALUES (3095, 1, 349, 10, null);
INSERT INTO "BEWWBZ07" VALUES (3115, 1, 354, 10, null);
INSERT INTO "BEWWBZ07" VALUES (3133, 1, 359, 10, null);
INSERT INTO "BEWWBZ07" VALUES (3141, 1, 360, 10, null);
INSERT INTO "BEWWBZ07" VALUES (3229, 1, 371, 10, null);
INSERT INTO "BEWWBZ07" VALUES (3237, 1, 372, 10, null);
INSERT INTO "BEWWBZ07" VALUES (3306, 1, 380, 10, null);
INSERT INTO "BEWWBZ07" VALUES (3345, 1, 387, 10, null);
INSERT INTO "BEWWBZ07" VALUES (3406, 1, 382, 10, null);
INSERT INTO "BEWWBZ07" VALUES (3407, 1, 388, 10, null);
INSERT INTO "BEWWBZ07" VALUES (3427, 1, 347, 11, null);
INSERT INTO "BEWWBZ07" VALUES (3437, 1, 350, 11, null);
INSERT INTO "BEWWBZ07" VALUES (3475, 1, 359, 11, null);
INSERT INTO "BEWWBZ07" VALUES (3483, 1, 360, 11, null);
INSERT INTO "BEWWBZ07" VALUES (3571, 1, 371, 11, null);
INSERT INTO "BEWWBZ07" VALUES (3579, 1, 372, 11, null);
INSERT INTO "BEWWBZ07" VALUES (3648, 1, 380, 11, null);
INSERT INTO "BEWWBZ07" VALUES (3687, 1, 387, 11, null);
INSERT INTO "BEWWBZ07" VALUES (4107, 1, 347, 13, null);
INSERT INTO "BEWWBZ07" VALUES (4117, 1, 350, 13, null);
INSERT INTO "BEWWBZ07" VALUES (4155, 1, 359, 13, null);
INSERT INTO "BEWWBZ07" VALUES (4163, 1, 360, 13, null);
INSERT INTO "BEWWBZ07" VALUES (4251, 1, 371, 13, null);
INSERT INTO "BEWWBZ07" VALUES (4259, 1, 372, 13, null);
INSERT INTO "BEWWBZ07" VALUES (4328, 1, 380, 13, null);
INSERT INTO "BEWWBZ07" VALUES (4367, 1, 387, 13, null);
INSERT INTO "BEWWBZ07" VALUES (4447, 1, 346, 14, null);
INSERT INTO "BEWWBZ07" VALUES (4457, 1, 350, 14, null);
INSERT INTO "BEWWBZ07" VALUES (4495, 1, 359, 14, null);
INSERT INTO "BEWWBZ07" VALUES (4503, 1, 360, 14, null);
INSERT INTO "BEWWBZ07" VALUES (4591, 1, 371, 14, null);
INSERT INTO "BEWWBZ07" VALUES (4599, 1, 372, 14, null);
INSERT INTO "BEWWBZ07" VALUES (4668, 1, 380, 14, null);
INSERT INTO "BEWWBZ07" VALUES (4707, 1, 387, 14, null);
INSERT INTO "BEWWBZ07" VALUES (4787, 1, 347, 15, null);
INSERT INTO "BEWWBZ07" VALUES (4797, 1, 351, 15, null);
INSERT INTO "BEWWBZ07" VALUES (4851, 1, 361, 15, null);
INSERT INTO "BEWWBZ07" VALUES (4859, 1, 362, 15, null);
INSERT INTO "BEWWBZ07" VALUES (4931, 1, 371, 15, null);
INSERT INTO "BEWWBZ07" VALUES (4947, 1, 373, 15, null);
INSERT INTO "BEWWBZ07" VALUES (5008, 1, 380, 15, null);
INSERT INTO "BEWWBZ07" VALUES (5127, 1, 346, 16, null);
INSERT INTO "BEWWBZ07" VALUES (5137, 1, 351, 16, null);
INSERT INTO "BEWWBZ07" VALUES (5191, 1, 361, 16, null);
INSERT INTO "BEWWBZ07" VALUES (5199, 1, 362, 16, null);
INSERT INTO "BEWWBZ07" VALUES (5271, 1, 371, 16, null);
INSERT INTO "BEWWBZ07" VALUES (5287, 1, 373, 16, null);
INSERT INTO "BEWWBZ07" VALUES (5348, 1, 380, 16, null);
INSERT INTO "BEWWBZ07" VALUES (5467, 1, 345, 17, null);
INSERT INTO "BEWWBZ07" VALUES (5477, 1, 351, 17, null);
INSERT INTO "BEWWBZ07" VALUES (5531, 1, 361, 17, null);
INSERT INTO "BEWWBZ07" VALUES (5539, 1, 362, 17, null);
INSERT INTO "BEWWBZ07" VALUES (5611, 1, 371, 17, null);
INSERT INTO "BEWWBZ07" VALUES (5627, 1, 373, 17, null);
INSERT INTO "BEWWBZ07" VALUES (5688, 1, 380, 17, null);
INSERT INTO "BEWWBZ07" VALUES (5807, 1, 346, 18, null);
INSERT INTO "BEWWBZ07" VALUES (5817, 1, 351, 18, null);
INSERT INTO "BEWWBZ07" VALUES (5871, 1, 361, 18, null);
INSERT INTO "BEWWBZ07" VALUES (5879, 1, 362, 18, null);
INSERT INTO "BEWWBZ07" VALUES (5951, 1, 371, 18, null);
INSERT INTO "BEWWBZ07" VALUES (5967, 1, 373, 18, null);
INSERT INTO "BEWWBZ07" VALUES (6028, 1, 380, 18, null);
INSERT INTO "BEWWBZ07" VALUES (6147, 1, 344, 19, null);
INSERT INTO "BEWWBZ07" VALUES (6157, 1, 351, 19, null);
INSERT INTO "BEWWBZ07" VALUES (6211, 1, 361, 19, null);
INSERT INTO "BEWWBZ07" VALUES (6219, 1, 362, 19, null);
INSERT INTO "BEWWBZ07" VALUES (6291, 1, 371, 19, null);
INSERT INTO "BEWWBZ07" VALUES (6307, 1, 373, 19, null);
INSERT INTO "BEWWBZ07" VALUES (6368, 1, 380, 19, null);
INSERT INTO "BEWWBZ07" VALUES (6487, 1, 347, 20, null);
INSERT INTO "BEWWBZ07" VALUES (6535, 1, 359, 20, null);
INSERT INTO "BEWWBZ07" VALUES (6543, 1, 360, 20, null);
INSERT INTO "BEWWBZ07" VALUES (6631, 1, 371, 20, null);
INSERT INTO "BEWWBZ07" VALUES (6639, 1, 372, 20, null);
INSERT INTO "BEWWBZ07" VALUES (6708, 1, 380, 20, null);
INSERT INTO "BEWWBZ07" VALUES (6747, 1, 387, 20, null);
INSERT INTO "BEWWBZ07" VALUES (6827, 1, 346, 21, null);
INSERT INTO "BEWWBZ07" VALUES (6875, 1, 359, 21, null);
INSERT INTO "BEWWBZ07" VALUES (6883, 1, 360, 21, null);
INSERT INTO "BEWWBZ07" VALUES (6971, 1, 371, 21, null);
INSERT INTO "BEWWBZ07" VALUES (6979, 1, 372, 21, null);
INSERT INTO "BEWWBZ07" VALUES (7048, 1, 380, 21, null);
INSERT INTO "BEWWBZ07" VALUES (7087, 1, 387, 21, null);
INSERT INTO "BEWWBZ07" VALUES (7167, 1, 345, 22, null);
INSERT INTO "BEWWBZ07" VALUES (7215, 1, 359, 22, null);
INSERT INTO "BEWWBZ07" VALUES (7223, 1, 360, 22, null);
INSERT INTO "BEWWBZ07" VALUES (7311, 1, 371, 22, null);
INSERT INTO "BEWWBZ07" VALUES (7319, 1, 372, 22, null);
INSERT INTO "BEWWBZ07" VALUES (7388, 1, 380, 22, null);
INSERT INTO "BEWWBZ07" VALUES (7427, 1, 387, 22, null);
INSERT INTO "BEWWBZ07" VALUES (7507, 1, 346, 23, null);
INSERT INTO "BEWWBZ07" VALUES (7555, 1, 359, 23, null);
INSERT INTO "BEWWBZ07" VALUES (7563, 1, 360, 23, null);
INSERT INTO "BEWWBZ07" VALUES (7651, 1, 371, 23, null);
INSERT INTO "BEWWBZ07" VALUES (7659, 1, 372, 23, null);
INSERT INTO "BEWWBZ07" VALUES (7728, 1, 380, 23, null);
INSERT INTO "BEWWBZ07" VALUES (7767, 1, 387, 23, null);
INSERT INTO "BEWWBZ07" VALUES (7847, 1, 344, 24, null);
INSERT INTO "BEWWBZ07" VALUES (7895, 1, 359, 24, null);
INSERT INTO "BEWWBZ07" VALUES (7903, 1, 360, 24, null);
INSERT INTO "BEWWBZ07" VALUES (7991, 1, 371, 24, null);
INSERT INTO "BEWWBZ07" VALUES (7999, 1, 372, 24, null);
INSERT INTO "BEWWBZ07" VALUES (8068, 1, 380, 24, null);
INSERT INTO "BEWWBZ07" VALUES (8107, 1, 387, 24, null);
INSERT INTO "BEWWBZ07" VALUES (8187, 1, 346, 25, null);
INSERT INTO "BEWWBZ07" VALUES (8243, 1, 360, 25, null);
INSERT INTO "BEWWBZ07" VALUES (8251, 1, 361, 25, null);
INSERT INTO "BEWWBZ07" VALUES (8339, 1, 372, 25, null);
INSERT INTO "BEWWBZ07" VALUES (8347, 1, 373, 25, null);
INSERT INTO "BEWWBZ07" VALUES (8408, 1, 380, 25, null);
INSERT INTO "BEWWBZ07" VALUES (8527, 1, 346, 26, null);
INSERT INTO "BEWWBZ07" VALUES (8583, 1, 360, 26, null);
INSERT INTO "BEWWBZ07" VALUES (8591, 1, 361, 26, null);
INSERT INTO "BEWWBZ07" VALUES (8679, 1, 372, 26, null);
INSERT INTO "BEWWBZ07" VALUES (8687, 1, 373, 26, null);
INSERT INTO "BEWWBZ07" VALUES (8748, 1, 380, 26, null);
INSERT INTO "BEWWBZ07" VALUES (8867, 1, 345, 27, null);
INSERT INTO "BEWWBZ07" VALUES (8923, 1, 360, 27, null);
INSERT INTO "BEWWBZ07" VALUES (8931, 1, 361, 27, null);
INSERT INTO "BEWWBZ07" VALUES (9019, 1, 372, 27, null);
INSERT INTO "BEWWBZ07" VALUES (9027, 1, 373, 27, null);
INSERT INTO "BEWWBZ07" VALUES (9088, 1, 380, 27, null);
INSERT INTO "BEWWBZ07" VALUES (9207, 1, 344, 28, null);
INSERT INTO "BEWWBZ07" VALUES (9263, 1, 360, 28, null);
INSERT INTO "BEWWBZ07" VALUES (9271, 1, 361, 28, null);
INSERT INTO "BEWWBZ07" VALUES (9359, 1, 372, 28, null);
INSERT INTO "BEWWBZ07" VALUES (9367, 1, 373, 28, null);
INSERT INTO "BEWWBZ07" VALUES (9428, 1, 380, 28, null);
INSERT INTO "BEWWBZ07" VALUES (9547, 1, 345, 29, null);
INSERT INTO "BEWWBZ07" VALUES (9603, 1, 360, 29, null);
INSERT INTO "BEWWBZ07" VALUES (9611, 1, 361, 29, null);
INSERT INTO "BEWWBZ07" VALUES (9699, 1, 372, 29, null);
INSERT INTO "BEWWBZ07" VALUES (9707, 1, 373, 29, null);
INSERT INTO "BEWWBZ07" VALUES (9768, 1, 380, 29, null);
INSERT INTO "BEWWBZ07" VALUES (9887, 1, 346, 30, null);
INSERT INTO "BEWWBZ07" VALUES (9935, 1, 359, 30, null);
INSERT INTO "BEWWBZ07" VALUES (9943, 1, 360, 30, null);
INSERT INTO "BEWWBZ07" VALUES (10108, 1, 380, 30, null);
INSERT INTO "BEWWBZ07" VALUES (10227, 1, 345, 31, null);
INSERT INTO "BEWWBZ07" VALUES (10275, 1, 359, 31, null);
INSERT INTO "BEWWBZ07" VALUES (10283, 1, 360, 31, null);
INSERT INTO "BEWWBZ07" VALUES (10448, 1, 380, 31, null);
INSERT INTO "BEWWBZ07" VALUES (10567, 1, 345, 32, null);
INSERT INTO "BEWWBZ07" VALUES (10615, 1, 359, 32, null);
INSERT INTO "BEWWBZ07" VALUES (10623, 1, 360, 32, null);
INSERT INTO "BEWWBZ07" VALUES (10788, 1, 380, 32, null);
INSERT INTO "BEWWBZ07" VALUES (10907, 1, 344, 33, null);
INSERT INTO "BEWWBZ07" VALUES (10955, 1, 359, 33, null);
INSERT INTO "BEWWBZ07" VALUES (10963, 1, 360, 33, null);
INSERT INTO "BEWWBZ07" VALUES (11128, 1, 380, 33, null);
INSERT INTO "BEWWBZ07" VALUES (11237, 1, 331, 34, null);
INSERT INTO "BEWWBZ07" VALUES (11247, 1, 345, 34, null);
INSERT INTO "BEWWBZ07" VALUES (11257, 1, 349, 34, null);
INSERT INTO "BEWWBZ07" VALUES (11295, 1, 359, 34, null);
INSERT INTO "BEWWBZ07" VALUES (11399, 1, 372, 34, null);
INSERT INTO "BEWWBZ07" VALUES (11468, 1, 380, 34, null);
INSERT INTO "BEWWBZ07" VALUES (11533, 1, 393, 34, null);
INSERT INTO "BEWWBZ07" VALUES (11577, 1, 331, 35, null);
INSERT INTO "BEWWBZ07" VALUES (11587, 1, 347, 35, null);
INSERT INTO "BEWWBZ07" VALUES (11635, 1, 359, 35, null);
INSERT INTO "BEWWBZ07" VALUES (11659, 1, 362, 35, null);
INSERT INTO "BEWWBZ07" VALUES (11731, 1, 371, 35, null);
INSERT INTO "BEWWBZ07" VALUES (11808, 1, 380, 35, null);
INSERT INTO "BEWWBZ07" VALUES (11917, 1, 331, 36, null);
INSERT INTO "BEWWBZ07" VALUES (11975, 1, 359, 36, null);
INSERT INTO "BEWWBZ07" VALUES (12071, 1, 371, 36, null);
INSERT INTO "BEWWBZ07" VALUES (12079, 1, 372, 36, null);
INSERT INTO "BEWWBZ07" VALUES (12148, 1, 380, 36, null);
INSERT INTO "BEWWBZ07" VALUES (12248, 1, 383, 36, null);
INSERT INTO "BEWWBZ07" VALUES (12258, 1, 331, 37, null);
INSERT INTO "BEWWBZ07" VALUES (12316, 1, 359, 37, null);
INSERT INTO "BEWWBZ07" VALUES (12412, 1, 371, 37, null);
INSERT INTO "BEWWBZ07" VALUES (12420, 1, 372, 37, null);
INSERT INTO "BEWWBZ07" VALUES (12489, 1, 380, 37, null);
INSERT INTO "BEWWBZ07" VALUES (12589, 1, 383, 37, null);
INSERT INTO "BEWWBZ07" VALUES (12599, 1, 331, 38, null);
INSERT INTO "BEWWBZ07" VALUES (12609, 1, 345, 38, null);
INSERT INTO "BEWWBZ07" VALUES (12619, 1, 350, 38, null);
INSERT INTO "BEWWBZ07" VALUES (12657, 1, 359, 38, null);
INSERT INTO "BEWWBZ07" VALUES (12753, 1, 371, 38, null);
INSERT INTO "BEWWBZ07" VALUES (12830, 1, 380, 38, null);
INSERT INTO "BEWWBZ07" VALUES (12939, 1, 333, 39, null);
INSERT INTO "BEWWBZ07" VALUES (12949, 1, 345, 39, null);
INSERT INTO "BEWWBZ07" VALUES (12959, 1, 349, 39, null);
INSERT INTO "BEWWBZ07" VALUES (12979, 1, 354, 39, null);
INSERT INTO "BEWWBZ07" VALUES (12997, 1, 359, 39, null);
INSERT INTO "BEWWBZ07" VALUES (13021, 1, 362, 39, null);
INSERT INTO "BEWWBZ07" VALUES (13045, 1, 365, 39, null);
INSERT INTO "BEWWBZ07" VALUES (13101, 1, 372, 39, null);
INSERT INTO "BEWWBZ07" VALUES (13117, 1, 374, 39, null);
INSERT INTO "BEWWBZ07" VALUES (13133, 1, 376, 39, null);
INSERT INTO "BEWWBZ07" VALUES (13170, 1, 380, 39, null);
INSERT INTO "BEWWBZ07" VALUES (13196, 1, 386, 39, null);
INSERT INTO "BEWWBZ07" VALUES (13270, 1, 382, 39, null);
INSERT INTO "BEWWBZ07" VALUES (13280, 1, 332, 40, null);
INSERT INTO "BEWWBZ07" VALUES (13300, 1, 350, 40, null);
INSERT INTO "BEWWBZ07" VALUES (13346, 1, 360, 40, null);
INSERT INTO "BEWWBZ07" VALUES (13354, 1, 361, 40, null);
INSERT INTO "BEWWBZ07" VALUES (13450, 1, 373, 40, null);
INSERT INTO "BEWWBZ07" VALUES (13458, 1, 374, 40, null);
INSERT INTO "BEWWBZ07" VALUES (13630, 1, 346, 41, null);
INSERT INTO "BEWWBZ07" VALUES (13640, 1, 350, 41, null);
INSERT INTO "BEWWBZ07" VALUES (13980, 1, 349, 42, null);
INSERT INTO "BEWWBZ07" VALUES (14300, 1, 333, 43, null);
INSERT INTO "BEWWBZ07" VALUES (14320, 1, 349, 43, null);
INSERT INTO "BEWWBZ07" VALUES (14990, 1, 344, 45, null);
INSERT INTO "BEWWBZ07" VALUES (15038, 1, 359, 45, null);
INSERT INTO "BEWWBZ07" VALUES (15046, 1, 360, 45, null);
INSERT INTO "BEWWBZ07" VALUES (15054, 1, 361, 45, null);
INSERT INTO "BEWWBZ07" VALUES (15211, 1, 380, 45, null);
INSERT INTO "BEWWBZ07" VALUES (15561, 1, 335, 48, null);
INSERT INTO "BEWWBZ07" VALUES (15571, 1, 345, 48, null);
INSERT INTO "BEWWBZ07" VALUES (15581, 1, 350, 48, null);
INSERT INTO "BEWWBZ07" VALUES (15601, 1, 354, 48, null);
INSERT INTO "BEWWBZ07" VALUES (15619, 1, 359, 48, null);
INSERT INTO "BEWWBZ07" VALUES (15715, 1, 371, 48, null);
INSERT INTO "BEWWBZ07" VALUES (15723, 1, 372, 48, null);
INSERT INTO "BEWWBZ07" VALUES (15792, 1, 380, 48, null);
INSERT INTO "BEWWBZ07" VALUES (15892, 1, 382, 48, null);
INSERT INTO "BEWWBZ07" VALUES (16582, 1, 335, 51, null);
INSERT INTO "BEWWBZ07" VALUES (16592, 1, 345, 51, null);
INSERT INTO "BEWWBZ07" VALUES (16602, 1, 350, 51, null);
INSERT INTO "BEWWBZ07" VALUES (16622, 1, 354, 51, null);
INSERT INTO "BEWWBZ07" VALUES (16640, 1, 359, 51, null);
INSERT INTO "BEWWBZ07" VALUES (16736, 1, 371, 51, null);
INSERT INTO "BEWWBZ07" VALUES (16744, 1, 372, 51, null);
INSERT INTO "BEWWBZ07" VALUES (16813, 1, 380, 51, null);
INSERT INTO "BEWWBZ07" VALUES (16922, 1, 333, 52, null);
INSERT INTO "BEWWBZ07" VALUES (16942, 1, 349, 52, null);
INSERT INTO "BEWWBZ07" VALUES (16962, 1, 354, 52, null);
INSERT INTO "BEWWBZ07" VALUES (17004, 1, 362, 52, null);
INSERT INTO "BEWWBZ07" VALUES (17028, 1, 365, 52, null);
INSERT INTO "BEWWBZ07" VALUES (17124, 1, 377, 52, null);
INSERT INTO "BEWWBZ07" VALUES (17166, 1, 385, 52, null);
INSERT INTO "BEWWBZ07" VALUES (17192, 1, 387, 52, null);
INSERT INTO "BEWWBZ07" VALUES (17262, 1, 335, 53, null);
INSERT INTO "BEWWBZ07" VALUES (17320, 1, 359, 53, null);
INSERT INTO "BEWWBZ07" VALUES (17416, 1, 371, 53, null);
INSERT INTO "BEWWBZ07" VALUES (17424, 1, 372, 53, null);
INSERT INTO "BEWWBZ07" VALUES (17493, 1, 380, 53, null);
INSERT INTO "BEWWBZ07" VALUES (17593, 1, 382, 53, null);
INSERT INTO "BEWWBZ07" VALUES (17603, 1, 335, 54, null);
INSERT INTO "BEWWBZ07" VALUES (17613, 1, 345, 54, null);
INSERT INTO "BEWWBZ07" VALUES (17623, 1, 350, 54, null);
INSERT INTO "BEWWBZ07" VALUES (17643, 1, 356, 54, null);
INSERT INTO "BEWWBZ07" VALUES (17661, 1, 359, 54, null);
INSERT INTO "BEWWBZ07" VALUES (17757, 1, 371, 54, null);
INSERT INTO "BEWWBZ07" VALUES (17765, 1, 372, 54, null);
INSERT INTO "BEWWBZ07" VALUES (17834, 1, 380, 54, null);
INSERT INTO "BEWWBZ07" VALUES (17943, 1, 335, 55, null);
INSERT INTO "BEWWBZ07" VALUES (17953, 1, 345, 55, null);
INSERT INTO "BEWWBZ07" VALUES (17963, 1, 350, 55, null);
INSERT INTO "BEWWBZ07" VALUES (17983, 1, 356, 55, null);
INSERT INTO "BEWWBZ07" VALUES (18001, 1, 359, 55, null);
INSERT INTO "BEWWBZ07" VALUES (18097, 1, 371, 55, null);
INSERT INTO "BEWWBZ07" VALUES (18105, 1, 372, 55, null);
INSERT INTO "BEWWBZ07" VALUES (18174, 1, 380, 55, null);
INSERT INTO "BEWWBZ07" VALUES (18283, 1, 331, 56, null);
INSERT INTO "BEWWBZ07" VALUES (18341, 1, 359, 56, null);
INSERT INTO "BEWWBZ07" VALUES (18437, 1, 371, 56, null);
INSERT INTO "BEWWBZ07" VALUES (18445, 1, 372, 56, null);
INSERT INTO "BEWWBZ07" VALUES (18514, 1, 380, 56, null);
INSERT INTO "BEWWBZ07" VALUES (18623, 1, 331, 57, null);
INSERT INTO "BEWWBZ07" VALUES (18681, 1, 359, 57, null);
INSERT INTO "BEWWBZ07" VALUES (18777, 1, 371, 57, null);
INSERT INTO "BEWWBZ07" VALUES (18785, 1, 372, 57, null);
INSERT INTO "BEWWBZ07" VALUES (18854, 1, 380, 57, null);
INSERT INTO "BEWWBZ07" VALUES (18963, 1, 331, 58, null);
INSERT INTO "BEWWBZ07" VALUES (19021, 1, 359, 58, null);
INSERT INTO "BEWWBZ07" VALUES (19117, 1, 371, 58, null);
INSERT INTO "BEWWBZ07" VALUES (19125, 1, 372, 58, null);
INSERT INTO "BEWWBZ07" VALUES (19194, 1, 380, 58, null);
INSERT INTO "BEWWBZ07" VALUES (19303, 1, 406, 59, null);
INSERT INTO "BEWWBZ07" VALUES (19361, 1, 434, 59, null);
INSERT INTO "BEWWBZ07" VALUES (19457, 1, 446, 59, null);
INSERT INTO "BEWWBZ07" VALUES (19465, 1, 447, 59, null);
INSERT INTO "BEWWBZ07" VALUES (19534, 1, 455, 59, null);
INSERT INTO "BEWWBZ07" VALUES (19643, 1, 331, 60, null);
INSERT INTO "BEWWBZ07" VALUES (19701, 1, 359, 60, null);
INSERT INTO "BEWWBZ07" VALUES (19797, 1, 371, 60, null);
INSERT INTO "BEWWBZ07" VALUES (19805, 1, 372, 60, null);
INSERT INTO "BEWWBZ07" VALUES (19874, 1, 380, 60, null);
INSERT INTO "BEWWBZ07" VALUES (19974, 1, 382, 60, null);
INSERT INTO "BEWWBZ07" VALUES (19984, 1, 408, 61, null);
INSERT INTO "BEWWBZ07" VALUES (20004, 1, 424, 61, null);
INSERT INTO "BEWWBZ07" VALUES (20042, 1, 434, 61, null);
INSERT INTO "BEWWBZ07" VALUES (20162, 1, 449, 61, null);
INSERT INTO "BEWWBZ07" VALUES (20170, 1, 450, 61, null);
INSERT INTO "BEWWBZ07" VALUES (20228, 1, 460, 61, null);
INSERT INTO "BEWWBZ07" VALUES (20254, 1, 462, 61, null);
INSERT INTO "BEWWBZ07" VALUES (20324, 1, 331, 62, null);
INSERT INTO "BEWWBZ07" VALUES (20382, 1, 359, 62, null);
INSERT INTO "BEWWBZ07" VALUES (20478, 1, 371, 62, null);
INSERT INTO "BEWWBZ07" VALUES (20486, 1, 372, 62, null);
INSERT INTO "BEWWBZ07" VALUES (20555, 1, 380, 62, null);
INSERT INTO "BEWWBZ07" VALUES (20655, 1, 382, 62, null);
INSERT INTO "BEWWBZ07" VALUES (20665, 1, 331, 63, null);
INSERT INTO "BEWWBZ07" VALUES (20723, 1, 359, 63, null);
INSERT INTO "BEWWBZ07" VALUES (20819, 1, 371, 63, null);
INSERT INTO "BEWWBZ07" VALUES (20827, 1, 372, 63, null);
INSERT INTO "BEWWBZ07" VALUES (20896, 1, 380, 63, null);
INSERT INTO "BEWWBZ07" VALUES (20996, 1, 382, 63, null);
INSERT INTO "BEWWBZ07" VALUES (21006, 1, 674, 64, null);
INSERT INTO "BEWWBZ07" VALUES (21064, 1, 698, 64, null);
INSERT INTO "BEWWBZ07" VALUES (21184, 1, 713, 64, null);
INSERT INTO "BEWWBZ07" VALUES (21347, 1, 331, 65, null);
INSERT INTO "BEWWBZ07" VALUES (21357, 1, 348, 65, null);
INSERT INTO "BEWWBZ07" VALUES (21367, 1, 352, 65, null);
INSERT INTO "BEWWBZ07" VALUES (21377, 1, null, 65, 'faulig');
INSERT INTO "BEWWBZ07" VALUES (21387, 1, 358, 65, null);
INSERT INTO "BEWWBZ07" VALUES (21429, 1, 362, 65, null);
INSERT INTO "BEWWBZ07" VALUES (21469, 1, 367, 65, null);
INSERT INTO "BEWWBZ07" VALUES (21501, 1, 371, 65, null);
INSERT INTO "BEWWBZ07" VALUES (21533, 1, 375, 65, null);
INSERT INTO "BEWWBZ07" VALUES (21541, 1, 376, 65, null);
INSERT INTO "BEWWBZ07" VALUES (21630, 1, 392, 65, null);
INSERT INTO "BEWWBZ07" VALUES (21679, 1, 389, 65, null);
INSERT INTO "BEWWBZ07" VALUES (22030, 1, 670, 67, null);
INSERT INTO "BEWWBZ07" VALUES (22040, 1, 684, 67, null);
INSERT INTO "BEWWBZ07" VALUES (22371, 1, 331, 68, null);
INSERT INTO "BEWWBZ07" VALUES (22381, 1, 348, 68, null);
INSERT INTO "BEWWBZ07" VALUES (22391, 1, 352, 68, null);
INSERT INTO "BEWWBZ07" VALUES (22401, 1, null, 68, 'faulig');
INSERT INTO "BEWWBZ07" VALUES (22411, 1, 358, 68, null);
INSERT INTO "BEWWBZ07" VALUES (22453, 1, 362, 68, null);
INSERT INTO "BEWWBZ07" VALUES (22493, 1, 367, 68, null);
INSERT INTO "BEWWBZ07" VALUES (22525, 1, 371, 68, null);
INSERT INTO "BEWWBZ07" VALUES (22557, 1, 375, 68, null);
INSERT INTO "BEWWBZ07" VALUES (22565, 1, 376, 68, null);
INSERT INTO "BEWWBZ07" VALUES (22654, 1, 392, 68, null);
INSERT INTO "BEWWBZ07" VALUES (22712, 1, 671, 69, null);
INSERT INTO "BEWWBZ07" VALUES (22722, 1, 683, 69, null);
INSERT INTO "BEWWBZ07" VALUES (22732, 1, 688, 69, null);
INSERT INTO "BEWWBZ07" VALUES (22752, 1, 693, 69, null);
INSERT INTO "BEWWBZ07" VALUES (22770, 1, 698, 69, null);
INSERT INTO "BEWWBZ07" VALUES (22874, 1, 711, 69, null);
INSERT INTO "BEWWBZ07" VALUES (22943, 1, 719, 69, null);
INSERT INTO "BEWWBZ07" VALUES (22969, 1, 721, 69, null);
INSERT INTO "BEWWBZ07" VALUES (22979, 1, 670, 70, null);
INSERT INTO "BEWWBZ07" VALUES (22989, 1, 684, 70, null);
INSERT INTO "BEWWBZ07" VALUES (22999, 1, 690, 70, null);
INSERT INTO "BEWWBZ07" VALUES (23009, 1, null, 70, 'acdsfv');
INSERT INTO "BEWWBZ07" VALUES (23019, 1, 693, 70, null);
INSERT INTO "BEWWBZ07" VALUES (23029, 1, null, 70, 'fvdsfbdgfbf');
INSERT INTO "BEWWBZ07" VALUES (23037, 1, 698, 70, null);
INSERT INTO "BEWWBZ07" VALUES (23061, 1, 701, 70, null);
INSERT INTO "BEWWBZ07" VALUES (23141, 1, 711, 70, null);
INSERT INTO "BEWWBZ07" VALUES (23149, 1, 712, 70, null);
INSERT INTO "BEWWBZ07" VALUES (23210, 1, 719, 70, null);
INSERT INTO "BEWWBZ07" VALUES (23236, 1, 721, 70, null);
INSERT INTO "BEWWBZ07" VALUES (23320, 1, 674, 71, null);
INSERT INTO "BEWWBZ07" VALUES (23330, 1, 684, 71, null);
INSERT INTO "BEWWBZ07" VALUES (23340, 1, 688, 71, null);
INSERT INTO "BEWWBZ07" VALUES (23360, 1, 693, 71, null);
INSERT INTO "BEWWBZ07" VALUES (23410, 1, 702, 71, null);
INSERT INTO "BEWWBZ07" VALUES (23418, 1, 703, 71, null);
INSERT INTO "BEWWBZ07" VALUES (23474, 1, 710, 71, null);
INSERT INTO "BEWWBZ07" VALUES (23551, 1, 719, 71, null);
INSERT INTO "BEWWBZ07" VALUES (23661, 1, 674, 72, null);
INSERT INTO "BEWWBZ07" VALUES (23751, 1, 702, 72, null);
INSERT INTO "BEWWBZ07" VALUES (23815, 1, 710, 72, null);
INSERT INTO "BEWWBZ07" VALUES (24002, 1, 670, 73, null);
INSERT INTO "BEWWBZ07" VALUES (24060, 1, 698, 73, null);
INSERT INTO "BEWWBZ07" VALUES (24156, 1, 710, 73, null);
INSERT INTO "BEWWBZ07" VALUES (24164, 1, 711, 73, null);
INSERT INTO "BEWWBZ07" VALUES (24272, 1, 722, 73, null);
INSERT INTO "BEWWBZ07" VALUES (24343, 1, 335, 74, null);
INSERT INTO "BEWWBZ07" VALUES (24353, 1, 345, 74, null);
INSERT INTO "BEWWBZ07" VALUES (24363, 1, 350, 74, null);
INSERT INTO "BEWWBZ07" VALUES (24383, 1, 356, 74, null);
INSERT INTO "BEWWBZ07" VALUES (24401, 1, 359, 74, null);
INSERT INTO "BEWWBZ07" VALUES (24433, 1, 363, 74, null);
INSERT INTO "BEWWBZ07" VALUES (24497, 1, 371, 74, null);
INSERT INTO "BEWWBZ07" VALUES (24505, 1, 372, 74, null);
INSERT INTO "BEWWBZ07" VALUES (24574, 1, 380, 74, null);
INSERT INTO "BEWWBZ07" VALUES (24684, 1, 670, 75, null);
INSERT INTO "BEWWBZ07" VALUES (24694, 1, 684, 75, null);
INSERT INTO "BEWWBZ07" VALUES (24704, 1, 689, 75, null);
INSERT INTO "BEWWBZ07" VALUES (24714, 1, null, 75, 'rtertet');
INSERT INTO "BEWWBZ07" VALUES (24724, 1, 693, 75, null);
INSERT INTO "BEWWBZ07" VALUES (24734, 1, null, 75, 'rtrer');
INSERT INTO "BEWWBZ07" VALUES (24750, 1, 699, 75, null);
INSERT INTO "BEWWBZ07" VALUES (24846, 1, 711, 75, null);
INSERT INTO "BEWWBZ07" VALUES (24854, 1, 712, 75, null);
INSERT INTO "BEWWBZ07" VALUES (24915, 1, 719, 75, null);
INSERT INTO "BEWWBZ07" VALUES (25025, 1, 675, 76, null);
INSERT INTO "BEWWBZ07" VALUES (25035, 1, 683, 76, null);
INSERT INTO "BEWWBZ07" VALUES (25045, 1, 689, 76, null);
INSERT INTO "BEWWBZ07" VALUES (25083, 1, 698, 76, null);
INSERT INTO "BEWWBZ07" VALUES (25203, 1, 713, 76, null);
INSERT INTO "BEWWBZ07" VALUES (25256, 1, 719, 76, null);
INSERT INTO "BEWWBZ07" VALUES (25282, 1, 721, 76, null);
INSERT INTO "BEWWBZ07" VALUES (25292, 1, 331, 77, null);
INSERT INTO "BEWWBZ07" VALUES (25302, 1, 348, 77, null);
INSERT INTO "BEWWBZ07" VALUES (25312, 1, 352, 77, null);
INSERT INTO "BEWWBZ07" VALUES (25322, 1, null, 77, 'faulig');
INSERT INTO "BEWWBZ07" VALUES (25332, 1, 358, 77, null);
INSERT INTO "BEWWBZ07" VALUES (25374, 1, 362, 77, null);
INSERT INTO "BEWWBZ07" VALUES (25414, 1, 367, 77, null);
INSERT INTO "BEWWBZ07" VALUES (25446, 1, 371, 77, null);
INSERT INTO "BEWWBZ07" VALUES (25478, 1, 375, 77, null);
INSERT INTO "BEWWBZ07" VALUES (25486, 1, 376, 77, null);
INSERT INTO "BEWWBZ07" VALUES (25575, 1, 392, 77, null);
INSERT INTO "BEWWBZ07" VALUES (25974, 1, 674, 79, null);
INSERT INTO "BEWWBZ07" VALUES (26032, 1, 698, 79, null);
INSERT INTO "BEWWBZ07" VALUES (26136, 1, 711, 79, null);
INSERT INTO "BEWWBZ07" VALUES (26315, 1, 331, 80, null);
INSERT INTO "BEWWBZ07" VALUES (26325, 1, 345, 80, null);
INSERT INTO "BEWWBZ07" VALUES (26373, 1, 359, 80, null);
INSERT INTO "BEWWBZ07" VALUES (26397, 1, 362, 80, null);
INSERT INTO "BEWWBZ07" VALUES (26469, 1, 371, 80, null);
INSERT INTO "BEWWBZ07" VALUES (26477, 1, 372, 80, null);
INSERT INTO "BEWWBZ07" VALUES (26501, 1, 375, 80, null);
INSERT INTO "BEWWBZ07" VALUES (26546, 1, 380, 80, null);
INSERT INTO "BEWWBZ07" VALUES (26656, 1, 675, 81, null);
INSERT INTO "BEWWBZ07" VALUES (26666, 1, 683, 81, null);
INSERT INTO "BEWWBZ07" VALUES (26676, 1, 689, 81, null);
INSERT INTO "BEWWBZ07" VALUES (26714, 1, 698, 81, null);
INSERT INTO "BEWWBZ07" VALUES (26834, 1, 713, 81, null);
INSERT INTO "BEWWBZ07" VALUES (26887, 1, 719, 81, null);
INSERT INTO "BEWWBZ07" VALUES (26913, 1, 721, 81, null);
INSERT INTO "BEWWBZ07" VALUES (26923, 1, 672, 82, null);
INSERT INTO "BEWWBZ07" VALUES (27069, 1, 709, 82, null);
INSERT INTO "BEWWBZ07" VALUES (27101, 1, 713, 82, null);
INSERT INTO "BEWWBZ07" VALUES (27154, 1, 719, 82, null);
INSERT INTO "BEWWBZ07" VALUES (27264, 1, 672, 83, null);
INSERT INTO "BEWWBZ07" VALUES (27410, 1, 709, 83, null);
INSERT INTO "BEWWBZ07" VALUES (27442, 1, 713, 83, null);
INSERT INTO "BEWWBZ07" VALUES (27495, 1, 719, 83, null);
INSERT INTO "BEWWBZ07" VALUES (27736, 1, 719, 85, null);
INSERT INTO "BEWWBZ07" VALUES (27762, 1, 721, 85, null);
INSERT INTO "BEWWBZ07" VALUES (27846, 1, 672, 86, null);
INSERT INTO "BEWWBZ07" VALUES (27992, 1, 709, 86, null);
INSERT INTO "BEWWBZ07" VALUES (28024, 1, 713, 86, null);
INSERT INTO "BEWWBZ07" VALUES (28077, 1, 719, 86, null);
INSERT INTO "BEWWBZ07" VALUES (28097, 1, 684, 87, null);
INSERT INTO "BEWWBZ07" VALUES (28145, 1, 698, 87, null);
INSERT INTO "BEWWBZ07" VALUES (28241, 1, 710, 87, null);
INSERT INTO "BEWWBZ07" VALUES (28318, 1, 719, 87, null);
INSERT INTO "BEWWBZ07" VALUES (28328, 1, 670, 88, null);
INSERT INTO "BEWWBZ07" VALUES (28559, 1, 719, 88, null);
COMMIT;

-- ----------------------------
-- Table structure for KENDEK07
-- ----------------------------
DROP TABLE IF EXISTS "KENDEK07";
CREATE TABLE "KENDEK07" (
"NR"  INTEGER NOT NULL,
"KENMDT07_NR"  INTEGER NOT NULL,
"BEZEICH"  VARCHAR2(2000) NOT NULL,
"GRAD"  INTEGER NOT NULL,
"KENWUN07_NR"  INTEGER NOT NULL,
"BESCHREIB"  VARCHAR2(4000),
"KUERZL"  VARCHAR2(5) NOT NULL,
"POS"  INTEGER,
PRIMARY KEY ("NR" ASC, "KENMDT07_NR" ASC)
)

;

-- ----------------------------
-- Records of KENDEK07
-- ----------------------------
BEGIN;
INSERT INTO "KENDEK07" VALUES (76, 1, '4A - Nekrose von Fußteilen (Wagner/Armstrong)', 0, 14, 'Begrenzte Vorfuß- oder Fersennekrose', '4A', 18);
INSERT INTO "KENDEK07" VALUES (77, 1, '4B - Nekrose von Fußteilen mit Infektion (Wagner/Armstrong)', 0, 14, 'Begrenzte Vorfuß- oder Fersennekrose', '4B', 19);
INSERT INTO "KENDEK07" VALUES (78, 1, '4C - Nekrose von Fußteilen mit Ischämie (Wagner/Armstrong)', 0, 14, 'Begrenzte Vorfuß- oder Fersennekrose', '4C', 20);
INSERT INTO "KENDEK07" VALUES (79, 1, '4D - Nekrose von Fußteilen mit Infektion und Ischämie (Wagner/Armstrong)', 0, 14, 'Begrenzte Vorfuß- oder Fersennekrose', '4D', 21);
INSERT INTO "KENDEK07" VALUES (90, 1, 'Stadium IIb (Fontaine) ', 2, 16, 'Claudicatio intermittens mit freien Gehstrecke < 200m', 'IIb', 3);
INSERT INTO "KENDEK07" VALUES (99, 1, 'Stadium IIb (Fontaine) ', 2, 17, 'Claudicatio intermittens mit freien Gehstrecke < 200m', 'IIb', 3);
INSERT INTO "KENDEK07" VALUES (89, 1, 'Stadium IIa (Fontaine) ', 2, 16, 'Claudicatio intermittens mit freien Gehstrecke > 200m', 'IIa', 2);
INSERT INTO "KENDEK07" VALUES (98, 1, 'Stadium IIa (Fontaine) ', 2, 17, 'Claudicatio intermittens mit freien Gehstrecke > 200m', 'IIa', 2);
INSERT INTO "KENDEK07" VALUES (59, 1, '0 - keine Läsion, evtl. Fußdeformation, Cellulitis (Wagner/Armstrong)', 0, 14, 'Füße von Diabetikern die eine Fehlstellung oder Hyperkeratosen haben, die eine sensorische Neuropathie oder einen Ulkus hatten.', 0, 1);
INSERT INTO "KENDEK07" VALUES (84, 1, 'Grad 1 - Corona phlebectatica paraplanaris (Widmer/mod. Marshall)', 1, 15, 'Lokale Gefäßerweiterungen (Besenreiser) in der Knöchelregion und oberhalb des Fußgewölbes. Typisch auftretende Knöchelödeme', 1, 1);
INSERT INTO "KENDEK07" VALUES (93, 1, 'Grad 1 - Corona phlebectatica paraplanaris (Widmer/mod. Marshall)', 1, 17, 'Lokale Gefäßerweiterungen (Besenreiser) in der Knöchelregion und oberhalb des Fußgewölbes. Typisch auftretende Knöchelödeme', 1, 1);
INSERT INTO "KENDEK07" VALUES (80, 1, '5A - Nekrose des gesamten Fußes (Wagner/Armstrong)', 0, 14, 'Nekrose des gesamten Fußes', '5A', 22);
INSERT INTO "KENDEK07" VALUES (81, 1, '5B - Nekrose des gesamten Fußes mit Infektion (Wagner/Armstrong)', 0, 14, 'Nekrose des gesamten Fußes', '5B', 23);
INSERT INTO "KENDEK07" VALUES (82, 1, '5C - Nekrose des gesamten Fußes mit Ischämie (Wagner/Armstrong)', 0, 14, 'Nekrose des gesamten Fußes', '5C', 24);
INSERT INTO "KENDEK07" VALUES (83, 1, '5D - Nekrose des gesamten Fußes mit Infektion und Ischämie (Wagner/Armstrong)', 0, 14, 'Nekrose des gesamten Fußes', '5D', 25);
INSERT INTO "KENDEK07" VALUES (55, 1, 'Grad I - Nicht wegdrückbare Rötung (EPUAP)', 1, 13, 'Nicht wegdrückbare Rötung bei intakter Haut, gewöhnlich über einem knöchernen Vorsprung. Bei dunkel pigmentierter Haut ist ein Verblassen möglicherweise nicht sichtbar, die Farbe kann sich aber von der umgebenden Haut unterscheiden. Der Bereich kann schmerzempfindlich, verhärtet, weich, wärmer oder kälter sein als das umgebende Gewebe.', 'I', 1);
INSERT INTO "KENDEK07" VALUES (102, 1, 'Grad I - Nicht wegdrückbare Rötung (EPUAP)', 1, 18, 'Nicht wegdrückbare Rötung bei intakter Haut, gewöhnlich über einem knöchernen Vorsprung. Bei dunkel pigmentierter Haut ist ein Verblassen möglicherweise nicht sichtbar, die Farbe kann sich aber von der umgebenden Haut unterscheiden. Der Bereich kann schmerzempfindlich, verhärtet, weich, wärmer oder kälter sein als das umgebende Gewebe.', 'I', 1);
INSERT INTO "KENDEK07" VALUES (64, 1, '1A - Oberflächliche Wunde (Wagner/Armstrong)', 0, 14, 'Oberflächliches Ulkus', '1A', 6);
INSERT INTO "KENDEK07" VALUES (65, 1, '1B - Oberflächliche Wunde mit Infektion (Wagner/Armstrong)', 0, 14, 'Oberflächliches Ulkus', '1B', 7);
INSERT INTO "KENDEK07" VALUES (66, 1, '1C - Oberflächliche Wunde mit Ischämie (Wagner/Armstrong)', 0, 14, 'Oberflächliches Ulkus', '1C', 8);
INSERT INTO "KENDEK07" VALUES (67, 1, '1D - Oberflächliche Wunde mit Infektion und Ischämie (Wagner/Armstrong)', 0, 14, 'Oberflächliches Ulkus', '1D', 9);
INSERT INTO "KENDEK07" VALUES (106, 1, 'Stadium I (Hach 1994)', 1, 19, 'Schwellungsneigung ohne Gewebssklerose', 'I', 1);
INSERT INTO "KENDEK07" VALUES (56, 1, 'Grad II - Teilverlust der Haut (EPUAP)', 2, 13, 'Teilzerstörung der Haut (bis zur Dermis), die als Flaches, offenes Ulcus mit einem rot bis rosafarbenen Wundbett ohne Beläge in Erscheinung tritt. Kann sich auch als intakte oder offene serumgefüllte Blase darstellen. Manifestiert sich als glänzendes oder trockenes, flaches Ulcus ohne nekrotisches Gewebe oder Bluterguss.', 'II', 2);
INSERT INTO "KENDEK07" VALUES (103, 1, 'Grad II - Teilverlust der Haut (EPUAP)', 2, 18, 'Teilzerstörung der Haut (bis zur Dermis), die als Flaches, offenes Ulcus mit einem rot bis rosafarbenen Wundbett ohne Beläge in Erscheinung tritt. Kann sich auch als intakte oder offene serumgefüllte Blase darstellen. Manifestiert sich als glänzendes oder trockenes, flaches Ulcus ohne nekrotisches Gewebe oder Bluterguss.', 'II', 2);
INSERT INTO "KENDEK07" VALUES (68, 1, '2A - Wunde bis zur Ebene von Sehne oder Kapsel (Wagner/Armstrong)', 0, 14, 'Tiefes Ulkus bis zur Gelenkkapsel', '2A', 10);
INSERT INTO "KENDEK07" VALUES (69, 1, '2B - Wunde bis zur Ebene von Sehne oder Kapsel mit Infektion (Wagner/Armstrong)', 0, 14, 'Tiefes Ulkus bis zur Gelenkkapsel', '2B', 11);
INSERT INTO "KENDEK07" VALUES (70, 1, '2C - Wunde bis zur Ebene von Sehne oder Kapsel mit Ischämie (Wagner/Armstrong)', 0, 14, 'Tiefes Ulkus bis zur Gelenkkapsel', '2C', 12);
INSERT INTO "KENDEK07" VALUES (71, 1, '2D - Wunde bis zur Ebene von Sehne oder Kapsel mit Infektion und Ischämie (Wagner/Armstrong)', 0, 14, 'Tiefes Ulkus bis zur Gelenkkapsel', '2D', 13);
INSERT INTO "KENDEK07" VALUES (72, 1, '3A - Wunde bis zur Ebene von Knochen oder Gelenk (Wagner/Armstrong)', 0, 14, 'Tiefes Ulkus mit Abszendierung, Osteomyelitis, Infektion der Gelenkkapsel', '3A', 14);
INSERT INTO "KENDEK07" VALUES (73, 1, '3B - Wunde bis zur Ebene von Knochen oder Gelenk mit Infektion (Wagner/Armstrong)', 0, 14, 'Tiefes Ulkus mit Abszendierung, Osteomyelitis, Infektion der Gelenkkapsel', '3B', 15);
INSERT INTO "KENDEK07" VALUES (74, 1, '3C - Wunde bis zur Ebene von Knochen oder Gelenk mit Ischämie (Wagner/Armstrong)', 0, 14, 'Tiefes Ulkus mit Abszendierung, Osteomyelitis, Infektion der Gelenkkapsel', '3C', 16);
INSERT INTO "KENDEK07" VALUES (75, 1, '3D - Wunde bis zur Ebene von Knochen oder Gelenk mit Infektion und Ischämie (Wagner/Armstrong)', 0, 14, 'Tiefes Ulkus mit Abszendierung, Osteomyelitis, Infektion der Gelenkkapsel', '3D', 17);
INSERT INTO "KENDEK07" VALUES (58, 1, 'Grad IV - vollständiger Haut oder Gewebeverlust (EPUAP)', 4, 13, 'Totaler Gewebsverlust mit freiliegenden Knochen, Sehnen oder Muskeln. Belag und Schorf können vorliegen. Tunnel oder Unterminierungen liegen oft vor. Wunden können sich in Muskeln oder unterstützende Strukturen ausbreiten und können Osteomyelitis oder Ostitis verursachen. Knochen und Sehnen sind sichtbar oder tastbar.', 'IV', 4);
INSERT INTO "KENDEK07" VALUES (105, 1, 'Grad IV - vollständiger Haut oder Gewebeverlust (EPUAP)', 4, 18, 'Totaler Gewebsverlust mit freiliegenden Knochen, Sehnen oder Muskeln. Belag und Schorf können vorliegen. Tunnel oder Unterminierungen liegen oft vor. Wunden können sich in Muskeln oder unterstützende Strukturen ausbreiten und können Osteomyelitis oder Ostitis verursachen. Knochen und Sehnen sind sichtbar oder tastbar.', 'IV', 4);
INSERT INTO "KENDEK07" VALUES (92, 1, 'Stadium IV (Fontaine) ', 4, 16, 'Ulkus, Gangrän', 'IV', 5);
INSERT INTO "KENDEK07" VALUES (101, 1, 'Stadium IV (Fontaine) ', 4, 17, 'Ulkus, Gangrän', 'IV', 5);
INSERT INTO "KENDEK07" VALUES (85, 1, 'Grad 2 - Pigmentverschiebungen, Ekzem (Widmer/mod. Marshall)', 2, 15, 'Unterschenkelödem, Hyperpigmentierung der Haut, Dermatoliposklerose, Atrophie blanche, Pigmentverschiebungen: Dermite ocre, Ekzem: stasis dermatitis', 2, 2);
INSERT INTO "KENDEK07" VALUES (94, 1, 'Grad 2 - Pigmentverschiebungen, Ekzem (Widmer/mod. Marshall)', 2, 17, 'Unterschenkelödem, Hyperpigmentierung der Haut, Dermatoliposklerose, Atrophie blanche, Pigmentverschiebungen: Dermite ocre, Ekzem: stasis dermatitis', 2, 2);
INSERT INTO "KENDEK07" VALUES (57, 1, 'Grad III - Verlust der Haut (EPUAP)', 3, 13, 'Zerstörung aller Hautschichten. Subcutanes Fett kann sichtbar sein, jedoch keine Knochen, Muskeln oder Sehnen. Es kann ein Belag vorliegen, der jedoch nicht die Tiefe dar Gewebsschädigung verschleiert. Es können Tunnel oder Unterminierungen vorliegen. Knochen und Sehnen sind nicht sichtbar oder tastbar.', 'III', 3);
INSERT INTO "KENDEK07" VALUES (104, 1, 'Grad III - Verlust der Haut (EPUAP)', 3, 18, 'Zerstörung aller Hautschichten. Subcutanes Fett kann sichtbar sein, jedoch keine Knochen, Muskeln oder Sehnen. Es kann ein Belag vorliegen, der jedoch nicht die Tiefe dar Gewebsschädigung verschleiert. Es können Tunnel oder Unterminierungen vorliegen. Knochen und Sehnen sind nicht sichtbar oder tastbar.', 'III', 3);
INSERT INTO "KENDEK07" VALUES (86, 1, 'Grad 3a - Ulkusnarbe (Widmer/mod. Marshall)', 3, 15, 'abgeheiltes Ulcus cruris venosum', '3a', 3);
INSERT INTO "KENDEK07" VALUES (95, 1, 'Grad 3a - Ulkusnarbe (Widmer/mod. Marshall)', 3, 17, 'abgeheiltes Ulcus cruris venosum', '3a', 3);
INSERT INTO "KENDEK07" VALUES (88, 1, 'Stadium I (Fontaine) ', 1, 16, 'asymptomatisch', 'I', 1);
INSERT INTO "KENDEK07" VALUES (97, 1, 'Stadium I (Fontaine) ', 1, 17, 'asymptomatisch', 'I', 1);
INSERT INTO "KENDEK07" VALUES (87, 1, 'Grad 3b - Unterschenkelgeschwür (Widmer/mod. Marshall)', 3, 15, 'florides Ulcus cruris venosum', '3b', 4);
INSERT INTO "KENDEK07" VALUES (96, 1, 'Grad 3b - Unterschenkelgeschwür (Widmer/mod. Marshall)', 3, 17, 'florides Ulcus cruris venosum', '3b', 4);
INSERT INTO "KENDEK07" VALUES (91, 1, 'Stadium III (Fontaine) ', 3, 16, 'ischämischer Ruheschmerz', 'III', 4);
INSERT INTO "KENDEK07" VALUES (100, 1, 'Stadium III (Fontaine) ', 3, 17, 'ischämischer Ruheschmerz', 'III', 4);
INSERT INTO "KENDEK07" VALUES (107, 1, 'Stadium II (Hach 1994)', 2, 19, 'mit Verhärtungen der Haut und des Subkutangewebes (Dermatoliposklerose)', 'II', 2);
INSERT INTO "KENDEK07" VALUES (108, 1, 'Stadium III (Hach 1994)', 3, 19, 'sklerotische Gewebsveränderungen der Haut, des Subkutangewebes und umschriebener Areale der Faszie (Dermatolipofasziosklerosis regionalis)', 'III', 3);
INSERT INTO "KENDEK07" VALUES (109, 1, 'Stadium IV (Hach 1994)', 4, 19, 'sklerotische Veränderungen der Haut, des Subkutangewebes und der Faszie zirkulär am Unterschenkel mit ausgedehnten, manchmal zirkulären Ulzerationen', 'IV', 4);
INSERT INTO "KENDEK07" VALUES (60, 1, '0A - Prä- oder postulcerative Läsion (Wagner/Armstrong)', 0, 14, null, '0A', 2);
INSERT INTO "KENDEK07" VALUES (61, 1, '0B - Prä- oder postulcerative Läsion mit Infektion (Wagner/Armstrong)', 0, 14, null, '0B', 3);
INSERT INTO "KENDEK07" VALUES (62, 1, '0C - Prä- oder postulcerative Läsion mit Ischämie (Wagner/Armstrong)', 0, 14, null, '0C', 4);
INSERT INTO "KENDEK07" VALUES (63, 1, '0D - Prä- oder postulcerative Läsion mit Infektion und Ischämie (Wagner/Armstrong)', 0, 14, null, '0D', 5);
COMMIT;

-- ----------------------------
-- Table structure for KENWBS07
-- ----------------------------
DROP TABLE IF EXISTS "KENWBS07";
CREATE TABLE "KENWBS07" (
"NR"  INTEGER NOT NULL,
"KENMDT07_NR"  INTEGER NOT NULL,
"TYP"  VARCHAR2(3),
"BEZEICH"  VARCHAR2(50) NOT NULL,
"KENWBS07_NR"  INTEGER,
"MITFREITEXT"  VARCHAR2(1),
"POSITION"  INTEGER,
PRIMARY KEY ("NR" ASC, "KENMDT07_NR" ASC)
)

;

-- ----------------------------
-- Records of KENWBS07
-- ----------------------------
BEGIN;
INSERT INTO "KENWBS07" VALUES (338, 1, null, 'Albuminmangel', null, null, 8);
INSERT INTO "KENWBS07" VALUES (413, 1, null, 'Albuminmangel', null, null, 8);
INSERT INTO "KENWBS07" VALUES (479, 1, null, 'Albuminmangel', null, null, 8);
INSERT INTO "KENWBS07" VALUES (545, 1, null, 'Albuminmangel', null, null, 8);
INSERT INTO "KENWBS07" VALUES (611, 1, null, 'Albuminmangel', null, null, 8);
INSERT INTO "KENWBS07" VALUES (677, 1, null, 'Albuminmangel', null, null, 8);
INSERT INTO "KENWBS07" VALUES (735, 1, null, 'Albuminmangel', null, null, 8);
INSERT INTO "KENWBS07" VALUES (332, 1, null, 'Arterielle Verschlusskrankheit', null, null, 2);
INSERT INTO "KENWBS07" VALUES (407, 1, null, 'Arterielle Verschlusskrankheit', null, null, 2);
INSERT INTO "KENWBS07" VALUES (473, 1, null, 'Arterielle Verschlusskrankheit', null, null, 2);
INSERT INTO "KENWBS07" VALUES (539, 1, null, 'Arterielle Verschlusskrankheit', null, null, 2);
INSERT INTO "KENWBS07" VALUES (605, 1, null, 'Arterielle Verschlusskrankheit', null, null, 2);
INSERT INTO "KENWBS07" VALUES (671, 1, null, 'Arterielle Verschlusskrankheit', null, null, 2);
INSERT INTO "KENWBS07" VALUES (729, 1, null, 'Arterielle Verschlusskrankheit', null, null, 2);
INSERT INTO "KENWBS07" VALUES (333, 1, null, 'Chronisch venöse Insuffizienz', null, null, 3);
INSERT INTO "KENWBS07" VALUES (408, 1, null, 'Chronisch venöse Insuffizienz', null, null, 3);
INSERT INTO "KENWBS07" VALUES (474, 1, null, 'Chronisch venöse Insuffizienz', null, null, 3);
INSERT INTO "KENWBS07" VALUES (540, 1, null, 'Chronisch venöse Insuffizienz', null, null, 3);
INSERT INTO "KENWBS07" VALUES (606, 1, null, 'Chronisch venöse Insuffizienz', null, null, 3);
INSERT INTO "KENWBS07" VALUES (672, 1, null, 'Chronisch venöse Insuffizienz', null, null, 3);
INSERT INTO "KENWBS07" VALUES (730, 1, null, 'Chronisch venöse Insuffizienz', null, null, 3);
INSERT INTO "KENWBS07" VALUES (379, 1, null, 'Dermatitis', null, null, 9);
INSERT INTO "KENWBS07" VALUES (454, 1, null, 'Dermatitis', null, null, 9);
INSERT INTO "KENWBS07" VALUES (520, 1, null, 'Dermatitis', null, null, 9);
INSERT INTO "KENWBS07" VALUES (586, 1, null, 'Dermatitis', null, null, 9);
INSERT INTO "KENWBS07" VALUES (652, 1, null, 'Dermatitis', null, null, 9);
INSERT INTO "KENWBS07" VALUES (718, 1, null, 'Dermatitis', null, null, 9);
INSERT INTO "KENWBS07" VALUES (776, 1, null, 'Dermatitis', null, null, 9);
INSERT INTO "KENWBS07" VALUES (395, 1, null, 'Dermis', null, null, 8);
INSERT INTO "KENWBS07" VALUES (470, 1, null, 'Dermis', null, null, 8);
INSERT INTO "KENWBS07" VALUES (536, 1, null, 'Dermis', null, null, 8);
INSERT INTO "KENWBS07" VALUES (602, 1, null, 'Dermis', null, null, 8);
INSERT INTO "KENWBS07" VALUES (668, 1, null, 'Dermis', null, null, 8);
INSERT INTO "KENWBS07" VALUES (726, 1, null, 'Dermis', null, null, 8);
INSERT INTO "KENWBS07" VALUES (784, 1, null, 'Dermis', null, null, 8);
INSERT INTO "KENWBS07" VALUES (331, 1, null, 'Diabetes mellitus', null, null, 1);
INSERT INTO "KENWBS07" VALUES (406, 1, null, 'Diabetes mellitus', null, null, 1);
INSERT INTO "KENWBS07" VALUES (472, 1, null, 'Diabetes mellitus', null, null, 1);
INSERT INTO "KENWBS07" VALUES (538, 1, null, 'Diabetes mellitus', null, null, 1);
INSERT INTO "KENWBS07" VALUES (604, 1, null, 'Diabetes mellitus', null, null, 1);
INSERT INTO "KENWBS07" VALUES (670, 1, null, 'Diabetes mellitus', null, null, 1);
INSERT INTO "KENWBS07" VALUES (728, 1, null, 'Diabetes mellitus', null, null, 1);
INSERT INTO "KENWBS07" VALUES (366, 1, null, 'Diffus', null, null, 8);
INSERT INTO "KENWBS07" VALUES (441, 1, null, 'Diffus', null, null, 8);
INSERT INTO "KENWBS07" VALUES (507, 1, null, 'Diffus', null, null, 8);
INSERT INTO "KENWBS07" VALUES (573, 1, null, 'Diffus', null, null, 8);
INSERT INTO "KENWBS07" VALUES (639, 1, null, 'Diffus', null, null, 8);
INSERT INTO "KENWBS07" VALUES (705, 1, null, 'Diffus', null, null, 8);
INSERT INTO "KENWBS07" VALUES (763, 1, null, 'Diffus', null, null, 8);
INSERT INTO "KENWBS07" VALUES (370, 1, null, 'Eingerollt', null, null, 12);
INSERT INTO "KENWBS07" VALUES (445, 1, null, 'Eingerollt', null, null, 12);
INSERT INTO "KENWBS07" VALUES (511, 1, null, 'Eingerollt', null, null, 12);
INSERT INTO "KENWBS07" VALUES (577, 1, null, 'Eingerollt', null, null, 12);
INSERT INTO "KENWBS07" VALUES (643, 1, null, 'Eingerollt', null, null, 12);
INSERT INTO "KENWBS07" VALUES (709, 1, null, 'Eingerollt', null, null, 12);
INSERT INTO "KENWBS07" VALUES (767, 1, null, 'Eingerollt', null, null, 12);
INSERT INTO "KENWBS07" VALUES (355, 1, null, 'Eiter', null, null, 3);
INSERT INTO "KENWBS07" VALUES (430, 1, null, 'Eiter', null, null, 3);
INSERT INTO "KENWBS07" VALUES (496, 1, null, 'Eiter', null, null, 3);
INSERT INTO "KENWBS07" VALUES (562, 1, null, 'Eiter', null, null, 3);
INSERT INTO "KENWBS07" VALUES (628, 1, null, 'Eiter', null, null, 3);
INSERT INTO "KENWBS07" VALUES (694, 1, null, 'Eiter', null, null, 3);
INSERT INTO "KENWBS07" VALUES (752, 1, null, 'Eiter', null, null, 3);
INSERT INTO "KENWBS07" VALUES (396, 1, null, 'Entzündung', null, null, 1);
INSERT INTO "KENWBS07" VALUES (386, 1, null, 'Epithel', null, null, 3);
INSERT INTO "KENWBS07" VALUES (461, 1, null, 'Epithel', null, null, 3);
INSERT INTO "KENWBS07" VALUES (527, 1, null, 'Epithel', null, null, 3);
INSERT INTO "KENWBS07" VALUES (593, 1, null, 'Epithel', null, null, 3);
INSERT INTO "KENWBS07" VALUES (659, 1, null, 'Epithel', null, null, 3);
INSERT INTO "KENWBS07" VALUES (721, 1, null, 'Epithel', null, null, 3);
INSERT INTO "KENWBS07" VALUES (779, 1, null, 'Epithel', null, null, 3);
INSERT INTO "KENWBS07" VALUES (397, 1, null, 'Epithelisierung', null, null, 2);
INSERT INTO "KENWBS07" VALUES (378, 1, null, 'Erythem', null, null, 8);
INSERT INTO "KENWBS07" VALUES (453, 1, null, 'Erythem', null, null, 8);
INSERT INTO "KENWBS07" VALUES (519, 1, null, 'Erythem', null, null, 8);
INSERT INTO "KENWBS07" VALUES (585, 1, null, 'Erythem', null, null, 8);
INSERT INTO "KENWBS07" VALUES (651, 1, null, 'Erythem', null, null, 8);
INSERT INTO "KENWBS07" VALUES (717, 1, null, 'Erythem', null, null, 8);
INSERT INTO "KENWBS07" VALUES (775, 1, null, 'Erythem', null, null, 8);
INSERT INTO "KENWBS07" VALUES (394, 1, null, 'Fettgewebe', null, null, 7);
INSERT INTO "KENWBS07" VALUES (469, 1, null, 'Fettgewebe', null, null, 7);
INSERT INTO "KENWBS07" VALUES (535, 1, null, 'Fettgewebe', null, null, 7);
INSERT INTO "KENWBS07" VALUES (601, 1, null, 'Fettgewebe', null, null, 7);
INSERT INTO "KENWBS07" VALUES (667, 1, null, 'Fettgewebe', null, null, 7);
INSERT INTO "KENWBS07" VALUES (725, 1, null, 'Fettgewebe', null, null, 7);
INSERT INTO "KENWBS07" VALUES (783, 1, null, 'Fettgewebe', null, null, 7);
INSERT INTO "KENWBS07" VALUES (375, 1, null, 'Feuchtigkeit', null, null, 5);
INSERT INTO "KENWBS07" VALUES (450, 1, null, 'Feuchtigkeit', null, null, 5);
INSERT INTO "KENWBS07" VALUES (516, 1, null, 'Feuchtigkeit', null, null, 5);
INSERT INTO "KENWBS07" VALUES (582, 1, null, 'Feuchtigkeit', null, null, 5);
INSERT INTO "KENWBS07" VALUES (648, 1, null, 'Feuchtigkeit', null, null, 5);
INSERT INTO "KENWBS07" VALUES (714, 1, null, 'Feuchtigkeit', null, null, 5);
INSERT INTO "KENWBS07" VALUES (772, 1, null, 'Feuchtigkeit', null, null, 5);
INSERT INTO "KENWBS07" VALUES (385, 1, null, 'Fibrin', null, null, 2);
INSERT INTO "KENWBS07" VALUES (460, 1, null, 'Fibrin', null, null, 2);
INSERT INTO "KENWBS07" VALUES (526, 1, null, 'Fibrin', null, null, 2);
INSERT INTO "KENWBS07" VALUES (592, 1, null, 'Fibrin', null, null, 2);
INSERT INTO "KENWBS07" VALUES (658, 1, null, 'Fibrin', null, null, 2);
INSERT INTO "KENWBS07" VALUES (720, 1, null, 'Fibrin', null, null, 2);
INSERT INTO "KENWBS07" VALUES (778, 1, null, 'Fibrin', null, null, 2);
INSERT INTO "KENWBS07" VALUES (358, 1, null, 'Fieber', null, null, 6);
INSERT INTO "KENWBS07" VALUES (433, 1, null, 'Fieber', null, null, 6);
INSERT INTO "KENWBS07" VALUES (499, 1, null, 'Fieber', null, null, 6);
INSERT INTO "KENWBS07" VALUES (565, 1, null, 'Fieber', null, null, 6);
INSERT INTO "KENWBS07" VALUES (631, 1, null, 'Fieber', null, null, 6);
INSERT INTO "KENWBS07" VALUES (697, 1, null, 'Fieber', null, null, 6);
INSERT INTO "KENWBS07" VALUES (755, 1, null, 'Fieber', null, null, 6);
INSERT INTO "KENWBS07" VALUES (343, 1, null, 'Fremdeinwirkung', null, null, 13);
INSERT INTO "KENWBS07" VALUES (418, 1, null, 'Fremdeinwirkung', null, null, 13);
INSERT INTO "KENWBS07" VALUES (484, 1, null, 'Fremdeinwirkung', null, null, 13);
INSERT INTO "KENWBS07" VALUES (550, 1, null, 'Fremdeinwirkung', null, null, 13);
INSERT INTO "KENWBS07" VALUES (616, 1, null, 'Fremdeinwirkung', null, null, 13);
INSERT INTO "KENWBS07" VALUES (682, 1, null, 'Fremdeinwirkung', null, null, 13);
INSERT INTO "KENWBS07" VALUES (740, 1, null, 'Fremdeinwirkung', null, null, 13);
INSERT INTO "KENWBS07" VALUES (365, 1, null, 'Gestanzt', null, null, 7);
INSERT INTO "KENWBS07" VALUES (440, 1, null, 'Gestanzt', null, null, 7);
INSERT INTO "KENWBS07" VALUES (506, 1, null, 'Gestanzt', null, null, 7);
INSERT INTO "KENWBS07" VALUES (572, 1, null, 'Gestanzt', null, null, 7);
INSERT INTO "KENWBS07" VALUES (638, 1, null, 'Gestanzt', null, null, 7);
INSERT INTO "KENWBS07" VALUES (704, 1, null, 'Gestanzt', null, null, 7);
INSERT INTO "KENWBS07" VALUES (762, 1, null, 'Gestanzt', null, null, 7);
INSERT INTO "KENWBS07" VALUES (380, 1, null, 'Granulation', null, null, 1);
INSERT INTO "KENWBS07" VALUES (401, 1, null, 'Granulation', null, null, 3);
INSERT INTO "KENWBS07" VALUES (455, 1, null, 'Granulation', null, null, 1);
INSERT INTO "KENWBS07" VALUES (521, 1, null, 'Granulation', null, null, 1);
INSERT INTO "KENWBS07" VALUES (587, 1, null, 'Granulation', null, null, 1);
INSERT INTO "KENWBS07" VALUES (653, 1, null, 'Granulation', null, null, 1);
INSERT INTO "KENWBS07" VALUES (719, 1, null, 'Granulation', null, null, 1);
INSERT INTO "KENWBS07" VALUES (777, 1, null, 'Granulation', null, null, 1);
INSERT INTO "KENWBS07" VALUES (364, 1, null, 'Gut begrenzt', null, null, 6);
INSERT INTO "KENWBS07" VALUES (439, 1, null, 'Gut begrenzt', null, null, 6);
INSERT INTO "KENWBS07" VALUES (505, 1, null, 'Gut begrenzt', null, null, 6);
INSERT INTO "KENWBS07" VALUES (571, 1, null, 'Gut begrenzt', null, null, 6);
INSERT INTO "KENWBS07" VALUES (637, 1, null, 'Gut begrenzt', null, null, 6);
INSERT INTO "KENWBS07" VALUES (703, 1, null, 'Gut begrenzt', null, null, 6);
INSERT INTO "KENWBS07" VALUES (761, 1, null, 'Gut begrenzt', null, null, 6);
INSERT INTO "KENWBS07" VALUES (335, 1, null, 'Immobilität', null, null, 5);
INSERT INTO "KENWBS07" VALUES (410, 1, null, 'Immobilität', null, null, 5);
INSERT INTO "KENWBS07" VALUES (476, 1, null, 'Immobilität', null, null, 5);
INSERT INTO "KENWBS07" VALUES (542, 1, null, 'Immobilität', null, null, 5);
INSERT INTO "KENWBS07" VALUES (608, 1, null, 'Immobilität', null, null, 5);
INSERT INTO "KENWBS07" VALUES (674, 1, null, 'Immobilität', null, null, 5);
INSERT INTO "KENWBS07" VALUES (732, 1, null, 'Immobilität', null, null, 5);
INSERT INTO "KENWBS07" VALUES (337, 1, null, 'Immunsuppression', null, null, 7);
INSERT INTO "KENWBS07" VALUES (412, 1, null, 'Immunsuppression', null, null, 7);
INSERT INTO "KENWBS07" VALUES (478, 1, null, 'Immunsuppression', null, null, 7);
INSERT INTO "KENWBS07" VALUES (544, 1, null, 'Immunsuppression', null, null, 7);
INSERT INTO "KENWBS07" VALUES (610, 1, null, 'Immunsuppression', null, null, 7);
INSERT INTO "KENWBS07" VALUES (676, 1, null, 'Immunsuppression', null, null, 7);
INSERT INTO "KENWBS07" VALUES (734, 1, null, 'Immunsuppression', null, null, 7);
INSERT INTO "KENWBS07" VALUES (336, 1, null, 'Infektion', null, null, 6);
INSERT INTO "KENWBS07" VALUES (411, 1, null, 'Infektion', null, null, 6);
INSERT INTO "KENWBS07" VALUES (477, 1, null, 'Infektion', null, null, 6);
INSERT INTO "KENWBS07" VALUES (543, 1, null, 'Infektion', null, null, 6);
INSERT INTO "KENWBS07" VALUES (609, 1, null, 'Infektion', null, null, 6);
INSERT INTO "KENWBS07" VALUES (675, 1, null, 'Infektion', null, null, 6);
INSERT INTO "KENWBS07" VALUES (733, 1, null, 'Infektion', null, null, 6);
INSERT INTO "KENWBS07" VALUES (369, 1, null, 'Kantig', null, null, 11);
INSERT INTO "KENWBS07" VALUES (444, 1, null, 'Kantig', null, null, 11);
INSERT INTO "KENWBS07" VALUES (510, 1, null, 'Kantig', null, null, 11);
INSERT INTO "KENWBS07" VALUES (576, 1, null, 'Kantig', null, null, 11);
INSERT INTO "KENWBS07" VALUES (642, 1, null, 'Kantig', null, null, 11);
INSERT INTO "KENWBS07" VALUES (708, 1, null, 'Kantig', null, null, 11);
INSERT INTO "KENWBS07" VALUES (766, 1, null, 'Kantig', null, null, 11);
INSERT INTO "KENWBS07" VALUES (393, 1, null, 'Knochen', null, null, 6);
INSERT INTO "KENWBS07" VALUES (468, 1, null, 'Knochen', null, null, 6);
INSERT INTO "KENWBS07" VALUES (534, 1, null, 'Knochen', null, null, 6);
INSERT INTO "KENWBS07" VALUES (600, 1, null, 'Knochen', null, null, 6);
INSERT INTO "KENWBS07" VALUES (666, 1, null, 'Knochen', null, null, 6);
INSERT INTO "KENWBS07" VALUES (724, 1, null, 'Knochen', null, null, 6);
INSERT INTO "KENWBS07" VALUES (782, 1, null, 'Knochen', null, null, 6);
INSERT INTO "KENWBS07" VALUES (373, 1, null, 'Mazeration', null, null, 3);
INSERT INTO "KENWBS07" VALUES (448, 1, null, 'Mazeration', null, null, 3);
INSERT INTO "KENWBS07" VALUES (514, 1, null, 'Mazeration', null, null, 3);
INSERT INTO "KENWBS07" VALUES (580, 1, null, 'Mazeration', null, null, 3);
INSERT INTO "KENWBS07" VALUES (646, 1, null, 'Mazeration', null, null, 3);
INSERT INTO "KENWBS07" VALUES (712, 1, null, 'Mazeration', null, null, 3);
INSERT INTO "KENWBS07" VALUES (770, 1, null, 'Mazeration', null, null, 3);
INSERT INTO "KENWBS07" VALUES (362, 1, null, 'Mazeriert', null, null, 4);
INSERT INTO "KENWBS07" VALUES (437, 1, null, 'Mazeriert', null, null, 4);
INSERT INTO "KENWBS07" VALUES (503, 1, null, 'Mazeriert', null, null, 4);
INSERT INTO "KENWBS07" VALUES (569, 1, null, 'Mazeriert', null, null, 4);
INSERT INTO "KENWBS07" VALUES (635, 1, null, 'Mazeriert', null, null, 4);
INSERT INTO "KENWBS07" VALUES (701, 1, null, 'Mazeriert', null, null, 4);
INSERT INTO "KENWBS07" VALUES (759, 1, null, 'Mazeriert', null, null, 4);
INSERT INTO "KENWBS07" VALUES (392, 1, null, 'Muskeln, Faszie, Sehne', null, null, 5);
INSERT INTO "KENWBS07" VALUES (467, 1, null, 'Muskeln, Faszie, Sehne', null, null, 5);
INSERT INTO "KENWBS07" VALUES (533, 1, null, 'Muskeln, Faszie, Sehne', null, null, 5);
INSERT INTO "KENWBS07" VALUES (599, 1, null, 'Muskeln, Faszie, Sehne', null, null, 5);
INSERT INTO "KENWBS07" VALUES (665, 1, null, 'Muskeln, Faszie, Sehne', null, null, 5);
INSERT INTO "KENWBS07" VALUES (723, 1, null, 'Muskeln, Faszie, Sehne', null, null, 5);
INSERT INTO "KENWBS07" VALUES (781, 1, null, 'Muskeln, Faszie, Sehne', null, null, 5);
INSERT INTO "KENWBS07" VALUES (387, 1, null, 'Nekrose', null, null, 4);
INSERT INTO "KENWBS07" VALUES (462, 1, null, 'Nekrose', null, null, 4);
INSERT INTO "KENWBS07" VALUES (528, 1, null, 'Nekrose', null, null, 4);
INSERT INTO "KENWBS07" VALUES (594, 1, null, 'Nekrose', null, null, 4);
INSERT INTO "KENWBS07" VALUES (660, 1, null, 'Nekrose', null, null, 4);
INSERT INTO "KENWBS07" VALUES (722, 1, null, 'Nekrose', null, null, 4);
INSERT INTO "KENWBS07" VALUES (780, 1, null, 'Nekrose', null, null, 4);
INSERT INTO "KENWBS07" VALUES (359, 1, null, 'Nekrotisch', null, null, 1);
INSERT INTO "KENWBS07" VALUES (434, 1, null, 'Nekrotisch', null, null, 1);
INSERT INTO "KENWBS07" VALUES (500, 1, null, 'Nekrotisch', null, null, 1);
INSERT INTO "KENWBS07" VALUES (566, 1, null, 'Nekrotisch', null, null, 1);
INSERT INTO "KENWBS07" VALUES (632, 1, null, 'Nekrotisch', null, null, 1);
INSERT INTO "KENWBS07" VALUES (698, 1, null, 'Nekrotisch', null, null, 1);
INSERT INTO "KENWBS07" VALUES (756, 1, null, 'Nekrotisch', null, null, 1);
INSERT INTO "KENWBS07" VALUES (341, 1, null, 'Operation', null, null, 11);
INSERT INTO "KENWBS07" VALUES (416, 1, null, 'Operation', null, null, 11);
INSERT INTO "KENWBS07" VALUES (482, 1, null, 'Operation', null, null, 11);
INSERT INTO "KENWBS07" VALUES (548, 1, null, 'Operation', null, null, 11);
INSERT INTO "KENWBS07" VALUES (614, 1, null, 'Operation', null, null, 11);
INSERT INTO "KENWBS07" VALUES (680, 1, null, 'Operation', null, null, 11);
INSERT INTO "KENWBS07" VALUES (738, 1, null, 'Operation', null, null, 11);
INSERT INTO "KENWBS07" VALUES (334, 1, null, 'Polyneuropathie', null, null, 4);
INSERT INTO "KENWBS07" VALUES (409, 1, null, 'Polyneuropathie', null, null, 4);
INSERT INTO "KENWBS07" VALUES (475, 1, null, 'Polyneuropathie', null, null, 4);
INSERT INTO "KENWBS07" VALUES (541, 1, null, 'Polyneuropathie', null, null, 4);
INSERT INTO "KENWBS07" VALUES (607, 1, null, 'Polyneuropathie', null, null, 4);
INSERT INTO "KENWBS07" VALUES (673, 1, null, 'Polyneuropathie', null, null, 4);
INSERT INTO "KENWBS07" VALUES (731, 1, null, 'Polyneuropathie', null, null, 4);
INSERT INTO "KENWBS07" VALUES (363, 1, null, 'Rosig', null, null, 5);
INSERT INTO "KENWBS07" VALUES (438, 1, null, 'Rosig', null, null, 5);
INSERT INTO "KENWBS07" VALUES (504, 1, null, 'Rosig', null, null, 5);
INSERT INTO "KENWBS07" VALUES (570, 1, null, 'Rosig', null, null, 5);
INSERT INTO "KENWBS07" VALUES (636, 1, null, 'Rosig', null, null, 5);
INSERT INTO "KENWBS07" VALUES (702, 1, null, 'Rosig', null, null, 5);
INSERT INTO "KENWBS07" VALUES (760, 1, null, 'Rosig', null, null, 5);
INSERT INTO "KENWBS07" VALUES (356, 1, null, 'Rötung', null, null, 4);
INSERT INTO "KENWBS07" VALUES (371, 1, null, 'Rötung', null, null, 1);
INSERT INTO "KENWBS07" VALUES (431, 1, null, 'Rötung', null, null, 4);
INSERT INTO "KENWBS07" VALUES (446, 1, null, 'Rötung', null, null, 1);
INSERT INTO "KENWBS07" VALUES (497, 1, null, 'Rötung', null, null, 4);
INSERT INTO "KENWBS07" VALUES (512, 1, null, 'Rötung', null, null, 1);
INSERT INTO "KENWBS07" VALUES (563, 1, null, 'Rötung', null, null, 4);
INSERT INTO "KENWBS07" VALUES (578, 1, null, 'Rötung', null, null, 1);
INSERT INTO "KENWBS07" VALUES (629, 1, null, 'Rötung', null, null, 4);
INSERT INTO "KENWBS07" VALUES (644, 1, null, 'Rötung', null, null, 1);
INSERT INTO "KENWBS07" VALUES (695, 1, null, 'Rötung', null, null, 4);
INSERT INTO "KENWBS07" VALUES (710, 1, null, 'Rötung', null, null, 1);
INSERT INTO "KENWBS07" VALUES (753, 1, null, 'Rötung', null, null, 4);
INSERT INTO "KENWBS07" VALUES (768, 1, null, 'Rötung', null, null, 1);
INSERT INTO "KENWBS07" VALUES (354, 1, null, 'Schmerz', null, null, 2);
INSERT INTO "KENWBS07" VALUES (405, 1, null, 'Schmerz', null, null, 1);
INSERT INTO "KENWBS07" VALUES (429, 1, null, 'Schmerz', null, null, 2);
INSERT INTO "KENWBS07" VALUES (471, 1, null, 'Schmerz', null, null, 1);
INSERT INTO "KENWBS07" VALUES (495, 1, null, 'Schmerz', null, null, 2);
INSERT INTO "KENWBS07" VALUES (537, 1, null, 'Schmerz', null, null, 1);
INSERT INTO "KENWBS07" VALUES (561, 1, null, 'Schmerz', null, null, 2);
INSERT INTO "KENWBS07" VALUES (603, 1, null, 'Schmerz', null, null, 1);
INSERT INTO "KENWBS07" VALUES (627, 1, null, 'Schmerz', null, null, 2);
INSERT INTO "KENWBS07" VALUES (669, 1, null, 'Schmerz', null, null, 1);
INSERT INTO "KENWBS07" VALUES (693, 1, null, 'Schmerz', null, null, 2);
INSERT INTO "KENWBS07" VALUES (727, 1, null, 'Schmerz', null, null, 1);
INSERT INTO "KENWBS07" VALUES (751, 1, null, 'Schmerz', null, null, 2);
INSERT INTO "KENWBS07" VALUES (785, 1, null, 'Schmerz', null, null, 1);
INSERT INTO "KENWBS07" VALUES (372, 1, null, 'Schwellung', null, null, 2);
INSERT INTO "KENWBS07" VALUES (447, 1, null, 'Schwellung', null, null, 2);
INSERT INTO "KENWBS07" VALUES (513, 1, null, 'Schwellung', null, null, 2);
INSERT INTO "KENWBS07" VALUES (579, 1, null, 'Schwellung', null, null, 2);
INSERT INTO "KENWBS07" VALUES (645, 1, null, 'Schwellung', null, null, 2);
INSERT INTO "KENWBS07" VALUES (711, 1, null, 'Schwellung', null, null, 2);
INSERT INTO "KENWBS07" VALUES (769, 1, null, 'Schwellung', null, null, 2);
INSERT INTO "KENWBS07" VALUES (339, 1, null, 'Sonstige', null, null, 9);
INSERT INTO "KENWBS07" VALUES (414, 1, null, 'Sonstige', null, null, 9);
INSERT INTO "KENWBS07" VALUES (480, 1, null, 'Sonstige', null, null, 9);
INSERT INTO "KENWBS07" VALUES (546, 1, null, 'Sonstige', null, null, 9);
INSERT INTO "KENWBS07" VALUES (612, 1, null, 'Sonstige', null, null, 9);
INSERT INTO "KENWBS07" VALUES (678, 1, null, 'Sonstige', null, null, 9);
INSERT INTO "KENWBS07" VALUES (736, 1, null, 'Sonstige', null, null, 9);
INSERT INTO "KENWBS07" VALUES (368, 1, null, 'Steil', null, null, 10);
INSERT INTO "KENWBS07" VALUES (443, 1, null, 'Steil', null, null, 10);
INSERT INTO "KENWBS07" VALUES (509, 1, null, 'Steil', null, null, 10);
INSERT INTO "KENWBS07" VALUES (575, 1, null, 'Steil', null, null, 10);
INSERT INTO "KENWBS07" VALUES (641, 1, null, 'Steil', null, null, 10);
INSERT INTO "KENWBS07" VALUES (707, 1, null, 'Steil', null, null, 10);
INSERT INTO "KENWBS07" VALUES (765, 1, null, 'Steil', null, null, 10);
INSERT INTO "KENWBS07" VALUES (340, 1, null, 'Sturz', null, null, 10);
INSERT INTO "KENWBS07" VALUES (415, 1, null, 'Sturz', null, null, 10);
INSERT INTO "KENWBS07" VALUES (481, 1, null, 'Sturz', null, null, 10);
INSERT INTO "KENWBS07" VALUES (547, 1, null, 'Sturz', null, null, 10);
INSERT INTO "KENWBS07" VALUES (613, 1, null, 'Sturz', null, null, 10);
INSERT INTO "KENWBS07" VALUES (679, 1, null, 'Sturz', null, null, 10);
INSERT INTO "KENWBS07" VALUES (737, 1, null, 'Sturz', null, null, 10);
INSERT INTO "KENWBS07" VALUES (374, 1, null, 'Trockene Haut', null, null, 4);
INSERT INTO "KENWBS07" VALUES (449, 1, null, 'Trockene Haut', null, null, 4);
INSERT INTO "KENWBS07" VALUES (515, 1, null, 'Trockene Haut', null, null, 4);
INSERT INTO "KENWBS07" VALUES (581, 1, null, 'Trockene Haut', null, null, 4);
INSERT INTO "KENWBS07" VALUES (647, 1, null, 'Trockene Haut', null, null, 4);
INSERT INTO "KENWBS07" VALUES (713, 1, null, 'Trockene Haut', null, null, 4);
INSERT INTO "KENWBS07" VALUES (771, 1, null, 'Trockene Haut', null, null, 4);
INSERT INTO "KENWBS07" VALUES (367, 1, null, 'Unregelmäßig', null, null, 9);
INSERT INTO "KENWBS07" VALUES (442, 1, null, 'Unregelmäßig', null, null, 9);
INSERT INTO "KENWBS07" VALUES (508, 1, null, 'Unregelmäßig', null, null, 9);
INSERT INTO "KENWBS07" VALUES (574, 1, null, 'Unregelmäßig', null, null, 9);
INSERT INTO "KENWBS07" VALUES (640, 1, null, 'Unregelmäßig', null, null, 9);
INSERT INTO "KENWBS07" VALUES (706, 1, null, 'Unregelmäßig', null, null, 9);
INSERT INTO "KENWBS07" VALUES (764, 1, null, 'Unregelmäßig', null, null, 9);
INSERT INTO "KENWBS07" VALUES (360, 1, null, 'Unterminiert', null, null, 2);
INSERT INTO "KENWBS07" VALUES (435, 1, null, 'Unterminiert', null, null, 2);
INSERT INTO "KENWBS07" VALUES (501, 1, null, 'Unterminiert', null, null, 2);
INSERT INTO "KENWBS07" VALUES (567, 1, null, 'Unterminiert', null, null, 2);
INSERT INTO "KENWBS07" VALUES (633, 1, null, 'Unterminiert', null, null, 2);
INSERT INTO "KENWBS07" VALUES (699, 1, null, 'Unterminiert', null, null, 2);
INSERT INTO "KENWBS07" VALUES (757, 1, null, 'Unterminiert', null, null, 2);
INSERT INTO "KENWBS07" VALUES (377, 1, null, 'Verhärtung', null, null, 7);
INSERT INTO "KENWBS07" VALUES (452, 1, null, 'Verhärtung', null, null, 7);
INSERT INTO "KENWBS07" VALUES (518, 1, null, 'Verhärtung', null, null, 7);
INSERT INTO "KENWBS07" VALUES (584, 1, null, 'Verhärtung', null, null, 7);
INSERT INTO "KENWBS07" VALUES (650, 1, null, 'Verhärtung', null, null, 7);
INSERT INTO "KENWBS07" VALUES (716, 1, null, 'Verhärtung', null, null, 7);
INSERT INTO "KENWBS07" VALUES (774, 1, null, 'Verhärtung', null, null, 7);
INSERT INTO "KENWBS07" VALUES (342, 1, null, 'Verletzung', null, null, 12);
INSERT INTO "KENWBS07" VALUES (417, 1, null, 'Verletzung', null, null, 12);
INSERT INTO "KENWBS07" VALUES (483, 1, null, 'Verletzung', null, null, 12);
INSERT INTO "KENWBS07" VALUES (549, 1, null, 'Verletzung', null, null, 12);
INSERT INTO "KENWBS07" VALUES (615, 1, null, 'Verletzung', null, null, 12);
INSERT INTO "KENWBS07" VALUES (681, 1, null, 'Verletzung', null, null, 12);
INSERT INTO "KENWBS07" VALUES (739, 1, null, 'Verletzung', null, null, 12);
INSERT INTO "KENWBS07" VALUES (361, 1, null, 'Wulstig', null, null, 3);
INSERT INTO "KENWBS07" VALUES (436, 1, null, 'Wulstig', null, null, 3);
INSERT INTO "KENWBS07" VALUES (502, 1, null, 'Wulstig', null, null, 3);
INSERT INTO "KENWBS07" VALUES (568, 1, null, 'Wulstig', null, null, 3);
INSERT INTO "KENWBS07" VALUES (634, 1, null, 'Wulstig', null, null, 3);
INSERT INTO "KENWBS07" VALUES (700, 1, null, 'Wulstig', null, null, 3);
INSERT INTO "KENWBS07" VALUES (758, 1, null, 'Wulstig', null, null, 3);
INSERT INTO "KENWBS07" VALUES (376, 1, null, 'Wärme', null, null, 6);
INSERT INTO "KENWBS07" VALUES (451, 1, null, 'Wärme', null, null, 6);
INSERT INTO "KENWBS07" VALUES (517, 1, null, 'Wärme', null, null, 6);
INSERT INTO "KENWBS07" VALUES (583, 1, null, 'Wärme', null, null, 6);
INSERT INTO "KENWBS07" VALUES (649, 1, null, 'Wärme', null, null, 6);
INSERT INTO "KENWBS07" VALUES (715, 1, null, 'Wärme', null, null, 6);
INSERT INTO "KENWBS07" VALUES (773, 1, null, 'Wärme', null, null, 6);
INSERT INTO "KENWBS07" VALUES (402, 1, null, 'Zyanose', 401, null, 1);
INSERT INTO "KENWBS07" VALUES (383, 1, null, 'altrosa', 380, null, 3);
INSERT INTO "KENWBS07" VALUES (458, 1, null, 'altrosa', 455, null, 3);
INSERT INTO "KENWBS07" VALUES (524, 1, null, 'altrosa', 521, null, 3);
INSERT INTO "KENWBS07" VALUES (590, 1, null, 'altrosa', 587, null, 3);
INSERT INTO "KENWBS07" VALUES (656, 1, null, 'altrosa', 653, null, 3);
INSERT INTO "KENWBS07" VALUES (399, 1, null, 'beginnend', 397, null, 2);
INSERT INTO "KENWBS07" VALUES (403, 1, null, 'blass', 401, null, 2);
INSERT INTO "KENWBS07" VALUES (352, 1, null, 'eitrig - undurchsichtig, gelblich bis grün', null, null, 4);
INSERT INTO "KENWBS07" VALUES (427, 1, null, 'eitrig - undurchsichtig, gelblich bis grün', null, null, 4);
INSERT INTO "KENWBS07" VALUES (493, 1, null, 'eitrig - undurchsichtig, gelblich bis grün', null, null, 4);
INSERT INTO "KENWBS07" VALUES (559, 1, null, 'eitrig - undurchsichtig, gelblich bis grün', null, null, 4);
INSERT INTO "KENWBS07" VALUES (625, 1, null, 'eitrig - undurchsichtig, gelblich bis grün', null, null, 4);
INSERT INTO "KENWBS07" VALUES (691, 1, null, 'eitrig - undurchsichtig, gelblich bis grün', null, null, 4);
INSERT INTO "KENWBS07" VALUES (749, 1, null, 'eitrig - undurchsichtig, gelblich bis grün', null, null, 4);
INSERT INTO "KENWBS07" VALUES (381, 1, null, 'geheilt', 380, null, 1);
INSERT INTO "KENWBS07" VALUES (456, 1, null, 'geheilt', 455, null, 1);
INSERT INTO "KENWBS07" VALUES (522, 1, null, 'geheilt', 521, null, 1);
INSERT INTO "KENWBS07" VALUES (588, 1, null, 'geheilt', 587, null, 1);
INSERT INTO "KENWBS07" VALUES (654, 1, null, 'geheilt', 653, null, 1);
INSERT INTO "KENWBS07" VALUES (346, 1, null, 'gering - Wundbett feucht, etwas aus Verband austr', null, null, 3);
INSERT INTO "KENWBS07" VALUES (421, 1, null, 'gering - Wundbett feucht, etwas aus Verband austr', null, null, 3);
INSERT INTO "KENWBS07" VALUES (487, 1, null, 'gering - Wundbett feucht, etwas aus Verband austr', null, null, 3);
INSERT INTO "KENWBS07" VALUES (553, 1, null, 'gering - Wundbett feucht, etwas aus Verband austr', null, null, 3);
INSERT INTO "KENWBS07" VALUES (619, 1, null, 'gering - Wundbett feucht, etwas aus Verband austr', null, null, 3);
INSERT INTO "KENWBS07" VALUES (685, 1, null, 'gering - Wundbett feucht, etwas aus Verband austr', null, null, 3);
INSERT INTO "KENWBS07" VALUES (743, 1, null, 'gering - Wundbett feucht, etwas aus Verband austr', null, null, 3);
INSERT INTO "KENWBS07" VALUES (389, 1, null, 'haftend, mit gelben Ablagerungen oder Fibrin', 387, null, 2);
INSERT INTO "KENWBS07" VALUES (464, 1, null, 'haftend, mit gelben Ablagerungen oder Fibrin', 462, null, 2);
INSERT INTO "KENWBS07" VALUES (530, 1, null, 'haftend, mit gelben Ablagerungen oder Fibrin', 528, null, 2);
INSERT INTO "KENWBS07" VALUES (596, 1, null, 'haftend, mit gelben Ablagerungen oder Fibrin', 594, null, 2);
INSERT INTO "KENWBS07" VALUES (662, 1, null, 'haftend, mit gelben Ablagerungen oder Fibrin', 660, null, 2);
INSERT INTO "KENWBS07" VALUES (391, 1, null, 'harter, trockener, schwarzer Schorf', 387, null, 4);
INSERT INTO "KENWBS07" VALUES (466, 1, null, 'harter, trockener, schwarzer Schorf', 462, null, 4);
INSERT INTO "KENWBS07" VALUES (532, 1, null, 'harter, trockener, schwarzer Schorf', 528, null, 4);
INSERT INTO "KENWBS07" VALUES (598, 1, null, 'harter, trockener, schwarzer Schorf', 594, null, 4);
INSERT INTO "KENWBS07" VALUES (664, 1, null, 'harter, trockener, schwarzer Schorf', 660, null, 4);
INSERT INTO "KENWBS07" VALUES (384, 1, null, 'hell', 380, null, 4);
INSERT INTO "KENWBS07" VALUES (459, 1, null, 'hell', 455, null, 4);
INSERT INTO "KENWBS07" VALUES (525, 1, null, 'hell', 521, null, 4);
INSERT INTO "KENWBS07" VALUES (591, 1, null, 'hell', 587, null, 4);
INSERT INTO "KENWBS07" VALUES (657, 1, null, 'hell', 653, null, 4);
INSERT INTO "KENWBS07" VALUES (382, 1, null, 'hell, fleischig rot', 380, null, 2);
INSERT INTO "KENWBS07" VALUES (457, 1, null, 'hell, fleischig rot', 455, null, 2);
INSERT INTO "KENWBS07" VALUES (523, 1, null, 'hell, fleischig rot', 521, null, 2);
INSERT INTO "KENWBS07" VALUES (589, 1, null, 'hell, fleischig rot', 587, null, 2);
INSERT INTO "KENWBS07" VALUES (655, 1, null, 'hell, fleischig rot', 653, null, 2);
INSERT INTO "KENWBS07" VALUES (345, 1, null, 'kaum - Wundbett feucht, Verband trocken', null, null, 2);
INSERT INTO "KENWBS07" VALUES (420, 1, null, 'kaum - Wundbett feucht, Verband trocken', null, null, 2);
INSERT INTO "KENWBS07" VALUES (486, 1, null, 'kaum - Wundbett feucht, Verband trocken', null, null, 2);
INSERT INTO "KENWBS07" VALUES (552, 1, null, 'kaum - Wundbett feucht, Verband trocken', null, null, 2);
INSERT INTO "KENWBS07" VALUES (618, 1, null, 'kaum - Wundbett feucht, Verband trocken', null, null, 2);
INSERT INTO "KENWBS07" VALUES (684, 1, null, 'kaum - Wundbett feucht, Verband trocken', null, null, 2);
INSERT INTO "KENWBS07" VALUES (742, 1, null, 'kaum - Wundbett feucht, Verband trocken', null, null, 2);
INSERT INTO "KENWBS07" VALUES (344, 1, null, 'kein - abgeheilt oder trockene Wunde', null, null, 1);
INSERT INTO "KENWBS07" VALUES (419, 1, null, 'kein - abgeheilt oder trockene Wunde', null, null, 1);
INSERT INTO "KENWBS07" VALUES (485, 1, null, 'kein - abgeheilt oder trockene Wunde', null, null, 1);
INSERT INTO "KENWBS07" VALUES (551, 1, null, 'kein - abgeheilt oder trockene Wunde', null, null, 1);
INSERT INTO "KENWBS07" VALUES (617, 1, null, 'kein - abgeheilt oder trockene Wunde', null, null, 1);
INSERT INTO "KENWBS07" VALUES (683, 1, null, 'kein - abgeheilt oder trockene Wunde', null, null, 1);
INSERT INTO "KENWBS07" VALUES (741, 1, null, 'kein - abgeheilt oder trockene Wunde', null, null, 1);
INSERT INTO "KENWBS07" VALUES (388, 1, null, 'locker, mit gelben Ablagerungen', 387, null, 1);
INSERT INTO "KENWBS07" VALUES (463, 1, null, 'locker, mit gelben Ablagerungen', 462, null, 1);
INSERT INTO "KENWBS07" VALUES (529, 1, null, 'locker, mit gelben Ablagerungen', 528, null, 1);
INSERT INTO "KENWBS07" VALUES (595, 1, null, 'locker, mit gelben Ablagerungen', 594, null, 1);
INSERT INTO "KENWBS07" VALUES (661, 1, null, 'locker, mit gelben Ablagerungen', 660, null, 1);
INSERT INTO "KENWBS07" VALUES (347, 1, null, 'moderat - deutlich flüssig im Wundbett', null, null, 4);
INSERT INTO "KENWBS07" VALUES (422, 1, null, 'moderat - deutlich flüssig im Wundbett', null, null, 4);
INSERT INTO "KENWBS07" VALUES (488, 1, null, 'moderat - deutlich flüssig im Wundbett', null, null, 4);
INSERT INTO "KENWBS07" VALUES (554, 1, null, 'moderat - deutlich flüssig im Wundbett', null, null, 4);
INSERT INTO "KENWBS07" VALUES (620, 1, null, 'moderat - deutlich flüssig im Wundbett', null, null, 4);
INSERT INTO "KENWBS07" VALUES (686, 1, null, 'moderat - deutlich flüssig im Wundbett', null, null, 4);
INSERT INTO "KENWBS07" VALUES (744, 1, null, 'moderat - deutlich flüssig im Wundbett', null, null, 4);
INSERT INTO "KENWBS07" VALUES (348, 1, null, 'reichlich/massenhaft - Verband mehr als erschöpft', null, null, 5);
INSERT INTO "KENWBS07" VALUES (423, 1, null, 'reichlich/massenhaft - Verband mehr als erschöpft', null, null, 5);
INSERT INTO "KENWBS07" VALUES (489, 1, null, 'reichlich/massenhaft - Verband mehr als erschöpft', null, null, 5);
INSERT INTO "KENWBS07" VALUES (555, 1, null, 'reichlich/massenhaft - Verband mehr als erschöpft', null, null, 5);
INSERT INTO "KENWBS07" VALUES (621, 1, null, 'reichlich/massenhaft - Verband mehr als erschöpft', null, null, 5);
INSERT INTO "KENWBS07" VALUES (687, 1, null, 'reichlich/massenhaft - Verband mehr als erschöpft', null, null, 5);
INSERT INTO "KENWBS07" VALUES (745, 1, null, 'reichlich/massenhaft - Verband mehr als erschöpft', null, null, 5);
INSERT INTO "KENWBS07" VALUES (404, 1, null, 'rot', 401, null, 3);
INSERT INTO "KENWBS07" VALUES (350, 1, null, 'serös - wässerig, klar, hell, gelblich', null, null, 2);
INSERT INTO "KENWBS07" VALUES (425, 1, null, 'serös - wässerig, klar, hell, gelblich', null, null, 2);
INSERT INTO "KENWBS07" VALUES (491, 1, null, 'serös - wässerig, klar, hell, gelblich', null, null, 2);
INSERT INTO "KENWBS07" VALUES (557, 1, null, 'serös - wässerig, klar, hell, gelblich', null, null, 2);
INSERT INTO "KENWBS07" VALUES (623, 1, null, 'serös - wässerig, klar, hell, gelblich', null, null, 2);
INSERT INTO "KENWBS07" VALUES (689, 1, null, 'serös - wässerig, klar, hell, gelblich', null, null, 2);
INSERT INTO "KENWBS07" VALUES (747, 1, null, 'serös - wässerig, klar, hell, gelblich', null, null, 2);
INSERT INTO "KENWBS07" VALUES (349, 1, null, 'serös/blutig - wässerig, hell, rot bis rosa', null, null, 1);
INSERT INTO "KENWBS07" VALUES (424, 1, null, 'serös/blutig - wässerig, hell, rot bis rosa', null, null, 1);
INSERT INTO "KENWBS07" VALUES (490, 1, null, 'serös/blutig - wässerig, hell, rot bis rosa', null, null, 1);
INSERT INTO "KENWBS07" VALUES (556, 1, null, 'serös/blutig - wässerig, hell, rot bis rosa', null, null, 1);
INSERT INTO "KENWBS07" VALUES (622, 1, null, 'serös/blutig - wässerig, hell, rot bis rosa', null, null, 1);
INSERT INTO "KENWBS07" VALUES (688, 1, null, 'serös/blutig - wässerig, hell, rot bis rosa', null, null, 1);
INSERT INTO "KENWBS07" VALUES (746, 1, null, 'serös/blutig - wässerig, hell, rot bis rosa', null, null, 1);
INSERT INTO "KENWBS07" VALUES (351, 1, null, 'serös/eitrig - undurchsichtig', null, null, 3);
INSERT INTO "KENWBS07" VALUES (426, 1, null, 'serös/eitrig - undurchsichtig', null, null, 3);
INSERT INTO "KENWBS07" VALUES (492, 1, null, 'serös/eitrig - undurchsichtig', null, null, 3);
INSERT INTO "KENWBS07" VALUES (558, 1, null, 'serös/eitrig - undurchsichtig', null, null, 3);
INSERT INTO "KENWBS07" VALUES (624, 1, null, 'serös/eitrig - undurchsichtig', null, null, 3);
INSERT INTO "KENWBS07" VALUES (690, 1, null, 'serös/eitrig - undurchsichtig', null, null, 3);
INSERT INTO "KENWBS07" VALUES (748, 1, null, 'serös/eitrig - undurchsichtig', null, null, 3);
INSERT INTO "KENWBS07" VALUES (400, 1, null, 'voll', 397, null, 3);
INSERT INTO "KENWBS07" VALUES (398, 1, null, 'vorhanden', 397, null, 1);
INSERT INTO "KENWBS07" VALUES (390, 1, null, 'weicher, grauer oder schwarzer Schorf', 387, null, 3);
INSERT INTO "KENWBS07" VALUES (465, 1, null, 'weicher, grauer oder schwarzer Schorf', 462, null, 3);
INSERT INTO "KENWBS07" VALUES (531, 1, null, 'weicher, grauer oder schwarzer Schorf', 528, null, 3);
INSERT INTO "KENWBS07" VALUES (597, 1, null, 'weicher, grauer oder schwarzer Schorf', 594, null, 3);
INSERT INTO "KENWBS07" VALUES (663, 1, null, 'weicher, grauer oder schwarzer Schorf', 660, null, 3);
INSERT INTO "KENWBS07" VALUES (357, 1, null, 'Ödeme', null, null, 5);
INSERT INTO "KENWBS07" VALUES (432, 1, null, 'Ödeme', null, null, 5);
INSERT INTO "KENWBS07" VALUES (498, 1, null, 'Ödeme', null, null, 5);
INSERT INTO "KENWBS07" VALUES (564, 1, null, 'Ödeme', null, null, 5);
INSERT INTO "KENWBS07" VALUES (630, 1, null, 'Ödeme', null, null, 5);
INSERT INTO "KENWBS07" VALUES (696, 1, null, 'Ödeme', null, null, 5);
INSERT INTO "KENWBS07" VALUES (754, 1, null, 'Ödeme', null, null, 5);
INSERT INTO "KENWBS07" VALUES (353, 1, null, 'Überwärmung', null, null, 1);
INSERT INTO "KENWBS07" VALUES (428, 1, null, 'Überwärmung', null, null, 1);
INSERT INTO "KENWBS07" VALUES (494, 1, null, 'Überwärmung', null, null, 1);
INSERT INTO "KENWBS07" VALUES (560, 1, null, 'Überwärmung', null, null, 1);
INSERT INTO "KENWBS07" VALUES (626, 1, null, 'Überwärmung', null, null, 1);
INSERT INTO "KENWBS07" VALUES (692, 1, null, 'Überwärmung', null, null, 1);
INSERT INTO "KENWBS07" VALUES (750, 1, null, 'Überwärmung', null, null, 1);
COMMIT;

-- ----------------------------
-- Table structure for KENWUN07
-- ----------------------------
DROP TABLE IF EXISTS "KENWUN07";
CREATE TABLE "KENWUN07" (
"NR"  INTEGER NOT NULL,
"KENMDT07_NR"  INTEGER NOT NULL,
"BEZEICH"  VARCHAR2(30) NOT NULL,
"TYP"  VARCHAR2(1) NOT NULL,
"GROESSEPFL"  VARCHAR2(1) NOT NULL,
"GRADSTATUS"  VARCHAR2(1) NOT NULL DEFAULT 'E',
"KOERPERSTELLEPFL"  VARCHAR2(1) NOT NULL DEFAULT 'n',
PRIMARY KEY ("NR" ASC, "KENMDT07_NR" ASC)
)

;

-- ----------------------------
-- Records of KENWUN07
-- ----------------------------
BEGIN;
INSERT INTO "KENWUN07" VALUES (13, 1, 'Senso6 Dekubitus', 'D', 'j', 'P', 'j');
INSERT INTO "KENWUN07" VALUES (14, 1, 'diabetisches Fußsydrom', 'S', 'j', 'E', 'j');
INSERT INTO "KENWUN07" VALUES (15, 1, 'Ulcus cruris venosum', 'S', 'j', 'E', 'j');
INSERT INTO "KENWUN07" VALUES (16, 1, 'Ulcus cruris arteriosum', 'S', 'j', 'E', 'j');
INSERT INTO "KENWUN07" VALUES (17, 1, 'Ulcus cruris mixtum', 'S', 'j', 'E', 'j');
INSERT INTO "KENWUN07" VALUES (18, 1, 'Dekubitus', 'D', 'j', 'P', 'j');
INSERT INTO "KENWUN07" VALUES (19, 1, 'Ulcus cruris', 'S', 'j', 'E', 'j');
COMMIT;

-- ----------------------------
-- Table structure for MITAPE07
-- ----------------------------
DROP TABLE IF EXISTS "MITAPE07";
CREATE TABLE "MITAPE07" (
"NR"  NUMBER(12) NOT NULL,
"KENMDT07_NR"  INTEGER NOT NULL,
"SUCHBEZ"  VARCHAR2(30) NOT NULL,
"NAME"  VARCHAR2(30),
"VORNAME"  VARCHAR2(30),
"KUERZL"  VARCHAR2(5) NOT NULL,
"QUALNR"  INTEGER,
"PDACODE"  VARCHAR2(12),
"GLKONTR"  VARCHAR2(1) NOT NULL DEFAULT 'n',
"SAMMQUIT_M"  VARCHAR2(1) NOT NULL DEFAULT 'n',
"GESCHLECHT"  VARCHAR2(100),
PRIMARY KEY ("NR" ASC, "KENMDT07_NR" ASC)
)

;

-- ----------------------------
-- Records of MITAPE07
-- ----------------------------
BEGIN;
INSERT INTO "MITAPE07" VALUES (22, 1, 'Zaren; Mila', 'Zaaren', 'Mila', 'DBL', null, null, 'n', 'n', 'weiblich');
INSERT INTO "MITAPE07" VALUES (23, 1, 'Henschel; Jutta', 'Henschel', 'Jutta', 'DBRA', null, null, 'n', 'n', 'weiblich');
INSERT INTO "MITAPE07" VALUES (21, 1, 'Toosen; Hans', 'Toosen', 'Hans', 'Dug', null, null, 'n', 'n', 'männlich');
INSERT INTO "MITAPE07" VALUES (20, 1, 'Hoolwitz; Kai', 'Hoolwitz', 'Kai', 'Dunke', null, null, 'n', 'n', 'männlich');
INSERT INTO "MITAPE07" VALUES (18, 1, 'Paulus; Christa', 'Paulus', 'Christa', 'HG', null, null, 'n', 'n', 'weiblich');
INSERT INTO "MITAPE07" VALUES (16, 1, 'Ottermann; Werner', 'Ottermann', 'Werner', 'Hb', null, null, 'n', 'n', 'männlich');
INSERT INTO "MITAPE07" VALUES (14, 1, 'Weng; Lisa', 'Weng', 'Lisa', 'Hellb', null, null, 'n', 'n', 'weiblich');
INSERT INTO "MITAPE07" VALUES (17, 1, 'Wiese; Klaus', 'Wiese', 'Klaus', 'Hellr', null, null, 'n', 'n', 'männlich');
INSERT INTO "MITAPE07" VALUES (19, 1, 'Kloos; Elisa', 'Kloos', 'Elisa', 'Hgr', null, null, 'n', 'n', 'weiblich');
INSERT INTO "MITAPE07" VALUES (24, 1, 'Abelt; Karin', 'Abelt', 'Karin', 'Pink', null, null, 'n', 'n', 'weiblich');
INSERT INTO "MITAPE07" VALUES (2, 1, 'Grün; Joana', 'Grün', 'Joana', 'John', 2, null, 'n', 'n', 'weiblich');
INSERT INTO "MITAPE07" VALUES (3, 1, 'Rot; Andreas', 'Rot', 'Andreas', 'Treff', 2, 'rot', 'n', 'n', 'männlich');
INSERT INTO "MITAPE07" VALUES (4, 1, 'Schwarz; Thomas', 'Schwarz', 'Thomas', 'Nau', 2, 'schw', 'n', 'n', 'männlich');
INSERT INTO "MITAPE07" VALUES (5, 1, 'Braun; Achim', 'Braun', 'Achim', 'Holl', null, 'brau', 'n', 'n', 'männlich');
INSERT INTO "MITAPE07" VALUES (6, 1, 'Hantzsch; Alexander', 'Hantzsch', 'Alexander', 'AHA', 3, 1234, 'n', 'n', 'männlich');
INSERT INTO "MITAPE07" VALUES (7, 1, 'Schöpp; Christina', 'Schöpp', 'Christina', 'CSC', 2, 1234, 'n', 'n', 'weiblich');
INSERT INTO "MITAPE07" VALUES (8, 1, 'Blau; Anne', 'Blau', 'Anne', 'Blau', 3, 'blau', 'n', 'n', 'weiblich');
INSERT INTO "MITAPE07" VALUES (9, 1, 'Rosa; Heino', 'Rosa', 'Heino', 'Rosa', 1, 'rosa', 'n', 'n', 'männlich');
INSERT INTO "MITAPE07" VALUES (10, 1, 'Orange; Erika', 'Orange', 'Erika', 'Orang', 1, 'oran', 'n', 'n', 'weiblich');
INSERT INTO "MITAPE07" VALUES (11, 1, 'Fethke; Hanne', 'Fethke', 'Hanne', 'Beige', 1, 'beig', 'j', 'n', 'weiblich');
INSERT INTO "MITAPE07" VALUES (12, 1, 'Grau; Carolin', 'Grau', 'Carolin', 'Grau', 1, 'grau', 'n', 'n', 'weiblich');
INSERT INTO "MITAPE07" VALUES (13, 1, 'Krebs; Andreas', 'Krebs', 'Andreas', 'Heino', 1, 'frie', 'n', 'n', 'männlich');
INSERT INTO "MITAPE07" VALUES (25, 1, 'Tulpe; Heiner', 'Tulpe', 'Heiner', 'Löwe', 1, null, 'n', 'n', 'männlich');
INSERT INTO "MITAPE07" VALUES (26, 1, 'Nau Thomas', 'Nau', 'Thomas', 'Na', null, null, 'n', 'n', 'männlich');
INSERT INTO "MITAPE07" VALUES (27, 1, 'Schraml; Brigitte', 'Schraml', 'Brigitte', 'Schra', 8, null, 'n', 'n', 'weiblich');
INSERT INTO "MITAPE07" VALUES (28, 1, 'Zuckriegel; Elke', 'Zuckriegel', 'Elke', 'Zuckr', 8, null, 'n', 'n', 'weiblich');
INSERT INTO "MITAPE07" VALUES (29, 1, 'Fischer; Christine', 'Fischer', 'Christine', 'Fisch', null, null, 'n', 'n', 'weiblich');
INSERT INTO "MITAPE07" VALUES (30, 1, 'Doll; Holger', 'Doll', 'Holger', 'Doll', null, null, 'n', 'n', 'männlich');
INSERT INTO "MITAPE07" VALUES (31, 1, 'Bajor; Agnes', 'Bajor', 'Agnes', 'Bajor', 8, null, 'n', 'n', 'weiblich');
INSERT INTO "MITAPE07" VALUES (32, 1, 'Rau; Verena', 'Rau', 'Verena', 'Rau', null, null, 'n', 'n', 'weiblich');
INSERT INTO "MITAPE07" VALUES (33, 1, 'Sillman; Rosemarie', 'Sillman', 'Rosemarie', 'Sillm', null, null, 'n', 'n', 'weiblich');
INSERT INTO "MITAPE07" VALUES (34, 1, 'Heror; Agnes', 'Heror', 'Agnes', 'Heror', 8, null, 'n', 'n', 'weiblich');
INSERT INTO "MITAPE07" VALUES (35, 1, 'Nelke; Heike', 'Nelke', 'Heike', 'Nelke', 11, null, 'n', 'n', 'weiblich');
INSERT INTO "MITAPE07" VALUES (36, 1, 'Rose; Christian', 'Rose', 'Christian', 'Rose', 2, null, 'n', 'n', 'männlich');
INSERT INTO "MITAPE07" VALUES (37, 1, 'Lierenfeld; Hans-Heinrich', 'Lierenfeld', 'Hans-Heinrich', 'Lilie', 15, null, 'n', 'n', 'männlich');
INSERT INTO "MITAPE07" VALUES (38, 1, 'Anemone; Rita', 'Anemone', 'Rita', 'Anemo', 18, null, 'n', 'n', 'weiblich');
INSERT INTO "MITAPE07" VALUES (39, 1, 'Veilchen; Christa', 'Veilchen', 'Christa', 'Veilc', 18, null, 'n', 'n', 'weiblich');
INSERT INTO "MITAPE07" VALUES (40, 1, 'Krokus; Elvira', 'Krokus', 'Elvira', 'Kroku', 1, null, 'n', 'n', 'weiblich');
COMMIT;

-- ----------------------------
-- Table structure for STATIONEN07
-- ----------------------------
DROP TABLE IF EXISTS "STATIONEN07";
CREATE TABLE "STATIONEN07" (
"NR"  INTEGER NOT NULL,
"KENMDT07_NR"  INTEGER NOT NULL,
"BEZEICH"  VARCHAR2(30) NOT NULL,
"HAUS_NR"  INTEGER NOT NULL,
PRIMARY KEY ("NR" ASC, "KENMDT07_NR" ASC)
)

;

-- ----------------------------
-- Records of STATIONEN07
-- ----------------------------
BEGIN;
INSERT INTO "STATIONEN07" VALUES (10, 1, 'Wohnbereich Neustift', 3);
INSERT INTO "STATIONEN07" VALUES (9, 1, 'Wohnbereich Schwaz', 3);
INSERT INTO "STATIONEN07" VALUES (15, 1, 'Wohnbereich Thaur', 6);
INSERT INTO "STATIONEN07" VALUES (8, 1, 'Wohnbereich Rum', 3);
INSERT INTO "STATIONEN07" VALUES (16, 1, 'Wohnbereich Wörgl', 6);
INSERT INTO "STATIONEN07" VALUES (5, 1, 'Wohnbereich Lienz', 1);
INSERT INTO "STATIONEN07" VALUES (4, 1, 'Wohnbereich Kitzbühel', 1);
INSERT INTO "STATIONEN07" VALUES (3, 1, 'Wohnbereich Stams', 1);
INSERT INTO "STATIONEN07" VALUES (2, 1, 'Wohnbereich Kufstein', 1);
INSERT INTO "STATIONEN07" VALUES (13, 1, 'Wohnbereich Hall', 4);
INSERT INTO "STATIONEN07" VALUES (17, 1, 'Wohnbereich Landeck', 7);
INSERT INTO "STATIONEN07" VALUES (6, 1, 'Wohnbereich Umhausen', 1);
INSERT INTO "STATIONEN07" VALUES (1, 1, 'Wohnbereich Zirl', 1);
INSERT INTO "STATIONEN07" VALUES (7, 1, 'Wohnbereich Telfs', 2);
INSERT INTO "STATIONEN07" VALUES (11, 1, 'Wohnbereich St. Johann', 4);
INSERT INTO "STATIONEN07" VALUES (14, 1, 'Wohnbereich Imst', 5);
INSERT INTO "STATIONEN07" VALUES (12, 1, 'Wohnbereich Wattens', 4);
COMMIT;

-- ----------------------------
-- Indexes structure for table BEWDKL07
-- ----------------------------
CREATE UNIQUE INDEX "TESTSBEWDKL07_PK"
ON "BEWDKL07" ("NR" ASC, "KENMDT07_NR" ASC);

-- ----------------------------
-- Indexes structure for table BEWOPE07
-- ----------------------------
CREATE UNIQUE INDEX "TESTSBEWOPE07_PK"
ON "BEWOPE07" ("NR" ASC, "KENMDT07_NR" ASC);

-- ----------------------------
-- Indexes structure for table BEWWBS07
-- ----------------------------
CREATE UNIQUE INDEX "TESTSBEWWBS07_PK"
ON "BEWWBS07" ("NR" ASC, "KENMDT07_NR" ASC);

-- ----------------------------
-- Indexes structure for table BEWWBZ07
-- ----------------------------
CREATE UNIQUE INDEX "TESTSBEWWBZ07_PK"
ON "BEWWBZ07" ("NR" ASC, "KENMDT07_NR" ASC);

-- ----------------------------
-- Indexes structure for table KENDEK07
-- ----------------------------
CREATE UNIQUE INDEX "TESTSKENDEK07_PK"
ON "KENDEK07" ("NR" ASC, "KENMDT07_NR" ASC);

-- ----------------------------
-- Indexes structure for table KENWBS07
-- ----------------------------
CREATE UNIQUE INDEX "TESTSKENWBS07_PK"
ON "KENWBS07" ("NR" ASC, "KENMDT07_NR" ASC);

-- ----------------------------
-- Indexes structure for table KENWUN07
-- ----------------------------
CREATE UNIQUE INDEX "TESTSKENWUN07_PK"
ON "KENWUN07" ("NR" ASC, "KENMDT07_NR" ASC);

-- ----------------------------
-- Indexes structure for table MITAPE07
-- ----------------------------
CREATE UNIQUE INDEX "TESTSMITAPE07_PK"
ON "MITAPE07" ("NR" ASC, "KENMDT07_NR" ASC);

-- ----------------------------
-- Indexes structure for table STATIONEN07
-- ----------------------------
CREATE UNIQUE INDEX "TESTSSTATIONEN07_PK"
ON "STATIONEN07" ("NR" ASC, "KENMDT07_NR" ASC);
