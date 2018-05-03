package utilities;

import engine.objects.Context;

import org.powerbot.script.Script;
import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.Varpbits;

import java.sql.Timestamp;

@Script.Manifest(
        name = "Varpbit Spy",
        description = "Logs changes to varpbits",
        properties = ""
)
public class VarpbitSpy extends Context<ClientContext> {
    public VarpbitSpy(ClientContext ctx) {
        super(ctx);
    }

    private Varpbits vbctx = new Varpbits(ctx);
    private int[] vbarr1 = vbctx.array();
    private int[] vbarr2 = vbctx.array();

    public void PollChanges() {
        vbarr2 = vbctx.array();

        for (int x = 0; x < vbarr1.length; x++) {
            if (vbarr1[x] != vbarr2[x])
                System.out.println(new Timestamp(System.currentTimeMillis())
                        + " >> " + x + ": " + vbarr1[x] + " ->  " + vbarr2[x]);
        }

        vbarr1 = vbarr2;
    }
}
