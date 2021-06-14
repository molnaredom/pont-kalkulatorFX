package sample;

public interface Mozgáspontok {

    static int futas400(double ido, boolean nem) {

        //ha ferfi
        if (nem ) return meterPontdOUBLE(ido, 80, 79.5, 79, 78.5, 78, 77.5, 77, 76.5, 76, 75.5, 75, 74.5, 74,
                73.5, 73, 72.5, 72, 71.5, 71, 70.5, 70, 69.5, 69, 68.5, 68, 67.5, 67,
                66.5, 66, 65.5, 65, 64.5, 64, 63.5, 63, 62.5, 62, 61.5, 61, 60.5, 60,
                59.5, 59, 58.5, 58, 57, 57, 56.5, 56, 55.5);
        //ha no
        return meterPontdOUBLE(ido, 90, 89.5, 89, 88.5, 88, 87.5, 87, 86.5, 86, 85.5,
                85, 84.5, 84, 83.5, 83, 82.5, 82, 81.5, 81, 80.5,
                80, 79.5, 79, 78.5, 78, 77.5, 77, 76.5, 76, 75.5, 75, 74.5, 74,
                73.5, 73, 72.5, 72, 71.5, 71, 70.5,
                70, 69.5, 69, 68.5, 68, 67.5, 67, 66.5, 66, 65.5);
    }

    static int huzodszk(int db) {
        if (db == 5) return 1;
        else if (db == 6) return 4;
        else if (db == 7) return 7;
        else if (db == 8) return 10;
        else if (db == 9) return 13;
        else if (db == 10) return 16;
        else if (db == 11) return 19;
        else if (db == 12) return 22;
        else if (db == 13) return 25;
        else if (db == 14) return 28;
        else if (db == 15) return 31;
        else if (db == 16) return 34;
        else if (db == 17) return 38;
        else if (db == 18) return 42;
        else if (db == 19) return 46;
        else if (db == 20) return 50;
        else return 0; //ha semelyik se lyo
    }


    static int futas3200(int ido, boolean nem) {

        if (nem) return altalanospont(ido, 930, 926, 923, 917, 912, 908, 903, 899, 894, 890, 885, 881, 876, 872,
                867, 863, 858, 854, 849, 845, 841, 837, 833, 828, 824, 819, 815, 811, 806,
                802, 797, 793, 789, 785, 781, 776, 772, 767, 763, 758, 753, 747, 742, 738,
                734, 729, 725, 721, 717, 712);

        return altalanospont(ido, 1150, 1145, 1140, 1135, 1130, 1125, 1120, 1115, 1110, 1105, 1100,
                1095, 1090, 1085, 1080, 1074, 1069, 1064, 1059, 1053, 1048, 1043, 1038, 1032,
                1027, 1022, 1017, 1011, 1006, 1001, 995, 990, 985, 980, 975, 970, 965,
                960, 955, 950, 944, 938, 932, 927, 922, 917, 912, 906, 900, 895);
    }

    static int uszas2000(int ido, boolean nem) {
        if (nem) return altalanospont(ido, 600, 350,
                347, 344, 341, 338, 335, 332, 329, 326, 323, 320, 316, 313, 310, 307, 304, 301,
                298, 295, 292, 289, 285, 281, 277, 273, 269, 265, 261, 257, 253, 249, 245,
                241, 237, 233, 229, 225, 221, 217, 213, 209, 205, 201, 197, 193, 189, 184,
                180, 176);
        /* 1 elem hianyzik*/
        else return altalanospont(ido,20000,419,416,413,410,407,404,400,396,392,388,384,380,376,372,368,364,360,356,352,348,344,
                340,336,332,328,324,320,316,312,308,304,300,296,292,288,284,280,276,272,268,264,260,
                256,252,248,244,240,236,232);

    }

