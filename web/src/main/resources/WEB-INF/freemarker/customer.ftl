<!DOCTYPE html>
<html lang="en">
<head>
  <title>Customer Information</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<script src="/assets/js/general.js"></script>  
</head>
<body>


<div class="container-fluid">
<button type="button" class="btn btn-link"><a href="/">BACK</a></button>
<table class="table table-striped table-borderless">
    <thead>
      <tr>
        <th>Name</th>
        <th>Phone Number</th>
        <th>Email Address</th>
        <th>Action</th>
      </tr>
    </thead>
    <#list model["userList"] as user>
      <tr class="background-color:#0000ff">
        <td>${user.name}</td>
        <td>${user.phoneNumber}</td>
        <td>${user.emailAddress}</td>
        <td><button type="button" class="btn btn-link">
        <input id="url" type="hidden" value="/customers/lentbooks/${user.id}">
        Retrieve Lent Books
        </button></td>
      </tr>
      <tr >
    <td colspan="4" >
    </td>
      </tr>
    </#list>
  </table>  
    </div>
            
    <#include "foot.ftl">    
</body>
</html>
