package com.springcore.standalone;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestClass {
   
	private List<String> listData;
	private Set<String>  setData;
	private Map<String,String> mapData;
	
	public TestClass() {
		super();
		
	}

	public TestClass(List<String> listData, Set<String> setData, Map<String, String> mapData) {
		super();
		this.listData = listData;
		this.setData = setData;
		this.mapData = mapData;
	}

	public List<String> getListData() {
		return listData;
	}

	public void setListData(List<String> listData) {
		this.listData = listData;
	}

	public Set<String> getSetData() {
		return setData;
	}

	public void setSetData(Set<String> setData) {
		this.setData = setData;
	}

	public Map<String, String> getMapData() {
		return mapData;
	}

	public void setMapData(Map<String, String> mapData) {
		this.mapData = mapData;
	}

	@Override
	public String toString() {
		return "TestClass [listData=" + listData + ", setData=" + setData + ", mapData=" + mapData + "]";
	}

}