    static int gy2000(int ido, boolean nem) {
        if (nem) return altalanospont(ido, 630, 627, 625, 622, 620, 617, 615, 612, 609, 606, 603, 600, 597, 595,
                592, 589, 586, 583, 580, 577, 575, 572, 569, 566, 563, 560, 557, 555, 552,
                549, 544, 543, 540, 537, 535, 532, 529, 526, 523, 520, 515, 512, 509, 506,
                503, 500, 497, 495, 490, 490);

        return altalanospont(ido, 730, 727, 724, 721, 718, 715, 712, 709, 706, 703, 700, 697,
                694, 691, 688, 685, 682, 679, 676, 674, 672, 670, 668, 666, 664, 662,
                660, 658, 556, 654, 652, 650, 648, 646, 644, 642, 640, 638, 636, 634,
                632, 630, 628, 626, 624, 622, 620, 618, 616, 614);
    }

    static int akp(int ido, boolean nem) {
        if (nem)
            return altalanospont(ido, 338, 336, 334, 332, 330, 328, 326, 324, 322, 320, 318, 316, 314, 312, 310, 308, 306, 304, 302, 300, 298,
                    296, 294, 292, 290, 288, 286, 284, 282, 280, 278, 276, 274, 272, 270, 268, 266, 264, 262, 260, 258, 256,
                    254, 252, 250, 248, 246, 244, 242, 240);

        return altalanospont(ido, 368, 366, 364, 362, 360, 358, 356, 354, 352, 350, 348, 346, 344, 342, 340, 338, 336, 334, 332, 330, 328,
                326, 324, 322, 320, 318, 316, 314, 312, 310, 308, 306, 304, 302, 300, 298, 296, 294, 292, 290, 288, 286
                , 284, 282, 280, 278, 276, 274, 272, 270);
    }

    static int buvar(double ido, boolean nem) {
        if (nem)
            return altalanospontDouble(ido, 8.5, 9, 9.5, 10, 10.5, 11, 11.5, 12, 12.5, 13, 13.5, 14, 14.5, 15, 15.5, 16, 16.5, 17, 17.5, 18,
                    18.5, 19, 19.5, 20, 20.5, 21, 21.5, 22, 22.5, 23, 23.5, 24, 24.5, 25, 25.5, 26, 26.5, 27, 27.5, 28,
                    28.5, 29, 29.5, 30, 30.5, 31, 31.5, 32, 32.5, 33);
        return altalanospontDouble(ido, 8.5, 9, 9.5, 10, 10.5, 11, 11.5, 12, 12.5, 13, 13.5, 14, 14.5, 15, 15.5, 16, 16.5, 17, 17.5, 18, 18.5,
                19, 19.5, 20, 20.5, 21, 21.5, 22, 22.5, 23, 23.5, 24, 24.5, 25, 25.5, 26, 26.5, 27, 27.5, 28, 28.5,
                29, 29.5, 30, 30.5, 31, 31.5, 32, 32.5, 33);
    }

    static int f2000(int ido, boolean nem) {
        //rossz az egesz
        if (nem) return altalanospont(ido,630,627,625,622,620,617,615,612,609,606,603,600,597,595,592,589,586,583,580,578,576,
                574,572,570,568,566,564,562,560,558,556,554,552,550,548,546,544,542,540,538,536,534,
                532,530,528,526,524,522,520,518);
        else return altalanospont(ido, 730, 727, 724, 721, 718, 715, 712, 709, 706, 703,
                700, 697, 694, 691, 688, 685, 682, 679, 676, 674, 672,
                670, 668, 666, 664, 662, 660, 658, 556, 654, 652, 650, 648, 646,
                644, 642, 640, 638, 636, 634, 632, 630,
                628, 626, 624, 622, 620, 618, 616, 614);

    }

    static int f3200(int ido, boolean nem) {
        if (nem) return altalanospont(ido, 1050, 1046, 1041, 1037, 1032, 1028, 1023, 1019, 1014, 1010, 1005, 1001,
                996, 992, 987, 983, 978, 974, 969, 965, 961, 957, 953, 948, 944, 939, 935,
                931, 926, 922, 917, 913, 909, 905, 901, 896, 892, 887, 883, 878, 873, 867,
                862, 878, 854, 849, 845, 841, 837, 832);
        return altalanospont(ido, 1270, 1265, 1260, 1255, 1250, 1245, 1240, 1235, 1230, 1225,
                1220, 1215, 1210, 1205, 1200, 1194, 1189, 1184, 1179, 1173, 1168, 1163,
                1158, 1152, 1147, 1142, 1137, 1131, 1126, 1121, 1115, 1110, 1105, 1100,
                1095, 1090, 1085, 1080, 1075, 1070, 1064, 1058, 1052, 1047, 1042, 1037,
                1032, 1026, 1020, 1015);
    }

