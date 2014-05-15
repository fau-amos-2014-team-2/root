package com.fau.amos.team2.WoundManagement.BodyWoundSelector;

import com.fau.amos.team2.WoundManagement.model.BodyLocation;

public enum WoundPosition {

	HINTERKOPF(BodyLocation.HINTERKOPF, 121, 44),
//	SCHAEDELANSATZ(2),
	NACKEN(BodyLocation.NACKEN, 121, 79),
	SCHULTERBLATT_OBEN_LI(BodyLocation.SCHULTERBLATT_OBEN_LI, 90, 106),
	SCHULTERBLATT_UNTEN_LI(BodyLocation.SCHULTERBLATT_UNTEN_LI, 95, 140),
	SCHULTERBLATT_OBEN_RE(BodyLocation.SCHULTERBLATT_OBEN_RE, 150, 106),
	SCHULTERBLATT_UNTEN_RE(BodyLocation.SCHULTERBLATT_UNTEN_RE, 145, 140),
	ELLENBOGEN_LI(BodyLocation.ELLENBOGEN_LI, 60, 196),
	ELLENBOGEN_RE(BodyLocation.ELLENBOGEN_RE, 182, 196),
	KREUZBEIN(BodyLocation.KREUZBEIN, 120, 235),
	FERSE_LI(BodyLocation.FERSE_LI, 112, 504),
	FERSE_RE(BodyLocation.FERSE_RE, 131, 504),
	GESAESS_LI(BodyLocation.GESAESS_LI, 91, 256),
	GESAESS_RE(BodyLocation.GESAESS_RE, 146, 256),
	WADE_LI(BodyLocation.WADE_LI, 94, 410),
	WADE_RE(BodyLocation.WADE_RE, 149, 410),
	WIRBELSAEULE(BodyLocation.WIRBELSAEULE, 121, 160),
	ANALFALTE(BodyLocation.ANALFALTE, 121, 261),
	HAND_AUSSEN_LI(BodyLocation.HAND_AUSSEN_LI, 36, 270),
	HAND_AUSSEN_RE(BodyLocation.HAND_AUSSEN_RE, 206, 270),

	OHR_RE(BodyLocation.OHR_RE, 457, 48),
	SCHULTER_RE(BodyLocation.SCHULTER_RE, 427, 106),
	TROCHANTER_RE(BodyLocation.TROCHANTER_RE, 171, 271),
	KNOECHEL_RE(BodyLocation.KNOECHEL_RE, 131, 481),
	UNTERE_FERSE_RE(BodyLocation.UNTERE_FERSE_RE, 278, 480),
	UNTERE_SOHLE_RE(BodyLocation.UNTERE_SOHLE_RE, 278, 450),
	ZEHENUNTERSEITE_RE(BodyLocation.ZEHENUNTERSEITE_RE, 277, 416),
	ZEHENOBERSEITE_RE(BodyLocation.ZEHENOBERSEITE_RE, 322, 305),
	FUSSOBERSEITE_RE(BodyLocation.FUSSOBERSEITE_RE, 322, 343),
	OBERARM_RE(BodyLocation.OBERARM_RE, 420, 163),
	UNTERARM_RE(BodyLocation.UNTERARM_RE, 547, 214),

	OHR_LI(BodyLocation.OHR_LI, 503, 48),
	SCHULTER_LI(BodyLocation.SCHULTER_LI, 528, 106),
	TROCHANTER_LI(BodyLocation.TROCHANTER_LI, 72, 271),
	KNOECHEL_LI(BodyLocation.KNOECHEL_LI, 112, 481),
	UNTERE_FERSE_LI(BodyLocation.UNTERE_FERSE_LI, 321, 480),
	UNTERE_SOHLE_LI(BodyLocation.UNTERE_SOHLE_LI, 321, 450),
	ZEHENUNTERSEITE_LI(BodyLocation.ZEHENUNTERSEITE_LI, 322, 416),
	ZEHENOBERSEITE_LI(BodyLocation.ZEHENOBERSEITE_LI, 277, 305),
	FUSSOBERSEITE_LI(BodyLocation.FUSSOBERSEITE_LI, 277, 343),
	OBERARM_LI(BodyLocation.OBERARM_LI, 535, 163),
	UNTERARM_LI(BodyLocation.UNTERARM_LI, 408, 214),

	GESICHT(BodyLocation.GESICHT, 478, 53),
	KNIE_RE(BodyLocation.KNIE_RE, 454, 373),
	KNIE_LI(BodyLocation.KNIE_LI, 504, 373),
	BRUSTBEIN(BodyLocation.BRUSTBEIN, 478, 130),
	BRUST_RE(BodyLocation.BRUST_RE, 458, 140),
	BRUST_LI(BodyLocation.BRUST_LI, 501, 140),
	BAUCH(BodyLocation.BAUCH, 478, 195),
	LEISTE_RE(BodyLocation.LEISTE_RE, 457, 239),
	LEISTE_LI(BodyLocation.LEISTE_LI, 500, 239),
	HAND_RE(BodyLocation.HAND_RE, 391, 266),
	HAND_LI(BodyLocation.HAND_LI, 563, 266),
	SCHIENBEIN_RE(BodyLocation.SCHIENBEIN_RE, 452, 421),
	SCHIENBEIN_LI(BodyLocation.SCHIENBEIN_LI, 503, 421),
	OBERSCHENKEL_RE(BodyLocation.OBERSCHENKEL_RE, 452, 305),
	OBERSCHENKEL_LI(BodyLocation.OBERSCHENKEL_LI, 505, 305),
	RIPPENBOGEN_RE(BodyLocation.RIPPENBOGEN_RE, 454, 174),
	RIPPENBOGEN_LI(BodyLocation.RIPPENBOGEN_LI, 498, 173)
	;

	private BodyLocation bodyLocation;
	private int xPosition;
	private int yPosition;

	private WoundPosition(BodyLocation bodyLocation, int xPosition, int yPosition) {
		this.bodyLocation = bodyLocation;
		this.xPosition = xPosition;
		this.yPosition = yPosition;
	}

	public BodyLocation getBodyLocation() {
		return this.bodyLocation;
	}

	public int getXPosition() {
		return xPosition;
	}

	public int getYPosition() {
		return yPosition;
	}

	public String getDescription() {
		return bodyLocation.toString();
	}
}