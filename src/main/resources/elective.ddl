CREATE TABLE courses
(
    ID_Course INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    Title VARCHAR(45) NOT NULL,
    ID_Professor INT,
    FOREIGN KEY (ID_Professor) REFERENCES professors (ID_Professor) ON DELETE CASCADE ON UPDATE CASCADE
);
CREATE UNIQUE INDEX ID_Course_UNIQUE ON courses (ID_Course);
CREATE INDEX CoursesProfessorsFK_idx ON courses (ID_Professor);
CREATE TABLE professors
(
    ID_Professor INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    Surname VARCHAR(45) NOT NULL
);
CREATE UNIQUE INDEX ID_Professor_UNIQUE ON professors (ID_Professor);
