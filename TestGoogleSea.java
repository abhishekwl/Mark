import java.io.*;
import java.net.*;
import java.util.*;
import com.google.gson.Gson;
class TestGoogleSea
{
    public static void main(String[] args)  throws Exception
    {
        Scanner sc = new Scanner(System.in);
        String address = "http://ajax.googleapis.com/ajax/services/search/web?v=1.0&q=";
        System.out.print("Enter query : ");
        String query = sc.nextLine();
        String request = "https://www.google.com/search?q=" +query+ "&num=20";
        String charset = "UTF-8";
        URL url = new URL(request + URLEncoder.encode(query, charset));
        InputStreamReader reader = new InputStreamReader(url.openStream(), charset);
        GoogleResults results = new Gson().fromJson(reader, GoogleResults.class);

        int total = 4;
        System.out.println("Total : "+total);

        for(int i=0; i<total; i++)
        {
            System.out.println("Title : "+ results.getResponseData().getResults().get(i).getTitle());
            System.out.println("URL : "  + results.getResponseData().getResults().get(i).getURL()+"\n");
        }
        sc.close();
    }
}

class GoogleResults
{
    public ResponseData responseData;
    public ResponseData getResponseData()
    {
        return responseData;
    }

    public void setResponseData(ResponseData responseData)
    {
        this.responseData = responseData;
    }

    public String toString()
    {
        return "ResponseData["+ responseData + "]";
    }

}

class ResponseData
{
    private List<Result> results;
    public List<Result> getResults()
    {
        return results;
    }

    public void setResults(List<Result> results)
    {
        this.results = results;
    }

    public String toString()
    {
        return "Results["+results+"]";
    }
}

class Result
{
    public String url;
    public String title;
    public String getURL()
    {
        return url;
    }

    public String getTitle()
    {
        return title;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String toString()
    {
        return "Result[url:"+ url +",title:"+ title +"]";
    }
}
