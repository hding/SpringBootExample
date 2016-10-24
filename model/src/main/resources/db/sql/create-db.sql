CREATE SCHEMA ecom;

CREATE TABLE ecom.customer (
  id         INT PRIMARY KEY,
  name VARCHAR(30) NOT NULL,
  phone_number VARCHAR(20),
  email_address  VARCHAR(50)
);



CREATE TABLE ecom.book (
  id         INT PRIMARY KEY,
  title VARCHAR(100) ,
  author VARCHAR(30) ,
  ISBN VARCHAR(30) NOT NULL,
);


CREATE TABLE ecom.customer_book (
  id         INT PRIMARY KEY,
  customer_id INT NOT NULL,
  book_id INT NOT NULL
);


ALTER TABLE ecom.customer_book
ADD FOREIGN KEY (customer_id) 
REFERENCES ecom.customer(id);

ALTER TABLE ecom.customer_book
ADD FOREIGN KEY (book_id) 
REFERENCES ecom.book(id);
