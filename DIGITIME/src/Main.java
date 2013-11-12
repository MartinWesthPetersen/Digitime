import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import appliction.Startup;

import rowcalculator.SlutActions;
import gui.MainFrame;

/*
6 Der skal indføres et system som gemmer alle åbne timesedler som igangværende, når programmet lukkes, 
og som automatisk åbnes når programmet åbnes igen. 	

4 Ved lukning af programmet skal der tjekkes om sluttid er skrevet.

5 Husk-at-lukke-sedler boksen skal have mulighed for at disables. (checkbox)

7 Timetakst og pris parser skal måske indføres.

6 Man skal kunne markere en timeseddel som afsluttet så den ikke loades ved opstart.

*/
public class Main {

	public static void main(String[] args) {
		Startup.instance.execute();
		MainFrame.instance.setVisible(true);			
	}
}

