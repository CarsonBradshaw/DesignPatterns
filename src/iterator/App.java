package iterator;

import iterator.iterable.DinerMenu;
import iterator.iterable.Iterable;
import iterator.iterable.PancakeHouseMenu;
import iterator.iterator.Iterator;
import iterator.model.MenuItem;

public class App {

    private static class Waitress{
        private Iterable breakfastMenu;
        private Iterable lunchMenu;

        private Waitress(Iterable breakfastMenu, Iterable lunchMenu){
            this.breakfastMenu = breakfastMenu;
            this.lunchMenu = lunchMenu;
        }

        public void printMenus(){
            System.out.println("Breakfast:");
            printFrom(breakfastMenu);
            System.out.println("Lunch:");
            printFrom(lunchMenu);
        }

        private void printFrom(Iterable menu){
            Iterator<MenuItem> iter = menu.iterator();
            while(iter.hasNext())
                System.out.println(iter.next());
        }
    }

    public static void main(String[] args) {
        Waitress waitress = new Waitress(new PancakeHouseMenu(), new DinerMenu(6));
        waitress.printMenus();
    }
}
