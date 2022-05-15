package views;

import java.awt.Color;
import java.awt.Font;

/*
 * Trabajo realizado por Angela Yurani Vargas
 * Clase UIConstants - Constantes
 */
public class UIConstants {


	//Rutas imagenes
	public static final String ICON_APP = "/img/iconApp.png";
	


		//Rutas titulos
		public static final String TITLE_APP = "Hospital Comunal Las Mercedes - Florencia Caquetá";
		
		//Rutas colores

		public static final Color COLOR_BASE_AZUL = Color.decode("#009fd9");
		public static final Color COLOR_WHITE=Color.WHITE;
		public static final Color SELECT_TYPE_USER_COLOR_BASE = Color.decode("#173e43");
		public static final Color COLOR_BACKGROUND_JTF_DIALOG_FINANCIAL_ADVISOR= Color.decode("#F2E9F3");
		public static final Color COLOR_BACKGROUND_JTF_DIALOG_ADMINISTRATOR= Color.decode("#BFC9CA");
		public static final Color COLOR_FOREGROUND_JTF_DIALOG_INPUT= Color.decode("#72777B");
		public static final Color COLOR_FOREGROUND_JL_DIALOG_ADMINISTRATOR= Color.decode("#2E4053");
		//#2E4053
		public static final Color COLOR_TRANSPARENT= (new Color(0,0,0,0));

		//Fuentes
		public static final Font FONT_TITLE_DIALOG = new Font("Gabriola", Font.BOLD, 32);
		public static final Font FONT_SELECT_USER_DIALOG = new Font("Gabriola", Font.BOLD, 24);
		public static final Font FONT_ITEMS_TABLE = new Font("Calibri", Font.BOLD, 15);
		public static final Font FONT_ITEMS_MENU_BAR = new Font("Gabriola", Font.PLAIN, 16);
		public static final Font FONT_MENU_ADMIN_WINDOW = new Font("Garamond", Font.BOLD, 17);

		//Tamaño
		public static final int WIDTH_LOGIN = 700;
		public static final int HIGTH_LOGIN = 400;
		public static final int HIGTH_SELECT_TYPE_USER = 350;
		public static final int WIDTH_SELECT_TYPE_USER = 750;

		public static final int HIGTH_DIALOG_LOGIN = 500;
		public static final int WIDTH_DIALOG_LOGIN = 700;

}