package cn.edu.gdmec.android.gridview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class GridViewTest extends AppCompatActivity {
    private GridView gv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_grid_view_test );

        gv=(GridView)findViewById ( R.id.GridView01 );
        gv.setNumColumns ( 4 );
        gv.setAdapter ( new MyAdapter(this) );
    }
    class MyAdapter extends BaseAdapter
    {
        private Integer[] imgs={
                R.drawable.img0,
                R.drawable.img1,
                R.drawable.img2,
                R.drawable.img3,
                R.drawable.img4,
                R.drawable.img5,
                R.drawable.img6,
                R.drawable.img7,

                R.drawable.img0,
                R.drawable.img1,
                R.drawable.img2,
                R.drawable.img3,
                R.drawable.img4,
                R.drawable.img5,
                R.drawable.img6,
                R.drawable.img7
        };
        Context context;

        MyAdapter(Context context) {
            this.context=context;
        }

        @Override
        public int getCount() {
            return imgs.length;
        }

        @Override
        public Object getItem(int item) {
            return item;
        }

        @Override
        public long getItemId(int id) {
            return id;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView;
            if(convertView==null)
            {
                imageView=new ImageView ( context );
                imageView.setLayoutParams ( new GridView.LayoutParams ( 300,300 ) );
                imageView.setAdjustViewBounds ( false );
                imageView.setScaleType ( ImageView.ScaleType.CENTER_CROP );
                imageView.setPadding ( 8,8,8,8 );
            }else
            {
                imageView=(ImageView)convertView;
            }
            imageView.setImageResource ( imgs[position] );
            return imageView;
        }
    }
}
