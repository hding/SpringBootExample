<!DOCTYPE html>
<html lang="en">
<head>
  <title>Book Information</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

</div>

<div class="container">
<button type="button" class="btn btn-link"><a href="/">BACK</a></button>
<table class="table">
    <thead>
      <tr>
        <th>Author</th>
        <th>Title</th>
        <th>ISBN</th>
      </tr>
    </thead>
    <#list model["bookList"] as book>
      <tr>
        <td>${book.author}</td>
        <td>${book.title}</td>
        <td>${book.ISBN}</td>
      </tr>
    </#list>
  </table>  
    </div>

    <#include "foot.ftl">    
    
</body>
</html>
