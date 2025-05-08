function adminSearchRecipes() {
    fetch(`search`)
        .then(response => response.json())
        .then(data => {
            const recipesDiv = document.getElementById("adminrecipes");
            recipesDiv.innerHTML = ``;
            data.forEach(recipe => {
		     recipesDiv.innerHTML += `
			
						<tr>
                        	<td>${recipe.recipeName}</td>
                        	<td> <img src="${recipe.imageUrl}" alt="${recipe.recipeName}" width="150" height="100" > </td>
							<td> ${recipe.username}</td>
							<td>
								${recipe.approve==="N"?`<a href="ApproveServlet?rid=${recipe.rid}">Approve</a>`:`<br/>`}
								<br/>
								<a href="DeleteRecipe?rid=${recipe.rid}">Delete</a>
								
							</td>
						</tr>

					                `;
				
				});
				console.log(recipesDiv.innerHTML);
				});
	}
				

