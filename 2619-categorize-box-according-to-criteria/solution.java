class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean isHeavy=false;
        boolean isBulky=false;
        long volume=(long)length*(long)width*(long)height;
        if(volume>=Math.pow(10,9) || length>=Math.pow(10,4) || width>=Math.pow(10,4) || height >=Math.pow(10,4))
        isBulky=true;
        if(mass>=100)
            isHeavy=true;
        
        if(isBulky && isHeavy)
            return "Both";
        else if(isBulky && !isHeavy)
            return "Bulky";
        else if(isHeavy && !isBulky)
            return "Heavy";
        return "Neither";
    }
}
