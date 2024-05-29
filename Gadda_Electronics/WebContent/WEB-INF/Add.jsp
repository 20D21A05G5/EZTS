<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Gadda_Electronics</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet" />
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css" />
</head>
<body>
	<nav class="navbar bg-primary">
		<label for="Brand" class="navbar-brand"> Product
			System </label>
	</nav>
	<br />
	<br />

	<div class="container">
		<form action="GaddaServlet" method="get">
			<input type="hidden" name="command" value="ADD" /> 
			<div class="row">
          <div class="col-3">
            <label for="Product_ID">Product_ID:</label>
          </div>
          <div class="col-3">
            <input
              type="text"
              id="id"
              name="id"
              class="form-control"
              required
            />
          </div>
        </div>
        <br />
        <div class="row">
          <div class="col-3">
            <label for="name">Name:</label>
          </div>
          <div class="col-3">
            <input
              type="text"
              id="name"
              name="name"
              class="form-control"
              required
            />
          </div>
        </div>
        <br />
        <div class="row">
          <div class="col-3">
            <label for="Brand">Brand:</label>
          </div>
          <div class="col-3">
            <select id="Brand" name="Brand" class="form-control" required>
              <option value="">Select Brand</option>
            </select>
          </div>
        </div>
        <br />
        <div class="row">
          <div class="col-3">
            <label for="category">Category:</label>
          </div>
          <div class="col-3">
            <input
              type="Category"
              id="Category"
              name="Category"
              class="form-control"
              required
            />
          </div>
        </div>
        <br />
        <div class="row">
          <div class="col-3">
            <label for="price">Price:</label>
          </div>
          <div class="col-3">
            <input
              type="tel"
              id="price"
              name="price"
              class="form-control"
              required
            />
          </div>
        </div>
        <br />
        <div class="row mt-3">
          <div class="col-6">
            <input type="submit" value="Submit" class="btn btn-primary" />
          </div>
        </div>
		</form>
		
		<br>
		<a href="Product1">Back to list</a>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>