INSERT INTO categories (category_name, description) VALUES
('Electronics', 'Devices and gadgets such as phones, laptops, and cameras.'),
('Books', 'Various genres including fiction, non-fiction, and educational materials.'),
('Clothing', 'Men and women clothing including shirts, pants, and accessories.'),
('Home & Kitchen', 'Household items, kitchen appliances, and home decor.'),
('Sports & Outdoors', 'Sports equipment, outdoor gear, and fitness products.'),
('Toys & Games', 'Toys for children of all ages and various games.'),
('Beauty & Personal Care', 'Cosmetics, skincare products, and personal hygiene items.'),
('Automotive', 'Car accessories, parts, and tools for vehicle maintenance.'),
('Health & Wellness', 'Health supplements, wellness products, and medical equipment.'),
('Pet Supplies', 'Products for pets including food, toys, and accessories.');

INSERT INTO products (product_name, description, price, stock, category_id, created_at, updated_at) VALUES
('Computer', 'Computer machine', '2000', '3', '1', '01/06/24', '01/06/24'),
('Deja de ser tú', 'Digital book', '40', '10', '2', '05/06/24', '05/06/24'),
('Jump rope', 'Professional jump rope', '20', '5', '5', '10/06/24', '10/06/24'),
('Straps', 'Gymnasium attachment', '15', '40', '5', '14/06/24', '14/06/24');