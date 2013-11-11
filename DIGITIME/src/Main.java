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

1 Timetakst skal være sat ved opstart.

4 Ved lukning af programmet skal der tjekkes om sluttid er skrevet.

3 Man skal kun kunne loade den samme fil een gang.

5 Husk-at-lukke-sedler boksen skal have mulighed for at disables. (checkbox)

2 Man skal kunne lukke en timseddel.

*/
public class Main {

	public static void main(String[] args) {
		Startup.instance.execute();
		MainFrame.instance.setVisible(true);			
	}
}

