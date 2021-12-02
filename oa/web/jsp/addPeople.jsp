<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 帅帅的小石头
  Date: 2021/11/26
  Time: 20:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312">
    <title>添加联系人</title>
    <link href="../css/style.css" rel="stylesheet" type="text/css">
    <link rel="icon" href="https://zhaoyushi.oss-cn-beijing.aliyuncs.com/img/IMG_2347(20210227-020611).JPG">
    <script type="text/javascript" language="JavaScript1.2" src="../js/util.js"></script>
</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
<form method="post" action="/addPeople">

    <table width="100%"  border="0" align="center" cellpadding="0" cellspacing="0">
        <tr>
            <td width="2%" valign="middle" background="../images/bg_03.gif">&nbsp;</td>
            <td width="2%" valign="middle" background="../images/bg_03.gif"><img src="../images/main_28.gif" width="9" height="9" align="absmiddle"></td>
            <td height="30" valign="middle" background="../images/bg_03.gif"><font color="#FFFFFF">添加联系人</font></td>
        </tr>
    </table>
    <table width="100%" border="0" align="center" cellpadding="0" cellspacing="0" class="table01">
        <tr>
            <td width="15%" class="td_02"><div align="center">通&nbsp;&nbsp;讯&nbsp;&nbsp;组</div></td>
            <td class="td_02"><div align="center">
                <input name="sort" type="text" class="input" style="width:80% ">
            </div></td>
            <td width="10%" class="td_02">&nbsp;</td>
            <td width="35%" class="td_02">&nbsp;</td>
        </tr>
        <tr>
            <td width="10%" class="td_02"><div align="center">姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名</div></td>
            <td class="td_02"><div align="center">
                <input name="name" type="text" class="input" style="width:80% ">
            </div></td>
            <td width="10%" class="td_02"><div align="center">性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别</div></td>
            <td width="35%" class="td_02"><div align="center">
                <select name="sex" class="input" style="width:80% ">
                    <option value="男" selected>男</option>
                    <option value="女">女</option>
                </select>
            </div></td>
        </tr>
        <tr>
            <td class="td_02"><div align="center">单&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;位</div></td>
            <td class="td_02"><div align="center">
                <input name="unit" type="text" class="input" style="width:80% ">
            </div></td>
            <td class="td_02"><div align="center">部&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;门</div></td>
            <td width="40%" class="td_02"><div align="center">
                <input name="department" type="text" class="input" style="width:80% ">
            </div></td>
        </tr>
        <tr>
            <td class="td_02"><div align="center">移动电话</div></td>
            <td class="td_02"><div align="center">
                <input name="iphone" type="text" class="input" style="width:80% ">
            </div></td>
            <td class="td_02"><div align="center">家庭电话</div></td>
            <td class="td_02"><div align="center">
                <input name="telephone" type="text" class="input" style="width:80% ">
            </div></td>
        </tr>
        <tr>
            <td class="td_02"><div align="center">电子邮箱</div></td>
            <td class="td_02"><div align="center">
                <input name="email" type="text" class="input" style="width:80% ">
            </div></td>
            <td class="td_02"><div align="center">家庭住址</div></td>
            <td class="td_02"><div align="center">
                <input name="address" type="text" class="input" style="width:80% ">
            </div></td>
        </tr>

    </table>
    <br>
    <table width="100%"  border="0" cellpadding="0" cellspacing="0">
        <tr>
            <td class="td_page">      <div align="center">
                <input name="Submit" type="submit" class="buttonface02" value="  添加  ">
                <input name="Submit2" type="reset" class="buttonface02" value="  重置  ">
                <input name="Submit3" type="button" class="buttonface02" value="  关闭  " onClick="window.close()">
            </div></td>
        </tr>
    </table>
</form>
</body>
</html>