    static int fekvo(int db, boolean nem) {
        if (nem) return darabAltalanosPont(db, 28, 28, 30, 31, 32, 33, 34, 35,
                36, 37, 38, 39, 40, 41, 42,
                43, 44, 45, 46, 47, 48, 49, 50, 51, 52,
                53, 54, 55, 56, 57, 58, 59,
                60, 61, 62, 63, 64, 65, 66, 67, 68, 69,
                70, 71, 72, 73, 74, 75, 76, 77);

        else return darabAltalanosPont(db,10,11,11,12,13,13,14,15,15,16,
                17,17,18,18,19,20,20,21,22,22,23,24,24,25,
                26,26,27,28,28,29,29,30,31,31,32,33,34,34,
                35,35,36,37,37,38,39,39,40,41,41,42);


    }

    static int felules(int db, boolean nem) {
        /* kb 10 el tobb szam van megadva*/
        if(nem) return darabAltalanosPont(db,40,42,43,44,46,48,49,
                51,52,53,55,56,57,58,59,61,
                62,63,64,66,67,69,70,71,73,
                74,75,76,77,79,80,82,83,84,
                86,87,88,89,90,92,93,95,96,
                97,99,100,101,103,104,106);
        else {
            return darabAltalanosPont(db, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61,
                    63, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77,
                    78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91,
                    92, 93, 94, 95, 96, 97, 98);
        }

    }

    static int kezigranat(double m, boolean nem) {

        if (nem) return keziG(m, 23, 23.5, 24, 24.5, 25, 25.5, 26, 26.5, 27, 27.5, 28,
                28.5, 29, 29.5, 30, 30.5, 31, 31.5, 32, 32.5,
                33, 33, 34, 34.5, 35, 35.5, 36, 36.5, 37, 37.5, 38, 38.5, 39,
                39.5, 40, 40.5, 41, 41.5, 42, 42.5,
                43, 43.5, 44, 44.5, 45, 45.5, 46, 46.5, 47, 47.5);

        else return keziG(m, 13, 13.5, 14, 14.5, 15, 15.5, 16, 16.5, 17, 17.5 , 18, 18.5, 19, 19.5, 20, 20.5, 21, 21.5, 22, 22.5,
                23, 23.5, 24, 24.5, 25, 25.5, 26, 26.5, 27, 27.5, 28, 28.5, 29,29.5, 30, 30.5, 31,31.5,32, 32.5,
                33,33.5,34,34.5,35,35.5,36, 36.5,37,37.5);
    }


    static int gy3200(int ido, boolean nem) {

        if (nem) return altalanospont(ido,1020,1016,1011,1007,1002,998,993,989,984,980,975,971,966,962,957,953,948,944,939,935,
                931,927,923,918,914,909,905,901,896,892,887,883,879,875,871,866,862,857,853,848,843,837,832,828,824,819,815,811,807,802);

        else return altalanospont(ido, 1240, 1235, 1230, 1225, 1220, 1215, 1210, 1205, 1200, 1195, 1190,
                1185, 1180, 1175, 1170, 1164, 1159, 1154, 1149, 1143, 1138, 1133, 1128, 1122,
                1117, 1112, 1107, 1101, 1096, 1091, 1085, 1080, 1075, 1070, 1065, 1060, 1055,
                1050, 1045, 1040, 1034, 1028, 1022, 1017, 1012, 1007, 1002, 996, 990, 985);

    }

