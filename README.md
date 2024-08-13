# Jdbc_Practice
##Regiser class

```shell
Class.forname("com.mysqlo.jdbc.Driver");
```
##Dtabase Creation & Connection

```shell
  String url="jdbc:mysql://localhost:3306/database_name";
  String UserName=root;
  Sytring  password="Sa******";
  Connection con=DriverManager.getConnection(url,username,password);
```

##create Statement & query
```
 String q = "CREATE TABLE emp(id INT, name VARCHAR(10))";
Statement stmt = con.createStatement();
```
##Execute
```
 stmt.executeUpdate(q);
```
##close
```
con.close();
```

