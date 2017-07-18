package command;

import java.util.ArrayList;
import java.util.List;

public class PlayWithRemote {
	
	public static void main(String[] args){
		
		//criou uma tv usando o TVRemote (tv implementa ED)
		ElectronicDevice newDevice = TVRemote.getDevice();
		
		//criou o comando de ligar tv, TTVON implementa Command e recebe ED)
		TurnTVOn onCommand = new TurnTVOn(newDevice);
		
		//Criou o botao que faz o comando acima
		DeviceButton onPressed = new DeviceButton(onCommand);
		
		//precionou o botao de ligar TV... ele printa TV LIGADA
		onPressed.press();
		
		// -----------------------  CRIANDO BOTAO DE DESLIGAR		
		
		TurnTVOff offCommand = new TurnTVOff(newDevice);
		
		onPressed = new DeviceButton(offCommand);	
		
		onPressed.press();
		
		// ---------------------- BOTAO DE AUMENTAR VOLUME
		
		TurnTVUp volumeUpCommand = new TurnTVUp(newDevice);
		
		onPressed = new DeviceButton(volumeUpCommand);
		
		onPressed.press();
		onPressed.press();		
		onPressed.press();
		
		// ---------------------- BOTAO DESLIGA TODOS
		
		Television theTV = new Television();
		Radio theRadio = new Radio();
		
		List<ElectronicDevice> allDevices = new ArrayList<>();
		allDevices.add(theTV);	
		allDevices.add(theRadio);	
		
		TurnItAllOff turnOffDevices = new TurnItAllOff(allDevices);
		
		//Criou o botao que faz o comando acima
		DeviceButton turnThemOff = new DeviceButton(turnOffDevices);
		
		turnThemOff.press();
		
		
	}

}
