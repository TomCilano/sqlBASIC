package data;

/**
 * Created by Tom on 9/27/16.
 */
public class  sqlText {
}
  /*  CREATE TABLE IF NOT EXISTS User (
usr_id IDENTITY,
usr_firstName VARCHAR,
usr_lastName VARCHAR,
usr_email VARCHAR,
usr_password VARCHAR,
 usr_login VARCHAR UNIQUE )



CREATE TABLE IF NOT EXISTS Blogs (
blo_id IDENTITY,
blo_title VARCHAR,
blo_date INT,
blo_use_id INT,
FOREIGN KEY (blo_usr_id)
REFERENCES users(usr_id))

CREATE TABLE IF NOT EXISTS entries (
ent_id IDENTITY,
ent_title VARCHAR,
ent_text VARCHAR,
ent_date INT,
ent_blo_id INT,
FOREIGN KEY (ent_blo_id)
REFERENCES blogs(blo_id))