Created by IntelliJ IDEA.
User: phong
Date: 10/31/2022
Time: 10:11 AM
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TGP-Shop</title>
</head>
<body>
<div align="center">
    <form action="/create" method="post">
        <table>
            <tr>
                <td>Nhập id</td>
                <td><input name="id" placeholder="Nhập id"></td>
            </tr>
            <tr>
                <td>Nhập tên</td>
                <td><input name="name" placeholder="Nhập tên"></td>
            </tr>
            <tr>
                <td>Nhập đường dẫn ảnh</td>
                <td><input name="img" placeholder="Nhập đường dẫn ảnh"></td>
            </tr>
            <tr>
                <td>Nhập Giá</td>
                <td><input name="price" placeholder="Nhập Giá"></td>
            </tr>
            <tr>
                <td>Nhập Số Lượng</td>
                <td><input name="amount" placeholder="Nhập Giá"></td>
            </tr>
            <tr>
                <td>Nhập Chi tiết mô tả </td>
                <td><input name="amount" placeholder="Nhập Chi tiết"></td>
            </tr>
        </table>
        <button type="submit"  class="btn btn-success">Submit</button>
    </form>
</div>
</body>
</html>
