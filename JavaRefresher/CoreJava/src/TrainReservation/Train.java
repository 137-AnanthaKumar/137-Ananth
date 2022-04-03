package TrainReservation;

import java.util.ArrayList;

public class Train {
private static final Train Train = null;
private int trainNo;
private String trainName;
private String ac;
private String nonAc;
private int availableSeat;
public Train(int trainNo, String trainName, String ac, String nonAc, int availableSeat) {
	super();
	this.trainNo = trainNo;
	this.trainName = trainName;
	this.ac = ac;
	this.nonAc = nonAc;
	this.availableSeat = availableSeat;
}
public Train() {
	
}
public int getTrainNo() {
	return trainNo;
}
public void setTrainNo(int trainNo) {
	this.trainNo = trainNo;
}
public String getTrainName() {
	return trainName;
}
public void setTrainName(String trainName) {
	this.trainName = trainName;
}
public String getAc() {
	return ac;
}
public void setAc(String ac) {
	this.ac = ac;
}
public String getNonAc() {
	return nonAc;
}
public void setNonAc(String nonAc) {
	this.nonAc = nonAc;
}
public int getAvailableSeat() {
	return availableSeat;
}
public void setAvailableSeat(int availableSeat) {
	this.availableSeat = availableSeat;
}
public void displayBusinfo(ArrayList<Train> train) {
System.out.println("TrainNo: "+trainNo+" AvailableSeat "+availableSeat);
	
}
public Train train(ArrayList<Train> train) {
       
	
	return Train;
}

	
	
}
