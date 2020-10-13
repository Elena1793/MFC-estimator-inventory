package site.Data.Resources;

import org.openqa.selenium.By;

import static site.Data.WebElements.UserMenu_WebElements.*;

/**
 * Created by Lena on 10.12.2019.
 */
public class Item {

    public static By language;
    public static Category category;
    public static Application application;
    public static UseFor useFor;
    public static Room room;

    public Item(By language) {
        this.language = language;
        this.category = new Category(language);
        this.application=new Application(language);
        this.useFor=new UseFor(language);
        this.room=new Room(language);
    }

    public static class Category {
        private By language;
        public static String Other ="Other";

        public Category(By language) {
            this.language = language;
            if(language.equals(Greek_language)){
                this.Other = "Άλλα";
            }
            if(language.equals(Portugal_language)){
                this.Other = "Outros";
            }
            if(language.equals(Spanish_language)){
                this.Other = "Otros";
            }

        }
    }

    public static class Application {
        private By language;
        public static String Both = "Both";

        public Application(By language) {
            this.language = language;
            if(language.equals(Greek_language)){
                this.Both = "Both";
            }
        }
    }

    public static class UseFor {
        private By language;
        public static String Both = "Both";

        public UseFor(By language) {
            this.language = language;
            if(language.equals(Greek_language)){
                this.Both = "Both";
            }
        }
    }

    public static class Room {
        private By language;
        public static String testRoom = "testRoom";
        public static String Hallway1 = "Hallway1";
        public static String Balcony = "Balcony";
        public Room(By language) {
            this.language=language;
            if(language.equals(Greek_language)){
                this.testRoom = "testRoom";
                this.Hallway1="Hallway1";
                this.Balcony="Balcony";
            }
        }
    }
}
