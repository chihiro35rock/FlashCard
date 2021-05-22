package app.mita.chatamin.flashcard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.UserDictionary.Words.addWord
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //りんご
        val apple = Word(R.drawable.apple,"りんご"+"apple")
        val banana = Word(R.drawable.banana,"バナナ"+"banana")
        val orange = Word(R.drawable.orange,"オレンジ"+"orange")
        val strawberry = Word(R.drawable.strawberry,"いちご"+"strawberry")

        addWord(apple)
        addWord(banana)
        addWord(orange)
        addWord(strawberry)
    }

    private fun addWord(word:Word){
        val nameTextView = TextView(applicationContext)
        nameTextView.text =word.name

        val layout1= LinearLayout(this.applicationContext)
        layout1.orientation = LinearLayout.HORIZONTAL

        val imageView = ImageView(this)
        imageView.setImageResource(word.resId)
        imageView.layoutParams = ViewGroup.LayoutParams(500,350)

        layout1.addView(imageView)
        layout1.addView(nameTextView)

        container.addView(layout1)
    }
}