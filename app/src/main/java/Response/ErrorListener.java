package Response;

import com.example.akcovid_19tracker.ui.home.VolleyError;

public abstract class ErrorListener {
    public abstract void onErrorResponse(VolleyError error);
}
