package com.rose.Bridge;

public class Client
{
	public static void main(String[] args)
	{
		/*System.out.println("-------房地产公司是这个样子运行的-------");
		//先找到我的公司
		HouseCorp houseCorp =new HouseCorp();
		//看我怎么挣钱
		houseCorp.makeMoney();
		System.out.println("\n");
		System.out.println("-------服装公司是这样运行的-------");
		ClothesCorp clothesCorp = new ClothesCorp();
		clothesCorp.makeMoney();
		
		System.out.println("-------山寨公司是这样运行的-------");
		IPodCorp iPodCorp = new IPodCorp();
		iPodCorp.makeMoney();
*/
		House house = new House();
		System.out.println("-------房地产公司是这个样子运行的-------");
		HouseCorp houseCorp =new HouseCorp(house);
		
		houseCorp.makeMoney();
		System.out.println("\n");
		
		System.out.println("-------山寨公司是这样运行的-------");
		//ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new Clothes());
		ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new IPod());

		shanZhaiCorp.makeMoney();



	}
}
