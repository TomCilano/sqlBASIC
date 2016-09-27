package data;

/**
 * Created by Tom on 9/27/16.
 */
public class sqlText {
}
  /*/  CREATE TABLE `User` (
        `firstName` varchar NOT NULL,
        `lastName` varchar NOT NULL,
        `email` varchar NOT NULL,
        `login` varchar NOT NULL AUTO_INCREMENT,
        `password` varchar NOT NULL,
        PRIMARY KEY (`login`)
        );

        CREATE TABLE `blogs` (
        `title` varchar NOT NULL,
        `creationDate` varchar NOT NULL
        );

        CREATE TABLE `entries` (
        `title` varchar NOT NULL,
        `creation date` varchar NOT NULL,
        `text` varchar NOT NULL
        );

        ALTER TABLE `blogs` ADD CONSTRAINT `blogs_fk0` FOREIGN KEY (`title`) REFERENCES `User`(`login`);

        ALTER TABLE `entries` ADD CONSTRAINT `entries_fk0` FOREIGN KEY (`text`) REFERENCES `blogs`(`title`);
