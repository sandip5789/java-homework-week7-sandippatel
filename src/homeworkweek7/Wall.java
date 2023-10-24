package homeworkweek7;

/**
 * Wall Area
 * Created by Sandip Patel
 */

public class Wall {
        // variables
        private double width;
        private double height;

        public Wall() {

        }
        public Wall(double width, double height) {
            setWidth(width);
            setHeight(height);
        }
// method for getWidth
        public double getWidth() {
            return width;
        }
// method for getHeight
        public double getHeight() {
            return height;
        }
// method for setWidth
        public void setWidth(double width) {
            if (width < 0) {
                this.width = 0;
            } else {
                this.width = width;
            }
        }
// method for setHeight
        public void setHeight(double height) {
            if (height < 0) {
                this.height = 0;
            } else {
                this.height = height;
            }
        }
// method for getArea
        public double getArea() {
            return width * height;
        }
// call main method
        public static void main(String[] args) {
            Wall wall = new Wall(5, 4);
            System.out.println("area= " + wall.getArea());
            wall.setHeight(-1.5);
            System.out.println("width= " + wall.getWidth());
            System.out.println("height= " + wall.getHeight());
            System.out.println("area= " + wall.getArea());
        }
    }



