-- liquibase formatted sql
-- changeset Dan Tsarenko:2024-05-07_20-30_1
CREATE TABLE IF NOT EXISTS "product_info" (
   id BIGSERIAL PRIMARY KEY,
   product_id BIGSERIAL UNIQUE NOT NULL,
   calories INTEGER NOT NULL,
   proteins INTEGER NOT NULL,
   fats INTEGER NOT NULL,
   carbohydrates INTEGER NOT NULL
)
-- changeset Dan Tsarenko:2024-05-07_20-35_2
CREATE TABLE IF NOT EXISTS "product"(
   id BIGSERIAL PRIMARY KEY,
   name VARCHAR(256) UNIQUE NOT NULL,
   description TEXT NOT NULL,
   price NUMERIC(10,2) NOT NULL,
   amount INTEGER NOT NULL
)