public class Exercicio04 {

	public static void main(String[] args) {
		
		char exclamacao = 0x21;
		System.out.println("Variáveis Java" + exclamacao);

		int idadeLeozinho = 5;		
		float idadeLua = 1000f;
		System.out.println("A Lua tem " + idadeLua + " anos" +  "\n\rE o seu filho Leozinho tem " + idadeLeozinho + " anos" + exclamacao);	
		
		int idadeMae = 0b101011;
		int minhaIdade = 0x10;
		System.out.println("Minha mãe tem  " + idadeMae + " anos" + exclamacao + "\ne eu tenho  " + minhaIdade + " anos" + exclamacao);		
		
		String decoracaoTexto = "༼ つ ◕_◕ ༽つ";	
		System.out.println("O Brasil foi colonizado em, " + decoracaoTexto + " 1532 DC" + exclamacao);
		
		String coracao = "( ˘ ³˘)♥";
		System.out.println("Mãe eu te amo " + coracao);
		
		double cotacaoDolar = 0b110100010;
		System.out.println("O dolar esta a valer,  " + cotacaoDolar);

		System.exit(0);	

	}

}
