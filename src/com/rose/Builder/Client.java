package com.rose.Builder;

import java.util.ArrayList;

public class Client
{
	public static void main(String[] args)
	
	{
		/*BenzModel benz = new BenzModel();
		ArrayList<String> sequence = new ArrayList<String>();
		sequence.add("engine boom");
		sequence.add("start");
		sequence.add("stop");
		
		benz.setSequence(sequence);
		benz.run();*/
		/*
		ArrayList<String> sequence = new ArrayList<String>();
		sequence.add("engine boom"); //客户要求,run的时候时候先发动引擎
		sequence.add("start"); //启动起来
		sequence.add("stop"); //开了一段就停下来
		
		//要一个奔驰车:
		BenzBuilder benzBuilder = new BenzBuilder();
		//把顺序给这个builder类,制造出这样一个车出来
		benzBuilder.setSequence(sequence);
		//制造出一个奔驰车
		BenzModel benz = (BenzModel)benzBuilder.getCarModel();
		//奔驰车跑一下看看
		benz.run();
		
		//按照同样的顺序,我再要一个宝马
		BMWBuilder bmwBuilder = new BMWBuilder();
		bmwBuilder.setSequence(sequence);
		BMWModel bmw = (BMWModel)bmwBuilder.getCarModel();
		bmw.run();*/
		
		Director director = new Director();
		//1W辆A类型的奔驰车
		for(int i=0;i<10;i++){
		director.getABenzModel().run();
		}
		//100W辆B类型的奔驰车
		for(int i=0;i<10;i++){
		director.getBBenzModel().run();
		}
		//1000W量C类型的宝马车
		for(int i=0;i<10;i++){
		director.getCBMWModel().run();
		}

		

	}
}
