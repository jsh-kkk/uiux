<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }
        th {
            background-color: #f2f2f2;
        }
</style>
<script>
	$(function(){
		$.ajax({
			url: "dataTransform.do",
			method: 'get',
			dataType:'json',
			success:function(data){
				let tableBody = $('#boardTable tbody');
				data.forEach(function(item){
					let row = $('<tr></tr>');
					row.append('<td>' + item.seq + '</td>');
					row.append('<td>' + item.title + '</td>');
					row.append('<td>' + item.writer + '</td>');
					row.append('<td>' + item.content + '</td>');
					row.append('<td>' + item.cnt + '</td>');
					tableBody.append(row);
				});
			},
			error:function(error){
				console.error(error);
			}
			
		});
	});
</script>    
</head>
<body>
	<table id="boardTable">
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>내용</th>
				<th>조회수</th>
			</tr>
		</thead>
		<tbody>
			
		</tbody>
	</table>
</body>
</html>