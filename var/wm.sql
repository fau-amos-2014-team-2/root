-----------------------------------------------------
-- WOUND MANAGEMENT DEMO DATA SQL INSERTION SCRIPT --
-----------------------------------------------------
-- 
-- This script inserts demo data into the database, after removing (truncating)
-- the data of all references tables. It was ported from the provided SQLite
-- database to a SQL script that should (hopefully) run on all SQL-based RDBMS,
-- but has been tested with PostgreSQL only.
--
-- The original SQLite database contained some inconsistency that were ignored
-- on SQLite database (since it's not relational), but is a problem when using
-- relational database systems. These inconsistent inserts have been left in
-- this script, but are commented out.
--
-- Before running this script, you need
-- *) a database, that you can connect with
-- *) a valid table structure by running the Wound Management Software for the
--     first time
--
-- Example import command:
--   psql --host=localhost --username=USERNAME DATABASE --file=THISFILE.sql
--
-- Verify the import:
-- After a lot of "INSERT 0 1" outputs you should see something similar to:
--           Import Finished       
--    -----------------------------
--     Data successfully imported.
--    (1 row)
--    
--    COMMIT


-- Truncate script below

BEGIN TRANSACTION;

TRUNCATE TABLE bewwbz07 CASCADE;
TRUNCATE TABLE bewwbs07 CASCADE;
TRUNCATE TABLE bewdkl07 CASCADE;
TRUNCATE TABLE bewope07 CASCADE;
TRUNCATE TABLE kendek07 CASCADE;
TRUNCATE TABLE kenwbs07 CASCADE;
TRUNCATE TABLE kenwun07 CASCADE;
TRUNCATE TABLE mitape07 CASCADE;
TRUNCATE TABLE stationen07 CASCADE;

COMMIT;

-- Truncate script end

-- Insert data script below

BEGIN TRANSACTION;

\set DEFAULTARBEITSSTATION 10

INSERT INTO "stationen07" ("nr", "kenmdt07_nr", "bezeich", "haus_nr") VALUES(10,1,'Wohnbereich Neustift',3);
INSERT INTO "stationen07" ("nr", "kenmdt07_nr", "bezeich", "haus_nr") VALUES(9,1,'Wohnbereich Schwaz',3);
INSERT INTO "stationen07" ("nr", "kenmdt07_nr", "bezeich", "haus_nr") VALUES(15,1,'Wohnbereich Thaur',6);
INSERT INTO "stationen07" ("nr", "kenmdt07_nr", "bezeich", "haus_nr") VALUES(8,1,'Wohnbereich Rum',3);
INSERT INTO "stationen07" ("nr", "kenmdt07_nr", "bezeich", "haus_nr") VALUES(16,1,'Wohnbereich Wörgl',6);
INSERT INTO "stationen07" ("nr", "kenmdt07_nr", "bezeich", "haus_nr") VALUES(5,1,'Wohnbereich Lienz',1);
INSERT INTO "stationen07" ("nr", "kenmdt07_nr", "bezeich", "haus_nr") VALUES(4,1,'Wohnbereich Kitzbühel',1);
INSERT INTO "stationen07" ("nr", "kenmdt07_nr", "bezeich", "haus_nr") VALUES(3,1,'Wohnbereich Stams',1);
INSERT INTO "stationen07" ("nr", "kenmdt07_nr", "bezeich", "haus_nr") VALUES(2,1,'Wohnbereich Kufstein',1);
INSERT INTO "stationen07" ("nr", "kenmdt07_nr", "bezeich", "haus_nr") VALUES(13,1,'Wohnbereich Hall',4);
INSERT INTO "stationen07" ("nr", "kenmdt07_nr", "bezeich", "haus_nr") VALUES(17,1,'Wohnbereich Landeck',7);
INSERT INTO "stationen07" ("nr", "kenmdt07_nr", "bezeich", "haus_nr") VALUES(6,1,'Wohnbereich Umhausen',1);
INSERT INTO "stationen07" ("nr", "kenmdt07_nr", "bezeich", "haus_nr") VALUES(1,1,'Wohnbereich Zirl',1);
INSERT INTO "stationen07" ("nr", "kenmdt07_nr", "bezeich", "haus_nr") VALUES(7,1,'Wohnbereich Telfs',2);
INSERT INTO "stationen07" ("nr", "kenmdt07_nr", "bezeich", "haus_nr") VALUES(11,1,'Wohnbereich St. Johann',4);
INSERT INTO "stationen07" ("nr", "kenmdt07_nr", "bezeich", "haus_nr") VALUES(14,1,'Wohnbereich Imst',5);
INSERT INTO "stationen07" ("nr", "kenmdt07_nr", "bezeich", "haus_nr") VALUES(12,1,'Wohnbereich Wattens',4);

INSERT INTO "mitape07" ("nr", "kenmdt07_nr", "suchbez", "name", "vorname", "kuerzl", "qualnr", "pdacode", "glkontr", "sammquit_m", "geschlecht", "arbeitsstation") VALUES(22,1,'Zaren; Mila','Zaaren','Mila','DBL',NULL,'','n','n','weiblich', :DEFAULTARBEITSSTATION);
INSERT INTO "mitape07" ("nr", "kenmdt07_nr", "suchbez", "name", "vorname", "kuerzl", "qualnr", "pdacode", "glkontr", "sammquit_m", "geschlecht", "arbeitsstation") VALUES(23,1,'Henschel; Jutta','Henschel','Jutta','DBRA',NULL,'','n','n','weiblich', :DEFAULTARBEITSSTATION);
INSERT INTO "mitape07" ("nr", "kenmdt07_nr", "suchbez", "name", "vorname", "kuerzl", "qualnr", "pdacode", "glkontr", "sammquit_m", "geschlecht", "arbeitsstation") VALUES(21,1,'Toosen; Hans','Toosen','Hans','Dug',NULL,'','n','n','männlich', :DEFAULTARBEITSSTATION);
INSERT INTO "mitape07" ("nr", "kenmdt07_nr", "suchbez", "name", "vorname", "kuerzl", "qualnr", "pdacode", "glkontr", "sammquit_m", "geschlecht", "arbeitsstation") VALUES(20,1,'Hoolwitz; Kai','Hoolwitz','Kai','Dunke',NULL,'','n','n','männlich', :DEFAULTARBEITSSTATION);
INSERT INTO "mitape07" ("nr", "kenmdt07_nr", "suchbez", "name", "vorname", "kuerzl", "qualnr", "pdacode", "glkontr", "sammquit_m", "geschlecht", "arbeitsstation") VALUES(18,1,'Paulus; Christa','Paulus','Christa','HG',NULL,'','n','n','weiblich', :DEFAULTARBEITSSTATION);
INSERT INTO "mitape07" ("nr", "kenmdt07_nr", "suchbez", "name", "vorname", "kuerzl", "qualnr", "pdacode", "glkontr", "sammquit_m", "geschlecht", "arbeitsstation") VALUES(16,1,'Ottermann; Werner','Ottermann','Werner','Hb',NULL,'','n','n','männlich', :DEFAULTARBEITSSTATION);
INSERT INTO "mitape07" ("nr", "kenmdt07_nr", "suchbez", "name", "vorname", "kuerzl", "qualnr", "pdacode", "glkontr", "sammquit_m", "geschlecht", "arbeitsstation") VALUES(14,1,'Weng; Lisa','Weng','Lisa','Hellb',NULL,'','n','n','weiblich', :DEFAULTARBEITSSTATION);
INSERT INTO "mitape07" ("nr", "kenmdt07_nr", "suchbez", "name", "vorname", "kuerzl", "qualnr", "pdacode", "glkontr", "sammquit_m", "geschlecht", "arbeitsstation") VALUES(17,1,'Wiese; Klaus','Wiese','Klaus','Hellr',NULL,'','n','n','männlich', :DEFAULTARBEITSSTATION);
INSERT INTO "mitape07" ("nr", "kenmdt07_nr", "suchbez", "name", "vorname", "kuerzl", "qualnr", "pdacode", "glkontr", "sammquit_m", "geschlecht", "arbeitsstation") VALUES(19,1,'Kloos; Elisa','Kloos','Elisa','Hgr',NULL,'','n','n','weiblich', :DEFAULTARBEITSSTATION);
INSERT INTO "mitape07" ("nr", "kenmdt07_nr", "suchbez", "name", "vorname", "kuerzl", "qualnr", "pdacode", "glkontr", "sammquit_m", "geschlecht", "arbeitsstation") VALUES(24,1,'Abelt; Karin','Abelt','Karin','Pink',NULL,'','n','n','weiblich', :DEFAULTARBEITSSTATION);
INSERT INTO "mitape07" ("nr", "kenmdt07_nr", "suchbez", "name", "vorname", "kuerzl", "qualnr", "pdacode", "glkontr", "sammquit_m", "geschlecht", "arbeitsstation") VALUES(2,1,'Grün; Joana','Grün','Joana','John',2,NULL,'n','n','weiblich', :DEFAULTARBEITSSTATION);
INSERT INTO "mitape07" ("nr", "kenmdt07_nr", "suchbez", "name", "vorname", "kuerzl", "qualnr", "pdacode", "glkontr", "sammquit_m", "geschlecht", "arbeitsstation") VALUES(3,1,'Rot; Andreas','Rot','Andreas','Treff',2,'rot','n','n','männlich', :DEFAULTARBEITSSTATION);
INSERT INTO "mitape07" ("nr", "kenmdt07_nr", "suchbez", "name", "vorname", "kuerzl", "qualnr", "pdacode", "glkontr", "sammquit_m", "geschlecht", "arbeitsstation") VALUES(4,1,'Schwarz; Thomas','Schwarz','Thomas','Nau',2,'schw','n','n','männlich', :DEFAULTARBEITSSTATION);
INSERT INTO "mitape07" ("nr", "kenmdt07_nr", "suchbez", "name", "vorname", "kuerzl", "qualnr", "pdacode", "glkontr", "sammquit_m", "geschlecht", "arbeitsstation") VALUES(5,1,'Braun; Achim','Braun','Achim','Holl',NULL,'brau','n','n','männlich', :DEFAULTARBEITSSTATION);
INSERT INTO "mitape07" ("nr", "kenmdt07_nr", "suchbez", "name", "vorname", "kuerzl", "qualnr", "pdacode", "glkontr", "sammquit_m", "geschlecht", "arbeitsstation") VALUES(6,1,'Hantzsch; Alexander','Hantzsch','Alexander','AHA',3,1234,'n','n','männlich', :DEFAULTARBEITSSTATION);
INSERT INTO "mitape07" ("nr", "kenmdt07_nr", "suchbez", "name", "vorname", "kuerzl", "qualnr", "pdacode", "glkontr", "sammquit_m", "geschlecht", "arbeitsstation") VALUES(7,1,'Schöpp; Christina','Schöpp','Christina','CSC',2,1234,'n','n','weiblich', :DEFAULTARBEITSSTATION);
INSERT INTO "mitape07" ("nr", "kenmdt07_nr", "suchbez", "name", "vorname", "kuerzl", "qualnr", "pdacode", "glkontr", "sammquit_m", "geschlecht", "arbeitsstation") VALUES(8,1,'Blau; Anne','Blau','Anne','Blau',3,'blau','n','n','weiblich', :DEFAULTARBEITSSTATION);
INSERT INTO "mitape07" ("nr", "kenmdt07_nr", "suchbez", "name", "vorname", "kuerzl", "qualnr", "pdacode", "glkontr", "sammquit_m", "geschlecht", "arbeitsstation") VALUES(9,1,'Rosa; Heino','Rosa','Heino','Rosa',1,'rosa','n','n','männlich', :DEFAULTARBEITSSTATION);
INSERT INTO "mitape07" ("nr", "kenmdt07_nr", "suchbez", "name", "vorname", "kuerzl", "qualnr", "pdacode", "glkontr", "sammquit_m", "geschlecht", "arbeitsstation") VALUES(10,1,'Orange; Erika','Orange','Erika','Orang',1,'oran','n','n','weiblich', :DEFAULTARBEITSSTATION);
INSERT INTO "mitape07" ("nr", "kenmdt07_nr", "suchbez", "name", "vorname", "kuerzl", "qualnr", "pdacode", "glkontr", "sammquit_m", "geschlecht", "arbeitsstation") VALUES(11,1,'Fethke; Hanne','Fethke','Hanne','Beige',1,'beig','j','n','weiblich', :DEFAULTARBEITSSTATION);
INSERT INTO "mitape07" ("nr", "kenmdt07_nr", "suchbez", "name", "vorname", "kuerzl", "qualnr", "pdacode", "glkontr", "sammquit_m", "geschlecht", "arbeitsstation") VALUES(12,1,'Grau; Carolin','Grau','Carolin','Grau',1,'grau','n','n','weiblich', :DEFAULTARBEITSSTATION);
INSERT INTO "mitape07" ("nr", "kenmdt07_nr", "suchbez", "name", "vorname", "kuerzl", "qualnr", "pdacode", "glkontr", "sammquit_m", "geschlecht", "arbeitsstation") VALUES(13,1,'Krebs; Andreas','Krebs','Andreas','Heino',1,'frie','n','n','männlich', :DEFAULTARBEITSSTATION);
INSERT INTO "mitape07" ("nr", "kenmdt07_nr", "suchbez", "name", "vorname", "kuerzl", "qualnr", "pdacode", "glkontr", "sammquit_m", "geschlecht", "arbeitsstation") VALUES(25,1,'Tulpe; Heiner','Tulpe','Heiner','Löwe',1,'','n','n','männlich', :DEFAULTARBEITSSTATION);
INSERT INTO "mitape07" ("nr", "kenmdt07_nr", "suchbez", "name", "vorname", "kuerzl", "qualnr", "pdacode", "glkontr", "sammquit_m", "geschlecht", "arbeitsstation") VALUES(26,1,'Nau Thomas','Nau','Thomas','Na',NULL,'','n','n','männlich', :DEFAULTARBEITSSTATION);
INSERT INTO "mitape07" ("nr", "kenmdt07_nr", "suchbez", "name", "vorname", "kuerzl", "qualnr", "pdacode", "glkontr", "sammquit_m", "geschlecht", "arbeitsstation") VALUES(27,1,'Schraml; Brigitte','Schraml','Brigitte','Schra',8,'','n','n','weiblich', :DEFAULTARBEITSSTATION);
INSERT INTO "mitape07" ("nr", "kenmdt07_nr", "suchbez", "name", "vorname", "kuerzl", "qualnr", "pdacode", "glkontr", "sammquit_m", "geschlecht", "arbeitsstation") VALUES(28,1,'Zuckriegel; Elke','Zuckriegel','Elke','Zuckr',8,'','n','n','weiblich', :DEFAULTARBEITSSTATION);
INSERT INTO "mitape07" ("nr", "kenmdt07_nr", "suchbez", "name", "vorname", "kuerzl", "qualnr", "pdacode", "glkontr", "sammquit_m", "geschlecht", "arbeitsstation") VALUES(29,1,'Fischer; Christine','Fischer','Christine','Fisch',NULL,'','n','n','weiblich', :DEFAULTARBEITSSTATION);
INSERT INTO "mitape07" ("nr", "kenmdt07_nr", "suchbez", "name", "vorname", "kuerzl", "qualnr", "pdacode", "glkontr", "sammquit_m", "geschlecht", "arbeitsstation") VALUES(30,1,'Doll; Holger','Doll','Holger','Doll',NULL,'','n','n','männlich', :DEFAULTARBEITSSTATION);
INSERT INTO "mitape07" ("nr", "kenmdt07_nr", "suchbez", "name", "vorname", "kuerzl", "qualnr", "pdacode", "glkontr", "sammquit_m", "geschlecht", "arbeitsstation") VALUES(31,1,'Bajor; Agnes','Bajor','Agnes','Bajor',8,'','n','n','weiblich', :DEFAULTARBEITSSTATION);
INSERT INTO "mitape07" ("nr", "kenmdt07_nr", "suchbez", "name", "vorname", "kuerzl", "qualnr", "pdacode", "glkontr", "sammquit_m", "geschlecht", "arbeitsstation") VALUES(32,1,'Rau; Verena','Rau','Verena','Rau',NULL,'','n','n','weiblich', :DEFAULTARBEITSSTATION);
INSERT INTO "mitape07" ("nr", "kenmdt07_nr", "suchbez", "name", "vorname", "kuerzl", "qualnr", "pdacode", "glkontr", "sammquit_m", "geschlecht", "arbeitsstation") VALUES(33,1,'Sillman; Rosemarie','Sillman','Rosemarie','Sillm',NULL,'','n','n','weiblich', :DEFAULTARBEITSSTATION);
INSERT INTO "mitape07" ("nr", "kenmdt07_nr", "suchbez", "name", "vorname", "kuerzl", "qualnr", "pdacode", "glkontr", "sammquit_m", "geschlecht", "arbeitsstation") VALUES(34,1,'Heror; Agnes','Heror','Agnes','Heror',8,'','n','n','weiblich', :DEFAULTARBEITSSTATION);
INSERT INTO "mitape07" ("nr", "kenmdt07_nr", "suchbez", "name", "vorname", "kuerzl", "qualnr", "pdacode", "glkontr", "sammquit_m", "geschlecht", "arbeitsstation") VALUES(35,1,'Nelke; Heike','Nelke','Heike','Nelke',11,'','n','n','weiblich', :DEFAULTARBEITSSTATION);
INSERT INTO "mitape07" ("nr", "kenmdt07_nr", "suchbez", "name", "vorname", "kuerzl", "qualnr", "pdacode", "glkontr", "sammquit_m", "geschlecht", "arbeitsstation") VALUES(36,1,'Rose; Christian','Rose','Christian','Rose',2,'','n','n','männlich', :DEFAULTARBEITSSTATION);
INSERT INTO "mitape07" ("nr", "kenmdt07_nr", "suchbez", "name", "vorname", "kuerzl", "qualnr", "pdacode", "glkontr", "sammquit_m", "geschlecht", "arbeitsstation") VALUES(37,1,'Lierenfeld; Hans-Heinrich','Lierenfeld','Hans-Heinrich','Lilie',15,'','n','n','männlich', :DEFAULTARBEITSSTATION);
INSERT INTO "mitape07" ("nr", "kenmdt07_nr", "suchbez", "name", "vorname", "kuerzl", "qualnr", "pdacode", "glkontr", "sammquit_m", "geschlecht", "arbeitsstation") VALUES(38,1,'Anemone; Rita','Anemone','Rita','Anemo',18,'','n','n','weiblich', :DEFAULTARBEITSSTATION);
INSERT INTO "mitape07" ("nr", "kenmdt07_nr", "suchbez", "name", "vorname", "kuerzl", "qualnr", "pdacode", "glkontr", "sammquit_m", "geschlecht", "arbeitsstation") VALUES(39,1,'Veilchen; Christa','Veilchen','Christa','Veilc',18,'','n','n','weiblich', :DEFAULTARBEITSSTATION);
INSERT INTO "mitape07" ("nr", "kenmdt07_nr", "suchbez", "name", "vorname", "kuerzl", "qualnr", "pdacode", "glkontr", "sammquit_m", "geschlecht", "arbeitsstation") VALUES(40,1,'Krokus; Elvira','Krokus','Elvira','Kroku',1,'','n','n','weiblich', :DEFAULTARBEITSSTATION);

