/**
 *
 */
package com.internousdev.rewrite.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.rewrite.dao.MainActionDAO;
import com.internousdev.rewrite.dto.MainActionDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MainAction extends ActionSupport{

	private List< MainActionDTO> MainList = new ArrayList<MainActionDTO>();

	public String execute() {
		String result = ERROR;
		MainActionDAO dao = new MainActionDAO();
		MainList = dao.select();
		if(!(MainList == null)){
			result = SUCCESS;
		}
		return result;
	}

	public List<MainActionDTO> getMainList() {
		return MainList;
	}

	public void setMainList(List<MainActionDTO> mainList) {
		MainList = mainList;
	}


}
