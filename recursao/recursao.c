#include <stdio.h>
float fatorial(int n) {
    if (n <= 1)
        return 1;
    return n * fatorial(n - 1);
}
int main() {
    for (int i = 0; i < 16; i++) {
        printf("fatorial de %d = %.0f\n", i, fatorial(i));
    }
    return 0;
}