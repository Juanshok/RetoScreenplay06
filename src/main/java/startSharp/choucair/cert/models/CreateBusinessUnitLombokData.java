package startSharp.choucair.cert.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class CreateBusinessUnitLombokData {
    private String nombre;
    private String unidadPadre;

    public static List<CreateBusinessUnitLombokData> setData (DataTable table){
        List<CreateBusinessUnitLombokData> data = new ArrayList<>();
        List<Map<String, String>> mapInfo = table.asMaps();
        for (Map<String, String> map: mapInfo){
            data.add(new ObjectMapper().convertValue(map, CreateBusinessUnitLombokData.class));
        }
        return data;
    }
}
