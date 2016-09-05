/**
 *
 */
package com.internousdev.openconnect.schedule.action;
import java.sql.Date;

import com.internousdev.openconnect.schedule.dao.ScheduleInsertDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internous
 *
 */
public class ScheduleInsertAction extends ActionSupport{

	private Date start_day;
	private String title;
	private String content;
	//private String errorstart_day;
	private String errortitle;
	private String errorcontent;

	public String execute(){
        String ret = ERROR;
        int k;
System.out.println(start_day);
//        if(!start_day.matches(".{1,255}")){   //開始日の検証
//			   errorstart_day = (getText("開始日を入力して下さい"));
//			   return ERROR;
//		}

        if(!title.matches(".{1,255}")){   //件名の検証
			   errortitle = (getText("件名を入力して下さい"));
			   return ERROR;
		}
        if(!content.matches(".{1,255}")){   //内容の検証
			   errorcontent = (getText("件名を入力して下さい"));
			   return ERROR;
		}
        ScheduleInsertDAO dao = new ScheduleInsertDAO();

        k = dao.insert(start_day,title,content);

        if (k>0) {
            ret = SUCCESS;
        } else {
        	errortitle=(getText("登録できませんでした"));
        }
		return ret;

	}

	public Date getStart_day() {
		return start_day;
	}

	public void setStart_day(Date start_day) {
		this.start_day = start_day;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getErrortitle() {
		return errortitle;
	}

	public void setErrortitle(String errortitle) {
		this.errortitle = errortitle;
	}

	public String getErrorcontent() {
		return errorcontent;
	}

	public void setErrorcontent(String errorcontent) {
		this.errorcontent = errorcontent;
	}


}
