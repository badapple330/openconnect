/**
 *
 */
package com.internousdev.openconnect.decision.detail.action;

import com.opensymphony.xwork2.ActionSupport;

public class DecisionArchiveAction extends ActionSupport {

	/**
	 *
	 */
	private static final long serialVersionUID = 6045130027645771884L;

	public String execute() {

		String result=ERROR;
		int count = 1;
		if (count > 0 ) {
			result = SUCCESS;
		}
		return result;
	}

}
