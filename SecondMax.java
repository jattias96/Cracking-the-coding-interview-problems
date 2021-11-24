class SecondMax {
  public int secondMax(int[] arr) {
    int max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        secondMax = max;
        max = arr[i];
      }
    }
    return secondMax;
  }

  // [1,2,3,-5,0,1,2]

  public int largestSum(int[] arr) {
    int maxSum = Integer.MIN_VALUE;
    
    for (int window = 1; window < arr.length; window++) {
      int total = 0;
      for (int i = 0; i <= arr.length - window; i++) {
        total += arr[i];
      }
      if (total > maxSum) maxSum = total;
    }
    return maxSum;
  }
}