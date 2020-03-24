package com.jeeps.covidopenknowledgeutplapi.model.medioComunicacion;

import java.util.List;
import java.util.Map;

public class MedioComunicacionJsonResponse {
    private Map<String, List<MedioComunicacion>> _embedded;

    public MedioComunicacionJsonResponse(Map<String, List<MedioComunicacion>> _embedded) {
        this._embedded = _embedded;
    }

    public MedioComunicacionJsonResponse() {}

    public Map<String, List<MedioComunicacion>> get_embedded() {
        return _embedded;
    }

    public void set_embedded(Map<String, List<MedioComunicacion>> _embedded) {
        this._embedded = _embedded;
    }
}
