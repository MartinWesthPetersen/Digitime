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
6 Der skal indf�res et system som gemmer alle �bne timesedler som igangv�rende, n�r programmet lukkes, 
og som automatisk �bnes n�r programmet �bnes igen. 	

4 Ved lukning af programmet skal der tjekkes om sluttid er skrevet.

5 Husk-at-lukke-sedler boksen skal have mulighed for at disables. (checkbox)

7 Timetakst og pris parser skal m�ske indf�res.

6 Man skal kunne markere en timeseddel som afsluttet s� den ikke loades ved opstart.

*/
public class Main {

	public static void main(String[] args) {
		Startup.instance.execute();
		MainFrame.instance.setVisible(true);			
	}
}

