Crypto Application for encoding/decoding text. It can encode/decode Morse, Caesar, Vigenere, VigenereOverCaesar.
Also, all operations are saved in database(postgreSQL is used).
There is security module - login, registration are included on /login and /registration. Also, logged user can see his user info and logout button on /logout-page. /admin-page is able only for admins. 
Admin has more rights than ordinary user(he can see history and analytic categories - /history and /analytics)
I used java, Spring Boot, Spring JPA, Spring Security, Thymeleaf, HTML, CSS and a little bit of JS, and Postresql as a database.
