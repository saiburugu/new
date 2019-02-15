package com.cg.payroll.daoservices;

import java.util.ArrayList;

import com.cg.payroll.beans.Associate;

public interface PayrollDAOServices {

	int insertAssociate(Associate associate);

	boolean updateAssociate(Associate associate);

	Associate getAssociate(int associateId);

	ArrayList<Associate> getAssociates();

	boolean closePayrollDAOServices();
}