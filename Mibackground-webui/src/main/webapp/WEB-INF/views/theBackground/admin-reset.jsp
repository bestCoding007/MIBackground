<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html class="no-js">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>小米后台管理</title>
    <meta name="description" content="这是一个 user 页面">
    <meta name="keywords" content="user">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
    <link rel="shortcut icon" href="../img/favicon.ico" type="image/x-icon">
    <link rel="apple-touch-icon-precomposed" href="assets/i/app-icon72x72@2x.png">
    <meta name="apple-mobile-web-app-title" content="Amaze UI"/>
    <link rel="stylesheet" href="../css/assets/css/amazeui.min.css"/>
    <link rel="stylesheet" href="../css/assets/css/admin.css">
</head>
<body>
<!--[if lte IE 9]>
<p class="browsehappy">你正在使用<strong>过时</strong>的浏览器，Amaze UI 暂不支持。 请 <a href="http://browsehappy.com/" target="_blank">升级浏览器</a>
    以获得更好的体验！</p>
<![endif]-->

<header class="am-topbar admin-header">
    <div class="am-topbar-brand">
        <strong>MI</strong>
        <small>小米手机商城后台管理</small>
    </div>

    <button class="am-topbar-btn am-topbar-toggle am-btn am-btn-sm am-btn-success am-show-sm-only"
            data-am-collapse="{target: '#topbar-collapse'}"><span class="am-sr-only">导航切换</span> <span
            class="am-icon-bars"></span></button>

    <div class="am-collapse am-topbar-collapse" id="topbar-collapse">

        <ul class="am-nav am-nav-pills am-topbar-nav am-topbar-right admin-header-list">
            <!--<li><a href="javascript:;"><span class="am-icon-envelope-o"></span> 收件箱 <span class="am-badge am-badge-warning">5</span></a></li>-->
            <li><a href="/reception/MIIndex"><span class="am-icon-exchange"></span> 前台管理 </a></li>
            <li class="am-dropdown" data-am-dropdown>
                <a class="am-dropdown-toggle" data-am-dropdown-toggle href="javascript:;">
                    <span class="am-icon-users"></span> 管理员 <span class="am-icon-caret-down"></span>
                </a>
                <ul class="am-dropdown-content">
                    <li><a href="#"><span class="am-icon-user"></span> 资料</a></li>
                    <li><a href="#"><span class="am-icon-cog"></span> 设置</a></li>
                    <li onclick="safetyOFF()"><a href="javascript:void(0)"><span class="am-icon-power-off"></span>
                        退出</a></li>
                </ul>
            </li>
            <li onclick="toFullscreen()"><a href="javascript:;"><span class="am-icon-arrows-alt"></span> <span
                    class="admin-fullText">开启全屏</span></a></li>
        </ul>
    </div>
</header>

