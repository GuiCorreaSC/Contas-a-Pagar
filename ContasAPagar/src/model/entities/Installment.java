package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {

	private Date dueDate;
	private Double amount;

	public SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


	public Installment() {

	}

	public Installment(Date dueDate, Double amount) {
		super();
		this.dueDate = dueDate;
		this.amount = amount;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Double getAmount() {
		return amount;
	}

	public Double interest(Double amount, Integer months) {

		for (int i = 1; i < months; i++) {
			amount = (((amount + 1 / 100) * i) * 2);
		}
		return amount;
	}

	@Override
	public String toString() {
		return "\n" + sdf.format(dueDate) + " - " +String.format("%.2f", amount) ;
	}

}
