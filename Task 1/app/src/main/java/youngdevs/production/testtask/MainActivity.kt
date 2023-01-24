package youngdevs.production.testtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.lottie.LottieAnimationView
import youngdevs.production.testtask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val animationView = binding.root.findViewById<LottieAnimationView>(R.id.lt_animation)
        animationView.setAnimation(R.raw.animation)
        animationView.playAnimation()
    }
}