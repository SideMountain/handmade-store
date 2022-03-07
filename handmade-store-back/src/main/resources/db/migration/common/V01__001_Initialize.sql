-- install uuid extension
CREATE EXTENSION IF NOT EXISTS "pgcrypto" WITH SCHEMA public;

CREATE TABLE item (
  id CHAR(36) PRIMARY KEY DEFAULT public.gen_random_uuid(),
  item_category VARCHAR(100) NOT NULL,
  name VARCHAR(100) NOT NULL,
  amount INTEGER NOT NULL,
  images JSONB,
  sort_number INTEGER NOT NULL,
  ${commonColumns}
);

INSERT INTO item (item_category, name, amount, sort_number) VALUES('category_1', 'item_sample', 100, 1);