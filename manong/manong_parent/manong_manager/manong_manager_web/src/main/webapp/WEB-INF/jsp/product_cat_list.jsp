<%--
  Created by IntelliJ IDEA.
  User: le
  Date: 2018/12/20
  Time: 下午3:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品分类</title>
</head>
<body>
<ul id="productCategory" class="easyui-tree">
    <script type="text/javascript">
        $(function () {
            $('#tt').tree({
                    url: "/product_category/list",
            });
        });

    </script>
</ul>
</body>
</html>
