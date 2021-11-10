$(function(){
$(".clsHead").click(function(){
	if($(".clsContent").is(":visible")){
		$(".clsHead span img").attr("src","img/shopping_arrow_up.gif");
		$(".clsContent").css("display","none");
	}else{
		$(".clsHead span img").attr("src","img/shopping_arrow_down.gif");
		$(".clsContent").css("display","block");
	}
});

$(".claBot > a").click(function(){
		//如果内容为"简化"字样
		if($(".claBot > a").text()=="简化"){
			$("ul li:gt(4):not(:last)").hide();
			$(".claBot>a").text("更多");
		}else{
			$("ul li:gt(4):not(:last)").show();
			$(".claBot>a").text("简化");
		}
	});
});
