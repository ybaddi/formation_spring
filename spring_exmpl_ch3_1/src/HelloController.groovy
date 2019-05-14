
@RestController
class HelloController{

    @RequestMapping("/")
    def hello () {
        "Hello world"
    }

}