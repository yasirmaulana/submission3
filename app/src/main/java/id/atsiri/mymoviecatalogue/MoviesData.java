package id.atsiri.mymoviecatalogue;

import java.util.ArrayList;

public class MoviesData {
    public static String [][] data = new String[][]{
            {"http://atsiri.id/movies/poster_a_star.jpg","http://atsiri.id/movies/poster_a_star_width.jpg","A Star Is Born","October 6, 2018","75%","Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally\\'s career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons."},
            {"http://atsiri.id/movies/poster_aquaman.jpg","http://atsiri.id/movies/poster_aquaman_width.jpg","Aquaman","December 21, 2018","68%","Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm\\'s half-human, half-Atlantean brother and true heir to the throne."},
            {"http://atsiri.id/movies/poster_avengerinfinity.jpg","http://atsiri.id/movies/poster_avenger_width.jpg","Avengers: Infinity War","April 27, 2018","83%","As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain."},
            {"http://atsiri.id/movies/poster_birdbox.jpg","http://atsiri.id/movies/poster_birdbox_width.jpg","Bird Box","May 13, 2018","78%","Five years after an ominous unseen presence drives most of society to suicide, a survivor and her two children make a desperate bid to reach safety."},
            {"http://atsiri.id/movies/poster_bumblebee.jpg","http://atsiri.id/movies/poster_bumblebee_width.jpg","Bumblebee","January 10, 2018","82%","On the run in the year 1987, Bumblebee finds refuge in a junkyard in a small Californian beach town. Charlie, on the cusp of turning 18 and trying to find her place in the world, discovers Bumblebee, battle-scarred and broken. When Charlie revives him, she quickly learns this is no ordinary yellow VW bug."},
            {"http://atsiri.id/movies/poster_deadpool.jpg","http://atsiri.id/movies/poster_deadpool_width.jpg","Once Upon a Deadpool","November 23, 2018","77%","A kidnapped Fred Savage is forced to endure Deadpool\\'s PG-13 rendition of Deadpool 2 as a Princess Bride\\-esque story that\\'s full of magic, wonder and zero F\\'s."},
            {"http://atsiri.id/movies/poster_robinhood.jpg","http://atsiri.id/movies/poster_robinhood_width.jpg","Robin Hood","February 13, 2018","76%","A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown."},
            {"http://atsiri.id/movies/poster_spiderman.jpg","http://atsiri.id/movies/poster_spiderman_width.jpg","Spider-Man: Into the Spider-Verse", "April 16, 2018","92%","Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \\'Kingpin\\' Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension."},
            {"http://atsiri.id/movies/poster_venom.jpg","http://atsiri.id/movies/poster_venom_width.jpg","Venom","January 29, 2018","87%","Investigative journalist Eddie Brock attempts a comeback following a scandal, but accidentally becomes the host of Venom, a violent, super powerful alien symbiote. Soon, he must rely on his newfound powers to protect the world from a shadowy organization looking for a symbiote of their own."},
            {"http://atsiri.id/movies/poster_ralph.jpg","http://atsiri.id/movies/poster_ralph_width.jpg","Ralph Breaks the Internet","February 2, 2018","75%","Video game bad guy Ralph and fellow misfit Vanellope von Schweetz must risk it all by traveling to the World Wide Web in search of a replacement part to save Vanellope\\'s video game, \\'Sugar Rush.\\' In way over their heads, Ralph and Vanellope rely on the citizens of the internet -- the netizens -- to help navigate their way, including an entrepreneur named Yesss, who is the head algorithm and the heart and soul of trend-making site BuzzzTube."},
            {"http://atsiri.id/movies/poster_blackpanther.jpg","http://atsiri.id/movies/poster_blackpanther_width.jpg","Black Panther","Juny 12, 2018","88%","King T\\'Challa returns home from America to the reclusive, technologically advanced African nation of Wakanda to serve as his country\\'s new leader. However, T\\'Challa soon finds that he is challenged for the throne by factions within his own country as well as without. Using powers reserved to Wakandan kings, T\\'Challa assumes the Black Panther mantel to join with girlfriend Nakia, the queen-mother, his princess-kid sister, members of the Dora Milaje (the Wakandan \\'special forces\\') and an American secret agent, to prevent Wakanda from being dragged into a world war."}
    };

    public static ArrayList<Movie> getListData() {
        ArrayList<Movie> list = new ArrayList<>();
        for (String[] aData : data) {
            Movie movie = new Movie();
            movie.setPoster(aData[0]);
            movie.setBanner(aData[1]);
            movie.setName(aData[2]);
            movie.setMovieDate(aData[3]);
            movie.setScore(aData[4]);
            movie.setOverview(aData[5]);

            list.add(movie);
        }

        return list;
    }
}
