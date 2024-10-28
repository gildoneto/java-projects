public class _29_Exercise_29_PaintJob {
    public static void main(String[] args) {
        System.out.println("Should return -1: " + getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println("Should return 3: " + getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println("Should return 3: " + getBucketCount(2.75, 3.25, 2.5, 1));

        System.out.println("Should return -1: " + getBucketCount(-3.4, 2.1, 1.5));
        System.out.println("Should return 5: " + getBucketCount(3.4, 2.1, 1.5));
        System.out.println("Should return 14: " + getBucketCount(7.25, 4.3, 2.35));

        System.out.println("Should return 3: " + getBucketCount(3.4, 1.5));
        System.out.println("Should return 3: " + getBucketCount(6.26, 2.2));
        System.out.println("Should return 5: " + getBucketCount(3.26, 0.75));

        System.out.println("Should return -1: " + getBucketCount(1.4, 2.1, 1.5, -4));
        System.out.println("Should return 2: " + getBucketCount(0.75,0.75,0.5,0));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double area = width * height;
        double coveredArea = areaPerBucket * extraBuckets;
        double remainingArea = area - coveredArea;
        return (int) Math.ceil(remainingArea / areaPerBucket);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double area = width * height;
        return (int) Math.ceil(area / areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        return (int) Math.ceil(area / areaPerBucket);
    }


}
