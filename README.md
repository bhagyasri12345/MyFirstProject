# MyFirstProject
It is based on Course management System


Developed a course management system. In this system, entities are course, student. System should be able to handle many courses which can be enrolled by many students by a single professor. Basic requirements are:

Students can enroll in a course and later also withdraw from the course.
Each course must be assigned a faculty.
Ability to modify any detail of the course.

Student will have the following attribute and functions to register

USER NAME : String UNIQUE
Password : String 
EMAIL : String
Contact_No : INTEGER
ID : INTEGER

Student will have the following attribute and functions to login.
USER NAME : String UNIQUE
Password : String 

Student can enroll courses with following attribute.
Course_Name : String
Course_Duration:Integer
Course_OutComes: String


Course_assigned : list of courses
ShowProf : Display all details of the professor
Course will have the following attribute and functions



Trivia:

There will NOT be any two students, course and professor with the same name.
You should add methods in these classes for writing good object oriented code. Try to make a modular code
Operation string and other string are case insensitive
Handle all corner cases such as enrolling in an enrolled course and un-enrolling a course which was not enrolled etc. It should display proper error message.
