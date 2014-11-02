CREATE TABLE courses
(
    idCourse INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    Title VARCHAR(45) NOT NULL,
    idProfessor INT,
    FOREIGN KEY (idProfessor) REFERENCES professors (idProfessor) ON DELETE CASCADE ON UPDATE CASCADE
);
CREATE UNIQUE INDEX ID_Course_UNIQUE ON courses (idCourse);
CREATE INDEX CoursesProfessorsFK_idx ON courses (idProfessor);
CREATE TABLE professors
(
    idProfessor INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    Surname VARCHAR(45) NOT NULL
);
CREATE UNIQUE INDEX ID_Professor_UNIQUE ON professors (idProfessor);
