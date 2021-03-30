<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>QL User</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
</head>
<body>
	<div class="col-8 offset-2">
		<div class="mt-5 row">
			<div class="col-6">
				<button class="btn btn-success">Thêm mới</button>
			</div>
			<div class="col-4"></div>
			<div class="col-2 d-flex justify-content-end">
				<select class="form-select">
					<option value="10" selected>10</option>
					<option value="10">20</option>
					<option value="10">50</option>
					<option value="10">100</option>
				</select>
			</div>
		</div>
		
		<div class="mt-5 table-responsive">
			<table class="table table-striped">
				<thead>
					<tr>
						<td>Id</td>
						<td>Name</td>
						<td>Email</td>
						<td>Gender</td>
						<td>Role</td>
						<td colspan="2">Action</td>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>1</td>
						<td>Nguyễn Văn A</td>
						<td>anvph12345@gmail.com</td>
						<td>Nam</td>
						<td>User</td>
						<td>
							<button class="btn btn-primary">Update</button>
						</td>
						<td>
							<button class="btn btn-danger">Delete</button>
						</td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>