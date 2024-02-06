class mergeSort {

  void divide(int arr[], int strt, int mid, int end) {
    int l1 = mid - strt + 1;
    int l2 = end - mid;
    int r[] = new int[l1];
    int l[] = new int[l2];
    for (int i = 0; i < l1; i++) {
      r[i] = arr[i];
    }
    for (int j = 0; j < l2; j++) {
      l[j] = arr[j + mid + 1];
    }
    int i = 0;
    int j = 0;
    int k = strt;
    while (i < l1 && j < l2) {
      if (l[i] <= r[j]) {
        arr[k] = l[i];
        i++;
      } else {
        arr[k] = r[j];
        j++;
      }
      k++;
    }
  }

  void merge(int arr[], int strt, int end) {
    if (strt < end) {
      int mid = strt + end / 2;
      merge(arr, strt, mid);
      merge(arr, mid + 1, end);
      divide(arr, strt, mid, end);
    }
  }
  
}
