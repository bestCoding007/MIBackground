function $i(id){
	return document.getElementById(id);
}
var images=["../../../img/slideshow/1.jpg","../../../img/slideshow/2.jpg",
	"../../../img/slideshow/3.jpg","../../../img/slideshow/4.jpg","../../../img/slideshow/5.jpg"];
var index=1;
function show(){

	$i("pri").src=images[index];
	var spans=document.getElementsByClassName("number");
	for(i=0;i<spans.length;i++){
		if(index==i){
			spans[i].style.background="beige";
			spans[i].style.color="";
		}else{
			spans[i].style.background="#A9A9A9";
			spans[i].style.color="none";
		}		
	}
	index++;
	if(index==images.length)
	{
		index=0;
	}
}	

//让菜单div显示
function menuOverBox()
{
	/*document.getElementsByClassName("a_box").css("background","#FF6700");*/
	var div=$i("Goods_Box");
	//显示
	div.style.display="block";
	//li的颜色
	
}
//让菜单div隐藏
function menuOutBox()
{
	/*document.getElementsByClassName("a_box").css("background","#FF6700");*/
	var div=$i("Goods_Box");
	//隐藏
	div.style.display="none";
	//li的颜色
}

var interval=window.setInterval(show,2000);
window.onload=function()
{
	$i("pri").onmouseover=function()
	{
		window.clearInterval(interval);
	};
	$i("pri").onmouseout=function()
	{
		interval=window.setInterval(show,2000);
	};

	$i("Goods_Box").onmouseover=menuOverBox;
	$i("Goods_Box").onmouseout=menuOutBox;	
	$i("u1").onmouseover=menuOverBox;
	$i("u1").onmouseout=menuOutBox;	
	$i("u2").onmouseover=menuOverBox;
	$i("u2").onmouseout=menuOutBox;		
	$i("u3").onmouseover=menuOverBox;
	$i("u3").onmouseout=menuOutBox;	
	$i("u4").onmouseover=menuOverBox;
	$i("u4").onmouseout=menuOutBox;	
	$i("u5").onmouseover=menuOverBox;
	$i("u5").onmouseout=menuOutBox;	
	$i("u6").onmouseover=menuOverBox;
	$i("u6").onmouseout=menuOutBox;	
	$i("u7").onmouseover=menuOverBox;
	$i("u7").onmouseout=menuOutBox;	
	$i("u8").onmouseover=menuOverBox;
	$i("u8").onmouseout=menuOutBox;	
	$i("u9").onmouseover=menuOverBox;
	$i("u9").onmouseout=menuOutBox;	
	$i("u10").onmouseover=menuOverBox;
	$i("u10").onmouseout=menuOutBox;	
	/*document.getElementsByClassName("a_box").onmouseover=menuOverBox;
	document.getElementsByClassName("a_box").onmouseout=menuOutBox;*/
};

