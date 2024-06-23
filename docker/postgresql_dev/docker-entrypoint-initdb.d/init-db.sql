ALTER SYSTEM SET log_statement = 'all';
ALTER SYSTEM SET log_line_prefix = '%a %u@%d ';

create user hibernate_json with password 'PazZw0rd';
create database hibernate_json with owner hibernate_json;
