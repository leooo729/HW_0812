# HW_0812
## H2 DataBase
* 登入網址 : http://localhost:8080/h2-console / JDBC URL : jdbc:h2:mem:order 
* Account : sa / Password : sa
* 透過resources中的 data.sql 將資料存入資料庫
## SpringBoot-MVC-Restful-H2-Database
1. 取得所有DB訂單資料 : http://localhost:8080/order
2. 透過訂單ID取得目標DB訂單資料 : http://localhost:8080/order/:id
3. 創建新DB訂單資料 : http://localhost:8080/order
4. 透過訂單ID修改目標DB訂單資料 : http://localhost:8080/order/:id
5. 透過訂單ID刪除目標DB訂單資料 : http://localhost:8080/order/:id
