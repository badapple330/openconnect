/**
 *
 */
package com.internousdev.openconnect.schedule.action;
import com.internousdev.openconnect.schedule.dao.ScheduleInsertDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internous
 *
 */
public class ScheduleInsertAction extends ActionSupport{

	private String Startdate;
	private String title;
	private String content;
	private String errorStartdate;
	private String errortitle;
	private String errorcontent;

	public String execute(){
        String ret = ERROR;
        int k;

        if(!Startdate.matches(".{1,255}")){   //開始日の検証
			   errorStartdate = (getText("開始日を入力して下さい"));
			   return ERROR;
		}

        if(!title.matches(".{1,255}")){   //件名の検証
			   errortitle = (getText("件名を入力して下さい"));
			   return ERROR;
		}
        if(!content.matches(".{1,255}")){   //内容の検証
			   errorcontent = (getText("件名を入力して下さい"));
			   return ERROR;
		}
        ScheduleInsertDAO dao = new ScheduleInsertDAO();

        k = dao.insert(Startdate,title,content);

        if (k>0) {
            ret = SUCCESS;
        } else {
        	errortitle=(getText("登録できませんでした"));
        }
		return ret;

	}

	public String getStartdate() {
		return Startdate;
	}

	public void setStartdate(String startdate) {
		Startdate = startdate;
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

	public String getErrorStartdate() {
		return errorStartdate;
	}

	public void setErrorStartdate(String errorStartdate) {
		this.errorStartdate = errorStartdate;
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
