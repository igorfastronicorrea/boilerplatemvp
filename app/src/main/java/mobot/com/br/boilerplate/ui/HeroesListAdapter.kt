package mobot.com.br.boilerplate.ui

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.Adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.hero_item.view.*
import mobot.com.br.boilerplate.R
import mobot.com.br.boilerplate.models.HeroesResponse
import mobot.com.br.boilerplate.utils.showToast

class HeroesListAdapter(private val heroes: List<HeroesResponse>,
                        val context: Context) : Adapter<HeroesListAdapter.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.hero_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, p1: Int) {
        val hero = heroes[p1]


        holder?.let {
            it.bindView(hero)
        }
    }


    override fun getItemCount(): Int {
        return heroes.size
    }


    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        fun bindView(heroes: HeroesResponse){
            val txtName = itemView.txtName

            txtName.text = heroes.name

            itemView.setOnClickListener {
                heroes?.let {
                    context.showToast("tes ${heroes.name}")
                }
            }
        }
    }


}