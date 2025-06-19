import com.burdbrain.drawings.DrawingWide;
import com.burdbrain.frames.ArtFrame;

public class MostrarFrame {
    public static void main(String args[]){
        ArtFrame artFrame = new ArtFrame(new DrawingWide());

        artFrame.setSize(200, 100);
        artFrame.setVisible(true);
    }
}
