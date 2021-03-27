package com.neppplus.viewpager_20210327.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.neppplus.viewpager_20210327.Fragments.Page1Fragment
import com.neppplus.viewpager_20210327.Fragments.Page2Fragment
import com.neppplus.viewpager_20210327.Fragments.Page3Fragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

//    필수 오버라이딩 2개를 구현 => Alt + Enther

    override fun getItem(position: Int): Fragment {
//        position의 값에 따라 다른 Fragment 리턴.
        if (position == 0) {
            return Page1Fragment()
        }
        else if (position == 1) {
            return Page2Fragment()
        }
        else {
            return Page3Fragment()
        }
    }

    override fun getCount(): Int {
//        3장 짜리야
        return 3
    }
}