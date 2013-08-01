package com.design.observer.event;

import java.awt.event.ActionListener;
import java.beans.EventHandler;

public class TestObserver {
	public static void main(String[] args) {
		Boss boss = new Boss();
		
		StockObserver kk = new StockObserver("kk", boss);
		NBAStockObserver sb = new NBAStockObserver("SB", boss);
		
		//boss.update = new EventHandler(ActionListener.class, "", "", "");
		boss.update = EventHandler.create(EventHandler.class, kk, "closeMark");
	}
}
