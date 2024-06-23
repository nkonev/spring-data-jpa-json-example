CREATE TABLE book_record (
    id BIGSERIAL PRIMARY KEY,
    title VARCHAR(512) NOT NULL,
    author VARCHAR(512) NOT NULL,
    jsonb_content JSONB
);
