<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Twitter Bootstrap Typeahead Extension Demo</title>
    <link href="${ctx}/static/css/prettify.css" rel="stylesheet" />
    <link href="${ctx}/static/css/bootstrap.css" rel="stylesheet">
    <link href="${ctx}/static/css/demo.css" rel="stylesheet">

    <script src="${ctx}/static/js/prettify.js" type="text/javascript"></script>
    <script src="${ctx}/static/js/jquery-1.8.0.min.js" type="text/javascript"></script>
    <script src="${ctx}/static/js/mockjax.js" type="text/javascript"></script>
    <script src="${ctx}/static/js/bootstrap-typeahead.js" type="text/javascript"></script>
    <script src="${ctx}/static/js/demo.js" type="text/javascript"></script>
</head>
<body class="container">
<div class="row">
    <div class="well span4">
        <input id="demo4" type="text" class="span4" placeholder="Search cities..." autocomplete="off" />
    </div>
    <pre class="prettyprint span7">
        ajax: {
            url: "ajax/test.do",
            method: "GET",
            triggerLength: 1,
            preProcess: function(data) { // 这个方法非常重要！
                // 本插件要求处理一个javascript对象而不是一个json字符串
                // 同时应当注意 $.parseJSON方法要求的json字符串必须用双引号引用属性名！
                return $.parseJSON(data);
            }
        },
        itemSelected: function(item, value, text) {
            alert(item);
            alert(value);
            alert(text);
        }
</pre>
</div>
</body>
</html>
