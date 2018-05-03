package engine.data.statics;

import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.Varpbits;

public class VarpbitsArray {
    public static int[] varpbitsArray = new int[] { };

    public static void UpdateVarpbits(ClientContext ctx) {
        Varpbits varpbits = new Varpbits(ctx);

        varpbitsArray = varpbits.array();
    }
}
