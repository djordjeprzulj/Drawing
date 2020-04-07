package drawing.model;

import java.util.ArrayList;

public class Polyline2 {

    private Line[] segments;
    private final int maxSize = 10;
    private int lastSegmentIndex = -1;

    public Polyline2() {
        this.segments = new Line[maxSize];
    }

    public boolean addSegment(Line newSegment) {
        if (this.lastSegmentIndex == -1) {
            this.segments[lastSegmentIndex++] = newSegment;
            return true;
        } else {
            Line lastSegment = this.segments[lastSegmentIndex];
            if (lastSegment.getEndPoint().equals(newSegment.getStartPoint())) {
                this.segments[lastSegmentIndex++] = newSegment;
                return true;
            }
        }
        return false;
    }

    public double length() {
        if (this.lastSegmentIndex == -1) {
            return 0;
        }
        double totalLength = 0;
        for (int i = 0;  i < this.segments.length; i++) {
            totalLength += this.segments[i].length();
            if (i == lastSegmentIndex) {
                break;
            }
        }
        return totalLength;
    }
}
