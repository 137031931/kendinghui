<%--
  Created by IntelliJ IDEA.
  User: le
  Date: 2018/12/16
  Time: 上午12:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="/css/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="/css/themes/icon.css">
    <script type="text/javascript" src="/js/jquery.min.js"></script>
    <script type="text/javascript" src="/js/jquery.easyui.min.js"></script>
</head>
<body class="easyui-layout">
    <div data-options="region:'west',title:'菜单',split:true,minWidth:180" style="width:180px;">
        <ul id="tt" class="easyui-tree">
            <li>
                <span>商品管理</span>
                <ul>
                    <li><span>商品列表</span></li>
                    <li><span>商品添加</span></li>
                </ul>
            </li>
        </ul>
    </div>
    <div data-options="region:'center'" style="padding:5px;background:#eee;">
        <div id="tabs" class="easyui-tabs">
            <div title="首页" style="padding:20px;display:none;">
                首页
            </div>

        </div>
    </div>
<script>
    $('#tt').tree({
        onClick: function(node){
            var tabs = $("#tabs");
            var tab = tabs.tabs("getTab",node.text);
            if(tab){
                tab.tabs("select",node.text)
            }{
                // add a new tab panel
                $('#tt').tabs('add',{
                    title:'node.txt',
                    content:'Tab Body',
                    closable:true
                });
            }
        }
    });
</script>
</body>
</html>