<div class="am-cf admin-main">
    <!-- sidebar start -->
    <div class="admin-sidebar">
        <ul class="am-list admin-sidebar-list">
            <li><a href="/background/theBackground"><span class="am-icon-home"></span> 首页</a></li>
            <li class="admin-parent">
                <a class="am-cf" data-am-collapse="{target: '#collapse-nav'}"><span class="am-icon-user-md"></span>
                    管理员操作 <span class="am-icon-angle-right am-fr am-margin-right"></span></a>
                <ul class="am-list am-collapse admin-sidebar-sub am-in" id="collapse-nav">
                    <%--<li><a href="admin-user.html" class="am-cf"><span class="am-icon-check"></span> 个人资料<span
                            class="am-icon-star am-fr am-margin-right admin-icon-yellow"></span></a></li>--%>
                    <li><a href="/background/addUser" class="am-cf"><span class="am-icon-leaf"></span> 添加管理员</a>
                    <li><a href="/background/reset" class="am-cf"><span class="am-icon-adn"></span> 修改密码</a></li>
                    <li><a href="/background/goodsEntry" class="am-cf"><span class="am-icon-edit"></span> 商品录入</a></li>
                </ul>
            <li onclick="safetyOFF()"><a href="javascript:void(0)"><span class="am-icon-sign-out"></span> 注销</a></li>
        </ul>
        <div class="am-panel am-panel-default admin-sidebar-panel">
            <div class="am-panel-bd">
                <p><span class="am-icon-bookmark"></span> 公告</p>
                <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;动作可以慢，但战略一定要正确，看准了再跟上去！—— Driver_Chen</p>
            </div>
        </div>

        <div class="am-panel am-panel-default admin-sidebar-panel">
            <div class="am-panel-bd">
                <p><span class="am-icon-tag"></span> wiki</p>
                <p>Welcome to the Driver_Chen</p>
            </div>
        </div>
        <!-- </ul>
         </div>-->
    </div>
    <!-- sidebar end -->

    <!-- content start -->
    <div class="admin-content">
        <div class="am-cf am-padding">
            <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">重置密码</strong> /
                <small>Reset Password</small>
            </div>
        </div>

        <hr/>

        <div class="am-g">
            <div class="am-u-sm-12 am-u-md-4 am-u-md-push-8" style="height: 486px;">
                <div class="am-panel am-panel-default">
                    <div class="am-panel-bd">
                        <div class="am-g">
                            <img src="../img/我喜欢电脑 I Love PC Windows10创意设计4k壁纸_彼岸图网.jpg"
                                 style="width: 394px;margin-left: 2px;height: 240px;margin-top: -13px;"/>
                        </div>
                    </div>
                </div>

                <div class="am-panel am-panel-default">
                    <div class="am-panel-bd">
                        <div class="user-info">
                            <p>等级信息</p>
                            <div class="am-progress am-progress-sm">
                                <div class="am-progress-bar" style="width: 60%"></div>
                            </div>
                            <p class="user-info-order">当前等级：<strong>LV8</strong> 活跃天数：<strong>587</strong>
                                距离下一级别：<strong>160</strong></p>
                        </div>
                        <div class="user-info">
                            <p>信用信息</p>
                            <div class="am-progress am-progress-sm">
                                <div class="am-progress-bar am-progress-bar-success" style="width: 80%"></div>
                            </div>
                            <p class="user-info-order">信用等级：正常当前 信用积分：<strong>80</strong></p>
                        </div>
                    </div>
                </div>
            </div>

            <div class="am-u-sm-12 am-u-md-8 am-u-md-pull-4">
                <form class="am-form am-form-horizontal">
                    <div class="am-form-group">
                        <label for="administratorUsername" name="administratorUsername" class="am-u-sm-3 am-form-label">用户名
                            / userName</label>
                        <div class="am-u-sm-9">
                            <input type="text" id="administratorUsername" value="" disabled="disabled"
                                   placeholder="用户名 / userName">
                        </div>
                    </div>

                    <div class="am-form-group">
                        <label for="administratorPassword" class="am-u-sm-3 am-form-label">原密码 / OldPassword</label>
                        <div class="am-u-sm-9">
                            <input type="password" id="administratorPassword" name="administratorPassword"
                                   placeholder="输入你的原密码 / OldPassword">
                            <small class="oldPWD">请输入原密码...</small>
                        </div>
                    </div>

                    <div class="am-form-group">
                        <label for="administratorNewPassword" class="am-u-sm-3 am-form-label">新密码 / NewPassword</label>
                        <div class="am-u-sm-9">
                            <input type="password" id="administratorNewPassword" name="administratorNewPassword"
                                   placeholder="输入你的新密码 / NewPassword">
                        </div>
                    </div>

                    <div class="am-form-group">
                        <div class="am-u-sm-9 am-u-sm-push-3">
                            <button type="button" class="am-btn am-btn-primary" onclick="editPWD();">保存修改</button>
                            <button type="button" class="am-btn am-btn-primary" onclick="initPassword()" style="margin-left: 20px;">初始化密码</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <!-- content end -->
</div>
<footer>
    <hr>
    <p class="am-padding-left">© 2018 AllMobilize, Inc. Licensed under MIT license.</p>
</footer>

<!--[if lt IE 9]>
<script src="../js/js/jquery-3.3.1.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="../js/js/polyfill/rem.min.js"></script>
<script src="../js/js/polyfill/respond.min.js"></script>
<script src="../js/js/amazeui.legacy.js"></script>
<![endif]-->

