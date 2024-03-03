import com.android.build.gradle.LibraryExtension
import com.example.convention.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies

class AndroidFeatureConventionPlugin: Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            dependencies {

                //add("implementation", libs.findLibrary("androidx.hilt.navigation.compose").get())
                add("implementation", libs.findLibrary("lifecycle.compose").get())

                add("implementation", libs.findLibrary("androidx.lifecycle.viewmodel.ktx").get())
                add("implementation", libs.findLibrary("androidx.tracing.ktx").get())

                add("androidTestImplementation", libs.findLibrary("androidx.lifecycle.runtimeTesting").get())
            }
        }

    }
}