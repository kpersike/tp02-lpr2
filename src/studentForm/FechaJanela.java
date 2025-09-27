/*
 CBTLPR2 - Trabalho Prático 02

 Nome: Kaik Persike Maiorquino
 Prontuário: CB3029689
 
 Nome: Matheus Penteado
 Prontuário: CB3031501
*/


// classe FechaJanela

package studentForm;

import java.awt.*;
import java.awt.event.*;

class FechaJanela extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}