    static int fugg(double ido, boolean nem) {
        if (nem) {
            return fuggpont(ido, 300000, 13, 12.8, 12.6, 12.4, 12.2, 12,
                    11.8, 11.6, 11.4, 11.2, 11, 10.8, 10.6, 10.4,
                    10.2, 10, 9.8,
                    9.6, 9.4, 9.2, 9, 8.8, 8.6, 8.4, 8.2, 8,
                    7.8, 7.6, 7.4, 7.2, 7, 6.8, 6.6, 6.4, 6.2,
                    6, 5.8, 5.6, 5.4, 5.2,
                    5, 4.8, 4.6, 4.4, 4.2, 4, 3.8, 3.6, 3.4);
        }
        return fuggpont(ido, 30000, 17.6, 17.3, 17.0, 16.7, 16.4, 16.1, 15.8, 15.5, 15.2,
                15.9, 14.6, 14.3, 14, 13.7, 13.4, 13.1, 12.9, 12.6, 12.3, 12, 11.7,
                11.4, 11.1, 10.9, 10.7, 10.4, 10.1, 9.8, 9.5, 9.2, 8.9, 8.7, 8.5,
                8.3, 8.1, 7.9, 7.8, 7.7, 7.6, 7.5, 7.4, 7.3, 7.2, 7.1, 7, 6.9,
                6.8, 6.7, 6.6);
    }


    private static int darabAltalanosPont(int ido, int a1, int a2, int a3, int a4, int a5, int a6, int a7, int a8, int a9, int a10, int a11, int a12, int a13, int a14, int a15, int a16,
                                          int a17, int a18, int a19, int a20, int a21, int a22, int a23, int a24, int a25, int a26, int a27, int a28, int a29,
                                          int a30, int a31, int a32, int a33, int a34, int a35, int a36, int a37, int a38, int a39, int a40, int a41, int a42,
                                          int a43, int a44, int a45, int a46, int a47, int a48, int a49, int a50) {
        // AZ IDO = DARAB CSAK NEM TUDTAM ATNEVEZNI ---- EZ A RESZ AFEKBOTAMASZHOZ VAN
        if (ido >= a50) {
            return 50;
        } else if (ido >= a49) {
            return 49;
        } else if (ido >= a48) {
            return 48;
        } else if (ido >= a47) {
            return 47;
        } else if (ido >= a46) {
            return 46;
        } else if (ido >= a45) {
            return 45;
        } else if (ido >= a44) {
            return 44;
        } else if (ido >= a43) {
            return 43;
        } else if (ido >= a42) {
            return 42;
        } else if (ido >= a41) {
            return 41;
        } else if (ido >= a40) {
            return 40;
        } else if (ido >= a39) {
            return 39;
        } else if (ido >= a38) {
            return 38;
        } else if (ido >= a37) {
            return 37;
        } else if (ido >= a36) {
            return 36;
        } else if (ido >= a35) {
            return 35;
        } else if (ido >= a34) {
            return 34;
        } else if (ido >= a33) {
            return 33;
        } else if (ido >= a32) {
            return 32;
        } else if (ido >= a31) {
            return 31;
        } else if (ido >= a30) {
            return 30;
        } else if (ido >= a29) {
            return 29;
        } else if (ido >= a28) {
            return 28;
        } else if (ido >= a27) {
            return 27;
        } else if (ido >= a26) {
            return 26;
        } else if (ido >= a25) {
            return 25;
        } else if (ido >= a24) {
            return 24;
        } else if (ido >= a23) {
            return 23;
        } else if (ido >= a22) {
            return 22;
        } else if (ido >= a21) {
            return 21;
        } else if (ido >= a20) {
            return 20;
        } else if (ido >= a19) {
            return 19;
        } else if (ido >= a18) {
            return 18;
        } else if (ido >= a17) {
            return 17;
        } else if (ido >= a16) {
            return 16;
        } else if (ido >= a15) {
            return 15;
        } else if (ido >= a14) {
            return 14;
        } else if (ido >= a13) {
            return 13;
        } else if (ido >= a12) {
            return 12;
        } else if (ido >= a11) {
            return 11;
        } else if (ido >= a10) {
            return 10;
        } else if (ido >= a9) {
            return 9;
        } else if (ido >= a8) {
            return 8;
        } else if (ido >= a7) {
            return 7;
        } else if (ido >= a6) {
            return 6;
        } else if (ido >= a5) {
            return 5;
        } else if (ido >= a4) {
            return 4;
        } else if (ido >= a3) {
            return 3;
        } else if (ido >= a2) {
            return 2;
        }else if (ido >= a1) {
            return 1;
        } else {
            return 0;
        }

    }



