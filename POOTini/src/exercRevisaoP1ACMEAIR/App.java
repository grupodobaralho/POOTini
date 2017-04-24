package exercRevisaoP1ACMEAIR;

public class App {
	
	public static void main(String[] args) {
		
		ListaDeBagagens lista = new ListaDeBagagens();
		
		BagagemFragil bgf1 = new BagagemFragil(18, "bagagem fragil 1");
		BagagemFragil bgf2 = new BagagemFragil(17, "bagagem fragil 2");
		BagagemFragil bgf3 = new BagagemFragil(15, "bagagem fragil 3");
		BagagemFragil bgf4 = new BagagemFragil(20, "bagagem fragil 4");
		BagagemFragil bgf5 = new BagagemFragil(22, "bagagem fragil 5");
		BagagemFragil bgf6 = new BagagemFragil(23, "bagagem fragil 6");

		BagagemNormal bgn1 = new BagagemNormal(18, "bagagem normal 1");
		BagagemNormal bgn2 = new BagagemNormal(17, "bagagem normal 2");
		BagagemNormal bgn3 = new BagagemNormal(15, "bagagem normal 3");
		BagagemNormal bgn4 = new BagagemNormal(20, "bagagem normal 4");
		BagagemNormal bgn5 = new BagagemNormal(22, "bagagem normal 5");
		BagagemNormal bgn6 = new BagagemNormal(23, "bagagem normal 6");
		BagagemNormal bgn7 = new BagagemNormal(30, "bagagem normal 7");
		
		BagagemDeMao bgm1 = new BagagemDeMao(2, "bagagem de mao 1");
		BagagemDeMao bgm2 = new BagagemDeMao(3, "bagagem de mao 2");
		BagagemDeMao bgm3 = new BagagemDeMao(5, "bagagem de mao 3");
		BagagemDeMao bgm4 = new BagagemDeMao(6, "bagagem de mao 4");
		BagagemDeMao bgm5 = new BagagemDeMao(8, "bagagem de mao 5");
		BagagemDeMao bgm6 = new BagagemDeMao(15, "bagagem de mao 6");
		
		lista.add(bgf1);
		lista.add(bgf2);
		lista.add(bgf3);
		lista.add(bgf4);
		lista.add(bgf5);
		lista.add(bgf6);
		
		lista.add(bgn1);
		lista.add(bgn2);
		lista.add(bgn3);
		lista.add(bgn4);
		lista.add(bgn5);
		lista.add(bgn6);
		lista.add(bgn7);
		
		lista.add(bgm1);
		lista.add(bgm2);
		lista.add(bgm3);
		lista.add(bgm4);
		lista.add(bgm5);
		lista.add(bgm6);
		
		BagagemNormal.setCustoFixo(10);
		
		System.out.println("Custo bagagem NORMAL 5: " + bgn5.getCusto());
		System.out.println("Custo bagagem FRAGIL 6: " + bgf6.getCusto());
		System.out.println("Custo bagagem DE MAO 4: " + bgm4.getCusto());
		
		System.out.println("Total Bagagens de mao: "+ lista.getTotalBagagensDeMao());
		
		System.out.println("Total de bagagens: "+ Bagagem.getTotalBagagens());		
		
		System.out.println("\n" + lista.relatorio());
		
		lista.ordenaPeso();
		
		System.out.println("\n" + lista.relatorio());
		
		System.out.println("\nCusto total: " + lista.custoTotal());	
		
	}

}
