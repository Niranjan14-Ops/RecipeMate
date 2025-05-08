package com.recipemanagement;

public class Recipe {
	private int rid;
	private String recipeName;
	private String ingredients;
	private String process;
	private String imageUrl;
	private String username;
	private String approve;
	
	public Recipe() {
		// TODO Auto-generated constructor stub
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getRecipeName() {
		return recipeName;
	}
	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}
	public String getIngredients() {
		return ingredients;
	}
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	public String getProcess() {
		return process;
	}
	public void setProcess(String process) {
		this.process = process;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getApprove() {
		return approve;
	}
	public void setApprove(String approve) {
		this.approve = approve;
	}
	@Override
	public String toString() {
		return "Recipe [rid=" + rid + ", recipeName=" + recipeName + ", ingredients=" + ingredients + ", process="
				+ process + ", imageUrl=" + imageUrl + ", username=" + username + ", approve=" + approve + "]";
	}

	
	
}
