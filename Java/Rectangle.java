public class Rectangle {
        private int width, height;
    
        // Constructor
        public Rectangle(int w, int h) {
            width = w;
            height = h;
        }
    
        // Method to calculate area
        public int area() {
            return width * height;
        }
    
        public static void main(String[] args) {
            // Create an object of Rectangle
            Rectangle rect = new Rectangle(10, 5);
    
            // Output the area
            System.out.println("Area of rectangle: " + rect.area());
        }
    }
