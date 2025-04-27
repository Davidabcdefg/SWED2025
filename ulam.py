def ulam(n):
    while n != 1:
        if n % 2 == 0:
            n = n / 2
        else:
            n = 3 * n + 1
        print(n)
    print("end.")

def main():
    n = int(input("Enter a number: "))
    ulam(n)

if __name__ == "__main__":
    main()