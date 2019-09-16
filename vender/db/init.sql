DROP DATABASE IF EXISTS CENTER;
CREATE DATABASE CENTER DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE CENTER;

SET CHARACTER_SET_CLIENT = 'UTF8';
SET CHARACTER_SET_CONNECTION = 'UTF8';
SET CHARACTER_SET_DATABASE = 'UTF8';
SET CHARACTER_SET_RESULTS = 'UTF8';
SET CHARACTER_SET_SERVER = 'UTF8';

CREATE TABLE WEEK_PLANS
(
    ID         VARCHAR(36) NOT NULL COMMENT 'WEEK PLAN PRIMARY ID',
    WEEK_NUM   INT UNIQUE COMMENT 'WEEK NUM',
    CONTENT    VARCHAR(9999) COMMENT 'CONTENT',
    AWARD      VARCHAR(999) COMMENT 'AWARD',
    PUNISHMENT VARCHAR(999) COMMENT 'PUNISHMENT',
    PRIMARY KEY (ID)
);