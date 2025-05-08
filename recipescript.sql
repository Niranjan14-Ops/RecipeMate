-- create database recipie_managementrecipes;
use recipie_management;
-- create table users(
--     id INT AUTO_INCREMENT PRIMARY KEY,
--     username VARCHAR(50) NOT NULL UNIQUE,
--     password VARCHAR(255) NOT NULL
-- );
CREATE TABLE recipes (
   rid INT AUTO_INCREMENT PRIMARY KEY,
    recipe_name VARCHAR(100) NOT NULL,
    ingredients LONGTEXT NOT NULL,
    process LONGTEXT NOT NULL,
    image_url VARCHAR(255));

-- select * from recipes;