package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*

object JavaScript_01FastTests : BuildType({
    template(JavaScript.buildTypes.JavaScript_Template)
    uuid = "466ac0e5-a345-46b2-a484-d8a814ab28f2"
    id = "JavaScript_01FastTests"
    name = "01. Fast Tests"

    params {
        param("Browser", "PhantomJS")
    }
})
