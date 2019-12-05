import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

//INSTANCIAS
		
		Cliente fernando = new Cliente("1", "1", "Fernando", "Aparicio", 30, false);
				
		Cine cinesa = new Cine(1, "Cinesa", 15, new Localizacion("Av. de Manoteras", "28050", "Madrid"));
		Cine yelmo = new Cine(2, "Yelmo Cines", 12, new Localizacion("Plaza Norte 2", "28703", "Madrid"));
		Cine kinepolis = new Cine(3, "Kinepolis", 10, new Localizacion("Ciudad de la Imagen", "28223", "Madrid"));
		Cine imax = new Cine(4, "IMAX", 20, new Localizacion(" Av. Gran Breta�a", "28916", "Leganes, Madrid"));
		
		Productora marvel = new Productora("Marvel Studios");
		Productora DC = new Productora("DC");
		Productora WB = new Productora("Warner Bros.");
		Productora WD = new Productora("Walt Disney Pictures");
		Productora eon = new Productora("Eon Productions");
		
		Pelicula avengers = new Pelicula(1, "Avangers: Endgame", "Acci�n", "3h", marvel);
		Pelicula shazam = new Pelicula(2, "Shazam", "Acci�n", "2h 45m", DC);
		Pelicula aladin = new Pelicula(3, "Aladdin", "Ciencia ficci�n", "2h 45m", WD);
		Pelicula cMarvel = new Pelicula(4, "Captain Marvel", "Acci�n", "2h 5m", marvel);
		Pelicula dPick = new Pelicula(5, "Detective Pikachu", "Fantas�a", "1h 45m", WB);
		Pelicula hellboy = new Pelicula(6, "Hellboy", "Acci�n", "2h", DC);
		Pelicula dumbo = new Pelicula(7, "Dumbo", "Fantasia", "1h 45m", WD);
		Pelicula JB = new Pelicula(8, "007: Spectre", "Acci�n", "2h 40m", eon);
		
		Participante rdj = new Participante("RDJ", 54, "Actor");
		Participante chrisE = new Participante("Chris Evans", 37, "Actor");
		Participante chrisH = new Participante("Chris Hemsworth", 35, "Actor");
		Participante scarletJ = new Participante("Scarlett Johanson", 34, "Actriz");
		Participante markR = new Participante("Mark Ruffalo", 51, "Actor");
		Participante jeremyR = new Participante("Jeremy Renner", 48, "Actor");
		Participante joshB = new Participante("Josh Brolin", 51, "Actor");
		Participante anthonyR = new Participante("Anthony Russo", 49, "Director");
		Participante joeR = new Participante("Joe Russo", 47, "Director");
		
		Participante zacharyL = new Participante("Zachary Levi", 38, "Actor");
		Participante asherA = new Participante("Chris Hemsworth", 16, "Actor");
		Participante markS = new Participante("Mark Strong", 55, "Actor");
		Participante davidF = new Participante("David F. Sandberg", 38, "Director");
		
		Participante mennaM = new Participante("Menna Mashoud", 27, "Actor");
		Participante willS = new Participante("Will Smith", 50, "Actor");
		Participante naomiS = new Participante("Naomi Scott", 26, "Actriz");
		Participante guyR = new Participante("Guy Ritchie", 50, "Director");
		
		Participante brieL = new Participante("Brie Larson", 29, "Actriz");
		Participante samuelL = new Participante("Samuel L. Jackson", 70, "Actor");
		Participante judeL = new Participante("Jude Law", 46, "Actor");
		Participante annaB = new Participante("Anna Boden", 42, "Directora");
		
		Participante justiceS = new Participante("Justice Smith", 23, "Actor");
		Participante ryanR = new Participante("Ryan Reynolds", 42, "Actor");
		Participante kathrynN = new Participante("Kathryn Newton", 22, "Actriz");
		Participante billN = new Participante("Bill Nighy", 69, "Actor");
		Participante robL = new Participante("Rob Letterman", 48, "Director");

		Participante davidH = new Participante("David Harbour", 44, "Actor");
		Participante millaH = new Participante("Milla Jovovich", 43, "Actriz");
		Participante ianM = new Participante("Ian McShane", 76, "Actor");
		Participante neilM = new Participante("Neil Marshall", 48, "Director");
		
		Participante evaG = new Participante("Eva Green", 38, "Actriz");
		Participante dannyD = new Participante("Danny DeVito", 74, "Actor");
		Participante colinL = new Participante("Colin Farrell", 42, "Actor");
		Participante timB = new Participante("Tim Burton", 60, "Director");
		
		Participante danielC = new Participante("Daniel Craig", 51, "Actor");
		Participante leaS = new Participante("L�a Seydoux", 33, "Actor");
		Participante christophW = new Participante("Christoph Waltz", 62, "Actor");
		Participante samM = new Participante("Sam Mendes", 53, "Director");
		
		Sala sala1 = new Sala(1, 1, 10, 18);
		Sala sala2 = new Sala(2, 2, 14, 20);
		Sala sala3 = new Sala(3, 3, 11, 17);
		Sala sala4 = new Sala(4, 4, 10, 18);
		Sala sala5 = new Sala(5, 5, 10, 18);
		Sala sala6 = new Sala(6, 6, 10, 18);
		Sala sala7 = new Sala(7, 7, 10, 18);
		Sala sala8 = new Sala(8, 8, 10, 18);
		
		Proyeccion proyeccion1Ac = new Proyeccion(1, new Fecha(27, 4, 2019, new Hora(12, 00)), sala1);
		Proyeccion proyeccion2Ac = new Proyeccion(2, new Fecha(28, 4, 2019, new Hora(20, 30)), sala2);
		Proyeccion proyeccion3Ac = new Proyeccion(3, new Fecha(29, 4, 2019, new Hora(20, 30)), sala3);
		Proyeccion proyeccion4Ac = new Proyeccion(4, new Fecha(30, 4, 2019, new Hora(20, 30)), sala4);
		Proyeccion proyeccion1Sc = new Proyeccion(5, new Fecha(1, 5, 2019, new Hora(20, 30)), sala1);
		Proyeccion proyeccion2Sc = new Proyeccion(6, new Fecha(2, 6, 2019, new Hora(20, 30)), sala2);
		Proyeccion proyeccion3Sc = new Proyeccion(7, new Fecha(3, 7, 2019, new Hora(20, 30)), sala3);
		Proyeccion proyeccion4Sc = new Proyeccion(8, new Fecha(4, 8, 2019, new Hora(20, 30)), sala4);
		Proyeccion proyeccion1ALc = new Proyeccion(9, new Fecha(27, 4, 2019, new Hora(12, 00)), sala1);
		Proyeccion proyeccion2ALc = new Proyeccion(10, new Fecha(28, 4, 2019, new Hora(20, 30)), sala2);
		Proyeccion proyeccion3ALc = new Proyeccion(11, new Fecha(29, 4, 2019, new Hora(20, 30)), sala3);
		Proyeccion proyeccion4ALc = new Proyeccion(12, new Fecha(30, 4, 2019, new Hora(20, 30)), sala4);
		Proyeccion proyeccion1CMc = new Proyeccion(13, new Fecha(27, 4, 2019, new Hora(12, 00)), sala1);
		Proyeccion proyeccion2CMc = new Proyeccion(14, new Fecha(28, 4, 2019, new Hora(20, 30)), sala2);
		Proyeccion proyeccion3CMc = new Proyeccion(15, new Fecha(29, 4, 2019, new Hora(20, 30)), sala3);
		Proyeccion proyeccion4CMc = new Proyeccion(16, new Fecha(30, 4, 2019, new Hora(20, 30)), sala4);
		Proyeccion proyeccion1DPc = new Proyeccion(17, new Fecha(27, 4, 2019, new Hora(20, 30)), sala5);
		Proyeccion proyeccion2DPc = new Proyeccion(18, new Fecha(28, 4, 2019, new Hora(20, 30)), sala6);
		Proyeccion proyeccion3DPc = new Proyeccion(19, new Fecha(29, 4, 2019, new Hora(20, 30)), sala7);
		Proyeccion proyeccion4DPc = new Proyeccion(20, new Fecha(30, 4, 2019, new Hora(20, 30)), sala8);
		Proyeccion proyeccion1HBc = new Proyeccion(21, new Fecha(27, 4, 2019, new Hora(20, 30)), sala5);
		Proyeccion proyeccion2HBc = new Proyeccion(22, new Fecha(28, 4, 2019, new Hora(20, 30)), sala6);
		Proyeccion proyeccion3HBc = new Proyeccion(23, new Fecha(29, 4, 2019, new Hora(20, 30)), sala7);
		Proyeccion proyeccion4HBc = new Proyeccion(24, new Fecha(30, 4, 2019, new Hora(20, 30)), sala8);
		Proyeccion proyeccion1Dc = new Proyeccion(25, new Fecha(27, 4, 2019, new Hora(12, 00)), sala1);
		Proyeccion proyeccion2Dc = new Proyeccion(26, new Fecha(28, 4, 2019, new Hora(20, 30)), sala2);
		Proyeccion proyeccion3Dc = new Proyeccion(27, new Fecha(29, 4, 2019, new Hora(20, 30)), sala3);
		Proyeccion proyeccion4Dc = new Proyeccion(28, new Fecha(30, 4, 2019, new Hora(20, 30)), sala4);
		Proyeccion proyeccion1JBc = new Proyeccion(29, new Fecha(27, 4, 2019, new Hora(20, 30)), sala5);
		Proyeccion proyeccion2JBc = new Proyeccion(30, new Fecha(28, 4, 2019, new Hora(20, 30)), sala6);
		Proyeccion proyeccion3JBc = new Proyeccion(31, new Fecha(29, 4, 2019, new Hora(20, 30)), sala7);
		Proyeccion proyeccion4JBc = new Proyeccion(34, new Fecha(30, 4, 2019, new Hora(20, 30)), sala8);
		
		Proyeccion proyeccion1Ay = new Proyeccion(35, new Fecha(27, 4, 2019, new Hora(12, 00)), sala1);
		Proyeccion proyeccion2Ay = new Proyeccion(36, new Fecha(28, 4, 2019, new Hora(20, 30)), sala2);
		Proyeccion proyeccion3Ay = new Proyeccion(37, new Fecha(29, 4, 2019, new Hora(20, 30)), sala3);
		Proyeccion proyeccion4Ay = new Proyeccion(38, new Fecha(30, 4, 2019, new Hora(20, 30)), sala4);
		Proyeccion proyeccion1Sy = new Proyeccion(39, new Fecha(1, 5, 2019, new Hora(20, 30)), sala1);
		Proyeccion proyeccion2Sy = new Proyeccion(40, new Fecha(2, 6, 2019, new Hora(20, 30)), sala2);
		Proyeccion proyeccion3Sy = new Proyeccion(41, new Fecha(3, 7, 2019, new Hora(20, 30)), sala3);
		Proyeccion proyeccion4Sy = new Proyeccion(42, new Fecha(4, 8, 2019, new Hora(20, 30)), sala4);
		Proyeccion proyeccion1ALy = new Proyeccion(43, new Fecha(27, 4, 2019, new Hora(12, 00)), sala1);
		Proyeccion proyeccion2ALy = new Proyeccion(44, new Fecha(28, 4, 2019, new Hora(20, 30)), sala2);
		Proyeccion proyeccion3ALy = new Proyeccion(45, new Fecha(29, 4, 2019, new Hora(20, 30)), sala3);
		Proyeccion proyeccion4ALy = new Proyeccion(46, new Fecha(30, 4, 2019, new Hora(20, 30)), sala4);
		Proyeccion proyeccion1CMy = new Proyeccion(47, new Fecha(27, 4, 2019, new Hora(12, 00)), sala1);
		Proyeccion proyeccion2CMy = new Proyeccion(48, new Fecha(28, 4, 2019, new Hora(20, 30)), sala2);
		Proyeccion proyeccion3CMy = new Proyeccion(49, new Fecha(29, 4, 2019, new Hora(20, 30)), sala3);
		Proyeccion proyeccion4CMy = new Proyeccion(50, new Fecha(30, 4, 2019, new Hora(20, 30)), sala4);
		Proyeccion proyeccion1DPy = new Proyeccion(51, new Fecha(27, 4, 2019, new Hora(20, 30)), sala5);
		Proyeccion proyeccion2DPy = new Proyeccion(52, new Fecha(28, 4, 2019, new Hora(20, 30)), sala6);
		Proyeccion proyeccion3DPy = new Proyeccion(53, new Fecha(29, 4, 2019, new Hora(20, 30)), sala7);
		Proyeccion proyeccion4DPy = new Proyeccion(54, new Fecha(30, 4, 2019, new Hora(20, 30)), sala8);
		Proyeccion proyeccion1HBy = new Proyeccion(56, new Fecha(27, 4, 2019, new Hora(20, 30)), sala5);
		Proyeccion proyeccion2HBy = new Proyeccion(57, new Fecha(28, 4, 2019, new Hora(20, 30)), sala6);
		Proyeccion proyeccion3HBy = new Proyeccion(58, new Fecha(29, 4, 2019, new Hora(20, 30)), sala7);
		Proyeccion proyeccion4HBy = new Proyeccion(59, new Fecha(30, 4, 2019, new Hora(20, 30)), sala8);
		Proyeccion proyeccion1Dy = new Proyeccion(60, new Fecha(27, 4, 2019, new Hora(12, 00)), sala1);
		Proyeccion proyeccion2Dy = new Proyeccion(61, new Fecha(28, 4, 2019, new Hora(20, 30)), sala2);
		Proyeccion proyeccion3Dy = new Proyeccion(62, new Fecha(29, 4, 2019, new Hora(20, 30)), sala3);
		Proyeccion proyeccion4Dy = new Proyeccion(63, new Fecha(30, 4, 2019, new Hora(20, 30)), sala4);
		Proyeccion proyeccion1JBy = new Proyeccion(64, new Fecha(27, 4, 2019, new Hora(20, 30)), sala5);
		Proyeccion proyeccion2JBy = new Proyeccion(65, new Fecha(28, 4, 2019, new Hora(20, 30)), sala6);
		Proyeccion proyeccion3JBy = new Proyeccion(66, new Fecha(29, 4, 2019, new Hora(20, 30)), sala7);
		Proyeccion proyeccion4JBy = new Proyeccion(67, new Fecha(30, 4, 2019, new Hora(20, 30)), sala8);
		
		Proyeccion proyeccion1Ak = new Proyeccion(68, new Fecha(27, 4, 2019, new Hora(12, 00)), sala1);
		Proyeccion proyeccion2Ak = new Proyeccion(69, new Fecha(28, 4, 2019, new Hora(20, 30)), sala2);
		Proyeccion proyeccion3Ak = new Proyeccion(70, new Fecha(29, 4, 2019, new Hora(20, 30)), sala3);
		Proyeccion proyeccion4Ak = new Proyeccion(71, new Fecha(30, 4, 2019, new Hora(20, 30)), sala4);
		Proyeccion proyeccion1Sk = new Proyeccion(72, new Fecha(1, 5, 2019, new Hora(20, 30)), sala1);
		Proyeccion proyeccion2Sk = new Proyeccion(73, new Fecha(2, 6, 2019, new Hora(20, 30)), sala2);
		Proyeccion proyeccion3Sk = new Proyeccion(74, new Fecha(3, 7, 2019, new Hora(20, 30)), sala3);
		Proyeccion proyeccion4Sk = new Proyeccion(75, new Fecha(4, 8, 2019, new Hora(20, 30)), sala4);
		Proyeccion proyeccion1ALk = new Proyeccion(76, new Fecha(27, 4, 2019, new Hora(12, 00)), sala1);
		Proyeccion proyeccion2ALk = new Proyeccion(77, new Fecha(28, 4, 2019, new Hora(20, 30)), sala2);
		Proyeccion proyeccion3ALk = new Proyeccion(78, new Fecha(29, 4, 2019, new Hora(20, 30)), sala3);
		Proyeccion proyeccion4ALk = new Proyeccion(79, new Fecha(30, 4, 2019, new Hora(20, 30)), sala4);
		Proyeccion proyeccion1CMk = new Proyeccion(80, new Fecha(27, 4, 2019, new Hora(12, 00)), sala1);
		Proyeccion proyeccion2CMk = new Proyeccion(81, new Fecha(28, 4, 2019, new Hora(20, 30)), sala2);
		Proyeccion proyeccion3CMk = new Proyeccion(82, new Fecha(29, 4, 2019, new Hora(20, 30)), sala3);
		Proyeccion proyeccion4CMk = new Proyeccion(83, new Fecha(30, 4, 2019, new Hora(20, 30)), sala4);
		Proyeccion proyeccion1DPk = new Proyeccion(84, new Fecha(27, 4, 2019, new Hora(20, 30)), sala5);
		Proyeccion proyeccion2DPk = new Proyeccion(85, new Fecha(28, 4, 2019, new Hora(20, 30)), sala6);
		Proyeccion proyeccion3DPk = new Proyeccion(86, new Fecha(29, 4, 2019, new Hora(20, 30)), sala7);
		Proyeccion proyeccion4DPk = new Proyeccion(87, new Fecha(30, 4, 2019, new Hora(20, 30)), sala8);
		Proyeccion proyeccion1HBk = new Proyeccion(88, new Fecha(27, 4, 2019, new Hora(20, 30)), sala5);
		Proyeccion proyeccion2HBk = new Proyeccion(89, new Fecha(28, 4, 2019, new Hora(20, 30)), sala6);
		Proyeccion proyeccion3HBk = new Proyeccion(90, new Fecha(29, 4, 2019, new Hora(20, 30)), sala7);
		Proyeccion proyeccion4HBk = new Proyeccion(91, new Fecha(30, 4, 2019, new Hora(20, 30)), sala8);
		Proyeccion proyeccion1Dk = new Proyeccion(91, new Fecha(27, 4, 2019, new Hora(12, 00)), sala1);
		Proyeccion proyeccion2Dk = new Proyeccion(93, new Fecha(28, 4, 2019, new Hora(20, 30)), sala2);
		Proyeccion proyeccion3Dk = new Proyeccion(94, new Fecha(29, 4, 2019, new Hora(20, 30)), sala3);
		Proyeccion proyeccion4Dk = new Proyeccion(95, new Fecha(30, 4, 2019, new Hora(20, 30)), sala4);
		Proyeccion proyeccion1JBk = new Proyeccion(96, new Fecha(27, 4, 2019, new Hora(20, 30)), sala5);
		Proyeccion proyeccion2JBk = new Proyeccion(97, new Fecha(28, 4, 2019, new Hora(20, 30)), sala6);
		Proyeccion proyeccion3JBk = new Proyeccion(98, new Fecha(29, 4, 2019, new Hora(20, 30)), sala7);
		Proyeccion proyeccion4JBk = new Proyeccion(99, new Fecha(30, 4, 2019, new Hora(20, 30)), sala8);
		
		Proyeccion proyeccion1Ai = new Proyeccion(100, new Fecha(27, 4, 2019, new Hora(12, 00)), sala1);
		Proyeccion proyeccion2Ai = new Proyeccion(101, new Fecha(28, 4, 2019, new Hora(20, 30)), sala2);
		Proyeccion proyeccion3Ai = new Proyeccion(102, new Fecha(29, 4, 2019, new Hora(20, 30)), sala3);
		Proyeccion proyeccion4Ai = new Proyeccion(103, new Fecha(30, 4, 2019, new Hora(20, 30)), sala4);
		Proyeccion proyeccion1Si = new Proyeccion(104, new Fecha(1, 5, 2019, new Hora(20, 30)), sala1);
		Proyeccion proyeccion2Si = new Proyeccion(105, new Fecha(2, 6, 2019, new Hora(20, 30)), sala2);
		Proyeccion proyeccion3Si = new Proyeccion(106, new Fecha(3, 7, 2019, new Hora(20, 30)), sala3);
		Proyeccion proyeccion4Si = new Proyeccion(107, new Fecha(4, 8, 2019, new Hora(20, 30)), sala4);
		Proyeccion proyeccion1ALi = new Proyeccion(108, new Fecha(27, 4, 2019, new Hora(12, 00)), sala1);
		Proyeccion proyeccion2ALi = new Proyeccion(109, new Fecha(28, 4, 2019, new Hora(20, 30)), sala2);
		Proyeccion proyeccion3ALi = new Proyeccion(110, new Fecha(29, 4, 2019, new Hora(20, 30)), sala3);
		Proyeccion proyeccion4ALi = new Proyeccion(111, new Fecha(30, 4, 2019, new Hora(20, 30)), sala4);
		Proyeccion proyeccion1CMi = new Proyeccion(112, new Fecha(27, 4, 2019, new Hora(12, 00)), sala1);
		Proyeccion proyeccion2CMi = new Proyeccion(113, new Fecha(28, 4, 2019, new Hora(20, 30)), sala2);
		Proyeccion proyeccion3CMi = new Proyeccion(114, new Fecha(29, 4, 2019, new Hora(20, 30)), sala3);
		Proyeccion proyeccion4CMi = new Proyeccion(115, new Fecha(30, 4, 2019, new Hora(20, 30)), sala4);
		Proyeccion proyeccion1DPi = new Proyeccion(116, new Fecha(27, 4, 2019, new Hora(20, 30)), sala5);
		Proyeccion proyeccion2DPi = new Proyeccion(117, new Fecha(28, 4, 2019, new Hora(20, 30)), sala6);
		Proyeccion proyeccion3DPi = new Proyeccion(118, new Fecha(29, 4, 2019, new Hora(20, 30)), sala7);
		Proyeccion proyeccion4DPi = new Proyeccion(119, new Fecha(30, 4, 2019, new Hora(20, 30)), sala8);
		Proyeccion proyeccion1HBi = new Proyeccion(120, new Fecha(27, 4, 2019, new Hora(20, 30)), sala5);
		Proyeccion proyeccion2HBi = new Proyeccion(121, new Fecha(28, 4, 2019, new Hora(20, 30)), sala6);
		Proyeccion proyeccion3HBi = new Proyeccion(122, new Fecha(29, 4, 2019, new Hora(20, 30)), sala7);
		Proyeccion proyeccion4HBi = new Proyeccion(123, new Fecha(30, 4, 2019, new Hora(20, 30)), sala8);
		Proyeccion proyeccion1Di = new Proyeccion(124, new Fecha(27, 4, 2019, new Hora(12, 00)), sala1);
		Proyeccion proyeccion2Di = new Proyeccion(125, new Fecha(28, 4, 2019, new Hora(20, 30)), sala2);
		Proyeccion proyeccion3Di = new Proyeccion(126, new Fecha(29, 4, 2019, new Hora(20, 30)), sala3);
		Proyeccion proyeccion4Di = new Proyeccion(127, new Fecha(30, 4, 2019, new Hora(20, 30)), sala4);
		Proyeccion proyeccion1JBi = new Proyeccion(128, new Fecha(27, 4, 2019, new Hora(20, 30)), sala5);
		Proyeccion proyeccion2JBi = new Proyeccion(129, new Fecha(28, 4, 2019, new Hora(20, 30)), sala6);
		Proyeccion proyeccion3JBi = new Proyeccion(130, new Fecha(29, 4, 2019, new Hora(20, 30)), sala7);
		Proyeccion proyeccion4JBi = new Proyeccion(131, new Fecha(30, 4, 2019, new Hora(20, 30)), sala8);
		
		GestorRegistros gr = new GestorRegistros();
		
		Menu menu = new Menu(gr);

