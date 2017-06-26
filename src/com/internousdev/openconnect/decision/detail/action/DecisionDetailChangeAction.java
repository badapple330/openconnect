/**
*
*/
package com.internousdev.openconnect.decision.detail.action;

import com.opensymphony.xwork2.ActionSupport;

public class DecisionDetailChangeAction extends ActionSupport {

	/**
	 *
	 */
	private static final long serialVersionUID = -2651575283199660553L;


	public String execute() {

		String result=ERROR;
		int count = 1;
		if (count > 0 ) {
			result = SUCCESS;
		}
		return result;
	}

}