    private static int altalanospontDouble(double ido
            , double a1, double a2, double a3, double a4, double a5, double a6, double a7, double a8, double a9, double a10, double a11, double a12, double a13,
                                           double a14, double a15, double a16, double a17, double a18, double a19, double a20, double a21, double a22, double a23,
                                           double a24, double a25, double a26, double a27, double a28, double a29, double a30, double a31, double a32, double a33,
                                           double a34, double a35, double a36, double a37, double a38, double a39, double a40, double a41, double a42, double a43,
                                           double a44, double a45, double a46, double a47, double a48, double a49, double a50) {
        if (ido < 0) {
            return 0;//akkor kisebb az ido mint nulla ha nincsenek kitoltve a mezok
        } else if (ido > a50) {
            return 50;
        } else if (ido >= a49) {
            return 49;
        } else if (ido >= a48) {
            return 48;
        } else if (ido >= a47) {
            return 47;
        } else if (ido >= a46) {
            return 46;
        } else if (ido >= a45) {
            return 45;
        } else if (ido >= a44) {
            return 44;
        } else if (ido >= a43) {
            return 43;
        } else if (ido >= a42) {
            return 42;
        } else if (ido >= a41) {
            return 41;
        } else if (ido >= a40) {
            return 40;
        } else if (ido >= a39) {
            return 39;
        } else if (ido >= a38) {
            return 38;
        } else if (ido >= a37) {
            return 37;
        } else if (ido >= a36) {
            return 36;
        } else if (ido >= a35) {
            return 35;
        } else if (ido >= a34) {
            return 34;
        } else if (ido >= a33) {
            return 33;
        } else if (ido >= a32) {
            return 32;
        } else if (ido >= a31) {
            return 31;
        } else if (ido >= a30) {
            return 30;
        } else if (ido >= a29) {
            return 29;
        } else if (ido >= a28) {
            return 28;
        } else if (ido >= a27) {
            return 27;
        } else if (ido >= a26) {
            return 26;
        } else if (ido >= a25) {
            return 25;
        } else if (ido >= a24) {
            return 24;
        } else if (ido >= a23) {
            return 23;
        } else if (ido >= a22) {
            return 22;
        } else if (ido >= a21) {
            return 21;
        } else if (ido >= a20) {
            return 20;
        } else if (ido >= a19) {
            return 19;
        } else if (ido >= a18) {
            return 18;
        } else if (ido >= a17) {
            return 17;
        } else if (ido >= a16) {
            return 16;
        } else if (ido >= a15) {
            return 15;
        } else if (ido >= a14) {
            return 14;
        } else if (ido >= a13) {
            return 13;
        } else if (ido >= a12) {
            return 12;
        } else if (ido >= a11) {
            return 11;
        } else if (ido >= a10) {
            return 10;
        } else if (ido >= a9) {
            return 9;
        } else if (ido >= a8) {
            return 8;
        } else if (ido >= a7) {
            return 7;
        } else if (ido >= a6) {
            return 6;
        } else if (ido >= a5) {
            return 5;
        } else if (ido >= a4) {
            return 4;
        } else if (ido >= a3) {
            return 3;
        } else if (ido >= a2) {
            return 2;
        } else if (ido > a1) {
            return 1;
        } else {
            return 0;
        }
    }

private static int fuggpont(double ido
            , double a1, double a2, double a3, double a4, double a5, double a6, double a7, double a8, double a9, double a10, double a11, double a12, double a13,
                                           double a14, double a15, double a16, double a17, double a18, double a19, double a20, double a21, double a22, double a23,
                                           double a24, double a25, double a26, double a27, double a28, double a29, double a30, double a31, double a32, double a33,
                                           double a34, double a35, double a36, double a37, double a38, double a39, double a40, double a41, double a42, double a43,
                                           double a44, double a45, double a46, double a47, double a48, double a49, double a50) {
        if (ido < 0) {
            return 0;//akkor kisebb az ido mint nulla ha nincsenek kitoltve a mezok
        } else if (ido < a50) {
            return 50;
        } else if (ido <= a49) {
            return 49;
        } else if (ido <= a48) {
            return 48;
        } else if (ido <= a47) {
            return 47;
        } else if (ido <= a46) {
            return 46;
        } else if (ido <= a45) {
            return 45;
        } else if (ido <= a44) {
            return 44;
        } else if (ido <= a43) {
            return 43;
        } else if (ido <= a42) {
            return 42;
        } else if (ido <= a41) {
            return 41;
        } else if (ido <= a40) {
            return 40;
        } else if (ido <= a39) {
            return 39;
        } else if (ido <= a38) {
            return 38;
        } else if (ido <= a37) {
            return 37;
        } else if (ido <= a36) {
            return 36;
        } else if (ido <= a35) {
            return 35;
        } else if (ido <= a34) {
            return 34;
        } else if (ido <= a33) {
            return 33;
        } else if (ido <= a32) {
            return 32;
        } else if (ido <= a31) {
            return 31;
        } else if (ido <= a30) {
            return 30;
        } else if (ido <= a29) {
            return 29;
        } else if (ido <= a28) {
            return 28;
        } else if (ido <= a27) {
            return 27;
        } else if (ido <= a26) {
            return 26;
        } else if (ido <= a25) {
            return 25;
        } else if (ido <= a24) {
            return 24;
        } else if (ido <= a23) {
            return 23;
        } else if (ido <= a22) {
            return 22;
        } else if (ido <= a21) {
            return 21;
        } else if (ido <= a20) {
            return 20;
        } else if (ido <= a19) {
            return 19;
        } else if (ido <= a18) {
            return 18;
        } else if (ido <= a17) {
            return 17;
        } else if (ido <= a16) {
            return 16;
        } else if (ido <= a15) {
            return 15;
        } else if (ido <= a14) {
            return 14;
        } else if (ido <= a13) {
            return 13;
        } else if (ido <= a12) {
            return 12;
        } else if (ido <= a11) {
            return 11;
        } else if (ido <= a10) {
            return 10;
        } else if (ido <= a9) {
            return 9;
        } else if (ido <= a8) {
            return 8;
        } else if (ido <= a7) {
            return 7;
        } else if (ido <= a6) {
            return 6;
        } else if (ido <= a5) {
            return 5;
        } else if (ido <= a4) {
            return 4;
        } else if (ido <= a3) {
            return 3;
        } else if (ido <= a2) {
            return 2;
        } else if (ido < a1) {
            return 1;
        } else {
            return 0;
        }
    }



