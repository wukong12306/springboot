
<head>
    <title>Bootstrap 实例</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body style="background-image: none;">
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="body_wrap">
    <div class="container">
        <div class="alert alert-success text-center" role="alert">springBoot-jsp</div>
        <table class="table table-striped table-bordered">

            <c:forEach var="learn" items="${list}">
                <tr class="text-info">
                    <td >${learn}</td>
                    <td >${learn}</td>
                    <td >${learn}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>