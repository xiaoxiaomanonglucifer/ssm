<%--
  Created by IntelliJ IDEA.
  User: 曾平平
  Date: 2023/8/27
  Time: 17:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="static/lib/layui/layui.js"></script>
    <link rel="stylesheet" href="static/lib/layui/css/layui.css">
    <title>
    </title>

</head>
<body>
<table id="demo"></table>

<script id="currentTableBar" type="text/html">
    <a class="layui-btn layui-btn-xs data-count-edit" lay-event="edit"><i
            class="layui-icon layui-icon-edit"></i>编辑</a>
    <a class="layui-btn layui-btn-xs layui-btn-danger data-count-delete" lay-event="delete"><i
            class="layui-icon layui-icon-close"></i>删除</a>
</script>
<script>
    layui.use('table', function(){
        var table = layui.table;
        //基本实例
      var tableIns=  table.render({
            elem: '#demo'//绑定容器
            ,url: '/stu/findStudentJSON' //设置数据接口
            ,page: true //开启分页
            ,cols: [[ //在表头设置对应的字段
                {field: 'id', title: 'ID', width:80, sort: true, fixed: 'left'}
                ,{field: 's_studentid', title: '学号', width:80}
                ,{field: 's_name', title: '姓名', width:80, sort: true}
                ,{field: 's_sex', title: '性别', width:80}
                ,{field: 's_age', title: '年龄', width: 177}
                ,{field: 's_phone', title: '电话', width: 80, sort: true}
                ,{field: 's_classid', title: '班级编号', width: 80, sort: true}
                ,{field: 's_classname', title: '班级名', width: 80}
                ,{field: 's_dormitoryid', title: '寝室编号', width: 135, sort: true}
                ,{field: 'wealth', title: '操作', toolbar: '#currentTableBar',width: 135, sort: true}
            ]],
            done: function (res, curr, count) {
                //判断当前页码是否是大于1并且当前页的数据量为0
                if (curr > 1 && res.data.length == 0) {
                    var pageValue = curr - 1;
                    //刷新数据表格的数据
                    tableIns.reload({
                        page: {curr: pageValue}
                    });
                }
            }
        });
    });
</script>
</body>
</html>
