CREATE TABLE IF NOT EXISTS Content (
    id INTEGER AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL,
    desc TEXT,
    status VARCHAR(20) NOT NULL,
    content_type VARCHAR(50) NOT NULL,
    date_created TIMESTAMP NOT NULL,
    date_updated TIMESTAMP,
    url VARCHAR(255),
    PRIMARY KEY (id)
);

--INSERT INTO Content (title, desc, status, content_type, date_created)
--VALUES ('My First Post', 'This is my first post', 'IDEA', 'ARTICLE', CURRENT_TIMESTAMP)