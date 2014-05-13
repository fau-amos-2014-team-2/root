package com.fau.amos.team2.WoundManagement.model;

public enum BodyLocation {
	
	HINTERKOPF(1),
	SCHAEDELANSATZ(2),
	NACKEN(3),
	SCHULTERBLATT_OBEN_LI(4),
	SCHULTERBLATT_UNTEN_LI(5),
	SCHULTERBLATT_OBEN_RE(6),
	SCHULTERBLATT_UNTEN_RE(7),
	ELLENBOGEN_LI(8),
	ELENBOGEN_RE(9),
	KREUZBEIN(10),
	FERSE_LI(11),
	FERSE_RE(12),
	GESAESS_LI(13),
	GESAESS_RE(14),
	WADE_LI(15),
	WADE_RE(16),
	WIRBELSAEULE(17),
	ANALFALTE(18),
	HAND_AUSSEN_LI(19),
	HAND_AUSSEN_RE(20),
	
	OHR_RE(21),
	SCHULTER_RE(22),
	TROCHANTER_RE(23),
	KNOECHEL_RE(24),
	UNTERE_FERSE_RE(25),
	UNTERE_SOHLE_RE(26),
	ZEHENUNTERSEITE_RE(27),
	ZEHENOBERSEITE_RE(28),
	FUSSOBERSEITE_RE(29),
	OBERARM_RE(30),
	UNTERARM_RE(31),
	
	OHR_LI(41),
	SCHULTER_LI(42),
	TROCHANTER_LI(43),
	KNOECHEL_LI(44),
	UNTERE_FERSE_LI(45),
	UNTERE_SOHLE_LI(46),
	ZEHENUNTERSEITE_LI(47),
	ZEHENOBERSEITE_LI(48),
	FUSSOBERSEITE_LI(49),
	OBERARM_LI(50),
	UNTERARM_LI(51),

	GESICHT(61),
	KNIE_RE(62),
	KNIE_LI(63),
	BRUSTBEIN(64),
	BRUST_RE(65),
	BRUST_LI(66),
	BAUCH(67),
	LEISTE_RE(68),
	LEISTE_LI(69),
	HAND_RE(70),
	HAND_LI(71),
	SCHIENBEIN_RE(72),
	SCHIENBEIN_LI(73),
	OBERSCHENKEL_RE(74),
	OBERSCHENKEL_LI(75),
	RIPPENBOGEN_RE(76),
	RIPPENBOGEN_LI(77)
	;
	
	private int value;
	
	private BodyLocation (int i){
		this.value = i;
	}
	
	public String toString(){
		switch (this){
		case HINTERKOPF: return "Hinterkopf";
		case SCHAEDELANSATZ: return "Schädelansatz";
		case NACKEN: return "Nacken";
		case SCHULTERBLATT_OBEN_LI: return "Schulterblatt oben links";
		case SCHULTERBLATT_UNTEN_LI: return "Schulterblatt unten links";
		case SCHULTERBLATT_OBEN_RE: return "Schulterblatt oben rechts";
		case SCHULTERBLATT_UNTEN_RE: return "Schulterblatt unten rechts";
		case ELLENBOGEN_LI: return "Ellenbogen links";
		case ELENBOGEN_RE: return "Ellenbogen rechts";
		case KREUZBEIN: return "Kreuzbein";
		case FERSE_LI: return "Ferse links";
		case FERSE_RE: return "Ferse rechts";
		case GESAESS_LI: return "Gesäß links";
		case GESAESS_RE: return "Gesäß rechts";
		case WADE_LI: return "Wade links";
		case WADE_RE: return "Wade rechts";
		case WIRBELSAEULE: return "Wirbelsäule";
		case ANALFALTE: return "Analfalte";
		case HAND_AUSSEN_LI: return "Hand außen links";
		case HAND_AUSSEN_RE: return "Hand außen rechts";
		
		case OHR_RE: return "Ohr rechts";
		case SCHULTER_RE: return "Schulter rechts";
		case TROCHANTER_RE: return "Trochanter rechts";
		case KNOECHEL_RE: return "Knöchel rechts";
		case UNTERE_FERSE_RE: return "Untere Ferse rechts";
		case UNTERE_SOHLE_RE: return "Untere Sohle rechts";
		case ZEHENUNTERSEITE_RE: return "Zehenunterseite rechts";
		case ZEHENOBERSEITE_RE: return "Zehenoberseite rechts";
		case FUSSOBERSEITE_RE: return "Fußoberseite rechts";
		case OBERARM_RE: return "Oberarm rechts";
		case UNTERARM_RE: return "Unterarm rechts";
		
		case OHR_LI: return "Ohr links";
		case SCHULTER_LI: return "Schulter links";
		case TROCHANTER_LI: return "Trochanter links";
		case KNOECHEL_LI: return "Knöchel links";
		case UNTERE_FERSE_LI: return "Untere Ferse links";
		case UNTERE_SOHLE_LI: return "Untere Sohle links";
		case ZEHENUNTERSEITE_LI: return "Zehenunterseite links";
		case ZEHENOBERSEITE_LI: return "Zehenoberseite links";
		case FUSSOBERSEITE_LI: return "Fußoberseite links";
		case OBERARM_LI: return "Oberarm links";
		case UNTERARM_LI: return "Unterarm links";

		case GESICHT: return "Gesicht";
		case KNIE_RE: return "Knie rechts";
		case KNIE_LI: return "Knie links";
		case BRUSTBEIN: return "Brustbein";
		case BRUST_RE: return "Brust rechts";
		case BRUST_LI: return "Brust links";
		case BAUCH: return "Bauch";
		case LEISTE_RE: return "Leiste rechts";
		case LEISTE_LI: return "Leiste links";
		case HAND_RE: return "Hand rechts";
		case HAND_LI: return "Hand links";
		case SCHIENBEIN_RE: return "Schienbein rechts";
		case SCHIENBEIN_LI: return "Schienbein links";
		case OBERSCHENKEL_RE: return "Oberschenkel rechts";
		case OBERSCHENKEL_LI: return "Oberschenkel links";
		case RIPPENBOGEN_RE: return "Rippenbogen rechts";
		case RIPPENBOGEN_LI: return "Rippenbogen links";
		}
		return "";
	}
	
	public String toFullString(){
		return this.value + " - " + this.toString();
	}
	
	public int getValue(){
		return this.value;
	}

}
