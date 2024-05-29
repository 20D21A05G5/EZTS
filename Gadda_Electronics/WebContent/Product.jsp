<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Document</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet" />
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
</head>
<body>
	
	<nav class="navbar bg-primary">
		<label for="Brand" class="navbar-brand"> GADDA_ELECTRONICS
			System </label>
	</nav>
	<br>
	<br>
	<div class="container">
	<div class="row">
        <div class="col-9">
          <h1>PRODUCT</h1>
        </div>
        <div class="col-3">
          <input type="button" value="Sell" onclick="window.location.href='Sell.jsp'">
        </div>
      </div>
		<table class="table table-bordered">
			<thead class="thead-dark ">
				<tr>
					<th>Product_ID</th>
					<th>Name</th>
					<th>Brand</th>
					<th>Category</th>
					<th>Price</th>
				</tr>
			</thead>
			<tr>
				<th scope="row">PD-001</th>
				<td>Watch</td>
				<td>Rolex</td>
				<td>Explorer II</td>
				<td>20000</td>
		</table>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
