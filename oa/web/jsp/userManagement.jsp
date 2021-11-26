<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 帅帅的小石头
  Date: 2021/11/26
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312">
    <title>用户管理</title>
    <link href="../css/style.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" language="JavaScript1.2" src="../js/util.js"></script>
</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
<center>

    <table width="100%"  border="0" align="center" cellpadding="0" cellspacing="0">
        <tr>
            <td width="2%" valign="middle" background="../images/bg_03.gif">&nbsp;</td>
            <td width="2%" valign="middle" background="../images/bg_03.gif"><img src="../images/main_28.gif" width="9" height="9" align="absmiddle"></td>
            <td height="30" valign="middle" background="../images/bg_03.gif"><font color="#FFFFFF">个人通讯录管理</font></td>
        </tr>
    </table>
    <br>
    <table width="95%" border="0" align="center" cellpadding="0" cellspacing="0" class="table01">
        <tr>
            <td colspan="2" class="td_02"><SPAN class=td_title>通讯录查询</SPAN></td>
            <td class="td_02">&nbsp;</td>
            <td class="td_02">&nbsp;</td>
        </tr>
        <tr>
            <td width="10%" class="td_02">通&nbsp;&nbsp;讯&nbsp;&nbsp;组</td>

                <td width="40%" class="td_02"><select name="select2" class="box" style="width:95% ">
                    <c:forEach var="so" items="${sort}">
                        <option>${so.sort}</option>
                    </c:forEach>
                </select>
                </td>

            <td width="10%" class="td_02">姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名</td>
            <td class="td_02"><input name="textfield3" type="text" class="input" style="width:95% "></td>
        </tr>
        <tr>
            <td class="td_02">单&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;位</td>
            <td class="td_02"><input name="textfield2" type="text" class="input" style="width:95% "></td>
            <td class="td_02">部&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;门 </td>
            <td class="td_02"><input name="textfield4" type="text" class="input" style="width:95% "></td>
        </tr>
        <tr>
            <td class="td_02">性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别</td>
            <td class="td_02"><select name="select3" class="box" style="width:95% ">
                <option value="1">男</option>
                <option value="0">女</option>
            </select></td>
            <td class="td_02">邮&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;件 </td>
            <td class="td_02"><input name="textfield5" type="text" class="input" style="width:95% "></td>
        </tr>
        <tr>
            <td class="td_02">家庭住址</td>
            <td colspan="3" class="td_02"><input name="textfield6" type="text" class="input" style="width:89% ">      <input name="Submit3" type="submit" class="buttonface" value="  查询  ">
            </td>
        </tr>
    </table>
    <br>
    <form method="post" action="/deletePeople">
        <table width="95%"  border="0" cellpadding="0" cellspacing="0">
            <tr>
                <td class="td_page">      <div align="right">
                    <input name="Submit" type="submit" class="buttonface02" value="添加联系人" onClick="javascript:windowOpen('jsp/addPeople.jsp','','',500,420,'no','yes','100','100')">
                    <input name="Submit2" type="submit" class="buttonface02" value="删除所选联系人">
                </div></td>
            </tr>
        </table>
        <table width="95%"  border="0" cellpadding="0" cellspacing="0" class="table02" align="center">
            <tr>
                <td width="37%" align="right"><div align="left"></div></td>
                <td width="63%" height="30" align="right"><img src="../images/1.gif" width="4" height="5" align="absmiddle"> 首页　 <img src="../images/2.gif" width="3" height="5" align="absmiddle"> 上一页　 <img src="../images/2-2.gif" width="3" height="5" align="absmiddle"> 下一页　 <img src="../images/3.gif" width="4" height="5" align="absmiddle"> 末页　　共 1 页 1 条记录</td>
            </tr>
        </table>
        <table width="95%" border="0" cellpadding="2" cellspacing="0" class="table01">
            <tr>
                <td class="td_top"><input name="chk" type="checkbox" id="chk" onClick="selectAllByChk(chk,checkbox)" value="checkbox0"></td>
                <td class="td_top">联系人</td>
                <td class="td_top">通讯组</td>
                <td class="td_top">E-mail</td>
                <td class="td_top">办公电话</td>
                <td class="td_top">移动电话</td>
                <td class="td_top">修改</td>
            </tr>
            <c:forEach var="people" items="${list}">
                <tr>
                    <td class="td_02"><input type="checkbox" name="checkbox" value="checkbox"></td>
                    <td class="td_02"><a href="../person_manage/&#21592;&#24037;&#35814;&#32454;&#20449;&#24687;.htm">${people.name}</a></td>
                    <td class="td_02">${people.sort}</td>
                    <td class="td_02">${people.email}</td>
                    <td class="td_02">${people.telephone}</td>
                    <td class="td_02">${people.iphone}</td>
                    <td class="td_02"><a href="#" onClick="javascript:windowOpen('修改联系人.htm','','',500,420,'no','yes','100','100')">修改</a></td>
                    <td class="td_02"><a href="javascript:void (0);" onClick="deletePeople(${people.id})">删除</a><td/>
                </tr>
            </c:forEach>
        </table>
    </form>
    <script type="text/javascript">
        function deletePeople(id) {
            if(window.confirm("确定删除？")){
                location.href="/deletePeople?id="+id;
            }
        }
    </script>
</center>
</body>
</html>

