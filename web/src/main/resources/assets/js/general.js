$(document).ready(function() {
	$("tr button").click(function(event) {
	var link=$(event.target).find("#url").val();
	$.ajax({
		url: link,
		timeout : 100000,
		success : function(data) {
			var json="<h4>The details of the lent books:</h4>";
    		if(data.length >0) 
    		{
				json =json+ "<table class=\"table\"><thead><tr><th>Title</th><th>Author</th><th>ISBN</th></tr></thead>";
				for (var i in data){
      				json = json+ "<tr><td>"+data[i].title+"</td><td>"+data[i].author+"</td><td>"+data[i].isbn+"</td></tr>";
     			};
     			json = json +"</table>";
    		}else
    		{
    			json =json+"<p>The customer has not borrowed any book.</p>"
    		}

	$(event.target).parent().parent().next().find("td[colspan='4']").html(json);
		},
		error : function(e) {
			console.log("ERROR: ", e);
		}
	});
	event.preventDefault();
	});
});