    private static int meterPontdOUBLE(double ido
            , double a1, double a2, double a3, double a4, double a5, double a6, double a7, double a8, double a9, double a10, double a11, double a12, double a13,
                                           double a14, double a15, double a16, double a17, double a18, double a19, double a20, double a21, double a22, double a23,
                                           double a24, double a25, double a26, double a27, double a28, double a29, double a30, double a31, double a32, double a33,
                                           double a34, double a35, double a36, double a37, double a38, double a39, double a40, double a41, double a42, double a43,
                                           double a44, double a45, double a46, double a47, double a48, double a49, double a50) {
        if (ido < 0) {
            return 0;//akkor kisebb az ido mint nulla ha nincsenek kitoltve a mezok
        } else if (ido < a50) {
            return 50;
        } else if (ido <= a49) {
            return 49;
        } else if (ido <= a48) {
            return 48;
        } else if (ido <= a47) {
            return 47;
        } else if (ido <= a46) {
            return 46;
        } else if (ido <= a45) {
            return 45;
        } else if (ido <= a44) {
            return 44;
        } else if (ido <= a43) {
            return 43;
        } else if (ido <= a42) {
            return 42;
        } else if (ido <= a41) {
            return 41;
        } else if (ido <= a40) {
            return 40;
        } else if (ido <= a39) {
            return 39;
        } else if (ido <= a38) {
            return 38;
        } else if (ido <= a37) {
            return 37;
        } else if (ido <= a36) {
            return 36;
        } else if (ido <= a35) {
            return 35;
        } else if (ido <= a34) {
            return 34;
        } else if (ido <= a33) {
            return 33;
        } else if (ido <= a32) {
            return 32;
        } else if (ido <= a31) {
            return 31;
        } else if (ido <= a30) {
            return 30;
        } else if (ido <= a29) {
            return 29;
        } else if (ido <= a28) {
            return 28;
        } else if (ido <= a27) {
            return 27;
        } else if (ido <= a26) {
            return 26;
        } else if (ido <= a25) {
            return 25;
        } else if (ido <= a24) {
            return 24;
        } else if (ido <= a23) {
            return 23;
        } else if (ido <= a22) {
            return 22;
        } else if (ido <= a21) {
            return 21;
        } else if (ido <= a20) {
            return 20;
        } else if (ido <= a19) {
            return 19;
        } else if (ido <= a18) {
            return 18;
        } else if (ido <= a17) {
            return 17;
        } else if (ido <= a16) {
            return 16;
        } else if (ido <= a15) {
            return 15;
        } else if (ido <= a14) {
            return 14;
        } else if (ido <= a13) {
            return 13;
        } else if (ido <= a12) {
            return 12;
        } else if (ido <= a11) {
            return 11;
        } else if (ido <= a10) {
            return 10;
        } else if (ido <= a9) {
            return 9;
        } else if (ido <= a8) {
            return 8;
        } else if (ido <= a7) {
            return 7;
        } else if (ido <= a6) {
            return 6;
        } else if (ido <= a5) {
            return 5;
        } else if (ido <= a4) {
            return 4;
        } else if (ido <= a3) {
            return 3;
        } else if (ido <= a2) {
            return 2;
        } else if (ido < a1) {
            return 1;
        } else {
            return 0;
        }
    }

