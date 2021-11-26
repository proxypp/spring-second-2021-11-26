<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="resources/js/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
	function idCheck(){
		var $id = "micol@abc.com";
		$.ajax({
			url : "memberList.do",
			type : "post",
			//data : {id : $id},
			dataType : "json",
			success : function(data){
				console.log(data);
				var tb = $("<table border='1' />");
				var row = $('<tr/>').append(
					$('<th />').text("아이디"),
					$('<th />').text("이름"),
					$('<th />').text("주소"),
					$('<th />').text("전화번호"),
					$('<th />').text("권한")
					);
					tb.append(row);
					for(var i in data){
						var id = data[i].id;
						var name = data[i].name;	
						var address = data[i].address;	
						var tel = data[i].tel;	
						var author = data[i].author;	
					
					row = $("<tr/>").append(
						$('<td />').text(id),
						$('<td />').text(name),
						$('<td />').text(address),
						$('<td />').text(tel),
						$('<td />').text(author)
					);	
					tb.append(row);	
				}
				$("#wrap").append(tb);
			}
		});
	}
</script>

</head>
<body>
	<!--<div align="center">
		<div id="test">타일즈 테스트</div>
		<button type="button" onclick="idCheck()">아이디 중복체크 test</button>
	 </div>  -->
	 <div align="center">
   					<div><h1>환영합니다.</h1></div>
   					<h3><a href="test.do">타일즈 테스트</a></h3>
  		 		 	<button type="button" onclick="idCheck()">멤버목록</button>
  				 	<div><h1>멤버목록</h1></div>
   	 		<div id="wrap"></div>
</div>
</body>
</html>