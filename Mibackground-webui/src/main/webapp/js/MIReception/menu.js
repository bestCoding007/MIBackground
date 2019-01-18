/*通过id来获取页面元素*/
function $o(id)
{
	return document.getElementById(id);
}


//让菜单div显示
function menuOverBox()
{
	var div=$o("Goods_Box");
	//显示
	div.style.display="block";
	
	//li的颜色
	document.getElementsByClassName("iconfont").style.backgroundColor="#ff6700";
}
//让菜单div隐藏
function menuOutBox()
{
	var div=$o("Goods_Box");
	//隐藏
	div.style.display="none";
	
	//li的颜色
	document.getElementsByClassName("iconfont").style.backgroundColor="#345";
}

window.onload=function()
{
	document.getElementsByClassName("iconfont").onmouseover=menuOverBox;
	document.getElementsByClassName("iconfont").onmouseout=menuOutBox;
	$o("Goods_Box").onmouseover=menuOverBox;
	$o("Goods_Box").onmouseout=menuOutBox;		
};


