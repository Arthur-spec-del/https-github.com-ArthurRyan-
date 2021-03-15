/* creation date 7-15/12/2020 by Grainne Walsh x20153678 & Arthur Ryan x20170386 for Project end of term NCI-HDAIML */
/* JS - Javascript file for end of term project titled Edge Fashion clothing */


/* Arthur Ryan Java script section start */

/* intelligent search on index page*/
function SearchFunction() {
    var input, filter, ul, li, a, i, txtValue;
    input = document.getElementById("userinput");
    filter = input.value.toUpperCase();
    ul = document.getElementById("searchadvanced");
    li = ul.getElementsByTagName("li");
    for (i = 0; i < li.length; i++) {
        a = li[i].getElementsByTagName("a")[0];
        txtValue = a.textContent || a.innerText;
        if (txtValue.toUpperCase().indexOf(filter) > -1) {
            li[i].style.display = "";
        } else {
            li[i].style.display = "none";
        }
    }
}


/* Start of Carousel*/ 

var slideIndex = 1;
showSlides(slideIndex);

function plusSlides(n) {
  showSlides(slideIndex += n);
}

function currentSlide(n) {
  showSlides(slideIndex = n);
}

function showSlides(n) {
  var i;
  var slides = document.getElementsByClassName("testslidefade");
  var dots = document.getElementsByClassName("dot");
  if (n > slides.length) {slideIndex = 1}    
  if (n < 1) {slideIndex = slides.length}
  for (i = 0; i < slides.length; i++) {
      slides[i].style.display = "none";  
  }
  for (i = 0; i < dots.length; i++) {
      dots[i].className = dots[i].className.replace(" active", "");
  }
  slides[slideIndex-1].style.display = "block";  
  dots[slideIndex-1].className += " active";
}

/* End of Carousel*/ 



// *** Validation section

		// validation of customer name				
		function namelength(customername){
			if(customername.value.length == 7){
				<!-- alert('Customername is ' + customername.value.length + ' characters long and because it is exactly 7 characters it is accepted'); -->
				return true;
			}	
			else if (customername.value.length < 7 || customername.value.length > 7){
				alert('Customer name is ' + customername.value.length + '.  Your name needs to be 7 characters long.  Please re-enter with a name that is 7 characters long. Thanks');
				return false;
			}
		}
		

		
		// validation of shirt number as number
		function allnumericshirt(shirtnumber){
			var numbers = /^[0-9]+$/;
			if(shirtnumber.value.match(numbers)){
				var tot_price = 0;		
				var divobj = document.getElementById('tot_amount');		
				divobj.value = tot_price;
				return true;
				}
			else
				{
				alert('Please input numbers/digits only');
				return false;
				}
		}
		
		
		// validation of tie number as number
		function allnumerictie(tienumber){
			var numbers = /^[0-9]+$/;
			if(tienumber.value.match(numbers)){
				var tot_price = 0;		
				var divobj = document.getElementById('tot_amount');		
				divobj.value = tot_price;
				return true;
				}
			else
				{
				alert('Please input numbers/digits only');
				return false;
				}
		}
		
		// validation of trousers number as number
		function allnumerictrouser(trousernumber){
			var numbers = /^[0-9]+$/;
			if(trousernumber.value.match(numbers)){
				var tot_price = 0;		
				var divobj = document.getElementById('tot_amount');		
				divobj.value = tot_price;
				return true;
				}
			else
				{
				alert('Please input numbers/digits only');
				return false;
				}
		}
		
		
		// validation of jackets number as number
		function allnumericjackets(jacketsnumber){
			var numbers = /^[0-9]+$/;
			if(jacketsnumber.value.match(numbers)){
				var tot_price = 0;		
				var divobj = document.getElementById('tot_amount');		
				divobj.value = tot_price;
				return true;
				}
			else
				{
				alert('Please input numbers/digits only');
				return false;
				}
		}
		
		
		// validation of size number as number
		function allletterssize(sizeletters){
			var numbers = /^[0-9]+$/;
			if(sizeletters.value.match(!numbers)){
				var tot_price = 0;		
				var divobj = document.getElementById('tot_amount');		
				divobj.value = tot_price;
				return true;
				}
			else
				{
				alert('Please input character letters only');
				return false;
				}
		}
		
		
		
		// validation of shoe size number as number
		function allnumericshoes(shoesizenumber){
			var numbers = /^[0-9]+$/;
			if(shoesizenumber.value.match(numbers)){
				var tot_price = 0;		
				var divobj = document.getElementById('tot_amount');		
				divobj.value = tot_price;
				return true;
				}
			else
				{
				alert('Please input numbers/digits only');
				return false;
				}
		}
			
		// validation of cerdit card number as solely numbers
		function allnumericcard(cardnumber){
			var numbers = /^[0-9]+$/;
			if(cardnumber.value.match(numbers)){
				return true;
				}
			else
				{
				alert('Please input numbers/digits only');
				return false;
				}
		}
		
			