    private static int keziG(double ido
            , double a1, double a2, double a3, double a4, double a5, double a6, double a7, double a8, double a9, double a10, double a11, double a12, double a13,
                                           double a14, double a15, double a16, double a17, double a18, double a19, double a20, double a21, double a22, double a23,
                                           double a24, double a25, double a26, double a27, double a28, double a29, double a30, double a31, double a32, double a33,
                                           double a34, double a35, double a36, double a37, double a38, double a39, double a40, double a41, double a42, double a43,
                                           double a44, double a45, double a46, double a47, double a48, double a49, double a50) {
        if (ido < 0) {
            return 0;//akkor kisebb az ido mint nulla ha nincsenek kitoltve a mezok
        } else if (ido > a50) {
            return 50;
        } else if (ido >= a49) {
            return 49;
        } else if (ido >= a48) {
            return 48;
        } else if (ido >= a47) {
            return 47;
        } else if (ido >= a46) {
            return 46;
        } else if (ido >= a45) {
            return 45;
        } else if (ido >= a44) {
            return 44;
        } else if (ido >= a43) {
            return 43;
        } else if (ido >= a42) {
            return 42;
        } else if (ido >= a41) {
            return 41;
        } else if (ido >= a40) {
            return 40;
        } else if (ido >= a39) {
            return 39;
        } else if (ido >= a38) {
            return 38;
        } else if (ido >= a37) {
            return 37;
        } else if (ido >= a36) {
            return 36;
        } else if (ido >= a35) {
            return 35;
        } else if (ido >= a34) {
            return 34;
        } else if (ido >= a33) {
            return 33;
        } else if (ido >= a32) {
            return 32;
        } else if (ido >= a31) {
            return 31;
        } else if (ido >= a30) {
            return 30;
        } else if (ido >= a29) {
            return 29;
        } else if (ido >= a28) {
            return 28;
        } else if (ido >= a27) {
            return 27;
        } else if (ido >= a26) {
            return 26;
        } else if (ido >= a25) {
            return 25;
        } else if (ido >= a24) {
            return 24;
        } else if (ido >= a23) {
            return 23;
        } else if (ido >= a22) {
            return 22;
        } else if (ido >= a21) {
            return 21;
        } else if (ido >= a20) {
            return 20;
        } else if (ido >= a19) {
            return 19;
        } else if (ido >= a18) {
            return 18;
        } else if (ido >= a17) {
            return 17;
        } else if (ido >= a16) {
            return 16;
        } else if (ido >= a15) {
            return 15;
        } else if (ido >= a14) {
            return 14;
        } else if (ido >= a13) {
            return 13;
        } else if (ido >= a12) {
            return 12;
        } else if (ido >= a11) {
            return 11;
        } else if (ido >= a10) {
            return 10;
        } else if (ido >= a9) {
            return 9;
        } else if (ido >= a8) {
            return 8;
        } else if (ido >= a7) {
            return 7;
        } else if (ido >= a6) {
            return 6;
        } else if (ido >= a5) {
            return 5;
        } else if (ido >= a4) {
            return 4;
        } else if (ido >= a3) {
            return 3;
        } else if (ido >= a2) {
            return 2;
        } else if (ido > a1) {
            return 1;
        } else {
            return 0;
        }
    }


