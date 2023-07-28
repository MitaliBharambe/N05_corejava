//program to demonstrate on encapsulation
/*encapsulation achieves the data hiding using private access specifier*/
package org.tnsif.encapsulation;

public class HDFC {
	private long accountNo;
	private int cvvtNo;
	private String accountType;
	private int pinNo;
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public int getCvvtNo() {
		return cvvtNo;
	}
	public void setCvvtNo(int cvvtNo) {
		this.cvvtNo = cvvtNo;
	}
	public String getAccountType() {
		return accountType;
	}
	@Override
	public String toString() {
		return "HDFC [accountNo=" + accountNo + ", cvvtNo=" + cvvtNo + ", accountType=" + accountType + ", pinNo="
				+ pinNo + "]";
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getPinNo() {
		return pinNo;
	}
	public void setPinNo(int pintNo) {
		this.pinNo = pintNo;
	}
}
