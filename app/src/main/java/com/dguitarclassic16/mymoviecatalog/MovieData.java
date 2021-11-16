package com.dguitarclassic16.mymoviecatalog;

import java.util.ArrayList;

public class MovieData {
    private static String[] title = {
            "Rogue City", "Sponge on the Run", "Hard Kill",
            "Roald Dahl's The Witches", "2067", "The New Mutants",
            "Welcome to Sudden Death","Once Upon a Snowman", "Mulan",
            "After We Collided"
    };
    private static String[] overview = {
            "Caught in the crosshairs of police corruption and Marseilles warring gangs, a loyal cop must protect his squad by taking matters into his own hands.",
            "When his best friend Gary is suddenly snatched away, SpongeBob takes Patrick on a madcap mission far beyond Bikini Bottom to save their pink-shelled pal.",
            "The work of billionaire tech CEO Donovan Chalmers is so valuable that he hires mercenaries to protect it, and a terrorist group kidnaps his daughter just to get it.",
            "In late 1967, a young orphaned boy goes to live with his loving grandma in the rural Alabama town of Demopolis. As the boy and his grandmother encounter some deceptively glamorous but thoroughly diabolical witches, she wisely whisks him away to a seaside resort. Regrettably, they arrive at precisely the same time that the worlds Grand High Witch has gathered.",
            "A lowly utility worker is called to the future by a mysterious radio signal, he must leave his dying wife to embark on a journey that will force him to face his deepest fears in an attempt to change the fabric of reality and save humankind from its greatest environmental crisis yet.",
            "Five young mutants, just discovering their abilities while held in a secret facility against their will, fight to escape their past sins and save themselves.",
            "Jesse Freeman is a former special forces officer and explosives expert now working a regular job as a security guard in a state-of-the-art basketball arena. Trouble erupts when a tech-savvy cadre of terrorists kidnap the teams owner and Jesses daughter during opening night. Facing a ticking clock and impossible odds, its up to Jesse to not only save them but also a full house of fans in this highly charged action thriller.",
            "The previously untold origins of Olaf, the innocent and insightful, summer-loving snowman are revealed as we follow Olafs first steps as he comes to life and searches for his identity in the snowy mountains outside Arendelle.",
            "When the Emperor of China issues a decree that one man per family must serve in the Imperial Chinese Army to defend the country from Huns, Hua Mulan, the eldest daughter of an honored warrior, steps in to take the place of her ailing father. She is spirited, determined and quick on her feet. Disguised as a man by the name of Hua Jun, she is tested every step of the way and must harness her innermost strength and embrace her true potential.",
            "Tessa finds herself struggling with her complicated relationship with Hardin; she faces a dilemma that could change their lives forever."
    };
    private static int[] cover = {
            R.drawable.cv_roguecity, R.drawable.cv_spongebobmovie, R.drawable.cv_hardkill,
            R.drawable.cv_thewitches, R.drawable.cv_2067, R.drawable.cv_thenewmutant,
            R.drawable.cv_welcometosuddendeath, R.drawable.cv_onceuponasnowman, R.drawable.cv_mulan,
            R.drawable.cv_afterwecollided
    };
    private static String[] releasedate = new String[]{
            "2020-10-30", "2020-08-14", "2020-10-23",
            "2020-10-26", "2020-10-01", "2020-08-26",
            "2020-09-29", "2020-10-23", "2020-09-04",
            "2020-09-02"
    };
    private static String[] popularity = new String[]{
            "2234.266", "1982.312", "1921.272",
            "1656.547", "1575.239", "1111.204",
            "1038.096", "1008.084", "909.769",
            "903.984"
    };
    private static String[] voteaverage = new String[]{
            "6.1", "8.2", "5.1",
            "6.9", "4.8", "6.3",
            "6.3", "7.1", "7.2",
            "7.3"
    };
    static ArrayList<Movie> getListData() {
        ArrayList<Movie> list = new ArrayList<>();
        for (int position = 0; position <title.length; position++) {
            Movie movie = new Movie();
            movie.setMv_cover(cover[position]);
            movie.setMv_title(title[position]);
            movie.setMv_releasedate(releasedate[position]);
            movie.setMv_voteaverage(voteaverage[position]);
            movie.setMv_overview(overview[position]);
            list.add(movie);
        }
        return list;
    }
}
