package studio.xmatrix.coffee.ui.detail;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import studio.xmatrix.coffee.R;
import studio.xmatrix.coffee.databinding.DetailActivityBinding;
import studio.xmatrix.coffee.ui.BaseActionBarActivity;

import java.util.Objects;

public class DetailActivity extends BaseActionBarActivity {
    DetailActivityBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.detail_activity);
        Objects.requireNonNull(getSupportActionBar()).setTitle("内容详情");
    }
}
