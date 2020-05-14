package jsftraining;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "jsfMbean", eager = true)
public class FirstJsfMbean {

	public FirstJsfMbean() {
	      System.out.println("FirstJsfMbean Created!");
	   }
		
	   public String getMessage() {
	      return "Demo of FirstJsfMbean...!!!";
	   }
}
