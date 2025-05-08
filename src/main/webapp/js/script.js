function searchRecipes() {
    const query = document.getElementById("search").value;
    fetch(`search?query=${query}`)
        .then(response => response.json())
        .then(data => {
            const recipesDiv = document.getElementById("recipes");
            recipesDiv.innerHTML = "";
            data.forEach(recipe => {
		     recipesDiv.innerHTML += `
                    <div class="recipe" data-header="${recipe.recipeName}" data-ingredients="${recipe.ingredients}" data-process="${recipe.process}" data-user="${recipe.username}">
                        <h2>${recipe.recipeName}</h2>
                        <img src="${recipe.imageUrl}" alt="${recipe.recipeName}" width="250" height="200" >
						<h4>By ${recipe.username}</h4>
                     </div>
					 <div id="myModal" class="modal">
					 	
		 			 	  <!-- Modal content -->
	 				 	  <div class="modal-content">
						  <span class="close">&times;</span>
					 	     <div id="myHeader" class="modal-header">
					 		 </div>
					 		 <div id="myBody" class="modal-body">

					 		 </div>
	 				 	   </div>
		 				</div>
				
                `;
				
				var recipearr = document.getElementsByClassName("recipe");
				
				console.log(recipesDiv.innerHTML);
				
				// Get the modal
				 var modal = document.getElementById("myModal");
				 var modalheader=document.getElementById("myHeader");
				 var modalbody=document.getElementById("myBody");
				// When the user clicks on the recipe, open the modal
				for(var i = 0; i < recipearr.length; i++) {
				    recipearr[i].onclick = function () {
						const title = this.getAttribute("data-header");
					    const ingredients = this.getAttribute("data-ingredients");
						const process=this.getAttribute("data-process");
						const user=this.getAttribute("data-user");
						modalheader.innerHTML=`	<h2>${title} by ${user} </h2>`;
						modalbody.innerHTML=`
						<pre style="font-size:20px"><strong>Ingredients:</strong> <br> ${ingredients}</pre>
						<pre style="font-size:20px"><strong>Process:</strong><br> ${process}</pre>
						`;
						
				        modal.style.display = "block";
				    }
				}
				
			
	 			// Get the <span> element that closes the modal
	 			var span = document.getElementsByClassName("close")[0];
						 	
	 			// When the user clicks on <span> (x), close the modal
				span.onclick = function() {
	 				 modal.style.display = "none";
	 			}
				
				// When the user clicks anywhere outside of the modal, close it
				window.onclick = function(event) {
				  if (event.target == modal) {
				    modal.style.display = "none";
				  }
				}
			
            });
			
        });
}




/*
		// Get the modal
			var modal = document.getElementById("myModal");
			// Get the <span> element that closes the modal
			var span = document.getElementsByClassName("close")[0];
			function openModel(){
				modal.style.display = "block";
			}
			// When the user clicks on <span> (x), close the modal
				span.onclick = function() {
				 modal.style.display = "none";
			}

<div id="myModal" class="modal">
			 	  <!-- Modal content -->
				 	  <div class="modal-content">
				 	     <div class="modal-header">
				 	       <span class="close">&times;</span>
				 	       <h2>${recipe.recipeName}</h2>
				 	     </div>
				 	     <div class="modal-body">
				 	       <p>Some text in the Modal Body</p>
				 	       <p>Some other text...</p>
				 	     </div>
				 	     <div class="modal-footer">
				 	       <h3>Modal Footer</h3>
				 	     </div>
				 	   </div>
				 </div>
				 
	*/
			


//<p><strong>Ingredients:</strong> ${recipe.ingredients}</p>
  // <p><strong>Process:</strong> ${recipe.process}</p>
