DROP TABLE IF EXISTS Taco_Ingredients;
DROP TABLE IF EXISTS Taco_Order_Tacos;
DROP TABLE IF EXISTS Ingredient;
DROP TABLE IF EXISTS Taco;
DROP TABLE IF EXISTS Taco_Order;

CREATE TABLE IF NOT EXISTS Ingredient
(
    id   varchar(4) PRIMARY KEY NOT NULL,
    name varchar(25)            NOT NULL,
    type varchar(10)            NOT NULL
);

CREATE TABLE IF NOT EXISTS Taco
(
    id         SERIAL PRIMARY KEY,
    name       varchar(50) NOT NULL,
    created_at timestamp   NOT NULL
);

CREATE TABLE IF NOT EXISTS Taco_Ingredients
(
    taco       bigint     NOT NULL,
    ingredient varchar(4) NOT NULL,
    FOREIGN KEY (taco) REFERENCES Taco (id),
    FOREIGN KEY (ingredient) REFERENCES Ingredient (id)
);

CREATE TABLE IF NOT EXISTS Taco_Order
(
    id              SERIAL PRIMARY KEY,
    delivery_Name   varchar(50) NOT NULL,
    delivery_Street varchar(50) NOT NULL,
    delivery_City   varchar(50) NOT NULL,
    delivery_State  varchar(2)  NOT NULL,
    delivery_Zip    varchar(10) NOT NULL,
    cc_Number       varchar(16) NOT NULL,
    cc_Expiration   varchar(5)  NOT NULL,
    cc_CVV          varchar(3)  NOT NULL,
    placed_At       timestamp   NOT NULL
);

CREATE TABLE IF NOT EXISTS Taco_Order_Tacos
(
    taco_Order bigint NOT NULL,
    taco       bigint NOT NULL,
    FOREIGN KEY (taco_Order) REFERENCES Taco_Order (id),
    FOREIGN KEY (taco) REFERENCES Taco (id)
);
