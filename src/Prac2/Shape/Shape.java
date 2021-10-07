package Prac2.Shape;

    public class Shape {
        private int numOfCorners;
        private String color;
        public void SetNumOfCorners(int numOfCorners){
            this.numOfCorners = numOfCorners;
        }
        public void SetColor(String color){
            this.color = color;
        }
        public String GetColor(){
            return color;
        }
        public int GetNumOfCorners(){
            return numOfCorners;
        }
        public String toString(){
            return "Number of shape's corners is " + numOfCorners + ", the color is " + color;
        }
    }

