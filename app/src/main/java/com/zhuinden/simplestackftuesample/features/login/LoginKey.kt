package com.zhuinden.simplestackftuesample.features.login

import androidx.fragment.app.Fragment
import com.zhuinden.simplestack.ServiceBinder
import com.zhuinden.simplestackextensions.fragments.DefaultFragmentKey
import com.zhuinden.simplestackextensions.services.DefaultServiceProvider
import com.zhuinden.simplestackextensions.servicesktx.add
import com.zhuinden.simplestackextensions.servicesktx.lookup
import kotlinx.android.parcel.Parcelize

@Parcelize
class LoginKey : DefaultFragmentKey(), DefaultServiceProvider.HasServices {
    override fun bindServices(serviceBinder: ServiceBinder) {
        with(serviceBinder) {
            add(LoginViewModel(lookup(), backstack))
        }
    }

    override fun getScopeTag(): String = javaClass.name

    override fun instantiateFragment(): Fragment = LoginFragment()
}