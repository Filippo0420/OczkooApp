package com.fpp.oczkoo;

public class listyKart {
    private int[] cardsId = {
            R.drawable.karowalet,
            R.drawable.kierwalet,
            R.drawable.treflwalet,
            R.drawable.pikwalet,
            R.drawable.karokrolowa,
            R.drawable.kierkrolowa,
            R.drawable.treflkrolowa,
            R.drawable.pikkrolowa,
            R.drawable.karokrol,
            R.drawable.kierkrol,
            R.drawable.treflkrol,
            R.drawable.pikkrol,
            R.drawable.karo2,
            R.drawable.kier2,
            R.drawable.trefl2,
            R.drawable.pik2,
            R.drawable.karo3,
            R.drawable.kier3,
            R.drawable.trefl3,
            R.drawable.pik3,
            R.drawable.karo4,
            R.drawable.kier4,
            R.drawable.trefl4,
            R.drawable.pik4,
            R.drawable.karo5,
            R.drawable.kier5,
            R.drawable.trefl5,
            R.drawable.pik5,
            R.drawable.karo6,
            R.drawable.kier6,
            R.drawable.trefl6,
            R.drawable.pik6,
            R.drawable.karo7,
            R.drawable.kier7,
            R.drawable.trefl7,
            R.drawable.pik7,
            R.drawable.karo8,
            R.drawable.kier8,
            R.drawable.trefl8,
            R.drawable.pik8,
            R.drawable.karo9,
            R.drawable.kier9,
            R.drawable.trefl9,
            R.drawable.pik9,
            R.drawable.karo10,
            R.drawable.kier10,
            R.drawable.trefl10,
            R.drawable.pik10
    };
    private int[] cardsKaro = {
            R.drawable.karowalet,
            R.drawable.karokrolowa,
            R.drawable.karokrol,
            R.drawable.karo2,
            R.drawable.karo3,
            R.drawable.karo4,
            R.drawable.karo5,
            R.drawable.karo6,
            R.drawable.karo7,
            R.drawable.karo8,
            R.drawable.karo9,
            R.drawable.karo10
    };
    private int[] cardsKier = {
            R.drawable.kierwalet,
            R.drawable.kierkrolowa,
            R.drawable.kierkrol,
            R.drawable.kier2,
            R.drawable.kier3,
            R.drawable.kier4,
            R.drawable.kier5,
            R.drawable.kier6,
            R.drawable.kier7,
            R.drawable.kier8,
            R.drawable.kier9,
            R.drawable.kier10
    };
    private int[] cardsTrefl = {
            R.drawable.treflwalet,
            R.drawable.treflkrolowa,
            R.drawable.treflkrol,
            R.drawable.trefl2,
            R.drawable.trefl3,
            R.drawable.trefl4,
            R.drawable.trefl5,
            R.drawable.trefl6,
            R.drawable.trefl7,
            R.drawable.trefl8,
            R.drawable.trefl9,
            R.drawable.trefl10
    };
    private int[] cardsPik = {
            R.drawable.pikwalet,
            R.drawable.pikkrolowa,
            R.drawable.pikkrol,
            R.drawable.pik2,
            R.drawable.pik3,
            R.drawable.pik4,
            R.drawable.pik5,
            R.drawable.pik6,
            R.drawable.pik7,
            R.drawable.pik8,
            R.drawable.pik9,
            R.drawable.pik10
    };
    private int[][] naRodzaje = {

            {
                    R.drawable.karo2,
                    R.drawable.kier2,
                    R.drawable.trefl2,
                    R.drawable.pik2
            },
            {R.drawable.karo3,
                    R.drawable.kier3,
                    R.drawable.trefl3,
                    R.drawable.pik3,
            },
            {R.drawable.karo4,
                    R.drawable.kier4,
                    R.drawable.trefl4,
                    R.drawable.pik4,
            },
            {R.drawable.karo5,
                    R.drawable.kier5,
                    R.drawable.trefl5,
                    R.drawable.pik5,
            },
            {R.drawable.karo6,
                    R.drawable.kier6,
                    R.drawable.trefl6,
                    R.drawable.pik6,
            },
            {R.drawable.karo7,
                    R.drawable.kier7,
                    R.drawable.trefl7,
                    R.drawable.pik7,
            },
            {R.drawable.karo8,
                    R.drawable.kier8,
                    R.drawable.trefl8,
                    R.drawable.pik8,
            },
            {R.drawable.karo9,
                    R.drawable.kier9,
                    R.drawable.trefl9,
                    R.drawable.pik9,
            },
            {R.drawable.karo10,
                    R.drawable.kier10,
                    R.drawable.trefl10,
                    R.drawable.pik10,
            },
            {R.drawable.karowalet,
                    R.drawable.kierwalet,
                    R.drawable.treflwalet,
                    R.drawable.pikwalet
            },
            {R.drawable.karokrolowa,
                    R.drawable.kierkrolowa,
                    R.drawable.treflkrolowa,
                    R.drawable.pikkrolowa,
            },
            {R.drawable.karokrol,
                    R.drawable.kierkrol,
                    R.drawable.treflkrol,
                    R.drawable.pikkrol,
            },
            {R.drawable.karoas,
                    R.drawable.kieras,
                    R.drawable.treflas,
                    R.drawable.pikas,
            }

    };

    private int[] punktyLista = {
        2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 3, 4, 11
    };

    public int[][] getKartyRodzaje(){
        return naRodzaje.clone();
    }
    public int[] getKartyPunkty(){
        return punktyLista.clone();
    }
}
