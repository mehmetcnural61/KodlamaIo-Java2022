primary key
Unique key
Foreign key

-- Case insensitive 

-- <= yorum satiri

--ANSII

--KDS (Karar Destek Sistemleri)


SELECT * FROM Customers;

SELECT CustomerName,ContactName,Address FROM Customers;
--alias
SELECT CustomerName Adi,ContactName İletisimAdi,Address Adresi FROM Customers;

SELECT * FROM Customers where city= 'UK'

SELECT * FROM Products

SELECT * FROM Products where CategoryID=1 

SELECT * FROM Products where CategoryID=1 or CategoryID=3 

SELECT * FROM Products where CategoryID=1 and  Unit>=10

--10'dan farklı olanları <>
SELECT * FROM Products where CategoryID=1 and  Unit<>10

SELECT * FROM Products order by Productname

SELECT * FROM Products order by CategoryID	,Productname

SELECT * FROM Products order by Price asc --asc is default , ascending (artan)

SELECT * FROM Products order by Price desc  --descending  (düşen)

SELECT * FROM Products where CategoryID=1 order by Price desc

SELECT count(*) from products --kaç ürünümüz var?

SELECT count(*) from products where categoryID=2

SELECT count(*) Adet from products where categoryID=2 --Adet alias

SELECT categoryId from products group by CategoryId --bütün kategoriler tekrar etmiycek şekilde sırala

--bütün kategoriler tekrar etmiycek şekilde sırala ve kaç ürün olduğunu göster
SELECT categoryId,count(*) from products group by CategoryId 

--10 taneden az ürün  olan kategorileri ver
SELECT categoryId,count(*) from products group by CategoryId having count(*)<10

--sayisi 10'dan küçük price 20'den fazla
SELECT categoryId,count(*) from products  where Price>20 group by CategoryId having count(*)<10


SELECT * FROM Products inner join Categories

--kosulumuzu on ile ekliyoruz
SELECT * FROM Products inner join Categories on Products.CategoryId=Categories.CategoryId

SELECT Products.ProductID,Products.ProductName,Products.Unit,Categories.CategoryID from 
Products inner join Categories on Products.CategoryID =Categories.CategoryID

--DTO Data Transformation Object

SELECT Products.ProductID,Products.ProductName,Products.Unit,Categories.CategoryID from 
Products inner join Categories on Products.CategoryID =Categories.CategoryID where Products.Unit<10

-- Inner Join: Sadece iki tabloda da eşleşenleri bir araya getirir.
-- Eşleşmeyen veriyi getirmez

SELECT * FROM Products inner join OrderDetails

SELECT * FROM Products p inner join OrderDetails od on p.ProductID=od.ProductID

-- Inner Join:Sadece eşlenenleri getirir iki tabloda eşleşiyorsa getirir!!

--Solda olup sağda olmayanlarıda getir
SELECT * FROM Products p left join OrderDetails od on p.ProductID=od.ProductID

SELECT * FROM Customers c inner join Orders o on c.CustomerId=o.CustomerID

--Solda olup sağda olmayanlarıda getir.
--Sana Özel ilk siparişte %10 indirim
SELECT * FROM Customers c left join Orders o on c.CustomerId=o.CustomerID

--Sana Özel ilk siparişte %10 indirim
SELECT * FROM Customers c left join Orders o on c.CustomerId=o.CustomerID where o.CustomerID is null

SELECT * FROM Products p left join OrderDetails od 
on p.ProductID=od.ProductID inner join Orders o on o.OrderID=od.OrderID



















