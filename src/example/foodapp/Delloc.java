package example.foodapp;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.app.Activity;
import android.widget.ListAdapter;

import java.util.ArrayList;  
import java.util.Arrays;  
  
import android.app.Activity;  
import android.os.Bundle;  
import android.widget.ArrayAdapter;  
import android.widget.ListView;  
  
public class Delloc extends Activity {  
    
  private ListView mainListView ;  
  private ArrayAdapter<String> listAdapter ;  
    
  /** Called when the activity is first created. */  
  @Override  
  public void onCreate(Bundle savedInstanceState) {  
    super.onCreate(savedInstanceState);  
    setContentView(R.layout.main);  
      
    // Find the ListView resource.   
    mainListView = (ListView) findViewById( R.id.mainListView );  
  
    mainListView.setSelector( R.layout.listitembackground); 
    String[] dellocation = new String[] { "HSR Layout", "Koramangala", "Indiranagar", "AKR Tech Park(Lunch)",  
                                      "Sarjapur Road", "Domlur(Lunch)", "Bellandur(Lunch)", "Embassy Tech Village(Lunch)"};    
    ArrayList<String> locList = new ArrayList<String>();  
    locList.addAll( Arrays.asList(dellocation) );  
      
    // Create ArrayAdapter using the planet list.  
    listAdapter = new ArrayAdapter<String>(this, R.layout.simplerow, locList); 
    mainListView.setAdapter( listAdapter );
  }
}