package com.critc.staff.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

/**
 * Created by 孔垂云 on 2017/4/26.
 */
@Results(value = { @Result(name = "success", location = "/result.jsp") })
public class TestAction extends ActionSupport {

    private String name;
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Action("test")
    public String test() {
        name = "qqqqqqq";
        return SUCCESS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
