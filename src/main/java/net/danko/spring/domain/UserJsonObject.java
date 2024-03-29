package net.danko.spring.domain;

import java.util.List;

public class UserJsonObject {
	
	int iTotalRecords;

    int iTotalDisplayRecords;

    String sEcho;

    String sColumns;

    List<User> aaData;

    public int getiTotalRecords() {
    return iTotalRecords;
    }

    public void setiTotalRecords(int iTotalRecords) {
    this.iTotalRecords = iTotalRecords;
    }

    public int getiTotalDisplayRecords() {
    return iTotalDisplayRecords;
    }

    public void setiTotalDisplayRecords(int iTotalDisplayRecords) {
    this.iTotalDisplayRecords = iTotalDisplayRecords;
    }

    public String getsEcho() {
    return sEcho;
    }

    public void setsEcho(String sEcho) {
    this.sEcho = sEcho;
    }

    public String getsColumns() {
    return sColumns;
    }

    public void setsColumns(String sColumns) {
    this.sColumns = sColumns;
    }

    public List<User> getAaData() {
        return aaData;
    }

    public void setAaData(List<User> aaData) {
    	
    	User users = null;
		
		for(int i = 0; i < aaData.size(); ++i) {
			users = aaData.get(i);
			users.setUserRoles(null);
			users.setPassword(null);
			users.setEnabled(null);
			aaData.set(i, users);
		}
    	
        this.aaData = aaData;
    }

    

}