    private static int altalanospont(int ido
            , int a1, int a2, int a3, int a4, int a5, int a6, int a7, int a8, int a9, int a10, int a11, int a12, int a13, int a14, int a15, int a16,
                                     int a17, int a18, int a19, int a20, int a21, int a22, int a23, int a24, int a25, int a26, int a27, int a28, int a29,
                                     int a30, int a31, int a32, int a33, int a34, int a35, int a36, int a37, int a38, int a39, int a40, int a41, int a42,
                                     int a43, int a44, int a45, int a46, int a47, int a48, int a49, int a50) {
        if (ido < 0) {
            return 0;//akkor kisabb az ido mint nulla ha nincsenek kitoltve a mezok
        } else if (ido <= a50) {
            return 50;
        } else if (ido <= a49) {
            return 49;
        } else if (ido <= a48) {
            return 48;
        } else if (ido <= a47) {
            return 47;
        } else if (ido <= a46) {
            return 46;
        } else if (ido <= a45) {
            return 45;
        } else if (ido <= a44) {
            return 44;
        } else if (ido <= a43) {
            return 43;
        } else if (ido <= a42) {
            return 42;
        } else if (ido <= a41) {
            return 41;
        } else if (ido <= a40) {
            return 40;
        } else if (ido <= a39) {
            return 39;
        } else if (ido <= a38) {
            return 38;
        } else if (ido <= a37) {
            return 37;
        } else if (ido <= a36) {
            return 36;
        } else if (ido <= a35) {
            return 35;
        } else if (ido <= a34) {
            return 34;
        } else if (ido <= a33) {
            return 33;
        } else if (ido <= a32) {
            return 32;
        } else if (ido <= a31) {
            return 31;
        } else if (ido <= a30) {
            return 30;
        } else if (ido <= a29) {
            return 29;
        } else if (ido <= a28) {
            return 28;
        } else if (ido <= a27) {
            return 27;
        } else if (ido <= a26) {
            return 26;
        } else if (ido <= a25) {
            return 25;
        } else if (ido <= a24) {
            return 24;
        } else if (ido <= a23) {
            return 23;
        } else if (ido <= a22) {
            return 22;
        } else if (ido <= a21) {
            return 21;
        } else if (ido <= a20) {
            return 20;
        } else if (ido <= a19) {
            return 19;
        } else if (ido <= a18) {
            return 18;
        } else if (ido <= a17) {
            return 17;
        } else if (ido <= a16) {
            return 16;
        } else if (ido <= a15) {
            return 15;
        } else if (ido <= a14) {
            return 14;
        } else if (ido <= a13) {
            return 13;
        } else if (ido <= a12) {
            return 12;
        } else if (ido <= a11) {
            return 11;
        } else if (ido <= a10) {
            return 10;
        } else if (ido <= a9) {
            return 9;
        } else if (ido <= a8) {
            return 8;
        } else if (ido <= a7) {
            return 7;
        } else if (ido <= a6) {
            return 6;
        } else if (ido <= a5) {
            return 5;
        } else if (ido <= a4) {
            return 4;
        } else if (ido <= a3) {
            return 3;
        } else if (ido <= a2) {
            return 2;
        } else if (ido <= a1) {
            return 1;
        } else return 0;
    }
}
