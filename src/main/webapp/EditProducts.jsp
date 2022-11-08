
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<div align="center">
  <form action="/edit" method="get" >
    <h1>Edit Products</h1>
    <table>
      <tr>
        <td>Nhập id</td>
        <td><input name="id" placeholder="Nhập id" value="${p.id}" readonly></td>
      </tr>
      <tr>
        <td>Nhập tên</td>
        <td><input name="name" placeholder="Nhập tên" value="${p.name}"></td>
      </tr>
      <tr>
        <td>Nhập đường dẫn ảnh</td>
        <td><input name="img" placeholder="Nhập đường dẫn ảnh" value="${p.img}"></td>
      </tr>
      <tr>
        <td>Nhập Giá</td>
        <td><input name="price" placeholder="Nhập Giá" value="${p.price}"></td>
      </tr>
      <tr>
        <td>Nhập Số Lượng</td>
        <td><input name="amount" placeholder="Nhập Số Lượng" value="${p.amount}"></td>
      </tr>
      <tr>
        <td>Nhập Chi tiết</td>
        <td><input name="detail" placeholder="Nhập Giá" value="${p.detail}"></td>
      </tr>
    </table>
    <button type="submit">Submit</button>
  </form>
</div>
</body>
</html>