<!--[if (gte IE 9)|!(IE)]><!-->
<script src="../js/js/jquery.min.js"></script>
<script src="../js/js/amazeui.min.js"></script>
<!--<![endif]-->
<script src="../js/js/app.js"></script>
<script type="text/javascript">
    /*开启全屏*/
    function toFullscreen() {
        var de = document.documentElement;
        if (de.requestFullscreen) {
            de.requestFullscreen();
        } else if (de.mozRequestFullScreen) {
            de.mozRequestFullScreen();
        } else if (de.webkitRequestFullScreen) {
            de.webkitRequestFullScreen();
        }
    }

    //密码验证
    $("#administratorPassword").blur(function (){
        var administratorPassword=$("#administratorPassword").val();
        /*密码必须要包含字母数字和!@#$%^&* 这几个特殊字符并且必须为8-20位之间*/
       /* var regExp = /^([a-zA-Z]+[0-9]+[!@#$%^&*]+)|([a-zA-Z]+[!@#$%^&*]+[0-9]+)|([0-9]+[!@#$%^&*]+[a-zA-Z]+)|([0-9]+[a-zA-Z]+[!@#$%^&*]+)|([!@#$%^&*]+[a-zA-Z]+[0-9]+)|([!@#$%^&*]+[0-9]+[a-zA-Z]+)$/;*/
        var regExp = /^[0-9a-zA-Z!@#$%^&*]{6,16}$/;
        if (regExp.test(administratorPassword)){
            $(".oldPWD").html('<span style="color: green;">√密码格式正确</span>');
        }else if (administratorPassword==""){
            $(".oldPWD").html('<span style="color: red;">密码不能为空！</span>');
        }else{
            $(".oldPWD").html('<span style="color: red;">×密码只能由字母数字!@#$%^&*组成,且必须为6-16位</span>');
        }
    });
    //密码验证
    $("#administratorNewPassword").blur(function (){
        var administratorPassword=$("#administratorPassword").val();
        var administratorNewPassword=$("#administratorNewPassword").val();
        /*var regExp = new RegExp("^.{5,15}$");*/
        var regExp = /^[0-9a-zA-Z!@#$%^&*]{6,16}$/;
        /*密码必须要包含字母数字和!@#$%^&* 这几个特殊字符并且必须为8-20位之间*/
        /*var regExp = /^([a-zA-Z]+[0-9]+[!@#$%^&*]+)|([a-zA-Z]+[!@#$%^&*]+[0-9]+)|([0-9]+[!@#$%^&*]+[a-zA-Z]+)|([0-9]+[a-zA-Z]+[!@#$%^&*]+)|([!@#$%^&*]+[a-zA-Z]+[0-9]+)|([!@#$%^&*]+[0-9]+[a-zA-Z]+)$/;*/
        if(administratorPassword==administratorNewPassword){
            if (regExp.test(administratorNewPassword)){
                $(".oldPWD").html('<span style="color: green;">√两次密码输入一致</span>');
            }else if (administratorNewPassword==""){
                $(".oldPWD").html("<span>密码不能为空！</span>");
            }else{
                $(".oldPWD").html('<span style="color: red;">×密码只能由字母数字!@#$%^&*组成,且必须为6-16位</span>');
            }
        }
        else{
            $(".oldPWD").html("<span style='color: red;'>密码不匹配</span>");
        }
    });

    /*修改*/
    function editPWD() {
        console.log($("#administratorName").val());
        $.ajax({
            url: "/administrator/edit",
            type: "POST",
            data: {
                administratorUsername: $("#administratorUsername").val(),
                administratorPassword: $("#administratorPassword").val(),
                administratorNewPassword: $("#administratorNewPassword").val()
            },
            success: function (data) {
                    if (data.code == 1) {
                        alert("密码修改成功!")
                    }else {
                        alert("密码修改失败!")
                    }
            }
        })
    }

    /*列表/导航栏退出后台管理系统*/
    function safetyOFF() {
        if (confirm("您真的要退出后台管理系统吗？")) {
            $.ajax({
                url: "/background/safetyOFF",
                type: "GET",
                success: function () {
                    //去掉前进后退功能
                    //location.replace("/administrator/login")
                    location.replace("/background/theBackground");
                    return true;
                }
            })
        } else {
            return false;
        }
    }

    //修改密码时查询当前用户名
    ;(function selectUserName() {
        var admin = '<%= session.getAttribute("admin")%>';
        $("#administratorUsername").val(admin);
    })()

    //初始化密码
    function initPassword() {
        $.ajax({
            url:"/administrator/initPassword",
            type:"POST",
            data:{administratorPassword:"888888",administratorNewPassword:"888888"},
            success:function () {
                alert("初始化密码为: 888888 请记得及时修改密码哦!");
            }
        })
    }
</script>
</body>
</html>