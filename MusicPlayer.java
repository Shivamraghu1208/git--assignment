mport java.util.*;

public class MusicPlayer {

    public static int getRandomNumber() {
        int max = 3;
        int min = 0;
        int range = max - min + 1;//

        int ran = (int) (Math.random() * range) + min;

        return ran;

    }//0,1,2,3




    public void shuffle(List<String> list) {
        System.out.println("Before shuffling: " + list);
        int length = list.size();
        for (int index = 0; index < length; index++) {
            int randomNumber = getRandomNumber();
            String temp= list.get(index);
            list.set(index, list.get(randomNumber));
            list.set(randomNumber, temp);
        }
        System.out.println("After shuffling: " + list);
    }


    public static void main (String[]args){
        Playlist playlist = new Playlist();
        List<String> list = new ArrayList<>();
        list.add("SOULmate" );
        list.add("zike");
        list.add("one");
        list.add("true");
        playlist.shuffle(list);
    }
}
