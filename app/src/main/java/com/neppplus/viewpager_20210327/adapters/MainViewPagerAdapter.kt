package com.neppplus.viewpager_20210327.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.neppplus.viewpager_20210327.Fragments.Page1Fragment
import com.neppplus.viewpager_20210327.Fragments.Page2Fragment
import com.neppplus.viewpager_20210327.Fragments.Page3Fragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
//        리턴을 하는데 -> position 값에 따라 다른 결과가 리턴되도록 하는 코틀린 문법 예시
        return when(position) {
            0 -> "인사"
            1 -> "자기소개"
            else -> "하고싶은말"
        }
    }


//    필수 오버라이딩 2개를 구현 => Alt + Enther

    override fun getItem(position: Int): Fragment {
//        position의 값에 따라 다른 Fragment 리턴.

        return when(position) {
            0 -> Page1Fragment()
            1 -> Page2Fragment()
            else -> Page3Fragment()
        }
    }

    override fun getCount(): Int {
//        3장 짜리야
        return 3
    }
}