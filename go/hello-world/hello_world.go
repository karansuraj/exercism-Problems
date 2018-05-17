package hello

const testVersion = 2

//Greet user with "Hello" if input is not empty, else print "Hello, World!"
func HelloWorld(s string) string {
	if len(s) != 0 {
		s = "Hello, " + s + "!"
	} else {
		s = "Hello, World!"
	}
	return s
}