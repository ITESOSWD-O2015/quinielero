<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="sources/style.css" rel="stylesheet" type="text/css">
<script>
	
	function valideDatos(){
		var leage_selection = document.getElementById("select_league_button");
		var maximum = document.getElementById("minimum_participants");
		var minimum = document.getElementById("maximum_participants");
		var price   = document.getElementById("pool_price");
		var date    = document.getElementById("start_date");
		var invite  = document.getElementById("invite_people_button");
		var name    = document.getElementById("pool_name");
		
		//variables to get current date
		var today = new Date();
		var dd = today.getDate();
		var mm = today.getMonth()+1; //January is 0!
		var yyyy = today.getFullYear();
		//ar today_date = dd
		
		if(maximum.valueOf() > 99 || maximum.valueOf() < 2 || maximum.valueOf()==null){
			alert("Number of participants must be between 2 and 99");
			return false;
		} else if(minimum.valueOf() >99 || minimum.valueOf() < 2 || minimum.valueOf()==null){
			alert("Number of participants must be between 2 and 99");
			return false;
		} else if(minimum.valueOf() > maximum.valueOf()){
			alert("Minimum number of participants can't be bigger than maximum");
			return flase;
		}else if(price.valueOf() < 5.00 || price.valueOf() == null){
			alert("Minimum price is 5 pesos");
			return false;
		}else if(name == null || name == ""){
			alert("You must give a name to your pool");
			return false;
		}else{
			return true;
		}
			
	}
	</script>
</head>
<body>
	
	<div class="mainLogo">
		<h1><a href="../../index.html">Quinielero</a></h1>	
	</div>
	
	<div class="currentSelection">
		<h2>Organize Pools</h2>	
	</div>
	
	
	<div class="firstStep">		
		<form action="../../CreatePoolServlet" method="post" onsubmit="return validateDatos();">	
		
			
			<h3>Give a name to your pool</h3>
			<input type="text" name="pool_name" id="pool_name" required> <br> <br>
			
			
			<h3>Select the league for you pool</h3>
			<input type="radio" name="select_league_button" value="uefa" id="select_league_button" required>  UEFA <br>
			<input type="radio" name="select_league_button" value="bundesliga"id="select_league_button" > Bundesliga <br>
			<input type="radio" name="select_league_button" value="mls" id="select_league_button"> MLS <br>
			<input type="radio" name="select_league_button" value="mundial" id="select_league_button"> Mundial <br>
			<input type="radio" name="select_league_button" value="primeradivisionmexicana" id="select_league_button"> Primera Division Mexicana <br>	
			<br><br>
			
			<h3>Set the Pool's preferences</h3>
			<h4> Set maximum and minimum number of participants (must be between 2 and 99)</h4>
				Minimum: <input type="number" name="minimum_participants" min=2 max=98 placeholder="2"  id="minimum_participants" required>
				Maximum: <input type="number" name="maximum_participants" min=2 max=99 placeholder="99" id="maximum_participants"required>
			<br> <br>
			
			<h4> Set the pool's price in mexican pesos (minimum required: $5.00))</h4>
				Price: <input type="number" name="pool_price" min=5 placeholder="50" step="any" id="pool_price" required> 
			<br> <br>
			
			<h4> Select a starting date for the pool))</h4>
				Starting Date: <input type="date" name="start_date" pattern="\d{1,2}/\d{1,2}/\d{4}"  id="start_date" required>
			<br> <br>
			
			<h4> Would you like to invite people to your pool right now?</h4>
			<input type="radio" name="invite_people_button" value="invitePeople" required> Yes <br>
			<input type="radio" name="invite_people_button" value="invitePeople" required> No <br>
			<br> <br>			
			
			<h5> Have you filled all blanks? </h5>
				<input type="submit" value="Submit" name="create_pool_button">				
			
		</form>
		
		
		
	</div>
	
</body>
</html>