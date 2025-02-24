package progressed.graphics;

import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.util.*;
import mindustry.graphics.*;

public class PMDrawf{

    public static void plus(float x, float y, float diameter, float angle, Color color, float alpha){
        Draw.color(color, alpha);
        for(int i = 0; i < 2; i++){
            Fill.rect(x, y, diameter / 3, diameter, angle + i * 90f);
        }
    }

    public static void shadowAlpha(TextureRegion region, float x, float y, float rotation, float alpha){
        Draw.color(Tmp.c1.set(Pal.shadow).mul(1f, 1f, 1f, alpha));
        Draw.rect(region, x, y, rotation);
        Draw.color();
    }
}