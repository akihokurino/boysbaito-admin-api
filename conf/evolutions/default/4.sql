# --- !Ups
ALTER TABLE entries ADD COLUMN created_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP;
# --- !Downs
ALTER TABLE entries DROP COLUMN created_at;