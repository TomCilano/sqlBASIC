package data;

/**
 * Created by Tom on 9/27/16.
 */
public class sqlText {
}
  /*/ CREATE TABLE `User` (
	`firstName` varchar NOT NULL,
	`lastName` varchar NOT NULL,
	`email` varchar NOT NULL,
	`login` varchar NOT NULL UNIQUE,
	`password` varchar NOT NULL,
	`id` int NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `blogs` (
	`title` varchar NOT NULL,
	`creationDate` varchar NOT NULL,
	`id` int NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `entries` (
	`title` varchar NOT NULL,
	`creation date` varchar NOT NULL,
	`text` varchar NOT NULL,
	`id` int NOT NULL,
	PRIMARY KEY (`id`)
);

ALTER TABLE `blogs` ADD CONSTRAINT `blogs_fk0` FOREIGN KEY (`title`) REFERENCES `User`(`id`);

ALTER TABLE `entries` ADD CONSTRAINT `entries_fk0` FOREIGN KEY (`text`) REFERENCES `blogs`(`id`);
