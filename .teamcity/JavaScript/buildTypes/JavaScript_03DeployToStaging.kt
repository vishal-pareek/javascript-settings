package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*

object JavaScript_03DeployToStaging : BuildType({
    uuid = "e9e2ca3c-93fe-4a8a-a4e1-499c042fe82c"
    id = "JavaScript_03DeployToStaging"
    name = "03. Deploy to staging"

    vcs {
        root(JavaScript.vcsRoots.JavaScript_HttpsGithubComG0t4teamcityCourseCards)

    }

    dependencies {
        dependency(JavaScript.buildTypes.JavaScript_01FastTests) {
            snapshot {
            }
        }
        dependency(JavaScript.buildTypes.JavaScript_02Firefox) {
            snapshot {
            }
        }
    }
})