// End of validation section	
				
		
// *** for final Socks entry -> then bill summary pre confiming the order ***
// Javascript for form order processing ie summing up in euro the total of the order
// and outputting to the user the order summary in euro, items purchased, saving made in euro and final net bill
		function allnumericsocks(customername, shirtnumber, tienumber, trousernumber, jacketnumber, sizeletters, 
			shoesize, shoenumber, socknumber, shirtselection, tieselection, trouserselection, jacketselection, sockselection, shoeselection)
		{
			var numbers = /^[0-9]+$/;
			if(socknumber.value.match(numbers))
				{
				// alert('document.cartform.shirtselection = ' + shirtselection.value);
				var tot_price = 0;
			    var tot_shirt = 0;
				var tot_tie = 0;
				var tot_trouser = 0;
				var tot_jacket = 0;
				var tot_sock = 0;
				var tot_shoe = 0;
				
				// *** totals withOut discount ***
				// total calculation for shirts - totals withOut discount
				if  (shirtselection.value == 'Denim'){
				tot_shirt = 20 * shirtnumber.value;
				}
				if  (shirtselection.value == 'Goodfellow'){
				tot_shirt = 25 * shirtnumber.value;
				}
				if  (shirtselection.value == 'Embroidered'){
				tot_shirt = 30 * shirtnumber.value;
				}
				// alert('Shirt total = ' + tot_shirt);
				
				// total calculation for ties - totals withOut discount
				if  (tieselection.value == 'Cotton Tie'){
				tot_tie = 10 * tienumber.value;
				}
				if  (tieselection.value == 'Silk Tie'){
				tot_tie = 15 * tienumber.value;
				}
				// alert('Tie total = ' + tot_tie);

				// total calculation for trousers - totals withOut discount
				if  (trouserselection.value == 'denimtrouser'){
				tot_trouser = 20 * trousernumber.value;
				}
				if  (trouserselection.value == 'colorfultrouser'){
				tot_trouser = 30 * trousernumber.value;
				}
				// alert('Trouser total = ' + tot_trouser);
				
				// total calculation for jackets - totals withOut discount
				if  (jacketselection.value == 'LeatherJacket'){
				tot_jacket = 50 * jacketnumber.value;
				}
				// alert('Jacket total = ' + tot_jacket);
			
				//alert ('shoeselection.value = ' + shoeselection.value);		
		
				// total calculation for shoe - totals withOut discount
				if  (shoeselection.value == 'CleanFinish'){
				tot_shoe = 70 * 1;
				}
				if  (shoeselection.value == 'HikingBoot'){
				tot_shoe = 80 * 1;
				}
				if  (shoeselection.value == 'Weave'){
				tot_shoe = 90 * 1;
				}
				if  (shoeselection.value == 'LeatherBoots'){
				tot_shoe = 100 * 1;
				}
				if  (shoeselection.value == 'Brogue'){
				tot_shoe = 120 * 1;
				}
				// alert('Shoe total = ' + tot_shoe);
				
				
				// total calculation for socks - totals withOut discount
				if  (sockselection.value == 'FineOrganicCotton'){
				tot_sock = 25 * socknumber.value;
				}
				// alert('Sock total = ' + tot_sock);
				
				// output message ie summary of bill construction
				var divobj = document.getElementById('tot_amount');		
				divobj.value = (tot_shirt + tot_tie + tot_trouser + tot_jacket + tot_sock + tot_shoe);
							
				alert('Your order is accepted.  Please review the total bill and when you are happy click "Press to order great clothes!" button');
					if(discountcode.value == 'new'){
					alert('Hi ' + customername.value + ' here is your Order Summary: ' +
					shirtnumber.value + 
					' shirts of size ' + sizeletters.value 
					+  ' and ' + tienumber.value + 
					' ties of style ' + tieselection.value +
					' and ' + trousernumber.value +
					' trousers size ' + sizeletters.value + 
					' then ' + jacketnumber.value + 
					' jackets of type '  + jacketselection.value 
					+ ' '+ socknumber.value + ' socks ' +
					' of type ' + sockselection.value + 
					' socks, 1 pair of shoes size ' + shoesize.value + ' ' +
					shoeselection.value + ' shoe style.  Totaling to: €' 
					+  divobj.value + 
					' there will be a discount of 15%, your savings are €' 
					+ (0.15 * divobj.value) + 
					'.  Making your total bill €' + (divobj.value - (0.15 * divobj.value)) + ' Enjoy your purchase!');
					}
					if(discountcode.value != 'new'){
					alert('Hi ' + customername.value + ' here is your Order Summary: ' +
					shirtnumber.value + 
					' shirts of size ' + sizeletters.value 
					+  ' and ' + tienumber.value + 
					' ties of style ' + tieselection.value +
					' and ' + trousernumber.value +
					' trousers size ' + sizeletters.value + 
					' then ' + jacketnumber.value + 
					' jackets of type '  + jacketselection.value 
					+ ' '+ socknumber.value + ' socks ' +
					'of type ' + sockselection.value + 
					' socks, 1 pair of shoes size ' + shoesize.value + 
					' ' + shoeselection.value + ' shoe style. ' + 
					' Totaling to €' +  divobj.value + 
					'. Ask us about our 15% discount for repeat customers. Enjoy your purchase!');
					}
				// return true;
				
			}
			else
				{
				alert('Please input numbers/digits only');
				return false;
				}
		
			// populate the summary text area with the order details
			var summaryobj = document.getElementById('summary');		
				summaryobj.value = ('Hi ' + customername.value + ' here is your Order Summary: ' +
					shirtnumber.value + 
					' shirts of size ' + sizeletters.value 
					+  ' and ' + tienumber.value + 
					' ties of style ' + tieselection.value +
					' and ' + trousernumber.value +
					' trousers size ' + sizeletters.value + 
					' then ' + jacketnumber.value + 
					' jackets of type '  + jacketselection.value 
					+ ' '+ socknumber.value + ' socks ' +
					'of type ' + sockselection.value + 
					' socks, 1 pair of shoes size ' + shoesize.value + 
					' ' + shoeselection.value + ' shoe style. ' + 
					' Totaling to €' +  divobj.value + 
					'. Ask us about our 15% discount for repeat customers. Enjoy your purchase!');
			return true;
			}
		
		
		// calculate total and output it to total box
		function calculateTotal(customername, shirtnumber, tienumber,trousernumber, jacketnumber, sizeletters,  
			shoesize, shoenumber, socknumber, shirtselection, ieselection, trouserselection, jacketselection,
			sockselection,shoeselection) {
			    						
				var tot_price = 0;
			    var tot_shirt = 0;
				var tot_tie = 0;
				var tot_trouser = 0;
				var tot_jacket = 0;
				var tot_sock = 0;
				var tot_shoe = 0;
				
				// *** totals withOut discount ***
				// total calculation for shirts - totals withOut discount
				if  (shirtselection.value == 'Denim'){
				tot_shirt = 20 * shirtnumber.value;
				}
				if  (shirtselection.value == 'Goodfellow'){
				tot_shirt = 25 * shirtnumber.value;
				}
				if  (shirtselection.value == 'Embroidered'){
				tot_shirt = 30 * shirtnumber.value;
				}
				//alert('Shirt total = ' + tot_shirt);
				
				// total calculation for ties - totals withOut discount
				if  (tieselection.value == 'Cotton Tie'){
				tot_tie = 10 * tienumber.value;
				}
				if  (tieselection.value == 'Silk Tie'){
				tot_tie = 15 * tienumber.value;
				}
				//alert('Tie total = ' + tot_tie);

				// total calculation for trousers - totals withOut discount
				if  (trouserselection.value == 'denimtrouser'){
				tot_trouser = 20 * trousernumber.value;
				}
				if  (trouserselection.value == 'colorfultrouser'){
				tot_trouser = 30 * trousernumber.value;
				}
				//alert('Trouser total = ' + tot_trouser);
				
				// total calculation for jackets - totals withOut discount
				if  (jacketselection.value == 'LeatherJacket'){
				tot_jacket = 50 * jacketnumber.value;
				}
				//alert('Jacket total = ' + tot_jacket);
			
				//alert ('shoeselection.value = ' + shoeselection.value);		
		
				// total calculation for shoe - totals withOut discount
				if  (shoeselection.value == 'CleanFinish'){
				tot_shoe = 70 * 1;
				}
				if  (shoeselection.value == 'HikingBoot'){
				tot_shoe = 80 * 1;
				}
				if  (shoeselection.value == 'Weave'){
				tot_shoe = 90 * 1;
				}
				if  (shoeselection.value == 'LeatherBoots'){
				tot_shoe = 100 * 1;
				}
				if  (shoeselection.value == 'Brogue'){
				tot_shoe = 120 * 1;
				}
				//alert('Shoe total = ' + tot_shoe);
				
				
				// total calculation for socks - totals withOut discount
				if  (sockselection.value == 'FineOrganicCotton'){
				tot_sock = 25 * socknumber.value;
				}
				//alert('Sock total = ' + tot_sock);
				
                var tempobj = document.getElementById('tot_amount');		
				tempobj.value = (tot_shirt + tot_tie + tot_trouser + tot_jacket + tot_sock + tot_shoe);
						
		}
		
	
/* End of Arthur Ryan Javascript section  */ 
		
		
