<%--
  Created by IntelliJ IDEA.
  User: 帅帅的小石头
  Date: 2021/11/23
  Time: 20:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>all</title>
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
                <c:forEach var="stu" items="${list}">
                    <tr>
                        <td>
                                ${stu.id}
                        </td>
                        <td>${stu.bookName}</td>
                        <td>${stu.bookCounts}</td>
                        <td>${stu.detail}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

</div>
${list}
</body>
</html>
