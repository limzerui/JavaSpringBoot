-- Table creation (optional, handled by Hibernate already)
CREATE TABLE IF NOT EXISTS product (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    desc VARCHAR(255),
    brand VARCHAR(255),
    price DECIMAL(38,2),
    category VARCHAR(255),
    release_date TIMESTAMP,
    available BOOLEAN NOT NULL,
    quantity INT NOT NULL
);

-- Sample data
INSERT INTO product (name, desc, brand, price, category, release_date, available, quantity)
VALUES
('Laptop', 'A high-end gaming laptop', 'BrandX', 1999.99, 'Electronics', CURRENT_TIMESTAMP, TRUE, 5),
('Headphones', 'Wireless noise-cancelling headphones', 'SoundPro', 299.99, 'Audio', CURRENT_TIMESTAMP, TRUE, 20),
('Smartphone', 'Latest model smartphone', 'TechGiant', 999.99, 'Electronics', CURRENT_TIMESTAMP, TRUE, 10),
('Coffee Mug', 'Insulated coffee mug', 'HomeEssentials', 15.99, 'Kitchen', CURRENT_TIMESTAMP, TRUE, 50),
('Gaming Mouse', 'Ergonomic gaming mouse with RGB lighting', 'ProGear', 59.99, 'Accessories', CURRENT_TIMESTAMP, TRUE, 30);