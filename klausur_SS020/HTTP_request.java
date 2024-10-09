package klausur_SS020;

public class HTTP_request {

    String http_method;
    String url;

    http_header[] http_header;

    public HTTP_request(String http_method, String url){
        if(!http_method.equals("GET")|| !http_method.equals("POST")){
            this.http_method = "GET";
        }
        else {
            this.http_method = http_method;
        }
        this.url = url;
        this.http_header = new http_header[20];
    }

    public void addHeader(http_header new_header){
        for(int i = 0; i< http_header.length;i++){
            if(http_header[i] == null){
                http_header[i] = new_header;
            }
        }
    }

    @Override
    public String toString(){
        String request_format = this.http_method+" "+this.url+" HTTP/1.0\n";
        for(http_header h : http_header){
            request_format+=h+"\n";
        }
        return request_format;
    }
}
