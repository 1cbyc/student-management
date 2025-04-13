## for this project, i intend to learn and implement JDBC and CRUD operations using Java and MySQL




anyways, since my java jdk is running, let me quickly setup my `mysql server`, and get `mysql workbench` (since i don't have any other DB GUI on my pc). i want to confirm my `Connector/J` (mysql jdbc driver for .jar file) is working, but then, i still have to even add the mysql jdbc driver to my classpath for it to work on my project.

well, quickly tried to run `mysql -u root -p` to see what's up but it wasn't running, but it did now sha. i don't mysqlconnector java is there, so let me just donwload it manually via https://dev.mysql.com/downloads/connector/j/ as platform independent zip version. then, i added it manually to intelliJ by going to `file > project structure > libraries > click + > choosing java > selecting the '.jar' i downloaded > clicking apply and ok`


So what i did for the db on cli is to create the database and the table. then, i did it like this:

```sql
CREATE DATABASE student_db;

USE student_db;

CREATE TABLE students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    age INT,
    department VARCHAR(100),
    email VARCHAR(100)
);
```

I would be continuing this today. the issue is that i was setting up my windows pc for flutter and needed to do some light work on it for a client before i continue with this.