package jsftraining;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "jsfMbean", eager = true)
public class FirstJsfMbean {
	
	private BigDecimal dropDownValue;
	private List<DropDownDto> dropdownList = new ArrayList<DropDownDto>();

	public FirstJsfMbean() {
	      System.out.println("FirstJsfMbean Created!");
	      dropdownList.add(new DropDownDto("1", "adjadjba"));
	      dropdownList.add(new DropDownDto("2", "djfhf"));
	      dropdownList.add(new DropDownDto("3", "as"));
	   }
		
	   public String getMessage() {
	      return "Demo of FirstJsfMbean...!!!";
	   }

	public List<DropDownDto> getDropdownList() {
		return dropdownList;
	}

	public void setDropdownList(List<DropDownDto> dropdownList) {
		this.dropdownList = dropdownList;
	}

	public BigDecimal getDropDownValue() {
		return dropDownValue;
	}

	public void setDropDownValue(BigDecimal dropDownValue) {
		this.dropDownValue = dropDownValue;
	}
	   
}