INSERT INTO "kenwun07" ("nr", "kenmdt07_nr", "bezeich", "typ", "groessepfl", "gradstatus", "koerperstellepfl") VALUES(13,1,'Senso6 Dekubitus','D','j','P','j');
INSERT INTO "kenwun07" ("nr", "kenmdt07_nr", "bezeich", "typ", "groessepfl", "gradstatus", "koerperstellepfl") VALUES(14,1,'diabetisches Fußsydrom','S','j','E','j');
INSERT INTO "kenwun07" ("nr", "kenmdt07_nr", "bezeich", "typ", "groessepfl", "gradstatus", "koerperstellepfl") VALUES(15,1,'Ulcus cruris venosum','S','j','E','j');
INSERT INTO "kenwun07" ("nr", "kenmdt07_nr", "bezeich", "typ", "groessepfl", "gradstatus", "koerperstellepfl") VALUES(16,1,'Ulcus cruris arteriosum','S','j','E','j');
INSERT INTO "kenwun07" ("nr", "kenmdt07_nr", "bezeich", "typ", "groessepfl", "gradstatus", "koerperstellepfl") VALUES(17,1,'Ulcus cruris mixtum','S','j','E','j');
INSERT INTO "kenwun07" ("nr", "kenmdt07_nr", "bezeich", "typ", "groessepfl", "gradstatus", "koerperstellepfl") VALUES(18,1,'Dekubitus','D','j','P','j');
INSERT INTO "kenwun07" ("nr", "kenmdt07_nr", "bezeich", "typ", "groessepfl", "gradstatus", "koerperstellepfl") VALUES(19,1,'Ulcus cruris','S','j','E','j');

INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(1,1,'TYP','offen',NULL,'n',1);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(2,1,'TYP','geschlossen',NULL,'n',2);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(3,1,'TYP','nekrotisch',NULL,'n',3);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(4,1,'BEL','gelblich',NULL,'n',1);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(5,1,'BEL','bräunlich',NULL,'n',2);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(6,1,'BEL','grau-gelb, weich',NULL,'n',3);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(7,1,'BEL','schwarz, hart',NULL,'n',4);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(8,1,'URS','Diabetes mellitus',NULL,'n',1);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(9,1,'URS','Arterielle Verschlusskrankheit',NULL,'n',2);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(10,1,'URS','Chronisch venöse Insuffizienz',NULL,'n',3);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(11,1,'URS','Polyneuropathie',NULL,'n',4);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(12,1,'URS','Immobilität',NULL,'n',5);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(13,1,'URS','Infektion',NULL,'n',6);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(14,1,'URS','Immunsuppression',NULL,'n',7);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(15,1,'URS','Albuminmangel',NULL,'n',8);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(16,1,'URS','Sonstige',NULL,'n',9);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(17,1,'URS','Sturz',NULL,'n',10);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(18,1,'URS','Operation',NULL,'n',11);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(19,1,'URS','Verletzung',NULL,'n',12);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(20,1,'URS','Fremdeinwirkung',NULL,'n',13);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(21,1,'SME','keine Angaben',NULL,'n',1);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(22,1,'SME','keine Schmerzen',NULL,'n',2);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(23,1,'SME','manchmal',NULL,'n',3);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(24,1,'SME','Verbandswechsel',NULL,'n',4);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(25,1,'SME','immer',NULL,'n',5);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(26,1,'WSM','viel',NULL,'n',1);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(27,1,'WSM','mäßig',NULL,'n',2);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(28,1,'WSM','wenig',NULL,'n',3);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(29,1,'WSM','keine',NULL,'n',4);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(30,1,'WSF','grünlich',NULL,'n',1);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(31,1,'WSF','gelblich',NULL,'n',2);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(32,1,'WSF','bräunlich',NULL,'n',3);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(33,1,'WSF','transparent',NULL,'n',4);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(34,1,'WSG','süßlich',NULL,'n',1);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(35,1,'WSG','säuerlich',NULL,'n',2);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(36,1,'WSG','faulig',NULL,'n',3);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(37,1,'WSG','kein',NULL,'n',4);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(38,1,'SEG','trocken',NULL,'n',1);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(39,1,'SEG','nässend',NULL,'n',2);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(40,1,'SEG','blutend',NULL,'n',3);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(41,1,'SEG','eitrig',NULL,'n',4);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(42,1,'WRA','zerklüftet',NULL,'n',1);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(43,1,'WRA','erhaben',NULL,'n',2);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(44,1,'WRA','gerötet',NULL,'n',3);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(45,1,'WUM','Intakt',NULL,'n',1);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(46,1,'WUM','Gerötet',NULL,'n',2);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(47,1,'WUM','Mazeriert',NULL,'n',3);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(48,1,'WUM','Infiziert',NULL,'n',4);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(49,1,'WUM','Allergie',NULL,'n',5);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(50,1,'WUM','Ekzem',NULL,'n',6);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(51,1,'INF','Überwärmung',NULL,'n',1);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(52,1,'INF','Schmerz',NULL,'n',2);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(53,1,'INF','Eiter',NULL,'n',3);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(54,1,'INF','Rötung',NULL,'n',4);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(55,1,'INF','Ödeme',NULL,'n',5);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(56,1,'INF','Fieber',NULL,'n',6);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(57,1,'WHP','Entzündung',NULL,'n',1);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(58,1,'WHP','Epithelisierung',NULL,'n',2);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(59,1,'HEI','vorhanden',58,'n',1);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(60,1,'HEI','beginnend',58,'n',2);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(61,1,'HEI','voll',58,'n',3);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(62,1,'WHP','Granulation',NULL,'n',3);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(63,1,'HEI','Zyanose',62,'n',1);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(64,1,'HEI','blass',62,'n',2);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(65,1,'HEI','rot',62,'n',3);
INSERT INTO "kenwbs07" ("nr", "kenmdt07_nr", "typ", "bezeich", "kenwbs07_nr", "mitfreitext", "position") VALUES(66,1,'WHP','unbekannt',NULL,'j',4);

INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(76,1,'4A - Nekrose von Fußteilen (Wagner/Armstrong)',0,14,'Begrenzte Vorfuß- oder Fersennekrose','4A',18);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(77,1,'4B - Nekrose von Fußteilen mit Infektion (Wagner/Armstrong)',0,14,'Begrenzte Vorfuß- oder Fersennekrose','4B',19);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(78,1,'4C - Nekrose von Fußteilen mit Ischämie (Wagner/Armstrong)',0,14,'Begrenzte Vorfuß- oder Fersennekrose','4C',20);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(79,1,'4D - Nekrose von Fußteilen mit Infektion und Ischämie (Wagner/Armstrong)',0,14,'Begrenzte Vorfuß- oder Fersennekrose','4D',21);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(90,1,'Stadium IIb (Fontaine) ',2,16,'Claudicatio intermittens mit freien Gehstrecke < 200m','IIb',3);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(99,1,'Stadium IIb (Fontaine) ',2,17,'Claudicatio intermittens mit freien Gehstrecke < 200m','IIb',3);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(89,1,'Stadium IIa (Fontaine) ',2,16,'Claudicatio intermittens mit freien Gehstrecke > 200m','IIa',2);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(98,1,'Stadium IIa (Fontaine) ',2,17,'Claudicatio intermittens mit freien Gehstrecke > 200m','IIa',2);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(59,1,'0 - keine Läsion, evtl. Fußdeformation, Cellulitis (Wagner/Armstrong)',0,14,'Füße von Diabetikern die eine Fehlstellung oder Hyperkeratosen haben, die eine sensorische Neuropathie oder einen Ulkus hatten.',0,1);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(84,1,'Grad 1 - Corona phlebectatica paraplanaris (Widmer/mod. Marshall)',1,15,'Lokale Gefäßerweiterungen (Besenreiser) in der Knöchelregion und oberhalb des Fußgewölbes. Typisch auftretende Knöchelödeme',1,1);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(93,1,'Grad 1 - Corona phlebectatica paraplanaris (Widmer/mod. Marshall)',1,17,'Lokale Gefäßerweiterungen (Besenreiser) in der Knöchelregion und oberhalb des Fußgewölbes. Typisch auftretende Knöchelödeme',1,1);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(80,1,'5A - Nekrose des gesamten Fußes (Wagner/Armstrong)',0,14,'Nekrose des gesamten Fußes','5A',22);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(81,1,'5B - Nekrose des gesamten Fußes mit Infektion (Wagner/Armstrong)',0,14,'Nekrose des gesamten Fußes','5B',23);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(82,1,'5C - Nekrose des gesamten Fußes mit Ischämie (Wagner/Armstrong)',0,14,'Nekrose des gesamten Fußes','5C',24);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(83,1,'5D - Nekrose des gesamten Fußes mit Infektion und Ischämie (Wagner/Armstrong)',0,14,'Nekrose des gesamten Fußes','5D',25);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(55,1,'Grad I - Nicht wegdrückbare Rötung (EPUAP)',1,13,'Nicht wegdrückbare Rötung bei intakter Haut, gewöhnlich über einem knöchernen Vorsprung. Bei dunkel pigmentierter Haut ist ein Verblassen möglicherweise nicht sichtbar, die Farbe kann sich aber von der umgebenden Haut unterscheiden. Der Bereich kann schmerzempfindlich, verhärtet, weich, wärmer oder kälter sein als das umgebende Gewebe.','I',1);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(102,1,'Grad I - Nicht wegdrückbare Rötung (EPUAP)',1,18,'Nicht wegdrückbare Rötung bei intakter Haut, gewöhnlich über einem knöchernen Vorsprung. Bei dunkel pigmentierter Haut ist ein Verblassen möglicherweise nicht sichtbar, die Farbe kann sich aber von der umgebenden Haut unterscheiden. Der Bereich kann schmerzempfindlich, verhärtet, weich, wärmer oder kälter sein als das umgebende Gewebe.','I',1);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(64,1,'1A - Oberflächliche Wunde (Wagner/Armstrong)',0,14,'Oberflächliches Ulkus','1A',6);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(65,1,'1B - Oberflächliche Wunde mit Infektion (Wagner/Armstrong)',0,14,'Oberflächliches Ulkus','1B',7);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(66,1,'1C - Oberflächliche Wunde mit Ischämie (Wagner/Armstrong)',0,14,'Oberflächliches Ulkus','1C',8);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(67,1,'1D - Oberflächliche Wunde mit Infektion und Ischämie (Wagner/Armstrong)',0,14,'Oberflächliches Ulkus','1D',9);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(106,1,'Stadium I (Hach 1994)',1,19,'Schwellungsneigung ohne Gewebssklerose','I',1);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(56,1,'Grad II - Teilverlust der Haut (EPUAP)',2,13,'Teilzerstörung der Haut (bis zur Dermis), die als Flaches, offenes Ulcus mit einem rot bis rosafarbenen Wundbett ohne Beläge in Erscheinung tritt. Kann sich auch als intakte oder offene serumgefüllte Blase darstellen. Manifestiert sich als glänzendes oder trockenes, flaches Ulcus ohne nekrotisches Gewebe oder Bluterguss.','II',2);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(103,1,'Grad II - Teilverlust der Haut (EPUAP)',2,18,'Teilzerstörung der Haut (bis zur Dermis), die als Flaches, offenes Ulcus mit einem rot bis rosafarbenen Wundbett ohne Beläge in Erscheinung tritt. Kann sich auch als intakte oder offene serumgefüllte Blase darstellen. Manifestiert sich als glänzendes oder trockenes, flaches Ulcus ohne nekrotisches Gewebe oder Bluterguss.','II',2);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(68,1,'2A - Wunde bis zur Ebene von Sehne oder Kapsel (Wagner/Armstrong)',0,14,'Tiefes Ulkus bis zur Gelenkkapsel','2A',10);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(69,1,'2B - Wunde bis zur Ebene von Sehne oder Kapsel mit Infektion (Wagner/Armstrong)',0,14,'Tiefes Ulkus bis zur Gelenkkapsel','2B',11);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(70,1,'2C - Wunde bis zur Ebene von Sehne oder Kapsel mit Ischämie (Wagner/Armstrong)',0,14,'Tiefes Ulkus bis zur Gelenkkapsel','2C',12);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(71,1,'2D - Wunde bis zur Ebene von Sehne oder Kapsel mit Infektion und Ischämie (Wagner/Armstrong)',0,14,'Tiefes Ulkus bis zur Gelenkkapsel','2D',13);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(72,1,'3A - Wunde bis zur Ebene von Knochen oder Gelenk (Wagner/Armstrong)',0,14,'Tiefes Ulkus mit Abszendierung, Osteomyelitis, Infektion der Gelenkkapsel','3A',14);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(73,1,'3B - Wunde bis zur Ebene von Knochen oder Gelenk mit Infektion (Wagner/Armstrong)',0,14,'Tiefes Ulkus mit Abszendierung, Osteomyelitis, Infektion der Gelenkkapsel','3B',15);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(74,1,'3C - Wunde bis zur Ebene von Knochen oder Gelenk mit Ischämie (Wagner/Armstrong)',0,14,'Tiefes Ulkus mit Abszendierung, Osteomyelitis, Infektion der Gelenkkapsel','3C',16);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(75,1,'3D - Wunde bis zur Ebene von Knochen oder Gelenk mit Infektion und Ischämie (Wagner/Armstrong)',0,14,'Tiefes Ulkus mit Abszendierung, Osteomyelitis, Infektion der Gelenkkapsel','3D',17);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(58,1,'Grad IV - vollständiger Haut oder Gewebeverlust (EPUAP)',4,13,'Totaler Gewebsverlust mit freiliegenden Knochen, Sehnen oder Muskeln. Belag und Schorf können vorliegen. Tunnel oder Unterminierungen liegen oft vor. Wunden können sich in Muskeln oder unterstützende Strukturen ausbreiten und können Osteomyelitis oder Ostitis verursachen. Knochen und Sehnen sind sichtbar oder tastbar.','IV',4);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(105,1,'Grad IV - vollständiger Haut oder Gewebeverlust (EPUAP)',4,18,'Totaler Gewebsverlust mit freiliegenden Knochen, Sehnen oder Muskeln. Belag und Schorf können vorliegen. Tunnel oder Unterminierungen liegen oft vor. Wunden können sich in Muskeln oder unterstützende Strukturen ausbreiten und können Osteomyelitis oder Ostitis verursachen. Knochen und Sehnen sind sichtbar oder tastbar.','IV',4);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(92,1,'Stadium IV (Fontaine) ',4,16,'Ulkus, Gangrän','IV',5);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(101,1,'Stadium IV (Fontaine) ',4,17,'Ulkus, Gangrän','IV',5);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(85,1,'Grad 2 - Pigmentverschiebungen, Ekzem (Widmer/mod. Marshall)',2,15,'Unterschenkelödem, Hyperpigmentierung der Haut, Dermatoliposklerose, Atrophie blanche, Pigmentverschiebungen: Dermite ocre, Ekzem: stasis dermatitis',2,2);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(94,1,'Grad 2 - Pigmentverschiebungen, Ekzem (Widmer/mod. Marshall)',2,17,'Unterschenkelödem, Hyperpigmentierung der Haut, Dermatoliposklerose, Atrophie blanche, Pigmentverschiebungen: Dermite ocre, Ekzem: stasis dermatitis',2,2);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(57,1,'Grad III - Verlust der Haut (EPUAP)',3,13,'Zerstörung aller Hautschichten. Subcutanes Fett kann sichtbar sein, jedoch keine Knochen, Muskeln oder Sehnen. Es kann ein Belag vorliegen, der jedoch nicht die Tiefe dar Gewebsschädigung verschleiert. Es können Tunnel oder Unterminierungen vorliegen. Knochen und Sehnen sind nicht sichtbar oder tastbar.','III',3);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(104,1,'Grad III - Verlust der Haut (EPUAP)',3,18,'Zerstörung aller Hautschichten. Subcutanes Fett kann sichtbar sein, jedoch keine Knochen, Muskeln oder Sehnen. Es kann ein Belag vorliegen, der jedoch nicht die Tiefe dar Gewebsschädigung verschleiert. Es können Tunnel oder Unterminierungen vorliegen. Knochen und Sehnen sind nicht sichtbar oder tastbar.','III',3);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(86,1,'Grad 3a - Ulkusnarbe (Widmer/mod. Marshall)',3,15,'abgeheiltes Ulcus cruris venosum','3a',3);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(95,1,'Grad 3a - Ulkusnarbe (Widmer/mod. Marshall)',3,17,'abgeheiltes Ulcus cruris venosum','3a',3);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(88,1,'Stadium I (Fontaine) ',1,16,'asymptomatisch','I',1);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(97,1,'Stadium I (Fontaine) ',1,17,'asymptomatisch','I',1);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(87,1,'Grad 3b - Unterschenkelgeschwür (Widmer/mod. Marshall)',3,15,'florides Ulcus cruris venosum','3b',4);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(96,1,'Grad 3b - Unterschenkelgeschwür (Widmer/mod. Marshall)',3,17,'florides Ulcus cruris venosum','3b',4);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(91,1,'Stadium III (Fontaine) ',3,16,'ischämischer Ruheschmerz','III',4);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(100,1,'Stadium III (Fontaine) ',3,17,'ischämischer Ruheschmerz','III',4);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(107,1,'Stadium II (Hach 1994)',2,19,'mit Verhärtungen der Haut und des Subkutangewebes (Dermatoliposklerose)','II',2);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(108,1,'Stadium III (Hach 1994)',3,19,'sklerotische Gewebsveränderungen der Haut, des Subkutangewebes und umschriebener Areale der Faszie (Dermatolipofasziosklerosis regionalis)','III',3);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(109,1,'Stadium IV (Hach 1994)',4,19,'sklerotische Veränderungen der Haut, des Subkutangewebes und der Faszie zirkulär am Unterschenkel mit ausgedehnten, manchmal zirkulären Ulzerationen','IV',4);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(60,1,'0A - Prä- oder postulcerative Läsion (Wagner/Armstrong)',0,14,'','0A',2);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(61,1,'0B - Prä- oder postulcerative Läsion mit Infektion (Wagner/Armstrong)',0,14,'','0B',3);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(62,1,'0C - Prä- oder postulcerative Läsion mit Ischämie (Wagner/Armstrong)',0,14,'','0C',4);
INSERT INTO "kendek07" ("nr", "kenmdt07_nr", "bezeich", "grad", "kenwun07_nr", "beschreib", "kuerzl", "pos") VALUES(63,1,'0D - Prä- oder postulcerative Läsion mit Infektion und Ischämie (Wagner/Armstrong)',0,14,'','0D',5);

INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(405,1,'Räumung','Helmut','männlich',NULL,NULL,'1925-01-03 00:00:00.0','A507',15,'Räumung; Helmut','2005-01-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(587,1,'Pfeifer','Elfriede','weiblich',NULL,NULL,'1925-04-11 00:00:00.0','N004',8,'Pfeifer; Elfriede','2000-11-16 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(568,1,'Reinhardt','Erwin','männlich','Herr',NULL,'1925-08-22 00:00:00.0','N037',3,'Reinhardt; Erwin','2001-10-15 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(585,1,'Dörfle','Lotte','weiblich','Frau',NULL,'1926-10-12 00:00:00.0','N013',2,'Dörfle; Lotte','2000-11-08 00:00:00.0','k');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(565,1,'Untermann','Maria','weiblich',NULL,NULL,'1927-02-15 00:00:00.0','N206',6,'Untermann; Maria','2000-05-15 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(454,1,'Wespe','Kurt','männlich',NULL,NULL,'1927-12-23 00:00:00.0','HPF',17,'Wespe; Kurt','2009-01-01 00:00:00.0','w');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(566,1,'Sauter','Elfriede','weiblich','Frau',NULL,'1928-01-05 00:00:00.0','N104',4,'Sauter; Elfriede','2000-05-26 00:00:00.0','');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(564,1,'Pflege','Otto','männlich',NULL,NULL,'1928-05-09 00:00:00.0','K1',15,'Pflege; Otto','2005-01-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(544,1,'Bauer','Artur','männlich',NULL,NULL,'1928-07-13 00:00:00.0','M6',10,'Bauer; Artur','2002-01-01 00:00:00.0','w');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(574,1,'Brändle','Elisabeth','weiblich','Frau',NULL,'1928-09-24 00:00:00.0','N137',5,'Brändle; Elisabeth','2001-06-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(328,1,'Engel','Manfred','männlich','Herr',NULL,'1928-12-07 00:00:00.0','N103',4,'Engel; Manfred','1994-09-29 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(557,1,'Glass','Anna','weiblich','Frau',NULL,'1929-09-28 00:00:00.0','N038',3,'Glass; Anna','2000-03-13 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(396,1,'Vesto','Jan','männlich',NULL,NULL,'1931-05-24 00:00:00.0','A409',15,'Vesto; Jan','2005-01-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(352,1,'Katze','Elisabeth','weiblich',NULL,NULL,'1932-02-11 00:00:00.0','HPF',17,'Katze; Elisabeth','2009-01-01 00:00:00.0','w');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(526,1,'Streicher','Jakob','männlich',NULL,NULL,'1934-05-18 00:00:00.0','N203',6,'Streicher; Jakob','1999-08-03 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(502,1,'Blahetek','Marga','weiblich','Frau',NULL,'1935-08-23 00:00:00.0','N007',2,'Blahetek; Marga','1999-02-15 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(538,1,'Pfau','Kathrin','weiblich',NULL,NULL,'1936-03-18 00:00:00.0',3,7,'Pfau; Kathrin','2001-01-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(616,1,'Fischer','Christine',NULL,NULL,NULL,'1940-05-11 00:00:00.0','C1',8,'Fischer; Christine','2003-06-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(625,1,'Eisbär','Heidi',NULL,NULL,NULL,'1940-11-11 00:00:00.0','HPF',17,'Eisbär; Heidi','2009-01-01 00:00:00.0','w');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(619,1,'demmer','wolfgang',NULL,NULL,NULL,'1945-01-01 00:00:00.0','P1',8,'demmer; wolfgang','2003-01-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(613,1,'Eichel','Heinrich','männlich','Herr',NULL,'1952-05-11 00:00:00.0','E03',3,'Eichel; Heinrich','2002-01-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(612,1,'Sommer','Katrin','weiblich','Frau',NULL,'1975-06-15 00:00:00.0','E02',3,'Sommer; Katrin','2002-05-10 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(609,1,'Berner','Heike',NULL,NULL,NULL,NULL,'M6',9,'Berner; Heike','2002-01-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(607,1,'Pfahlei','Barbara',NULL,NULL,NULL,NULL,'M3',10,'Pfahlei; Barbara','2002-01-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(614,1,'Taube','Isolde','weiblich','Frau',NULL,NULL,'B07',3,'Taube; Isolde','2003-01-01 00:00:00.0','t');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(623,1,'Trommel','Erwin','männlich','Herr',NULL,NULL,'A209',1,'Trommel; Erwin','2006-05-09 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(576,1,'Geschwandner','Egon','männlich','Herr','Dr. Ing.','1934-04-01 00:00:00.0','N112',4,'Geschwandner; Egon','2000-10-06 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(626,1,'Betreut','Heinrich','männlich',NULL,NULL,'1922-04-11 00:00:00.0','N205',6,'Betreut; Heinrich','2011-10-01 00:00:00.0','w');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(600,1,'Estheim','Esther','weiblich','Frau',NULL,'1912-07-03 00:00:00.0','M1',10,'Estheim; Esther','2002-01-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(596,1,'Maier','Elsa','weiblich','Frau',NULL,'1914-05-18 00:00:00.0',117,2,'Maier; Elsa','2001-02-05 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(601,1,'Ertem','Elise','weiblich','Frau',NULL,'1915-05-06 00:00:00.0','E01',3,'Ertem; Elise','2001-03-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(606,1,'Ernst','Erna','weiblich','Frau',NULL,'1915-06-04 00:00:00.0','E02',3,'Ernst; Erna','2001-02-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(602,1,'Edenhofer','Erika','weiblich','Frau',NULL,'1916-08-07 00:00:00.0','E01',3,'Edenhofer; Erika','2001-03-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(617,1,'Friedel','Hilde','weiblich','Frau',NULL,'1921-11-11 00:00:00.0','E03',3,'Friedel; Hilde','2003-01-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(591,1,'Burg','Erika','weiblich','Frau',NULL,'1924-04-13 00:00:00.0','b02',10,'Burg; Erika','2003-01-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(592,1,'Bartenbach','Margarete','weiblich','Frau',NULL,'1925-04-23 00:00:00.0','B10',8,'Bartenbach; Margarete','2003-01-01 00:00:00.0','k');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(603,1,'Erler','Erich','männlich','Herr',NULL,'1910-07-06 00:00:00.0','b01',2,'Erler; Erich','2003-01-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(618,1,'Lippe','Hans','männlich','Herr',NULL,'1911-11-11 00:00:00.0','B5',8,'Lippe; Hans','2003-01-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(582,1,'Abschlag','Erich','männlich','Herr','Dipl.-Ing.','1911-12-21 00:00:00.0','B 2',10,'Abschlag; Erich','2003-01-01 00:00:00.0','w');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(611,1,'Hecht','Hans','männlich','Herr',NULL,NULL,'E02',2,'Hecht; Hans','2002-06-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(152,1,'Schiffer','Juliane','weiblich','Frau',NULL,'1897-01-06 00:00:00.0','N107',4,'Schiffer; Juliane','1991-03-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(161,1,'Christo','Berta','weiblich','Frau',NULL,'1898-11-01 00:00:00.0','N012',2,'Christo; Berta','1991-04-17 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(530,1,'Epple','Emma','weiblich','Frau',NULL,'1902-10-21 00:00:00.0','A304',1,'Epple; Emma','1999-08-26 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(511,1,'Käfer','Frieda','weiblich',NULL,NULL,'1903-08-08 00:00:00.0','HPF',17,'Käfer; Frieda','2009-01-01 00:00:00.0','w');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(424,1,'Mauch','Emma','weiblich',NULL,NULL,'1903-11-22 00:00:00.0','M3',10,'Mauch; Emma','2003-01-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(513,1,'Krauss','Marta','weiblich',NULL,NULL,'1904-04-02 00:00:00.0','N005',8,'Krauss; Marta','1999-04-23 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(528,1,'Spinne','Ilse','weiblich',NULL,NULL,'1904-06-26 00:00:00.0','HPF',17,'Spinne; Ilse','2009-01-01 00:00:00.0','w');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(330,1,'Vogt','Else','weiblich','Frau',NULL,'1904-07-10 00:00:00.0','N113',4,'Vogt; Else','1994-12-02 00:00:00.0','');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(14,1,'Lindner','Gertrud','weiblich',NULL,NULL,'1904-08-04 00:00:00.0','N002',8,'Lindner; Gertrud','1988-08-15 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(389,1,'Tiger','Klara','weiblich',NULL,NULL,'1904-09-27 00:00:00.0','HPF',17,'Tiger; Klara','2009-01-01 00:00:00.0','w');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(343,1,'Kolske','Elsa','weiblich','Frau',NULL,'1905-01-27 00:00:00.0','N109',4,'Kolske; Elsa','1997-09-29 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(414,1,'Böse','Anna','weiblich',NULL,NULL,'1905-06-06 00:00:00.0','N003',8,'Böse; Anna','1996-12-03 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(69,1,'Willhauck','Anna','weiblich','Frau',NULL,'1905-06-20 00:00:00.0','N104',4,'Willhauck; Anna','1987-04-10 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(507,1,'Stehle','Karl','männlich',NULL,NULL,'1905-12-25 00:00:00.0','A302',8,'Stehle; Karl','1999-03-08 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(162,1,'Zimmer','Rosa','weiblich',NULL,NULL,'1906-01-14 00:00:00.0','N028',3,'Zimmer; Rosa','1991-04-27 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(470,1,'Geck','Gertrud','weiblich','Frau',NULL,'1906-06-07 00:00:00.0','N107',4,'Geck; Gertrud','1998-03-17 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(333,1,'Zuschuss','Clara','weiblich',NULL,NULL,'1906-07-23 00:00:00.0','M6',9,'Zuschuss; Clara','2005-01-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(438,1,'Bertsch','Lydia','weiblich',NULL,NULL,'1906-11-19 00:00:00.0','B5',8,'Bertsch; Lydia','2003-01-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(498,1,'Zebra','Werner','männlich',NULL,NULL,'1907-04-24 00:00:00.0','HPF',17,'Zebra; Werner','2009-01-01 00:00:00.0','w');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(360,1,'Faiss','Gertrud','weiblich','Frau',NULL,'1907-06-28 00:00:00.0','N031',3,'Faiss; Gertrud','1997-04-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(350,1,'Ermold','Annalisette','weiblich','Frau',NULL,'1907-06-29 00:00:00.0','N014',2,'Ermold; Annalisette','1995-04-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(391,1,'Kurz','Hedwig','weiblich',NULL,NULL,'1907-11-02 00:00:00.0','N005',8,'Kurz; Hedwig','2005-01-01 00:00:00.0','k');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(282,1,'Hofmann','Elise','weiblich','Frau',NULL,'1908-03-24 00:00:00.0','N009',2,'Hofmann; Elise','1993-11-15 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(61,1,'Schürle','Hedwig','weiblich','Frau',NULL,'1908-03-28 00:00:00.0','N109',4,'Schürle; Hedwig','1987-12-07 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(214,1,'Kurz','Marta','weiblich','Frau',NULL,'1908-04-16 00:00:00.0','N129',5,'Kurz; Marta','1992-03-23 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(488,1,'Kranken','Viktor','weiblich',NULL,NULL,'1908-05-22 00:00:00.0','A207',15,'Kranken; Viktor','2005-01-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(484,1,'Lützow','Annalise','weiblich','Frau',NULL,'1908-06-05 00:00:00.0','N138',5,'Lützow; Annalise','1998-06-22 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(457,1,'Wagner','Elsa','weiblich','Frau',NULL,'1908-06-13 00:00:00.0','N013',2,'Wagner; Elsa','1997-10-20 00:00:00.0','');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(311,1,'Hailfinger','Ernestine','weiblich','Frau',NULL,'1908-07-19 00:00:00.0','N026',3,'Hailfinger; Ernestine','1994-07-12 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(478,1,'Lenkeit','Anna Maria','weiblich','Frau',NULL,'1908-12-20 00:00:00.0','A007',1,'Lenkeit; Anna Maria','1998-04-30 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(368,1,'Böhm','Lina','weiblich',NULL,NULL,'1909-08-08 00:00:00.0','P1',8,'Böhm; Lina','1995-10-23 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(560,1,'Gruber','Lina','weiblich','Frau',NULL,'1909-10-30 00:00:00.0','A204',1,'Gruber; Lina','2000-05-03 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(529,1,'Schweiker','Wilhelmine','weiblich','Frau','Stud.-Dir.','1909-10-31 00:00:00.0','N110',4,'Schweiker; Wilhelmine','1999-10-25 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(298,1,'Maus','Emil','weiblich',NULL,NULL,'1910-02-12 00:00:00.0',1,7,'Maus; Emil','2001-06-15 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(458,1,'Huber','Luise','weiblich','Frau',NULL,'1910-04-09 00:00:00.0','A111',1,'Huber; Luise','1997-11-19 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(540,1,'Brück','Adolf','männlich','Herr',NULL,'1910-05-11 00:00:00.0','N135',5,'Brück; Adolf','1999-10-11 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(392,1,'Hespelt','Emilie','weiblich','Frau',NULL,'1910-07-03 00:00:00.0','A002',1,'Hespelt; Emilie','1998-12-11 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(436,1,'Becker','Hedwig','weiblich','Frau',NULL,'1910-09-30 00:00:00.0','N013',2,'Becker; Hedwig','1997-07-01 00:00:00.0','');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(559,1,'Duburg','Emma','weiblich','Frau',NULL,'1910-10-29 00:00:00.0','N013',2,'Duburg; Emma','2000-04-03 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(589,1,'Reh','August',NULL,NULL,NULL,'1910-12-10 00:00:00.0','HPF',17,'Reh; August','2009-01-01 00:00:00.0','w');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(583,1,'Schlaier','Emma','weiblich','Frau',NULL,'1911-03-31 00:00:00.0','A003',1,'Schlaier; Emma','2000-11-02 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(353,1,'Biene','Irma','weiblich',NULL,NULL,'1911-04-05 00:00:00.0','HPF',17,'Biene; Irma','2009-01-01 00:00:00.0','w');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(430,1,'Abwesend','Sophie','weiblich',NULL,NULL,'1911-04-25 00:00:00.0','A001',15,'Abwesend; Sophie','2005-01-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(537,1,'Trinkaus','Ludwig','männlich','Herr',NULL,'1911-06-03 00:00:00.0','A205',1,'Trinkaus; Ludwig','1999-10-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(539,1,'Kosten','Edgar','männlich',NULL,NULL,'1911-06-04 00:00:00.0','A008',10,'Kosten; Edgar','2005-01-01 00:00:00.0','w');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(407,1,'Seebach','Emma','weiblich','Frau',NULL,'1911-06-28 00:00:00.0','A103',1,'Seebach; Emma','1996-09-24 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(426,1,'Braun','Martha','weiblich','Frau',NULL,'1911-08-04 00:00:00.0','N009',2,'Braun; Martha','1998-02-04 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(460,1,'Klaiber','Lina','weiblich','Frau',NULL,'1911-08-10 00:00:00.0','N110',4,'Klaiber; Lina','1997-12-22 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(235,1,'Klaiber','Adele','weiblich','Frau',NULL,'1911-08-11 00:00:00.0','N012',2,'Klaiber; Adele','1992-09-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(549,1,'Kladeck','Gertrud','weiblich','Frau',NULL,'1911-10-23 00:00:00.0','N126',5,'Kladeck; Gertrud','1999-12-15 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(615,1,'Karl','Ernst','männlich',NULL,NULL,'1911-11-11 00:00:00.0','B10',8,'Karl; Ernst','2003-01-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(620,1,'Wilhelm','Theo',NULL,NULL,NULL,'1911-11-11 00:00:00.0','B3',8,'Wilhelm; Theo','2003-01-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(479,1,'Baumann','Anna','weiblich','Frau',NULL,'1911-11-15 00:00:00.0','E02',2,'Baumann; Anna','2002-01-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(475,1,'Korb','Anna','weiblich','Frau',NULL,'1911-12-15 00:00:00.0','A208',1,'Korb; Anna','1998-04-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(413,1,'Stupak','Ewfrosina','weiblich','Frau',NULL,'1912-01-12 00:00:00.0','N138',5,'Stupak; Ewfrosina','1996-12-02 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(543,1,'Wurm','Maria','weiblich',NULL,NULL,'1912-01-30 00:00:00.0','HPF',17,'Wurm; Maria','2009-01-01 00:00:00.0','w');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(518,1,'Bauer','Linda Elisabeth','weiblich',NULL,NULL,'1912-03-17 00:00:00.0','S1',8,'Bauer; Linda Elisabeth','2003-01-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(504,1,'Vogel','Luise','weiblich',NULL,NULL,'1912-06-18 00:00:00.0','HPF',17,'Vogel; Luise','2009-01-01 00:00:00.0','w');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(598,1,'Eck','Erika','weiblich','Frau',NULL,'1912-07-03 00:00:00.0','b01',2,'Eck; Erika','2001-03-13 00:00:00.0','');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(599,1,'Eck','Erika','weiblich','Frau',NULL,'1912-07-03 00:00:00.0','N012',2,'Eck; Erika','2001-03-01 00:00:00.0','');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(90,1,'Hügel','Hilde','weiblich','Frau',NULL,'1912-10-17 00:00:00.0','N038',3,'Hügel; Hilde','1989-08-14 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(402,1,'Tag','Franz','männlich',NULL,NULL,'1913-05-14 00:00:00.0','T108',16,'Tag; Franz','2005-01-01 00:00:00.0','t');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(16,1,'Pichl','Ernestine','weiblich','Frau',NULL,'1913-05-19 00:00:00.0','N114',4,'Pichl; Ernestine','1978-04-27 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(418,1,'Erlewein','Emilie','weiblich','Frau',NULL,'1913-06-10 00:00:00.0','N111',4,'Erlewein; Emilie','1996-12-10 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(545,1,'Gazda','Martha','weiblich','Frau',NULL,'1913-06-11 00:00:00.0','A206',1,'Gazda; Martha','1999-12-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(375,1,'Hund','Theresia','weiblich',NULL,NULL,'1913-06-12 00:00:00.0','HPF',17,'Hund; Theresia','2009-01-01 00:00:00.0','w');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(315,1,'Dietz','Frieda','weiblich','Frau',NULL,'1913-09-17 00:00:00.0','N025',3,'Dietz; Frieda','1994-07-28 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(558,1,'Scholtze','Ursula','weiblich','Frau',NULL,'1913-11-04 00:00:00.0','A110',1,'Scholtze; Ursula','2000-03-22 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(567,1,'Schloßbach','Agnes','weiblich','Frau',NULL,'1913-12-24 00:00:00.0','N104',4,'Schloßbach; Agnes','2000-06-05 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(303,1,'Faas','Frieda','weiblich',NULL,NULL,'1914-02-26 00:00:00.0','N006',8,'Faas; Frieda','1994-04-25 00:00:00.0','');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(542,1,'Klukowski','Ursula','weiblich',NULL,NULL,'1914-05-07 00:00:00.0','A303',8,'Klukowski; Ursula','2000-08-29 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(174,1,'Lechner','Hedwig','weiblich','Frau',NULL,'1914-05-23 00:00:00.0','N011',2,'Lechner; Hedwig','1991-07-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(287,1,'Weispfenning','Albert','männlich',NULL,NULL,'1914-07-17 00:00:00.0','S1',8,'Weispfenning; Albert','2003-01-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(398,1,'Koppenhöfer','Elise','weiblich','Frau',NULL,'1914-11-13 00:00:00.0','N130',5,'Koppenhöfer; Elise','1996-07-11 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(157,1,'Igel','Magdalena','weiblich',NULL,NULL,'1915-01-26 00:00:00.0','HPF',17,'Igel; Magdalena','2009-01-01 00:00:00.0','w');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(441,1,'Beihilf','Emma','weiblich',NULL,NULL,'1915-06-09 00:00:00.0','A507',15,'Beihilf; Emma','2005-01-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(209,1,'Eckert','Ida','weiblich','Frau',NULL,'1915-06-24 00:00:00.0','N115',4,'Eckert; Ida','1992-03-09 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(453,1,'Wieland','Hilda','weiblich','Frau',NULL,'1915-07-19 00:00:00.0','N105',4,'Wieland; Hilda','1997-11-10 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(551,1,'Löwe','Franziska','weiblich',NULL,NULL,'1915-08-29 00:00:00.0','HPF',17,'Löwe; Franziska','2009-01-01 00:00:00.0','w');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(243,1,'Ester','Elise','weiblich','Frau',NULL,'1915-09-30 00:00:00.0','N007',2,'Ester; Elise','1992-10-20 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(561,1,'Edam','Lina','weiblich','Frau',NULL,'1916-02-03 00:00:00.0','N111',4,'Edam; Lina','2000-08-03 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(452,1,'Osterburg','Theresia','weiblich',NULL,NULL,'1916-04-05 00:00:00.0','A302',8,'Osterburg; Theresia','2003-01-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(580,1,'Wieland','Martha','weiblich','Frau',NULL,'1916-05-27 00:00:00.0','N010',2,'Wieland; Martha','2000-11-02 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(503,1,'Lohmann','Martha','weiblich','Frau',NULL,'1916-07-22 00:00:00.0','A108',1,'Lohmann; Martha','1999-02-11 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(572,1,'Laus','Hans','männlich',NULL,NULL,'1916-10-09 00:00:00.0',2,7,'Laus; Hans','2000-07-21 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(415,1,'Biewald','Walter','männlich',NULL,NULL,'1916-10-20 00:00:00.0','F1',8,'Biewald; Walter','1996-12-06 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(586,1,'Kaiser','Hilda','weiblich','Frau',NULL,'1917-08-07 00:00:00.0','N112',4,'Kaiser; Hilda','2000-11-08 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(371,1,'Friedrich','Maria','weiblich','Frau',NULL,'1917-12-12 00:00:00.0','N127',5,'Friedrich; Maria','1995-12-04 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(20,1,'Stolz','Elisabeth','weiblich',NULL,NULL,'1918-03-30 00:00:00.0','N004',8,'Stolz; Elisabeth','1984-08-28 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(555,1,'Weik','Klara','weiblich',NULL,NULL,'1918-04-03 00:00:00.0','N202',6,'Weik; Klara','2000-03-01 00:00:00.0','w');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(604,1,'Eberwein','Emil','männlich','Herr',NULL,'1918-05-08 00:00:00.0',117,2,'Eberwein; Emil','2001-02-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(510,1,'Mall','Helene','weiblich','Frau',NULL,'1918-10-23 00:00:00.0','N137',5,'Mall; Helene','2000-07-12 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(516,1,'Osterstock','Lieselotte','weiblich',NULL,NULL,'1918-10-24 00:00:00.0','A303',8,'Osterstock; Lieselotte','2003-01-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(474,1,'Ordnung','Juliane','weiblich',NULL,NULL,'1918-11-04 00:00:00.0','A207',15,'Ordnung; Juliane','2005-04-15 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(505,1,'Eder','Maria','weiblich',NULL,NULL,'1918-11-06 00:00:00.0','N006',8,'Eder; Maria','1999-02-26 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(486,1,'Leibig','Gertrud','weiblich','Frau',NULL,'1919-04-28 00:00:00.0','N126',5,'Leibig; Gertrud','1998-07-03 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(597,1,'Schiller','Hans','männlich','Herr',NULL,'1919-05-13 00:00:00.0','b01',2,'Schiller; Hans','2001-02-06 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(429,1,'Reservierung','Berta','weiblich',NULL,NULL,'1919-05-26 00:00:00.0','A001',15,'Reservierung; Berta','2005-01-15 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(463,1,'Hirsch','Erwin','männlich','Herr',NULL,'1919-10-16 00:00:00.0','A212',1,'Hirsch; Erwin','1998-01-05 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(523,1,'Stuttgart','Mechthilde','weiblich',NULL,NULL,'1919-10-17 00:00:00.0','B3',8,'Stuttgart; Mechthilde','2003-01-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(590,1,'Vogel','Kathrin','weiblich',NULL,'Amtsrat','1920-03-12 00:00:00.0',3,7,'Vogel; Kathrin','2001-07-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(593,1,'Probe','Jutta','weiblich','Frau',NULL,'1920-12-03 00:00:00.0','B07',3,'Probe; Jutta','2001-02-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(584,1,'Bär','Maria','weiblich',NULL,NULL,'1920-12-13 00:00:00.0','HPF',17,'Bär; Maria','2009-01-01 00:00:00.0','w');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(579,1,'Gereke','Herta','weiblich','Frau',NULL,'1921-02-20 00:00:00.0','A305',1,'Gereke; Herta','2000-09-19 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(259,1,'Walter','Lotte','weiblich','Frau','Dr. med.','1921-03-02 00:00:00.0','N106',4,'Walter; Lotte','1993-05-29 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(437,1,'Breitner','Josef','männlich',NULL,NULL,'1921-03-29 00:00:00.0','B3',8,'Breitner; Josef','2003-01-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(588,1,'Petermeier','Amanda','weiblich','Frau',NULL,'1921-05-11 00:00:00.0','N013',2,'Petermeier; Amanda','2002-01-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(508,1,'Moll','Friedhilde','weiblich','Frau',NULL,'1921-05-22 00:00:00.0','N131',5,'Moll; Friedhilde','1999-03-12 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(385,1,'Hiemer','Johanna','weiblich','Frau',NULL,'1921-05-26 00:00:00.0','N012',2,'Hiemer; Johanna','1996-05-09 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(468,1,'Horn','Edith','weiblich',NULL,NULL,'1921-08-22 00:00:00.0','N002',8,'Horn; Edith','1998-02-06 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(547,1,'Strittmatter','Heinz','männlich','Herr',NULL,'1921-10-09 00:00:00.0','A107',1,'Strittmatter; Heinz','1999-12-18 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(531,1,'Gerwert','Ilse','weiblich',NULL,NULL,'1922-01-02 00:00:00.0','N201',6,'Gerwert; Ilse','1999-09-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(466,1,'Knödler','Luise','weiblich','Frau',NULL,'1922-02-04 00:00:00.0','N010',2,'Knödler; Luise','1998-01-12 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(495,1,'Bräuer','Berta','weiblich',NULL,NULL,'1922-05-03 00:00:00.0',4,7,'Bräuer; Berta','1998-12-15 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(563,1,'Sänger','Lieselotte','weiblich','Frau',NULL,'1922-07-27 00:00:00.0','N102',4,'Sänger; Lieselotte','2000-05-11 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(435,1,'Hamburg','Erika','weiblich',NULL,NULL,'1922-08-12 00:00:00.0','K1',15,'Hamburg; Erika','2006-10-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(533,1,'Winter Ella',NULL,'weiblich','Frau',NULL,'1922-09-04 00:00:00.0','N137',5,'Winter Ella; ','1999-09-17 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(562,1,'Eberle','Walter','männlich','Herr',NULL,'1923-02-23 00:00:00.0','N013',2,'Eberle; Walter','2000-05-08 00:00:00.0','');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(451,1,'Burckardt','Else','weiblich','Frau',NULL,'1923-11-27 00:00:00.0','N015',2,'Burckardt; Else','1997-09-26 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(180,1,'Pfau','Lara','weiblich','Frau',NULL,'1924-06-04 00:00:00.0','N012',2,'Pfau; Lara','2002-01-01 00:00:00.0','');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(465,1,'Nowadnick','Theresia','weiblich',NULL,NULL,'1924-06-06 00:00:00.0','N204',6,'Nowadnick; Theresia','1998-01-10 00:00:00.0','w');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(111,1,'Riethmayer','Anna','weiblich','Frau',NULL,'1924-07-28 00:00:00.0','A203',1,'Riethmayer; Anna','1990-03-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(628,1,'Richert','Klaus','männlich','Herr','Dr.','1929-09-02 00:00:00.0','N113',4,'Richert; Klaus','2012-03-15 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(629,1,'Neuer','Manfred','männlich','Herr','Dipl.-Ing.','1944-05-11 00:00:00.0','N011',2,'Neuer; Manfred','2012-03-16 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(632,1,'Mare','Magdalena','weiblich','Frau',NULL,NULL,'DG102',2,'Mare; Magdalena','2011-03-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(635,1,'Sommer','Ida-Maria','weiblich','Frau',NULL,'1948-09-09 00:00:00.0','A210',1,'Sommer; Ida-Maria','2012-03-16 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(634,1,'Frühling','Michael','männlich','Herr',NULL,'1958-06-12 00:00:00.0','A109',1,'Frühling; Michael','2012-03-15 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(636,1,'Löwe','Sintra','weiblich','Frau',NULL,'1922-09-09 00:00:00.0','A211',1,'Löwe; Sintra','2012-03-16 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(639,1,'Winter','Sebastian','männlich','Herr','General a.D.','1966-08-06 00:00:00.0','N333',5,'Winter; Sebastian','2012-03-16 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(630,1,'Sonnenblume','Marianne','weiblich','Frau',NULL,'1939-11-29 00:00:00.0','DG101',2,'Sonnenblume; Marianne','2012-03-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(631,1,'Schön','Tabea','weiblich','Frau',NULL,'1955-02-05 00:00:00.0','DG101',2,'Schön; Tabea','2012-03-19 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(637,1,'Meinhaus','Olga','weiblich','Frau',NULL,'1945-05-17 00:00:00.0','B07',3,'Meinhaus; Olga','2012-03-16 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(638,1,'Friesenjong','Michael','männlich','Herr',NULL,'1944-03-12 00:00:00.0','N222',5,'Friesenjong; Michael','2012-03-16 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(640,1,'Herbst','Thomas','männlich','Herr',NULL,'1933-08-08 00:00:00.0','N333',5,'Herbst; Thomas','2012-03-16 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(627,1,'Helgert','Matthias','männlich','Herr',NULL,'1935-03-16 00:00:00.0','N105',4,'Helgert; Matthias','2012-03-15 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(648,1,'Brecht','Berta','weiblich','Frau',NULL,'1944-05-17 00:00:00.0','N101',4,'Brecht; Berta','2012-11-13 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(650,1,'Bardot','Brigitte','weiblich','Frau',NULL,'1945-01-15 00:00:00.0','N037',3,'Bardot; Brigitte','2012-11-15 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(654,1,'Williams','Miriam','weiblich','Frau',NULL,'1950-04-06 00:00:00.0','Z1',1,'Williams; Miriam','2013-04-05 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(656,1,'Fritz','Heike','weiblich','Frau',NULL,'1944-12-12 00:00:00.0','Z1',1,'Fritz; Heike','2013-04-08 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(657,1,'Mustermax','Maxime','weiblich','Frau',NULL,NULL,'N300',4,'Mustermax; Maxime','2013-04-10 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(642,1,'Meyer','Manfred','männlich','Herr',NULL,NULL,'N102',4,'Meyer; Manfred','2012-09-13 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(643,1,'Lierenfeld','Hans Heinrich','männlich','Herr',NULL,'0057-01-19 00:00:00.0','N124',4,'Lierenfeld; Hans Heinrich','2012-09-17 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(644,1,'Sonthofen','Markus','männlich','Herr',NULL,'1932-01-19 00:00:00.0','N106',4,'Sonthofen; Markus','2012-09-26 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(645,1,'Schöpp','Christian','männlich','Herr',NULL,NULL,'F2',1,'Schöpp; Christian','2012-10-08 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(646,1,'Mustermann','Max','männlich','Herr',NULL,NULL,'DG102',2,'Mustermann; Max','2012-10-25 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(649,1,'Krebs','Andreas','männlich','Herr',NULL,'1966-12-15 00:00:00.0','N103',4,'Krebs; Andreas','2012-11-13 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(651,1,'Winter','Michael','männlich','Herr',NULL,NULL,'Test Zim',4,'Winter; Michael','2013-01-22 00:00:00.0','t');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(652,1,'Frühling','Klaus','männlich','Herr',NULL,'1949-02-11 00:00:00.0','Test Zim',4,'Frühling; Klaus','2013-01-23 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(653,1,'Mustermann','Michael','männlich','Herr',NULL,'1955-09-29 00:00:00.0','Test Zim',4,'Mustermann; Michael','2013-03-12 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(655,1,'Frisch','Arno','männlich','Herr',NULL,'1912-12-12 00:00:00.0','Z1',1,'Frisch; Arno','2013-04-05 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(658,1,'Meiering','Michael','männlich','Herr',NULL,'1944-09-29 00:00:00.0','L100',5,'Meiering; Michael','2013-07-01 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(659,1,'Testmann','Marius','männlich','Herr',NULL,NULL,'L100',5,'Testmann; Marius','2013-08-12 00:00:00.0','s');
INSERT INTO "bewope07" ("nr", "kenmdt07_nr", "name", "vorname", "geschlecht", "anrede", "titel", "gebdatum", "zimmer", "stationen07_nr", "suchbez", "einzug", "unterbringung") VALUES(641,1,'Fischer','Christine','weiblich',NULL,NULL,NULL,'N101',4,'Fischer; Christine','2012-06-15 00:00:00.0','s');

INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(96,1,658,'2013-07-09 00:00:00.0',7,NULL,NULL,'Kreuzbein',10,40,50,2,NULL,9,102,18,1);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(94,1,650,'2013-04-10 00:00:00.0',7,NULL,NULL,'Schulter hinten rechts',22,1,1,NULL,NULL,6,104,18,4);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(89,1,650,'2012-12-05 00:00:00.0',29,NULL,NULL,'Schulterblatt unten links',5,5,5,5,NULL,6,104,18,2);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(88,1,650,'2012-12-03 00:00:00.0',29,NULL,NULL,'Gesäß rechts',14,5,5,5,NULL,6,103,18,1);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(97,1,648,'2013-11-28 00:00:00.0',7,NULL,NULL,'Analfalte',18,1,2,1,NULL,9,103,18,1);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(81,1,645,'2012-10-15 00:00:00.0',7,NULL,NULL,'Kreuzbein',10,296,NULL,NULL,NULL,9,103,18,1);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(77,1,643,'2012-09-26 00:00:00.0',37,NULL,NULL,'Schulterblatt oben links',4,20,10,2,NULL,6,102,18,1);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(98,1,641,'2013-12-03 00:00:00.0',7,NULL,NULL,'Analfalte',18,3,2,1,NULL,9,103,18,1);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(40,1,639,'2012-03-23 00:00:00.0',29,NULL,NULL,'Schulterblatt oben links',4,2,NULL,NULL,NULL,6,77,14,1);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(69,1,638,'2012-06-29 00:00:00.0',7,NULL,NULL,'Kreuzbein',10,10,5,NULL,NULL,9,56,13,2);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(66,1,638,'2012-06-22 00:00:00.0',29,NULL,NULL,'Wirbelsäule',17,28,NULL,NULL,NULL,6,56,13,1);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(43,1,627,'2012-03-21 00:00:00.0',37,NULL,NULL,'Schulterblatt oben links',4,60,NULL,NULL,NULL,6,55,13,1);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(59,1,623,'2012-05-04 00:00:00.0',29,NULL,NULL,'Kreuzbein',10,1095,NULL,5,NULL,6,55,13,1);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(38,1,604,'2012-03-21 00:00:00.0',29,NULL,NULL,'Schienbein rechts',72,10,5,1,NULL,9,90,16,1);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(47,1,602,'2012-03-29 00:00:00.0',7,NULL,NULL,'Großer Rollhügel links',43,1330,NULL,NULL,NULL,9,56,13,1);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(39,1,586,'2012-03-21 00:00:00.0',29,NULL,NULL,'Hand außen rechts',20,2,4,NULL,NULL,6,55,13,1);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(49,1,585,'2012-03-29 00:00:00.0',13,NULL,NULL,'Kniekehle rechts',62,2,2,2,NULL,NULL,55,13,1);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(41,1,582,'2012-03-23 00:00:00.0',29,NULL,NULL,'Schädelansatz',2,0,NULL,NULL,NULL,6,55,13,1);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(60,1,574,'2012-05-07 00:00:00.0',29,NULL,NULL,'Wirbelsäule',17,6,NULL,NULL,NULL,NULL,55,13,1);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(42,1,563,'2012-03-20 00:00:00.0',13,NULL,NULL,'Schulterblatt oben rechts',6,50,NULL,NULL,NULL,6,55,13,1);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(82,1,561,'2012-10-16 00:00:00.0',13,NULL,NULL,'Oberschenkel hinten rechts',74,2,2,1,NULL,9,103,18,2);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(46,1,561,'2012-03-29 00:00:00.0',7,NULL,NULL,'Schienbein rechts',72,2883,NULL,NULL,NULL,9,91,16,1);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(80,1,540,'2012-10-04 00:00:00.0',13,NULL,NULL,'Oberschenkel hinten rechts',74,2,2,1,NULL,NULL,103,18,4);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(62,1,540,'2012-05-07 00:00:00.0',29,NULL,NULL,'Schulterblatt unten rechts',7,15,NULL,NULL,NULL,6,55,13,3);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(61,1,540,'2012-05-07 00:00:00.0',29,NULL,NULL,'Gesäß rechts',14,11,NULL,NULL,NULL,NULL,55,13,2);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(48,1,540,'2012-03-29 00:00:00.0',13,NULL,NULL,'Wade rechts',16,5,5,2,NULL,NULL,56,13,1);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(87,1,529,'2012-11-21 00:00:00.0',13,NULL,NULL,'Schulterblatt oben links',4,50,NULL,3,NULL,6,103,18,1);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(34,1,502,'2012-03-20 00:00:00.0',11,NULL,NULL,'Schulterblatt unten links',5,2,4,2,NULL,6,55,13,1);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(75,1,479,'2012-08-16 00:00:00.0',11,NULL,NULL,'Hand links',71,1,1,NULL,NULL,NULL,55,13,11);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(71,1,479,'2012-08-13 00:00:00.0',11,NULL,NULL,'Kreuzbein',10,1,1,NULL,NULL,NULL,55,13,10);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(70,1,479,'2012-07-25 00:00:00.0',11,NULL,NULL,'Brustbein',64,1,1,NULL,NULL,6,55,13,9);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(68,1,479,'2012-06-26 00:00:00.0',7,NULL,NULL,'Schulterblatt oben links',4,2,2,2,NULL,6,56,13,8);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(67,1,479,'2012-06-23 00:00:00.0',11,NULL,NULL,'Schulterblatt unten links',5,1,1,NULL,NULL,6,55,13,7);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(58,1,463,'2012-05-04 00:00:00.0',29,NULL,NULL,'Gesäß rechts',14,2,NULL,NULL,NULL,6,55,13,1);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(63,1,451,'2012-05-07 00:00:00.0',29,NULL,NULL,'Wirbelsäule',17,35,NULL,NULL,NULL,6,55,13,1);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(74,1,436,'2012-08-15 00:00:00.0',11,NULL,NULL,'Schulterblatt oben rechts',6,1,1,NULL,NULL,NULL,55,13,4);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(73,1,436,'2012-08-15 00:00:00.0',11,NULL,NULL,'Ferse links',11,1,1,NULL,NULL,NULL,64,14,3);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(72,1,436,'2012-08-15 00:00:00.0',11,NULL,NULL,'Kreuzbein',10,1,1,NULL,NULL,NULL,55,13,2);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(92,1,426,'2013-02-21 00:00:00.0',7,NULL,NULL,'Gesäß rechts',14,742,NULL,NULL,NULL,NULL,103,18,2);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(51,1,426,'2012-03-29 00:00:00.0',11,NULL,NULL,'Schulterblatt oben links',4,4,4,NULL,NULL,NULL,56,13,1);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(95,1,328,'2013-07-02 00:00:00.0',7,NULL,NULL,'Fersenunterseite rechts',25,1342,NULL,3,NULL,9,102,18,7);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(91,1,328,'2013-01-15 00:00:00.0',7,NULL,NULL,'Zehenunterseite links',47,3058,NULL,NULL,NULL,9,103,18,6);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(83,1,328,'2012-10-18 00:00:00.0',7,NULL,NULL,'Kreuzbein',10,10,12,2,NULL,9,103,18,5);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(44,1,259,'2012-03-22 00:00:00.0',29,NULL,NULL,'Oberschenkel vorne rechts',74,55,NULL,NULL,NULL,6,55,13,1);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(36,1,162,'2012-03-21 00:00:00.0',29,NULL,NULL,'Oberam hinten links',50,1,1,NULL,NULL,6,55,13,1);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(50,1,152,'2012-03-29 00:00:00.0',11,NULL,NULL,'Schulterblatt oben rechts',6,4,4,NULL,NULL,NULL,57,13,1);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(33,1,559,'2012-03-19 00:00:00.0',11,NULL,NULL,'Schulterblatt unten links',5,10,NULL,NULL,'xycyxcyxc
yxcyxc
yxcyx',6,55,13,1);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(65,1,451,'2012-05-10 00:00:00.0',13,NULL,NULL,'Schulterblatt unten rechts',7,10,10,2,'sragttrtrt',9,55,13,2);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(85,1,502,'2012-11-15 00:00:00.0',13,NULL,NULL,'Oberschenkel hinten rechts',74,10,12,2,'rgethrhrh',6,103,18,2);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(86,1,502,'2012-11-15 00:00:00.0',13,NULL,NULL,'Ferse rechts',12,1,2,1,'rfergeg',6,103,18,3);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(84,1,540,'2012-11-13 00:00:00.0',13,NULL,NULL,'Wirbelsäule',17,2,2,1,'fhfghfg',9,103,18,5);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(90,1,650,'2012-12-13 00:00:00.0',13,NULL,NULL,'Oberschenkel hinten rechts',74,4,5,1,'dgdffhfhfgh',6,103,18,3);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(32,1,209,'2012-03-19 00:00:00.0',11,NULL,NULL,'Schulterblatt unten links',5,5,2,4,'askljjasdhfasd
ßfasödkjfjhasödlf
asdflkjasdjasd',6,55,13,1);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(78,1,644,'2012-09-26 00:00:00.0',37,NULL,NULL,'Wade links',15,4,6,2,'Einzug 26.09.2012',1,102,18,1);
INSERT INTO "bewdkl07" ("nr", "kenmdt07_nr", "bewope07_nr", "erfassungsdatum", "mitape07_nr", "endedatum", "ende_mitape07_nr", "koerperstelle", "koerperstelle_code", "groesse1", "groesse2", "tiefe", "bemerkung", "entstehung", "kendek07_nr", "kenwun07_nr", "dekubitusnr") VALUES(76,1,642,'2012-09-13 00:00:00.0',7,NULL,NULL,'Wirbelsäule',17,22,NULL,1,'Einzug 13.09.2012',3,103,18,1);

INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(88,1,98,'2013-12-03 14:01:59.0',7,NULL,NULL,NULL,NULL,3,2,103,18,1);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(87,1,97,'2013-11-28 14:05:16.0',7,NULL,NULL,NULL,NULL,1,2,103,18,1);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(85,1,95,'2013-07-02 14:50:03.0',7,'j',NULL,NULL,NULL,1342,NULL,102,18,3);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(84,1,94,'2013-05-15 10:22:25.0',7,NULL,NULL,NULL,NULL,1,1,104,18,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(79,1,92,'2013-02-21 15:55:21.0',7,NULL,NULL,NULL,NULL,742,NULL,103,18,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(81,1,91,'2013-03-11 11:16:35.0',7,'j','distal','2 Uhr',NULL,1319,NULL,103,18,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(76,1,91,'2013-01-15 13:18:44.0',7,'n',NULL,NULL,NULL,3058,NULL,103,18,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(75,1,90,'2012-12-13 11:00:21.0',13,NULL,NULL,NULL,NULL,4,5,103,18,1);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(73,1,89,'2012-12-05 16:12:10.0',29,NULL,NULL,NULL,NULL,5,5,104,18,5);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(72,1,88,'2012-12-03 15:00:28.0',29,'n',NULL,NULL,NULL,5,5,103,18,5);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(71,1,87,'2012-11-21 14:05:50.0',13,NULL,NULL,NULL,NULL,50,NULL,103,18,3);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(70,1,85,'2012-11-15 14:54:49.0',13,'j','reggrtrtgrt','fdeferer',NULL,10,12,103,18,2);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(86,1,83,'2013-07-29 11:33:37.0',7,NULL,NULL,NULL,NULL,10,12,103,18,2);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(83,1,83,'2013-04-11 13:27:51.0',7,NULL,NULL,NULL,NULL,10,12,103,18,2);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(82,1,83,'2013-04-10 15:06:19.0',7,NULL,NULL,NULL,NULL,10,12,103,18,2);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(69,1,81,'2012-10-15 14:19:40.0',7,NULL,NULL,NULL,NULL,296,NULL,103,18,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(67,1,80,'2012-10-04 14:29:53.0',13,NULL,NULL,NULL,NULL,2,2,103,18,1);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(66,1,80,'2012-10-04 14:29:07.0',13,NULL,NULL,NULL,NULL,2,2,103,18,1);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(64,1,76,'2012-09-13 14:25:22.0',7,NULL,NULL,NULL,NULL,22,NULL,103,18,1);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(80,1,75,'2013-03-07 11:33:38.0',7,'j',NULL,'4 Uhr',NULL,1,1,55,13,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(63,1,75,'2012-08-16 10:46:56.0',11,'j',NULL,'4 Uhr',NULL,1,1,55,13,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(62,1,74,'2012-08-15 20:00:01.0',11,'j',NULL,'1 Uhr',NULL,1,1,55,13,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(59,1,73,'2012-08-15 18:21:16.0',11,'j',NULL,'4 Uhr',NULL,1,1,64,14,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(58,1,72,'2012-08-15 17:34:17.0',11,'j',NULL,'5 Uhr',NULL,1,1,55,13,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(57,1,71,'2012-08-13 12:07:54.0',11,'j',NULL,'4 Uhr',NULL,1,1,55,13,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(56,1,71,'2012-08-13 12:06:08.0',11,NULL,NULL,NULL,NULL,1,1,55,13,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(53,1,70,'2012-07-25 22:27:44.0',11,'j',NULL,'2 Uhr',NULL,1,1,55,13,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(49,1,68,'2012-06-26 11:13:07.0',7,NULL,NULL,NULL,NULL,2,2,56,13,2);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(74,1,67,'2012-12-11 13:48:42.0',7,'j',NULL,'10 Uhr',NULL,2,1,55,13,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(55,1,67,'2012-08-13 11:18:55.0',11,'j',NULL,'10 Uhr',NULL,2,1,55,13,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(54,1,67,'2012-08-13 11:16:31.0',11,'j',NULL,NULL,NULL,2,1,55,13,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(51,1,67,'2012-07-10 15:20:50.0',29,'j',NULL,NULL,NULL,1,1,55,13,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(48,1,67,'2012-06-23 17:17:03.0',11,'j',NULL,NULL,NULL,1,1,55,13,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(50,1,66,'2012-06-29 14:00:01.0',7,NULL,NULL,NULL,NULL,28,NULL,56,13,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(47,1,66,'2012-06-22 14:26:42.0',29,NULL,NULL,NULL,NULL,28,NULL,56,13,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(78,1,65,'2013-01-30 13:54:39.0',7,NULL,NULL,NULL,NULL,10,10,55,13,2);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(44,1,63,'2012-05-07 17:47:05.0',29,NULL,NULL,NULL,NULL,35,NULL,55,13,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(52,1,62,'2012-07-21 20:34:01.0',7,'j',NULL,NULL,NULL,15,NULL,55,13,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(43,1,62,'2012-05-07 17:30:34.0',29,NULL,NULL,NULL,NULL,15,NULL,55,13,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(42,1,61,'2012-05-07 16:55:59.0',29,NULL,NULL,NULL,NULL,11,NULL,55,13,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(41,1,60,'2012-05-07 16:53:27.0',29,NULL,NULL,NULL,NULL,6,NULL,55,13,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(40,1,59,'2012-05-04 15:47:24.0',29,NULL,NULL,NULL,NULL,1095,NULL,55,13,5);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(39,1,58,'2012-05-04 15:27:55.0',29,NULL,NULL,NULL,NULL,2,NULL,55,13,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(35,1,49,'2012-03-29 10:10:25.0',13,NULL,NULL,NULL,NULL,2,2,55,13,2);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(34,1,48,'2012-03-29 09:34:22.0',13,NULL,NULL,NULL,NULL,5,5,56,13,2);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(29,1,44,'2012-03-26 13:30:01.0',29,NULL,NULL,NULL,NULL,30,NULL,55,13,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(28,1,44,'2012-03-25 13:28:27.0',29,NULL,NULL,NULL,NULL,30,NULL,55,13,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(27,1,44,'2012-03-24 13:27:58.0',29,NULL,NULL,NULL,NULL,40,NULL,55,13,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(26,1,44,'2012-03-23 13:27:27.0',29,NULL,NULL,NULL,NULL,50,NULL,55,13,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(25,1,44,'2012-03-22 13:26:53.0',29,NULL,NULL,NULL,NULL,55,NULL,55,13,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(24,1,43,'2012-03-25 13:21:12.0',37,NULL,NULL,NULL,NULL,30,NULL,55,13,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(23,1,43,'2012-03-24 13:20:43.0',37,NULL,NULL,NULL,NULL,30,NULL,55,13,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(22,1,43,'2012-03-23 13:19:42.0',37,NULL,NULL,NULL,NULL,30,NULL,55,13,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(21,1,43,'2012-03-22 13:18:05.0',37,NULL,NULL,NULL,NULL,50,NULL,55,13,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(20,1,43,'2012-03-21 13:16:46.0',37,NULL,NULL,NULL,NULL,60,NULL,55,13,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(19,1,42,'2012-03-25 13:11:58.0',13,NULL,NULL,NULL,NULL,20,NULL,55,13,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(18,1,42,'2012-03-23 13:10:09.0',13,NULL,NULL,NULL,NULL,30,NULL,55,13,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(17,1,42,'2012-03-22 13:08:23.0',13,NULL,NULL,NULL,NULL,40,NULL,55,13,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(16,1,42,'2012-03-21 13:05:08.0',13,NULL,NULL,NULL,NULL,40,NULL,55,13,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(15,1,42,'2012-03-20 13:03:35.0',13,NULL,NULL,NULL,NULL,50,NULL,55,13,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(9,1,41,'2012-03-23 10:28:41.0',29,'j',NULL,'1 Uhr',NULL,0,NULL,55,13,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(61,1,40,'2012-08-15 19:54:35.0',11,'j',NULL,'2 Uhr',NULL,2,NULL,77,14,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(8,1,40,'2012-03-23 08:54:18.0',29,NULL,NULL,NULL,NULL,2,NULL,77,14,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(7,1,39,'2012-03-21 15:29:06.0',29,NULL,NULL,NULL,NULL,2,4,55,13,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(6,1,38,'2012-03-21 15:13:47.0',29,NULL,NULL,NULL,NULL,10,5,90,16,1);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(60,1,34,'2012-08-15 18:52:39.0',11,'j',NULL,'2 Uhr',NULL,2,4,55,13,2);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(4,1,34,'2012-03-20 12:03:27.0',11,NULL,NULL,NULL,NULL,2,4,55,13,2);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(2,1,33,'2012-03-20 09:07:42.0',11,NULL,NULL,NULL,NULL,30,NULL,55,13,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(1,1,33,'2012-03-19 15:38:35.0',11,NULL,NULL,NULL,NULL,10,NULL,55,13,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(36,1,51,'2012-03-29 10:21:29.0',11,'j',NULL,'4 Uhr','gggg',4,4,56,13,NULL);
INSERT INTO "bewwbs07" ("nr", "kenmdt07_nr", "bewdkl07_nr", "datum", "mitape07_nr", "taschen", "taschlok", "taschricht", "bemerkung", "groesse1", "groesse2", "kendek07_nr", "kenwun07_nr", "tiefe") VALUES(3,1,32,'2012-03-20 09:24:31.0',11,NULL,NULL,NULL,'bla bla
bla',5,2,55,13,4);

INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(76,1,18,1,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(84,1,19,1,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(164,1,25,1,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(204,1,30,1,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(241,1,32,1,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(350,1,2,2,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(360,1,6,2,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(370,1,13,2,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(390,1,15,2,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(408,1,17,2,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(416,1,18,2,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(424,1,19,2,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(432,1,20,2,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(504,1,25,2,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(512,1,26,2,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(520,1,27,2,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(581,1,32,2,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(594,1,36,2,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(607,1,37,2,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(748,1,17,3,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(756,1,18,3,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(772,1,20,3,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(788,1,22,3,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(852,1,26,3,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(876,1,29,3,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(892,1,31,3,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(921,1,32,3,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(947,1,37,3,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(960,1,38,3,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(1021,1,40,3,'');
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(1445,1,19,5,''); -- bewwbs07_nr=5 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(1461,1,21,5,''); -- bewwbs07_nr=5 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(1533,1,26,5,''); -- bewwbs07_nr=5 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(1541,1,27,5,''); -- bewwbs07_nr=5 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(1615,1,36,5,''); -- bewwbs07_nr=5 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(1628,1,37,5,''); -- bewwbs07_nr=5 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(1641,1,38,5,''); -- bewwbs07_nr=5 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(1667,1,42,5,''); -- bewwbs07_nr=5 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(1702,1,39,5,''); -- bewwbs07_nr=5 does not exist
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(1712,1,55,6,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(1722,1,56,6,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(1732,1,57,6,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(1778,1,58,6,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(1802,1,59,6,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(1906,1,60,6,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(1943,1,61,6,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(1969,1,62,6,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(2052,1,1,7,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(2142,1,21,7,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(2206,1,25,7,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(2214,1,26,7,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(2392,1,44,8,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(2412,1,45,8,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(2570,1,49,8,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(2578,1,50,8,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(2636,1,52,8,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(2662,1,53,8,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(2723,1,54,8,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(2733,1,1,9,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(2753,1,10,9,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(2763,1,66,9,'keiner');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(2773,1,15,9,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(2783,1,66,9,'keine');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(2791,1,17,9,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(2799,1,18,9,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(2887,1,25,9,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(2895,1,26,9,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(2964,1,32,9,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(2977,1,36,9,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(2990,1,37,9,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(3003,1,38,9,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(3064,1,33,9,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(3065,1,39,9,'');
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(3085,1,9,10,''); -- bewwbs07_nr=10 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(3095,1,10,10,''); -- bewwbs07_nr=10 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(3115,1,14,10,''); -- bewwbs07_nr=10 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(3133,1,17,10,''); -- bewwbs07_nr=10 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(3141,1,18,10,''); -- bewwbs07_nr=10 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(3229,1,25,10,''); -- bewwbs07_nr=10 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(3237,1,26,10,''); -- bewwbs07_nr=10 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(3306,1,32,10,''); -- bewwbs07_nr=10 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(3345,1,38,10,''); -- bewwbs07_nr=10 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(3406,1,34,10,''); -- bewwbs07_nr=10 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(3407,1,39,10,''); -- bewwbs07_nr=10 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(3427,1,8,11,''); -- bewwbs07_nr=11 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(3437,1,11,11,''); -- bewwbs07_nr=11 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(3475,1,17,11,''); -- bewwbs07_nr=11 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(3483,1,18,11,''); -- bewwbs07_nr=11 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(3571,1,25,11,''); -- bewwbs07_nr=11 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(3579,1,26,11,''); -- bewwbs07_nr=11 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(3648,1,32,11,''); -- bewwbs07_nr=11 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(3687,1,38,11,''); -- bewwbs07_nr=11 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(4107,1,8,13,''); -- bewwbs07_nr=13 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(4117,1,11,13,''); -- bewwbs07_nr=13 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(4155,1,17,13,''); -- bewwbs07_nr=13 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(4163,1,18,13,''); -- bewwbs07_nr=13 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(4251,1,25,13,''); -- bewwbs07_nr=13 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(4259,1,26,13,''); -- bewwbs07_nr=13 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(4328,1,32,13,''); -- bewwbs07_nr=13 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(4367,1,38,13,''); -- bewwbs07_nr=13 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(4447,1,7,14,''); -- bewwbs07_nr=14 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(4457,1,11,14,''); -- bewwbs07_nr=14 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(4495,1,17,14,''); -- bewwbs07_nr=14 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(4503,1,18,14,''); -- bewwbs07_nr=14 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(4591,1,25,14,''); -- bewwbs07_nr=14 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(4599,1,26,14,''); -- bewwbs07_nr=14 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(4668,1,32,14,''); -- bewwbs07_nr=14 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(4707,1,38,14,''); -- bewwbs07_nr=14 does not exist
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(4787,1,8,15,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(4797,1,12,15,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(4851,1,19,15,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(4859,1,20,15,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(4931,1,25,15,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(4947,1,27,15,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(5008,1,32,15,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(5127,1,7,16,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(5137,1,12,16,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(5191,1,19,16,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(5199,1,20,16,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(5271,1,25,16,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(5287,1,27,16,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(5348,1,32,16,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(5467,1,6,17,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(5477,1,12,17,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(5531,1,19,17,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(5539,1,20,17,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(5611,1,25,17,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(5627,1,27,17,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(5688,1,32,17,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(5807,1,7,18,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(5817,1,12,18,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(5871,1,19,18,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(5879,1,20,18,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(5951,1,25,18,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(5967,1,27,18,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(6028,1,32,18,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(6147,1,5,19,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(6157,1,12,19,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(6211,1,19,19,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(6219,1,20,19,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(6291,1,25,19,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(6307,1,27,19,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(6368,1,32,19,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(6487,1,8,20,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(6535,1,17,20,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(6543,1,18,20,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(6631,1,25,20,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(6639,1,26,20,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(6708,1,32,20,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(6747,1,38,20,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(6827,1,7,21,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(6875,1,17,21,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(6883,1,18,21,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(6971,1,25,21,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(6979,1,26,21,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(7048,1,32,21,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(7087,1,38,21,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(7167,1,6,22,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(7215,1,17,22,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(7223,1,18,22,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(7311,1,25,22,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(7319,1,26,22,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(7388,1,32,22,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(7427,1,38,22,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(7507,1,7,23,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(7555,1,17,23,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(7563,1,18,23,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(7651,1,25,23,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(7659,1,26,23,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(7728,1,32,23,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(7767,1,38,23,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(7847,1,5,24,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(7895,1,17,24,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(7903,1,18,24,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(7991,1,25,24,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(7999,1,26,24,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(8068,1,32,24,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(8107,1,38,24,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(8187,1,7,25,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(8243,1,18,25,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(8251,1,19,25,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(8339,1,26,25,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(8347,1,27,25,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(8408,1,32,25,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(8527,1,7,26,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(8583,1,18,26,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(8591,1,19,26,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(8679,1,26,26,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(8687,1,27,26,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(8748,1,32,26,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(8867,1,6,27,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(8923,1,18,27,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(8931,1,19,27,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(9019,1,26,27,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(9027,1,27,27,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(9088,1,32,27,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(9207,1,5,28,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(9263,1,18,28,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(9271,1,19,28,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(9359,1,26,28,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(9367,1,27,28,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(9428,1,32,28,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(9547,1,6,29,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(9603,1,18,29,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(9611,1,19,29,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(9699,1,26,29,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(9707,1,27,29,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(9768,1,32,29,'');
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(9887,1,7,30,''); -- bewwbs07_nr=30 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(9935,1,17,30,''); -- bewwbs07_nr=30 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(9943,1,18,30,''); -- bewwbs07_nr=30 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(10108,1,32,30,''); -- bewwbs07_nr=30 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(10227,1,6,31,''); -- bewwbs07_nr=31 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(10275,1,17,31,''); -- bewwbs07_nr=31 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(10283,1,18,31,''); -- bewwbs07_nr=31 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(10448,1,32,31,''); -- bewwbs07_nr=31 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(10567,1,6,32,''); -- bewwbs07_nr=32 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(10615,1,17,32,''); -- bewwbs07_nr=32 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(10623,1,18,32,''); -- bewwbs07_nr=32 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(10788,1,32,32,''); -- bewwbs07_nr=32 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(10907,1,5,33,''); -- bewwbs07_nr=33 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(10955,1,17,33,''); -- bewwbs07_nr=33 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(10963,1,18,33,''); -- bewwbs07_nr=33 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(11128,1,32,33,''); -- bewwbs07_nr=33 does not exist
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(11237,1,1,34,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(11247,1,6,34,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(11257,1,10,34,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(11295,1,17,34,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(11399,1,26,34,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(11468,1,32,34,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(11533,1,42,34,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(11577,1,1,35,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(11587,1,8,35,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(11635,1,17,35,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(11659,1,20,35,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(11731,1,25,35,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(11808,1,32,35,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(11917,1,1,36,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(11975,1,17,36,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(12071,1,25,36,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(12079,1,26,36,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(12148,1,32,36,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(12248,1,35,36,'');
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(12258,1,1,37,''); -- bewwbs07_nr=37 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(12316,1,17,37,''); -- bewwbs07_nr=37 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(12412,1,25,37,''); -- bewwbs07_nr=37 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(12420,1,26,37,''); -- bewwbs07_nr=37 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(12489,1,32,37,''); -- bewwbs07_nr=37 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(12589,1,35,37,''); -- bewwbs07_nr=37 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(12599,1,1,38,''); -- bewwbs07_nr=38 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(12609,1,6,38,''); -- bewwbs07_nr=38 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(12619,1,11,38,''); -- bewwbs07_nr=38 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(12657,1,17,38,''); -- bewwbs07_nr=38 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(12753,1,25,38,''); -- bewwbs07_nr=38 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(12830,1,32,38,''); -- bewwbs07_nr=38 does not exist
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(12939,1,3,39,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(12949,1,6,39,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(12959,1,10,39,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(12979,1,14,39,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(12997,1,17,39,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(13021,1,20,39,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(13045,1,23,39,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(13101,1,26,39,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(13117,1,28,39,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(13133,1,30,39,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(13170,1,32,39,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(13196,1,37,39,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(13270,1,34,39,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(13280,1,2,40,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(13300,1,11,40,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(13346,1,18,40,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(13354,1,19,40,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(13450,1,27,40,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(13458,1,28,40,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(13630,1,7,41,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(13640,1,11,41,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(13980,1,10,42,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(14300,1,3,43,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(14320,1,10,43,'');
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(14990,1,5,45,''); -- bewwbs07_nr=45 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(15038,1,17,45,''); -- bewwbs07_nr=45 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(15046,1,18,45,''); -- bewwbs07_nr=45 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(15054,1,19,45,''); -- bewwbs07_nr=45 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(15211,1,32,45,''); -- bewwbs07_nr=45 does not exist
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(15561,1,4,48,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(15571,1,6,48,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(15581,1,11,48,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(15601,1,14,48,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(15619,1,17,48,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(15715,1,25,48,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(15723,1,26,48,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(15792,1,32,48,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(15892,1,34,48,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(16582,1,4,51,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(16592,1,6,51,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(16602,1,11,51,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(16622,1,14,51,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(16640,1,17,51,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(16736,1,25,51,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(16744,1,26,51,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(16813,1,32,51,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(16922,1,3,52,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(16942,1,10,52,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(16962,1,14,52,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(17004,1,20,52,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(17028,1,23,52,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(17124,1,31,52,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(17166,1,36,52,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(17192,1,38,52,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(17262,1,4,53,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(17320,1,17,53,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(17416,1,25,53,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(17424,1,26,53,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(17493,1,32,53,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(17593,1,34,53,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(17603,1,4,54,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(17613,1,6,54,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(17623,1,11,54,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(17643,1,15,54,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(17661,1,17,54,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(17757,1,25,54,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(17765,1,26,54,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(17834,1,32,54,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(17943,1,4,55,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(17953,1,6,55,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(17963,1,11,55,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(17983,1,15,55,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(18001,1,17,55,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(18097,1,25,55,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(18105,1,26,55,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(18174,1,32,55,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(18283,1,1,56,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(18341,1,17,56,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(18437,1,25,56,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(18445,1,26,56,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(18514,1,32,56,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(18623,1,1,57,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(18681,1,17,57,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(18777,1,25,57,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(18785,1,26,57,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(18854,1,32,57,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(18963,1,1,58,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(19021,1,17,58,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(19117,1,25,58,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(19125,1,26,58,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(19194,1,32,58,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(19303,1,43,59,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(19361,1,46,59,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(19457,1,47,59,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(19465,1,48,59,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(19534,1,51,59,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(19643,1,1,60,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(19701,1,17,60,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(19797,1,25,60,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(19805,1,26,60,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(19874,1,32,60,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(19974,1,34,60,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(19984,1,44,61,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(20004,1,45,61,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(20042,1,46,61,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(20162,1,49,61,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(20170,1,50,61,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(20228,1,52,61,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(20254,1,53,61,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(20324,1,1,62,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(20382,1,17,62,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(20478,1,25,62,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(20486,1,26,62,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(20555,1,32,62,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(20655,1,34,62,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(20665,1,1,63,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(20723,1,17,63,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(20819,1,25,63,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(20827,1,26,63,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(20896,1,32,63,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(20996,1,34,63,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(21006,1,66,64,'');
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(21347,1,1,65,''); -- bewwbs07_nr=65 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(21357,1,9,65,''); -- bewwbs07_nr=65 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(21367,1,13,65,''); -- bewwbs07_nr=65 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(21377,1,66,65,'faulig'); -- bewwbs07_nr=65 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(21387,1,16,65,''); -- bewwbs07_nr=65 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(21429,1,20,65,''); -- bewwbs07_nr=65 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(21469,1,24,65,''); -- bewwbs07_nr=65 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(21501,1,25,65,''); -- bewwbs07_nr=65 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(21533,1,29,65,''); -- bewwbs07_nr=65 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(21541,1,30,65,''); -- bewwbs07_nr=65 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(21630,1,41,65,''); -- bewwbs07_nr=65 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(21679,1,40,65,''); -- bewwbs07_nr=65 does not exist
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(22030,1,63,67,'');
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(22371,1,1,68,''); -- bewwbs07_nr=68 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(22381,1,9,68,''); -- bewwbs07_nr=68 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(22391,1,13,68,''); -- bewwbs07_nr=68 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(22401,1,66,68,'faulig'); -- bewwbs07_nr=68 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(22411,1,16,68,''); -- bewwbs07_nr=68 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(22453,1,20,68,''); -- bewwbs07_nr=68 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(22493,1,24,68,''); -- bewwbs07_nr=68 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(22525,1,25,68,''); -- bewwbs07_nr=68 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(22557,1,29,68,''); -- bewwbs07_nr=68 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(22565,1,30,68,''); -- bewwbs07_nr=68 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(22654,1,41,68,''); -- bewwbs07_nr=68 does not exist
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(22712,1,64,69,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(22979,1,63,70,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(23009,1,66,70,'acdsfv');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(23029,1,66,70,'fvdsfbdgfbf');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(23320,1,66,71,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(23661,1,66,72,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(24002,1,63,73,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(24343,1,4,74,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(24353,1,6,74,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(24363,1,11,74,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(24383,1,15,74,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(24401,1,17,74,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(24433,1,21,74,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(24497,1,25,74,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(24505,1,26,74,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(24574,1,32,74,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(24684,1,63,75,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(24714,1,66,75,'rtertet');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(24734,1,66,75,'rtrer');
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(25292,1,1,77,''); -- bewwbs07_nr=77 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(25302,1,9,77,''); -- bewwbs07_nr=77 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(25312,1,13,77,''); -- bewwbs07_nr=77 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(25322,1,66,77,'faulig'); -- bewwbs07_nr=77 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(25332,1,16,77,''); -- bewwbs07_nr=77 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(25374,1,20,77,''); -- bewwbs07_nr=77 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(25414,1,24,77,''); -- bewwbs07_nr=77 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(25446,1,25,77,''); -- bewwbs07_nr=77 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(25478,1,29,77,''); -- bewwbs07_nr=77 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(25486,1,30,77,''); -- bewwbs07_nr=77 does not exist
-- INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(25575,1,41,77,''); -- bewwbs07_nr=77 does not exist
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(25974,1,66,79,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(26315,1,1,80,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(26325,1,6,80,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(26373,1,17,80,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(26397,1,20,80,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(26469,1,25,80,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(26477,1,26,80,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(26501,1,29,80,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(26546,1,32,80,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(26923,1,65,82,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(27264,1,65,83,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(27846,1,65,86,'');
INSERT INTO "bewwbz07" ("nr", "kenmdt07_nr", "kenwbs07_nr", "bewwbs07_nr", "freitext") VALUES(28328,1,63,88,'');

SELECT 'Data successfully imported.' AS "Import Finished";

COMMIT;
