<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>信息</title>
    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>学生信息列表</small>
                </h1>
            </div>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>学号</th>
                    <th>姓名</th>
                    <th>成绩</th>
                    <th>专业</th>
                    <th>详情</th>
                </tr>
                </thead>
                <tbody>

<%--                <c:forEach var="stu" items="list">--%>
<%--不能用循环遍历，因为是对象，而不是集合--%>
                    <tr>
                        <td>
                                ${list.id}
                        </td>
                        <td>${list.name}</td>
                        <td>${list.grade}</td>
                        <td>${list.direction.name}</td>
                        <td>${list.direction.introductions}</td>
                    </tr>
<%--                </c:forEach>--%>


                </tbody>
            </table>
        </div>
    </div>

</div>

</body>
</html>
