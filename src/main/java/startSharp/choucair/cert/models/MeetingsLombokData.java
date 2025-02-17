package startSharp.choucair.cert.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class MeetingsLombokData {

    private String nombreR;
    private String tipoReunion;
    private String numeroReunion;
    private String fechaInicio;
    private String fechaFinalizacion;

    public static List<MeetingsLombokData> setData (DataTable table){
        List<MeetingsLombokData> data = new ArrayList<>();
        List<Map<String, String>> mapInfo = table.asMaps();
        for (Map<String, String> map: mapInfo){
            data.add(new ObjectMapper().convertValue(map, MeetingsLombokData.class));
        }
        return data;
    }

}