//IMPLEMENTACIONES EN LISTAS
		
		gr.anadirCliente(fernando);  
		
		avengers.anadirParticipante(rdj);
		avengers.anadirParticipante(chrisE);
		avengers.anadirParticipante(chrisH);
		avengers.anadirParticipante(scarletJ);
		avengers.anadirParticipante(markR);
		avengers.anadirParticipante(jeremyR);
		avengers.anadirParticipante(brieL);
		avengers.anadirParticipante(samuelL);
		avengers.anadirParticipante(joshB);
		avengers.anadirParticipante(anthonyR);
		avengers.anadirParticipante(joeR);
		shazam.anadirParticipante(zacharyL);
		shazam.anadirParticipante(asherA);
		shazam.anadirParticipante(markS);
		shazam.anadirParticipante(davidF);
		aladin.anadirParticipante(mennaM);
		aladin.anadirParticipante(willS);
		aladin.anadirParticipante(naomiS);
		aladin.anadirParticipante(guyR);
		cMarvel.anadirParticipante(brieL);
		cMarvel.anadirParticipante(samuelL);
		cMarvel.anadirParticipante(judeL);
		cMarvel.anadirParticipante(annaB);
		dPick.anadirParticipante(justiceS);
		dPick.anadirParticipante(ryanR);
		dPick.anadirParticipante(kathrynN);
		dPick.anadirParticipante(billN);
		dPick.anadirParticipante(robL);
		hellboy.anadirParticipante(davidH);
		hellboy.anadirParticipante(millaH);
		hellboy.anadirParticipante(ianM);
		hellboy.anadirParticipante(neilM);
		dumbo.anadirParticipante(evaG);
		dumbo.anadirParticipante(dannyD);
		dumbo.anadirParticipante(colinL);
		dumbo.anadirParticipante(timB);
		JB.anadirParticipante(danielC);
		JB.anadirParticipante(leaS);
		JB.anadirParticipante(christophW);
		JB.anadirParticipante(samM);
		
		marvel.anadirPelicula(avengers);
		marvel.anadirPelicula(cMarvel);
		DC.anadirPelicula(shazam);
		DC.anadirPelicula(hellboy);
		WD.anadirPelicula(aladin);
		WD.anadirPelicula(dumbo);
		WB.anadirPelicula(dPick);
		eon.anadirPelicula(JB);
		
		gr.anadirPelicula(avengers);
		gr.anadirPelicula(shazam);
		gr.anadirPelicula(aladin);
		gr.anadirPelicula(cMarvel);
		gr.anadirPelicula(dPick);
		gr.anadirPelicula(hellboy);
		gr.anadirPelicula(dumbo);
		gr.anadirPelicula(JB);
		
		gr.anadirCine(1, cinesa);
		gr.anadirCine(1, yelmo);
		gr.anadirCine(1, kinepolis);
		gr.anadirCine(1, imax);
		gr.anadirCine(2, cinesa);
		gr.anadirCine(2, yelmo);
		gr.anadirCine(2, kinepolis);
		gr.anadirCine(2, imax);
		gr.anadirCine(3, cinesa);
		gr.anadirCine(3, yelmo);
		gr.anadirCine(3, kinepolis);
		gr.anadirCine(3, imax);
		gr.anadirCine(4, cinesa);
		gr.anadirCine(4, yelmo);
		gr.anadirCine(4, kinepolis);
		gr.anadirCine(4, imax);
		gr.anadirCine(5, cinesa);
		gr.anadirCine(5, yelmo);
		gr.anadirCine(5, kinepolis);
		gr.anadirCine(5, imax);
		gr.anadirCine(6, cinesa);
		gr.anadirCine(6, yelmo);
		gr.anadirCine(6, kinepolis);
		gr.anadirCine(6, imax);
		gr.anadirCine(7, cinesa);
		gr.anadirCine(7, yelmo);
		gr.anadirCine(7, kinepolis);
		gr.anadirCine(7, imax);
		gr.anadirCine(8, cinesa);
		gr.anadirCine(8, yelmo);
		gr.anadirCine(8, kinepolis);
		gr.anadirCine(8, imax);
		
		gr.anadirSala(1, sala1);
		gr.anadirSala(1, sala2);
		gr.anadirSala(1, sala3);
		gr.anadirSala(1, sala4);
		gr.anadirSala(1, sala5);
		gr.anadirSala(1, sala6);
		gr.anadirSala(1, sala7);
		gr.anadirSala(1, sala8);
		gr.anadirSala(2, sala1);
		gr.anadirSala(2, sala2);
		gr.anadirSala(2, sala3);
		gr.anadirSala(2, sala4);
		gr.anadirSala(2, sala5);
		gr.anadirSala(2, sala6);
		gr.anadirSala(2, sala7);
		gr.anadirSala(2, sala8);
		gr.anadirSala(3, sala1);
		gr.anadirSala(3, sala2);
		gr.anadirSala(3, sala3);
		gr.anadirSala(3, sala4);
		gr.anadirSala(3, sala5);
		gr.anadirSala(3, sala6);
		gr.anadirSala(3, sala7);
		gr.anadirSala(3, sala8);
		gr.anadirSala(4, sala1);
		gr.anadirSala(4, sala2);
		gr.anadirSala(4, sala3);
		gr.anadirSala(4, sala4);
		gr.anadirSala(4, sala5);
		gr.anadirSala(4, sala6);
		gr.anadirSala(4, sala7);
		gr.anadirSala(4, sala8);
		
		gr.anadirProyeccion(1, 1, proyeccion1Ac);
		gr.anadirProyeccion(1, 1, proyeccion2Ac);
		gr.anadirProyeccion(1, 1, proyeccion3Ac);
		gr.anadirProyeccion(1, 1, proyeccion4Ac);
		gr.anadirProyeccion(2, 1, proyeccion1Sc);
		gr.anadirProyeccion(2, 1, proyeccion2Sc);
		gr.anadirProyeccion(2, 1, proyeccion3Sc);
		gr.anadirProyeccion(2, 1, proyeccion4Sc);
		gr.anadirProyeccion(3, 1, proyeccion1ALc);
		gr.anadirProyeccion(3, 1, proyeccion2ALc);
		gr.anadirProyeccion(3, 1, proyeccion3ALc);
		gr.anadirProyeccion(3, 1, proyeccion4ALc);
		gr.anadirProyeccion(4, 1, proyeccion1CMc);
		gr.anadirProyeccion(4, 1, proyeccion2CMc);
		gr.anadirProyeccion(4, 1, proyeccion3CMc);
		gr.anadirProyeccion(4, 1, proyeccion4CMc);
		gr.anadirProyeccion(5, 1, proyeccion1DPc);
		gr.anadirProyeccion(5, 1, proyeccion2DPc);
		gr.anadirProyeccion(5, 1, proyeccion3DPc);
		gr.anadirProyeccion(5, 1, proyeccion4DPc);
		gr.anadirProyeccion(6, 1, proyeccion1HBc);
		gr.anadirProyeccion(6, 1, proyeccion2HBc);
		gr.anadirProyeccion(6, 1, proyeccion3HBc);
		gr.anadirProyeccion(6, 1, proyeccion4HBc);
		gr.anadirProyeccion(7, 1, proyeccion1Dc);
		gr.anadirProyeccion(7, 1, proyeccion2Dc);
		gr.anadirProyeccion(7, 1, proyeccion3Dc);
		gr.anadirProyeccion(7, 1, proyeccion4Dc);
		gr.anadirProyeccion(8, 1, proyeccion1JBc);
		gr.anadirProyeccion(8, 1, proyeccion2JBc);
		gr.anadirProyeccion(8, 1, proyeccion3JBc);
		gr.anadirProyeccion(8, 1, proyeccion4JBc);		
		gr.anadirProyeccion(1, 2, proyeccion1Ay);
		gr.anadirProyeccion(1, 2, proyeccion2Ay);
		gr.anadirProyeccion(1, 2, proyeccion3Ay);
		gr.anadirProyeccion(1, 2, proyeccion4Ay);
		gr.anadirProyeccion(2, 2, proyeccion1Sy);
		gr.anadirProyeccion(2, 2, proyeccion2Sy);
		gr.anadirProyeccion(2, 2, proyeccion3Sy);
		gr.anadirProyeccion(2, 2, proyeccion4Sy);
		gr.anadirProyeccion(3, 2, proyeccion1ALy);
		gr.anadirProyeccion(3, 2, proyeccion2ALy);
		gr.anadirProyeccion(3, 2, proyeccion3ALy);
		gr.anadirProyeccion(3, 2, proyeccion4ALy);
		gr.anadirProyeccion(4, 2, proyeccion1CMy);
		gr.anadirProyeccion(4, 2, proyeccion2CMy);
		gr.anadirProyeccion(4, 2, proyeccion3CMy);
		gr.anadirProyeccion(4, 2, proyeccion4CMy);
		gr.anadirProyeccion(5, 2, proyeccion1DPy);
		gr.anadirProyeccion(5, 2, proyeccion2DPy);
		gr.anadirProyeccion(5, 2, proyeccion3DPy);
		gr.anadirProyeccion(5, 2, proyeccion4DPy);
		gr.anadirProyeccion(6, 2, proyeccion1HBy);
		gr.anadirProyeccion(6, 2, proyeccion2HBy);
		gr.anadirProyeccion(6, 2, proyeccion3HBy);
		gr.anadirProyeccion(6, 2, proyeccion4HBy);
		gr.anadirProyeccion(7, 2, proyeccion1Dy);
		gr.anadirProyeccion(7, 2, proyeccion2Dy);
		gr.anadirProyeccion(7, 2, proyeccion3Dy);
		gr.anadirProyeccion(7, 2, proyeccion4Dy);
		gr.anadirProyeccion(8, 2, proyeccion1JBy);
		gr.anadirProyeccion(8, 2, proyeccion2JBy);
		gr.anadirProyeccion(8, 2, proyeccion3JBy);
		gr.anadirProyeccion(8, 2, proyeccion4JBy);		
		gr.anadirProyeccion(1, 3, proyeccion1Ak);
		gr.anadirProyeccion(1, 3, proyeccion2Ak);
		gr.anadirProyeccion(1, 3, proyeccion3Ak);
		gr.anadirProyeccion(1, 3, proyeccion4Ak);
		gr.anadirProyeccion(2, 3, proyeccion1Sk);
		gr.anadirProyeccion(2, 3, proyeccion2Sk);
		gr.anadirProyeccion(2, 3, proyeccion3Sk);
		gr.anadirProyeccion(2, 3, proyeccion4Sk);
		gr.anadirProyeccion(3, 3, proyeccion1ALk);
		gr.anadirProyeccion(3, 3, proyeccion2ALk);
		gr.anadirProyeccion(3, 3, proyeccion3ALk);
		gr.anadirProyeccion(3, 3, proyeccion4ALk);
		gr.anadirProyeccion(4, 3, proyeccion1CMk);
		gr.anadirProyeccion(4, 3, proyeccion2CMk);
		gr.anadirProyeccion(4, 3, proyeccion3CMk);
		gr.anadirProyeccion(4, 3, proyeccion4CMk);
		gr.anadirProyeccion(5, 3, proyeccion1DPk);
		gr.anadirProyeccion(5, 3, proyeccion2DPk);
		gr.anadirProyeccion(5, 3, proyeccion3DPk);
		gr.anadirProyeccion(5, 3, proyeccion4DPk);
		gr.anadirProyeccion(6, 3, proyeccion1HBk);
		gr.anadirProyeccion(6, 3, proyeccion2HBk);
		gr.anadirProyeccion(6, 3, proyeccion3HBk);
		gr.anadirProyeccion(6, 3, proyeccion4HBk);
		gr.anadirProyeccion(7, 3, proyeccion1Dk);
		gr.anadirProyeccion(7, 3, proyeccion2Dk);
		gr.anadirProyeccion(7, 3, proyeccion3Dk);
		gr.anadirProyeccion(7, 3, proyeccion4Dk);
		gr.anadirProyeccion(8, 3, proyeccion1JBk);
		gr.anadirProyeccion(8, 3, proyeccion2JBk);
		gr.anadirProyeccion(8, 3, proyeccion3JBk);
		gr.anadirProyeccion(8, 3, proyeccion4JBk);	
		gr.anadirProyeccion(1, 4, proyeccion1Ai);
		gr.anadirProyeccion(1, 4, proyeccion2Ai);
		gr.anadirProyeccion(1, 4, proyeccion3Ai);
		gr.anadirProyeccion(1, 4, proyeccion4Ai);
		gr.anadirProyeccion(2, 4, proyeccion1Si);
		gr.anadirProyeccion(2, 4, proyeccion2Si);
		gr.anadirProyeccion(2, 4, proyeccion3Si);
		gr.anadirProyeccion(2, 4, proyeccion4Si);
		gr.anadirProyeccion(3, 4, proyeccion1ALi);
		gr.anadirProyeccion(3, 4, proyeccion2ALi);
		gr.anadirProyeccion(3, 4, proyeccion3ALi);
		gr.anadirProyeccion(3, 4, proyeccion4ALi);
		gr.anadirProyeccion(4, 4, proyeccion1CMi);
		gr.anadirProyeccion(4, 4, proyeccion2CMi);
		gr.anadirProyeccion(4, 4, proyeccion3CMi);
		gr.anadirProyeccion(4, 4, proyeccion4CMi);
		gr.anadirProyeccion(5, 4, proyeccion1DPi);
		gr.anadirProyeccion(5, 4, proyeccion2DPi);
		gr.anadirProyeccion(5, 4, proyeccion3DPi);
		gr.anadirProyeccion(5, 4, proyeccion4DPi);
		gr.anadirProyeccion(6, 4, proyeccion1HBi);
		gr.anadirProyeccion(6, 4, proyeccion2HBi);
		gr.anadirProyeccion(6, 4, proyeccion3HBi);
		gr.anadirProyeccion(6, 4, proyeccion4HBi);
		gr.anadirProyeccion(7, 4, proyeccion1Di);
		gr.anadirProyeccion(7, 4, proyeccion2Di);
		gr.anadirProyeccion(7, 4, proyeccion3Di);
		gr.anadirProyeccion(7, 4, proyeccion4Di);
		gr.anadirProyeccion(8, 4, proyeccion1JBi);
		gr.anadirProyeccion(8, 4, proyeccion2JBi);
		gr.anadirProyeccion(8, 4, proyeccion3JBi);
		gr.anadirProyeccion(8, 4, proyeccion4JBi);
		
//IMPRIMIR POR CONSOLA
	
		menu.menuPrincipal();
		
	}

}
