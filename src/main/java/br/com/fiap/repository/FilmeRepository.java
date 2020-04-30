
package br.com.fiap.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import br.com.fiap.model.FilmeModel;
import org.springframework.stereotype.Repository;

@Repository
public class FilmeRepository {
	private static Map<Long, FilmeModel> filmes;

	private FilmeRepository() {
		filmes = new HashMap<Long, FilmeModel>();
		filmes.put(1l, new FilmeModel(1l, "Rubber", 2010, 14, "1h 22min", "Comédia, fantasia e horror",
                "Quentin Dupieux", "Stephen Spinella, Roxane Mesquida, Wings Hauser", 5.8,
                "No deserto, um pneu assassino usa poderes telepáticos para matar animais e fazer cabeças de humanos explodirem e sente-se estranhamente atraído por uma jovem.",
                "https://i.pinimg.com/originals/c9/ce/20/c9ce20d3af6a41456260e84bd3be7e8f.jpg"));
        filmes.put(2l, new FilmeModel(2l, "300", 2006, 18, "1h 57min", "Ação e drama", "Zack Snyder",
                "Gerard Butler, Lena Headey, David Wenham", 7.6,
                "Em 480 A.C., existe uma guerra entre a Pérsia, liderada pelo rei Xerxes, e a Grécia. Na batalha de Thermopylae, Leônidas, rei da cidade grega de Sparta, lidera seu guerreiros em desvantagem contra o massivo exército persa. Mesmo sabendo que a morte certa os espera, seus sacrifícios inspiram toda a Grécia a unir-se contra o seu inimigo comum.",
                "https://img.elo7.com.br/product/zoom/264DABF/big-poster-filme-300-ascensao-do-imperio-lo01-tam-90x60-cm-poster-de-filme.jpg"));
        filmes.put(3l, new FilmeModel(3l, "Machete", 2010, 18, "1h 45min", "Ação, Crime e suspense",
                "Ethan Maniquis e Robert Rodriguez", "Danny trejo, Michelle Rodriguez, Robert De Niro ", 6.6,
                "Depois de quase ser morto durante uma briga violenta com um poderoso traficante, um ex-agente federal mexicano, conhecido como Machete, percorre as ruas do Texas trabalhando como operário e vigilante. Contratado para cometer um assassinato, ele é traído e forçado a fugir. Machete parte em busca de vingança e abre caminho com sangue, balas e corações partidos na sua jornada para acertar as contas.",
                "https://www.vortexcultural.com.br/images/2013/09/machete-poster.jpg"));
        filmes.put(4l, new FilmeModel(4l, "Your Name", 2016, 0, "1h 46min", "Animação, Drama e fantasia",
                "Makoto Shinkai", "Ryûnosuke Kamiki, Mone Kamishiraishi, Ryô Narita", 8.4,
                "Mitsuha é a filha do prefeito de uma pequena cidade, mas sonha em tentar a sorte em Tóquio. Taki trabalha em um restaurante em Tóquio e deseja largar o seu emprego. Os dois não se conhecem, mas estão conectados pelas imagens de seus sonhos.",
                "https://www.record.com.br/wp-content/uploads/2019/07/15833.jpeg"));
        filmes.put(5l, new FilmeModel(5l, "O Poderoso Chefão", 1972, 14, "2h 55min", "Drama e crime",
                "Francis Ford Coppola", "Marlon Brando, Al Pacino, James Caan", 9.2,
                "Uma família mafiosa luta para estabelecer sua supremacia nos Estados Unidos depois da Segunda Guerra Mundial. Uma tentativa de assassinato deixa o chefão Vito Corleone incapacitado e força os filhos Michael e Sonny a assumir os negócios.",
                "https://www.loucademiadecinema.com.br/wp-content/uploads/2018/01/O-Poderoso-Chef%C3%A3o-1972-The-Godfather-original.jpg"));
        filmes.put(6l, new FilmeModel(6l, "Vingadores: Ultimato", 2019, 12, "3h 01min", "Ação, aventura e drama",
                "Anthony Russo, Joe Russo", " Robert Downey Jr., Chris Evans, Mark Ruffalo", 8.4,
                "Após Thanos eliminar metade das criaturas vivas, os Vingadores têm de lidar com a perda de amigos e entes queridos. Com Tony Stark vagando perdido no espaço sem água e comida, Steve Rogers e Natasha Romanov lideram a resistência contra o titã louco.",
                "https://universoreverso.com.br/wp-content/uploads/2019/03/avengers-endgame-poster.jpg"));
        filmes.put(7l, new FilmeModel(7l, "Marley & Eu", 2008, 0, "1h 51min", "Comédia, drama e família",
                "David Frankel", "Owen Wilson, Jennifer Aniston, Eric Dane", 7.1,
                "Os recém-casados John e Jenny Grogan se mudam de Michigan para a Flórida, onde eles compram sua primeira casa e encontram trabalhos em competitivos jornais. Mais tarde, o casal adota Marley, um adorável filhote de labrador amarelo. Marley cresce rapidamente e se torna bastante travesso. Ainda assim, mesmo enquanto ele está destruindo a mobília e não obedece, ele sempre consegue alegrar John, Jenny e sua crescente família.",
                "https://m.media-amazon.com/images/M/MV5BYTlkYmM2NjAtMDkyZi00M2JiLThjZmItMjUzZDhiMDg2NGJmXkEyXkFqcGdeQXVyNTAyODkwOQ@@._V1_.jpg"));
        filmes.put(8l, new FilmeModel(8l, "Star Trek", 2009, 12, "2h 7min", "Ação, aventura e sci-fi", "J.J. Abrams",
                "Chris Pine, Zachary Quinto, Simon Pegg", 7.9,
                "A bordo do USS Enterprise, a nave mais sofisticada já construída, uma tripulação de novatos embarca em sua viagem inaugural, que é atrapalhada por Nero, um comandante cuja vingança ameaça toda a humanidade. Para que os humanos possam sobreviver, James Kirk, um jovem oficial rebelde, e Spock, um Vulcan friamente lógico, devem superar a rivalidade que há entre eles e encontrar uma maneira de derrotar Nero antes que seja tarde demais.",
                "https://i.pinimg.com/originals/c3/6d/a8/c36da858f7c230db18c70d93758e95ca.jpg"));
	}

	public ArrayList<FilmeModel> findAll() {
		return new ArrayList<FilmeModel>(filmes.values());
	}

	public FilmeModel findById(long id) {
		return filmes.get(id);
	}

	public void save(FilmeModel filmeModel) {
		Long newId = (long) (filmes.size() + 1);
		filmeModel.setId(newId);
		filmes.put(newId, filmeModel);
	}

	public void update(FilmeModel filmeModel) {
		filmes.put(filmeModel.getId(), filmeModel);
	}

	public void deleteById(long id) {
		filmes.remove(id);
	}
}
