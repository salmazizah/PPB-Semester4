package com.example.implementasiapi.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListUserResponse{
	@SerializedName("page")
	private int page;
	@SerializedName("per_page")
	private int perPage;
	@SerializedName("total")
	private int total;
	@SerializedName("total_pages")
	private int totalPages;
	@SerializedName("data")
	private List<DataItem> data;
	@SerializedName("support")
	private Support support;

	public void setPage(int page){
		this.page = page;
	}

	public int getPage(){
		return page;
	}

	public void setPerPage(int perPage){
		this.perPage = perPage;
	}

	public int getPerPage(){
		return perPage;
	}

	public void setTotal(int total){
		this.total = total;
	}

	public int getTotal(){
		return total;
	}

	public void setTotalPages(int totalPages){
		this.totalPages = totalPages;
	}

	public int getTotalPages(){
		return totalPages;
	}

	public void setData(List<DataItem> data){
		this.data = data;
	}

	public List<DataItem> getData(){
		return data;
	}

	public void setSupport(Support support){
		this.support = support;
	}

	public Support getSupport(){
		return support;
	}

	@Override
 	public String toString(){
		return 
			"ListUserResponse{" + 
			"per_page = '" + perPage + '\'' + 
			",total = '" + total + '\'' + 
			",data = '" + data + '\'' + 
			",page = '" + page + '\'' + 
			",total_pages = '" + totalPages + '\'' + 
			",support = '" + support + '\'' + 
			"}";
		}
}