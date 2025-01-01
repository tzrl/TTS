package me.ag2s.tts.data;

import java.util.Comparator;
import java.util.Locale;

public class TtsActorComparator implements Comparator<TtsActor> {

    public static final TtsActorComparator INSTANCE = new TtsActorComparator();
    private final Locale locale;

    public TtsActorComparator() {
        this.locale = Locale.getDefault();
    }

    public TtsActorComparator(Locale locale) {
        this.locale = locale;
    }

    @Override
    public int compare(TtsActor o1, TtsActor o2) {
        Locale loc1 = o1.getLocale();
        Locale loc2 = o2.getLocale();
        boolean b11 = loc1.getISO3Language().equals(locale.getISO3Language());
        boolean b12 = loc1.getISO3Country().equals(locale.getISO3Country());
        boolean b13 = loc1.getDisplayVariant(Locale.US).equals(locale.getDisplayVariant(Locale.US));
        boolean b21 = loc2.getISO3Language().equals(locale.getISO3Language());
        boolean b22 = loc2.getISO3Country().equals(locale.getISO3Country());
        boolean b23 = loc2.getDisplayVariant(Locale.US).equals(locale.getDisplayVariant(Locale.US));


        if (b11 != b21) {
            return b11 ? -1 : 1;
        }
        if (b12 != b22) {
            return b12 ? -1 : 1;
        }


//        //语言都不同
//        if ((!b11) && (!b21)) {
//            return 0;
//        }
//        //两个都相同
//        if (b11 && b12 && b13 == b21 && b22 && b23) {
//            return 0;
//        }
//        if (b11 && b12 && b13) {
//            return -1;
//        }
//        if (b21 && b22 && b23) {
//            return 1;
//        }
//        if ((b11 && b12 == b21 && b22)) {
//            if (b13 == b23) {
//                return 0;
//            }
//            if (b13) {
//                return -1;
//            } else {
//                return 1;
//            }
//        }
//        if (b11 && b12) {
//            return -1;
//        }
//        if (b21 && b22) {
//            return 1;
//        }
        return 0;
    }
}
