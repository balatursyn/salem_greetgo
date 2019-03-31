# Salem Alem application
##Spring Boot + jQuery + MyBatis + H2

### Guides
To run the project make the following steps:

1. Download the project and execute the command: git clone https://github.com/balatursyn/salem_greetgo.git
2. Open the directory "salem_project" and execute the command (process will stop on 80%): gradle bootRun
3. Project runned on localhost on port 8080, Go to the browser and type: http://localhost:8080/
4. Now, you will see the sentence "Salem alem!", which from database<br>

####To change information in database perform next steps
1. Type in  browser: http://localhost:8080/h2-console<br>
2. Check the settings:
                <tt><td>Saved Settings: Generic H2 (Embedded)<br>
                Driver Class: org.h2.Driver<br>
                JDBC URL:  jdbc:h2:mem:testdb<br>
                User Name: sa<br>
                No password<br></td></tt>
                
3. In the free area type the command (in brackets enter new sentence) : UPDATE info SET text = '' WHERE id = 1;<br>
4. Press the button RUN
5. Now go to the http://localhost:8080/ and check changes
