
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class TextToSpeech
{
    VoiceManager freettsVM;
    Voice freettsVoice;

    public TextToSpeech(String words)
    {
        String dir = Adv.GetCurrentWorkingDirectory();
        System.setProperty("mbrola.base", (dir+"/mbrola"));
        freettsVM = VoiceManager.getInstance();
        freettsVoice = freettsVM.getVoice("mbrola_us2");
        freettsVoice.allocate();	
        sayWords(words);
    }

    public void sayWords(String words)
    {
        freettsVoice.speak(words);
    }

    public static void main(String n)
    {
        new TextToSpeech(n);
    }
}