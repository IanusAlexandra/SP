public class DescarcareFactory {

    public static Descarcare create(String Url) throws Exception{
        if(extensie.endWith(.mp4))
            return new MP4Descarcare(extensie);
        else if(extensie.endWith(".mvk"))
            return new MVKDescarcare(extensie);
        else
            throw new Exception("Unsupported extension type");

    }
}
