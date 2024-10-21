CREATE TABLE member
(
    id              BIGINT AUTO_INCREMENT PRIMARY KEY,
    username        VARCHAR(20)  NOT NULL UNIQUE,
    password        VARCHAR(20)  NOT NULL,
    email           VARCHAR(50)  NOT NULL UNIQUE,
    phone_number    VARCHAR(11)  NOT NULL UNIQUE,
    address         VARCHAR(100) NOT NULL,
    gender          ENUM('MALE', 'FEMALE') NOT NULL,
    birth_date      DATE         NOT NULL,
    grade           ENUM('BRONZE', 'SILVER', 'GOLD', 'PLATINUM', 'DIAMOND') NOT NULL,
    purchase_amount INT          NOT NULL DEFAULT 0,
    created_at      TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at      TIMESTAMP NULL ON UPDATE CURRENT_TIMESTAMP
);